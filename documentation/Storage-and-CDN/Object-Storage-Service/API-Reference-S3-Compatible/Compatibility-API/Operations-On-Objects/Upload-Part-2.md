# Upload Part

## Description
Upload single multipart in the Multipart Upload. You must initial a new multipart upload event. In the initialization request, OSS will return Upload ID that is regarded as the unique identifier, and your multipart upload request needs to contain the ID.

The number of multiparts is any number from 1 to 10,000, multipart number is the unique identifier of a multipart and also is the location identifier of the multipart in the whole Object.

In order to ensure that the data are not corrupted in transmission, you can specify Content-MD5 in the multipart upload request, and OSS will check multipart data according to the MD5 value. In case of mismatching, it will return an error.

Note: After initialing multipart upload and uploading one or multiple multiparts, OSS will charge the bucket occupied by the multipart by volume, and you must complete or terminate multipart upload to stop storage cost of the multipart charged by OSS.

## Request
### Syntax
```
PUT /ObjectName?partNumber=PartNumber&uploadId=UploadId HTTP/1.1
Host: <Bucket>.s3.<region>.jcloudcs.com 
Date: <date>
Content-Length: <Size>
Authorization: <authorization string>
```
### Request Parameter

Name|Description|Must
---|---|---
partNumber|Multipart Number, which is the unique identifier of a multipart and also is the location identifier of the multipart in the whole Object. <br>Type: String|Yes
uploadId|Upload ID, which is the unique identifier returned in the initialization multipart upload request. <br>Type: String|Yes

### Request Header
Except public request Headers, the following Headers also can be used.

Name|Description|Must
---|---|---
Content-Length|The size unit of Object is byte; see RFC2616 for detailed description.<br>Type: String<br>Default: None<br>Constraints: None|Yes
Content-MD5|Obtain 128-bit binary number from packet body with MD5 algorithm, then write it into Centen-MD5 through Base64 coding, which is applied to check data integrity. <br>Type: String<br>Default: None<br>Constraints: None|No
Expect|The client uses Expect to inform OSS, expecting to occur certain specific behavior. If errors occur because OSS cannot respond, request packet body will not be sent. <br>Type: String<br>Default: None<br>Valid Values: 100-continue<br>Constraints: None|No

### Request Elements
No Request Elements

## Response
### Response Header
Except general response Header, it also includes the following response Header.

Name|Description
---|---
x-amz-storage-class|Storage Type of Object. OSS returns the Header for Objects of non-standard storage. <br>Type: String<br>Default: None

### Response Element
No Response Element

### Special Error

Error Code|Description|HTTP Status Code|SOAP Fault Code Prefix
---|---|---|---
NoSuchUpload|The specified multipart upload is absent. Upload ID may be invalid. |404 Not Found|Client

## Examples
### Request Example
```
PUT /my-movie.m2ts?partNumber=1&uploadId=VCVsb2FkIElEIGZvciBlbZZpbmcncyBteS1tb3ZpZS5tMnRzIHVwbG9hZR HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com 
Date:  Mon, 1 Nov 2010 20:34:56 GMT
Content-Length: 10485760
Content-MD5: pUNXr/BjKK5G2UKvaRRrOA==
Authorization: <authorization string>

***part data omitted***
```
### Response Example
```
HTTP/1.1 200 OK
x-amz-request-id: 656c76696e6727732072657175657374
Date:  Mon, 1 Nov 2010 20:34:56 GMT
ETag: "b54357faf0632cce46e942fa68356b38"
Content-Length: 0
Connection: keep-alive
Server: JDCloudOSS
```

