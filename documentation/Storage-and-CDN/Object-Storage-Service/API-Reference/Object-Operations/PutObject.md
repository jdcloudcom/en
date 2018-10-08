# PutObject

The action is used to upload a new Object to the specified Bucket

**Request Syntax**

```
PUT /ObjectName HTTP/1.1
Content-Length:ContentLength
Content-Type: ContentType
Content-MD5: Content-MD5
Host: BucketName. s.jcloud.com
x-jss-server-side-encryption:   true or false      
x-jss-storage-class: STANDARD   or REDUCED_REDUNDANCY
Date: GMT  Date     
Authorization:   signatureValue#Please refer to "Identity and Access Management"
```

**Request Header**

|Name|Description|
|-|-|
|Content-MD5|MD5 value of uploaded data used to verify whether the user’s data is modified during transmission<br>Type: Character string<br>Default Value: None|
|x-jss-server-side-encryption|Encrypt or not at the server when specifying jss to create object<br>Type: boolean<br>Legal value: true, false|
|x-jss-storage-class|Object storage type, the default value is "STANDARD" (standard storage). <br>Support "STANDARD" (standard storage) and "REDUCED_REDUNDANCY" (low frequency access type) storage types<br>Note: Currently "REDUCED_REDUNDANCY" (low frequency access type) is only supported by the machine room in North China<br>Type: Character string<br>Default Value: "STANDARD" (standard storage)|
|Cache-Control|Specify the redis of webpage when the Object is downloaded; For detailed description, please refer to RFC2616.<br>Type: Character string<br>Default Value: 2592000|

Detail Analysis:

1.The maximum length of uploading data with put object is suggested not to exceed 5GB. Uploading by parts is suggested for larger files.

2.The action is atomic, the action either succeeds or fails, and only updating partial data will never occur.

3.In case that keys are the same, the original files will be directly replaced.

4.End-to-end verification may be carried out by client through HTTP header Content-MD5 to guarantee the completeness of the uploaded data. Before uploading, the client will compute the Content-MD5 value of uploaded data, and upload the value together with data to cloud storage. After the cloud storage receives the data, it will compute the Content-MD5 value of the received data again, compare it with the Content-MD5 provided by the client, and save the data to the cloud storage only when the Content-MD5 values match with each other, or the server will return error and the uploading fails.

5.If the "Content-Length" value in request header is shorter than the data length transmitted in actual request body (body), OSS will fail to upload files, and the uploaded data will be discarded.

6.If Content length parameter is not added to Head, 400 Length Required error will be returned. Error code: MissingContentLength

7.If the Bucket where the Object to be added does not exist, 404 Not Found error will be returned. Error code: NoSuchBucket.

8.If the length of incoming Object key is longer than 1022 bytes, 400 Bad Request will be returned. Error code: InvalidArgument

**Request Example**

```
PUT /example.jpg HTTP/1.1
Host: oss-example.s-bj.jcloud.com
Content-Length: 13
Content-Type: text/plain
Content-MD5: 6457646542258052f767868fd686d74d 
x-jss-server-side-encryption:   false 
Date: Tue, 11 Jul 2017   07:13:32 GMT    
Authorization: jingdong   qbS5QXpLORrvdrmb:cQ63NndHAoEBmjZHehSuNWG/Jns=
```
**Response Example**

```
HTTP/1.1 200 OK
Server: nginx
Date: Tue, 11 Jul 2017   07:13:32 GMT
Content-Length: 0
Connection: keep-alive
x-jss-request-id:   8E4FC95C05EC1A4C
ETag:   "6457646542258052f767868fd686d74d"
X-Trace:   200-1499757212162-0-0-20-50-50
```
**Request Example (Content-Type and Content-MD5 are not set):**

```
PUT /example.jpg HTTP/1.1
Host:   oss-example.s-bj.jcloud.com
x-jss-server-side-encryption:   true  
Date: Thu, 13 Jul 2017   02:12:02 GMT    
Authorization: jingdong     qbS5QXpLORrvdrmb:S2ZHyLfdZml/bRjD/TEQ+ftJXBA=
```
**Response Example (Content-Type and Content-MD5 are not set):**

```
HTTP/1.1 200 OK
Server: nginx
Date: Thu, 13 Jul 2017   02:12:13 GMT
Content-Length: 0
Connection: keep-alive
x-jss-request-id: 9457B50779BA6947
ETag: "77abd5a162ef88440102129fffbb404c"
X-Trace: 200-1499911919867-0-12790-12809-13303-13303
```
