Please download SDK in  ‘*[Download Zone](../Download-Center.md)*’, in this document, ENT is mainly used by way of Go Plugins; for codes, please refer to the two example files under ENT-Go/Example/ in SDK.

1. Make preparations<br>
   Transfer the entplugin folder and entplugin.go therein to the root directory of your own project, and select the appropriate system and entplugin.so file under CPU architecture in Plugins, and then transfer them under the entplugin directory of the project.
   
2. Write your applications in the form of example.go<br>
   Call GetEntService of this package in entplugin to get its return value EntService; use EntService.func to call a method. Please refer to the writing of  example_a.go and example_b.go.
   
3. Run example
   In Plugins, select the ent-plugin.so of appropriate version, and place it to the entplugin folder of example_a and example_b. Successively go build commands for compiling, run example_b first and then example_a respectively in the two terminals:
   ```
   go build -o example_a example_a.go 
   go build -o example_b example_b.go 
   ./example_b
   ./example_a
   ```

4. API Document

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
