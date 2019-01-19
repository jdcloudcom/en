# Put Object

## Description
The operation can upload one object to the bucket, and the operator is required WRITE permission of the bucket.

You can use Content-MD5 to ensure the data integrity, and OSS will verify the Object according to the provided MD5. If not matching, it will return an error. In addition, you can also calculate MD5 when uploading the object, and compare it with returned ETag.

## Request
### Syntax
```
PUT /ObjectName HTTP/1.1
Host: <bucket>.s3.<region>.jcloudcs.com
Date: <date>
Authorization: <authorization string> (see Authenticating Requests (AWS Signature Version4))
```

### Request Elements
No Request Elements

### Request Header
The operation can use the following request Header and general request Header (see Common Request Headers); the size of Header shall not exceed 8KB.

Name|Description|Must
---|---|---
Cache-Control|Specify the cache behaviors of the web page when the Object is downloaded; see RFC2616 for detailed description.<br>Type: String<br>Default: None<br>Constraints: None|No
Content-Disposition|Specify which form will the returned Object be displayed, with the length being limited to 100 bytes; See RFC2616 for detailed description.<br>Type: String<br>Default: None<br>Constraints: None|No
Content-Encoding|Its value presents what kind of content encoding conversion that the message body carried out, which is used to inform the client how to decode for obtaining media type content indicated in Content-Type; see RFC2616 for detailed description.<br>Type: String<br>Default: None<br>Constraints: None|No
Content-Length|The size unit of Object is byte; see RFC2616 for detailed description.<br>Type: String<br>Default: None<br>Constraints: None|Yes
Content-MD5|Obtain 128-bit binary number from packet body with MD5 algorithm, and then write it into Centen-MD5 through Base64 coding, which is applied to check data integrity. <br>Type: String<br>Default: None<br>Constraints: None|No
Content-Type|Present MIME type in the request. <br>Type: String<br>Default: binary/octet-stream<br>Valid Values: MIME types<br>Constraints: None|No
Expect|The client uses Expect to inform OSS, expecting to occur certain specific behavior. If errors occur because OSS cannot respond, request packet body will not be sent. <br>Type: String<br>Default: None<br>Valid Values: 100-continue<br>Constraints: None|No
Expires|Object Cache Expiration Time. <br>Type: String<br>Default: None<br>Constraints: None|No
x-amz-storage-class| Object Storage Type, if it is not specified, it will be standard storage by default. <br>Type: Enum<br>Default: STANDARD<br>Valid Values: STANDARD, REDUCED_REDUNDANCY|No

## Response
### Response Header
Except general response Header, it also includes the following response Header.

Name|Description
---|---
x-amz-expiration|If the Object has expiration time (it will be supported after Put Bucket lifecycle launch), the Header will be contained in the response. <br>Type: String

### Response Element
No Special Response Element

## Examples
### Request Example
```
PUT /my-image.jpg HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com 
Date: Wed, 12 Oct 2009 17:50:00 GMT
Authorization: <authorization string>
Content-Type: text/plain
Content-Length: 11434
Expect: 100-continue
[11434 bytes of object data]
```
### Response Example
```
HTTP/1.1 100 Continue

HTTP/1.1 200 OK
x-amz-request-id: 0A49CE4060975EAC
Date: Wed, 12 Oct 2009 17:50:00 GMT
ETag: "1b2cf535f27731c974343645a3985328"
Content-Length: 0
Connection: close
Server: JDCloudOSS
```





