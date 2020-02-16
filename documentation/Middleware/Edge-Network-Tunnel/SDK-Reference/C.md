[The operating system in this document is Linux System (Ubuntu and CentOS)]<br>
Please download SDK in ‘*[Download Zone](../Download-Center.md)*’; for codes, please refer to the two .c files under ENT/Example/Linux in SDK<br>

1. Use ENT dynamic library to build a project<br>
   a) You can use the following command to install libentapi library:<br>
   Install the corresponding system and the .so library file of CPU architecture
   ```
   sudo cp libentapi.so /usr/lib/
   sudo ldconfig                       //Dynamic Library Installation
   ```
   b) Compile example_a.c and example_b.c:<br>
   Place the header file entapi.h in Include and the example_a.c and example_b.c under Example directory in the same directory, compile example_a.c and example_b.c
   ```
   gcc -o example_a example_a.c -L. -Wl,-dy -lentapi
   gcc -o example_b example_b.c -L. -Wl,-dy -lentapi
   ```
   c) Open two terminals to enable example_b first and then  example_a:
   ```
   ./example_b
   ```
   ```
   ./example_a
   ```
	
2. Use ENT static library to build a project<br>
   a) Compile example_a.c and example_b.c:<br>
   Copy the header file entapi.h in Include directory, the example_a.c and example_b.c under Example directory, and the corresponding *.a library file in Lib (select the corresponding system and CPU architecture) in the same directory, and compile example_a.c and example_b.c
   ```
   gcc -o example_a example_a.c -L. -Wl,-dn -lentapi -Wl,-dy -lpthread
   gcc -o example_b example_b.c -L. -Wl,-dn -lentapi -Wl,-dy -lpthread
   ```
   b) Open two terminals to enable example_b first and then  example_a:
   ```
   ./example_b
   ```
   ```
   ./example_a
   ```
3. API Document

   <table>
     <tr valign="top">
       <td rowspan="4">Register</td>
       <td colspan="2">int Register(const char *demandID, const char *peerID, const char *serverAddr);</td>
     </tr>
     <tr>
       <td>Function</td>
       <td>Register a Peer node according to PeerID</td>
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
       <td>If succeeded, return value = 0.<br>
   		If failed, return value < 0.
   	</td>
     </tr>
     <tr valign="top">
       <td rowspan="4">Unregister</td>
       <td colspan="2">int Unregister(const char *peerID);</td>
     </tr>
     <tr>
       <td>Function</td>
       <td>Deregister a Peer node according to PeerID</td>
     </tr>
     <tr>
       <td>Parameter</td>
       <td>peerID [in]: Home Terminal Node ID</td>
     </tr>
     <tr>
       <td>Return Value</td>
       <td>If succeeded, return value = 0.<br>
   		If failed, return value < 0.
   	</td>
     </tr>
     <tr valign="top">
       <td rowspan="4">Connect</td>
       <td colspan="2">char * Connect(const char *peerID);</td>
     </tr>
     <tr>
       <td>Function</td>
       <td>Establish the connection between the home terminal Peer node and the opposite terminal Peer. If succeeded, return the connected ConnectID.</td>
     </tr>
     <tr>
       <td>Parameter</td>
       <td>peerID [in]: Opposite Terminal Node ID.</td>
     </tr>
     <tr>
       <td>Return Value</td>
       <td>If succeeded, return value = ConnectID.<br>
   		If failed, return value = "".
   	</td>
     </tr>
     <tr valign="top">
       <td rowspan="4">Disconnect</td>
       <td colspan="2">int Disconnect(const char *connectID);</td>
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
       <td>If succeeded, return value = 0.<br>
   		If failed, return value < 0.
   	</td>
     </tr>
     <tr valign="top">
       <td rowspan="4">SetTimeout</td>
       <td colspan="2">int SetTimeout(const char *connectID, int timeout);</td>
     </tr>
     <tr>
       <td>Function</td>
       <td>Set read/write time-out period of connection corresponding to connectID, unit ms.</td>
     </tr>
     <tr>
       <td>Parameter</td>
       <td>connectID[in]: Connected ConnectID.<br>
   		timeout[in]: Read/write time-out period, unit ms.
   	</td>
     </tr>
     <tr>
       <td>Return Value</td>
       <td>If succeeded, return value = 0.<br>
   		If failed, return value < 0.
   	</td>
     </tr>
     <tr valign="top">
       <td rowspan="4">Write</td>
       <td colspan="2">int Write(const char *connectID, char *buf, int bufSize);</td>
     </tr>
     <tr>
       <td>Function</td>
       <td>Write data in the connection corresponding to connectID.</td>
     </tr>
     <tr>
       <td>Parameter</td>
       <td>connectID [in]: Connected ConnectID.<br>
   		buf [in]: Write pointer of character string.<br>
   		bufSize [in]: Write size of character string, unit byte.
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
       <td colspan="2">int Read(const char *connectID, char *buf, int bufSize);</td>
     </tr>
     <tr>
       <td>Function</td>
       <td>Read data from the connection corresponding to connectID.</td>
     </tr>
     <tr>
       <td>Parameter</td>
       <td>connectID [in]: Connected ConnectID.<br>
   		buf [out]: Read pointer of character string.
   	</td>
     </tr>
     <tr>
       <td>Return Value</td>
       <td>If succeeded, return value = read data size.<br>
   		If failed, return value < 0.
   	</td>
     </tr>
     <tr valign="top">
       <td rowspan="4">SetConnectHandler</td>
       <td colspan="2">int SetConnectHandler(connect_callback_fn handler);</td>
     </tr>
     <tr>
       <td>Function</td>
       <td>Set callback function called when the connection is established, parameters of callback function are ConnectID sent when the connection is established.</td>
     </tr>
     <tr>
       <td>Parameter</td>
       <td>handler [in]: Callback function, type is void (connect_callback_fn)(const char)</td>
     </tr>
     <tr>
       <td>Return Value</td>
       <td>If succeeded, return value = 0.<br>
   		If failed, return value < 0.
   	</td>
     </tr>
   </table>
