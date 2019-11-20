Please download SDK in  ‘*[Download Zone](../Download-Center.md)*’.

1.	 Use shared library to build a project
	 a) Install shared library, you can use the following command to install libentapi library:

```
	sudo cp libentapi.so /usr/lib/  //dynamic library installation
```
	
	b) Build application, write your own application according to the API document, e.g.: example.c
	
	```
	gcc -o example example.c -L. -Wl,-dy –lentapi
	./example
	```
	
2. Use static library to build a project
   Build application, write your own application according to the API document, e.g.: example.c. If you place libentapi.a under the same folder, you can use the following command to build it:

   ```
   gcc -o example example.c -L. -Wl,-dn -lentapi -Wl,-dy -lpthread
   ./example
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

4. Instance Code

   ```
   1.	#include <sys/types.h>
   2.	#include <stdio.h>
   3.	#include <string.h>
   4.	#include <unistd.h>
   5.	#include "entapi.h"
   6.	 
   7.	void ConnectHandler(const char*);
   8.	 
   9.	int main() {
   10.	    int res;
   11.	    void (*f)(const char*);
   12.	    res = Register("test", "Peer2", DEFAULT_SERVER_ADDR);
   13.	    if (res < 0) {
   14.	        printf("register of Peer2 is %d\n", res);
   15.	    }
   16.	    f = ConnectHandler;
   17.	    SetConnectHandler(f);
   18.	    sleep(20); // hold the process
   19.	}
   20.	 
   21.	void ConnectHandler(const char* connectID) {
   22.	    char buf[50];
   23.	    int nRead, nWrite;
   24.	    SetTimeout(connectID, 5000);
   25.	    sleep(1); // wait peer1 to send
   26.	    while (1) {
   27.	        nRead = Read(connectID, buf);
   28.	        if (nRead < 0) {
   29.	            printf("Peer2 fail to read from connect: %s\n", connectID);
   30.	            return;
   31.	        }
   32.	        printf("Peer2 read data: %s\n", buf);
   33.	        nWrite = Write(connectID, buf, nRead);
   34.	        if (nWrite < 0) {
   35.	            printf("Peer2 fail to read from connect: %s\n", connectID);
   36.	            return;
   37.	        }
   38.	        printf("Peer2 write data: %s\n", buf);
   39.	    }
   40.	}
   ```

