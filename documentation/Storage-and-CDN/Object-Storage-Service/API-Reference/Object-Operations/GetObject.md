# GetObject

The action is used to obtain the specified Object content

**Request Syntax**

```
GET /ObjectName   HTTP/1.1
Host: BucketName. s.jcloud.com
Date: GMT   Date     
Authorization: signatureValue#Please refer to "Identity and Access Management"
Range: bytes=ByteRange(optional)
```
**Request Header**


Range specifies the obtained Object data content. If set   bytes=0-9, it represents transferring the 0th to 9th characters, totally 10 characters. For more information, refer to RFC2616

Detail Analysis:
1.GetObject may support breakpoint upload via range parameter, and the function is recommended for large Objects.

2.If Range parameter is used in request header; the returned message will contain the length of the whole file and the returned range, for example: Content-Range: bytes 0-9/44, representing that the length of the whole file is 44.

3.If the file does not exist, 404 Not Found error will be returned. Error code: NoSuchKey.

4.If the Object is stored as encrypted by the server, it will be decrypted automatically and returned to the user when GET the request.

**Request Example**

```
GET /example.jpg HTTP/1.1
Host: oss-example.s-bj.jcloud.com
Date: Tue, 11 Jul 2017   07:28:01 GMT    
Authorization: jingdong qbS5QXpLORrvdrmb:Ctm+uA40JmY3T3LvCZ6CkKkANXs=
```
**Response Example**

```
HTTP/1.1 200 OK
Server: nginx
Date: Tue, 11 Jul 2017   07:28:01 GMT
Content-Type: text/plain
Content-Length: 13
Connection: keep-alive
x-jss-request-id:   95CB505F50E9341D
Cache-Control:   max-age=2592000
Content-Disposition: inline;   filename="example.jpg"
Accept-Ranges: bytes
ETag:   "6457646542258052f767868fd686d74d"
Last-Modified: Tue, 11 Jul   2017 07:27:15 GMT
x-jss-storage-class: STANDARD
X-Trace: 200-1499758081049-0-0-19-45-45
```
**Range Request Example**

```
GET example.jpg HTTP/1.1
Host: oss-example.s-bj.jcloud.com
Range: bytes=0-9   
Date: Tue, 11 Jul 2017 07:34:11   GMT    
Authorization: jingdong qbS5QXpLORrvdrmb:/Aaawoo0xVq4XVMei/yK1UqhoFc=
```
**Range Response Example**

```
HTTP/1.1 206   Partial Content
Server: nginx
Date: Tue, 11 Jul 2017   07:34:11 GMT
Content-Type: text/plain
Content-Length: 10
Connection: keep-alive
Content-Range: bytes 0-9/13
x-jss-request-id:   A0D975825710D969
Cache-Control:   max-age=2592000
Content-Disposition: inline;   filename="example.jpg"
Accept-Ranges: bytes
ETag:   "6457646542258052f767868fd686d74d"
Last-Modified: Tue, 11 Jul   2017 07:27:15 GMT
x-jss-storage-class: STANDARD
X-Trace:   206-1499758451594-0-0-20-44-44
```
