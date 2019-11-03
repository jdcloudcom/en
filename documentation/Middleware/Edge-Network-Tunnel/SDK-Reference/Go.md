Please download SDK in  ‘*Download Zone*’.

1. Take Go SDK as plugin to build projects

   a) Create entplugin file under the project root directory, select proper .so library version and place it inside, and place the entplugin.go in it.

   b) In project codes, use our SDK through import entplugin, entplugin.GetEntService(). Please see the instance code at the end of the document for details.

2. API Document

   <table>
     <tr valign="top">
       <td rowspan="4">Register</td>
       <td colspan="2">Register(demandID, peerID, serverAddr string) error</td>
     </tr>
     <tr>
       <td>Function</td>
       <td>Register a Peer node according to PeerID.</td>
     </tr>
     <tr>
       <td>Parameter</td>
       <td>demandID [in]: Supplier ID.<br>
   		peerID [in]: Home Terminal Node ID.<br>
   		serverAddr [in]: Server IP Address or Domain, fill in DEFAULT_SERVER_ADDR by default.
   	</td>
     </tr>
     <tr>
       <td width="10%">Return Value</td>
       <td>If succeeded, return value = nil.<br>
   		If failed, return value = error
   	</td>
     </tr>
     <tr valign="top">
       <td rowspan="4">Unregister</td>
       <td colspan="2">Unregister(peerID string) error</td>
     </tr>
     <tr>
       <td>Function</td>
       <td>Deregister a Peer node according to PeerID.</td>
     </tr>
     <tr>
       <td>Parameter</td>
       <td>peerID [in]: Home Terminal Node ID.</td>
     </tr>
     <tr>
       <td>Return Value</td>
       <td>If succeeded, return value = nil.<br>
   		If failed, return value = error.
   	</td>
     </tr>
     <tr valign="top">
       <td rowspan="4">Connect</td>
       <td colspan="2">Connect(peerID string) (string, error)</td>
     </tr>
     <tr>
       <td>Function</td>
       <td>Establish the connection with Peer node corresponding to peerID, and return the ConnectID corresponding to the connection.</td>
     </tr>
     <tr>
       <td>Parameter</td>
       <td>peerID [in]: Opposite Terminal Node ID.</td>
     </tr>
     <tr>
       <td>Return Value</td>
       <td>If succeeded, return value = ConnectID, nil.<br>
   		If failed, return value = "", error.
   	</td>
     </tr>
     <tr valign="top">
       <td rowspan="4">Disconnect</td>
       <td colspan="2">Disconnect(connectID string) error</td>
     </tr>
     <tr>
       <td>Function</td>
       <td>Disconnect corresponding connection according to connectID.</td>
     </tr>
     <tr>
       <td>Parameter</td>
       <td>connectID [in]: Connected ConnectID.</td>
     </tr>
     <tr>
       <td>Return Value</td>
       <td>If succeeded, return value = nil.<br>
   		If failed, return value = error.
   	</td>
     </tr>
     <tr valign="top">
       <td rowspan="4">SetTimeout</td>
       <td colspan="2">SetTimeOut(connectID string, timeout time.Duration) error</td>
     </tr>
     <tr>
       <td>Function</td>
       <td>Set read/write time-out period of connection corresponding to connectID.</td>
     </tr>
     <tr>
       <td>Parameter</td>
       <td>connectID [in]: Connected ConnectID.<br>
   		timeout [in]: Read/write time-out period.
   	</td>
     </tr>
     <tr>
       <td>Return Value</td>
       <td>If succeeded, return value = nil.<br>
   		If failed, return value = error.
   	</td>
     </tr>
     <tr valign="top">
       <td rowspan="4">Write</td>
       <td colspan="2">Write(connectID string, data []byte) error</td>
     </tr>
     <tr>
       <td>Function</td>
       <td>Write data in the connection corresponding to connectID.</td>
     </tr>
     <tr>
       <td>Parameter</td>
       <td>connectID [in]: Connected ConnectID.<br>
   		data [in]: Data written in.
   	</td>
     </tr>
     <tr>
       <td>Return Value</td>
       <td>If succeeded, return value = write data size.<br>
   		If failed, return value < 0.
   	</td>
     </tr>
     <tr valign="top">
       <td rowspan="4">Read</td>
       <td colspan="2">Read(connectID string, data []byte) (int, error)</td>
     </tr>
     <tr>
       <td>Function</td>
       <td>Read data from the connection corresponding to connectID.</td>
     </tr>
     <tr>
       <td>Parameter</td>
       <td>connectID [in]: Connected ConnectID.<br>
   		data [out]: Data read out.
   	</td>
     </tr>
     <tr>
       <td>Return Value</td>
       <td>If succeeded, return value = read data size, nil.<br>
   		If failed, return value = 0, error.
   	</td>
     </tr>
     <tr valign="top">
       <td rowspan="4">SetConnectHandler</td>
       <td colspan="2">SetConnectHandler(handler func(string)) error</td>
     </tr>
     <tr>
       <td>Function</td>
       <td>Set callback function called when the connection is established, parameters of callback function are ConnectID sent when the connection is established.</td>
     </tr>
     <tr>
       <td>Parameter</td>
       <td>handler [in]: Callback function, type is func(string)</td>
     </tr>
     <tr>
       <td>Return Value</td>
       <td>If succeeded, return value = nil.<br>
   		If failed, return value = error.
   	</td>
     </tr>
   </table>

3. Instance Code

   ```
   1.	package main
   2.	 
   3.	import (
   4.	    "fmt"
   5.	    "time"
   6.	 
   7.	    "git.jd.com/jdcloud-epn/example-b/entplugin"
   8.	)
   9.	 
   10.	/*
   11.	    See the project structure and README document in resource download for details
   12.	*/
   13.	 
   14.	func main() {
   15.	    entService := entplugin.GetEntService()
   16.	 
   17.	    signalServer := "ent.jdcloud.com"
   18.	    bPeerID := "api_test_with_id_b"
   19.	 
   20.	    _ = entService.Register("api_test", bPeerID, signalServer)
   21.	    _ = entService.SetConnectHandler(func(connectID string) {
   22.	        data := make([]byte, 50)
   23.	        for {
   24.	            n, err := entService.Read(connectID, data)
   25.	            if err != nil {
   26.	                return
   27.	            }
   28.	            fmt.Println("Read data is ", string(data[:n]))
   29.	            err = entService.Write(connectID, data[:n])
   30.	            if err != nil {
   31.	                return
   32.	            }
   33.	            fmt.Println("Write data is ", string(data[:n]))
   34.	        }
   35.	    })
   36.	    time.Sleep(1 * time.Minute)
   37.	}
   ```

