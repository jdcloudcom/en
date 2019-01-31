# Abort Multipart Upload

## Description
The operation will terminate multipart upload. After termination of multipart upload, Upload ID will be unavailable and the previously stored multipart will be released. You can use List Parts to ensure that all multiparts have been released.

## Request
### Syntax
```
DELETE /ObjectName?uploadId=UploadId HTTP/1.1
Host: <bucket>.s3.<region>.jcloudcs.com 
Date: <Date>
Authorization: <authorization string>
```

### Request Parameter
No Request Parameters
### Request Header
No Special Request Header
### Request Elements
No Request Elements

## Response
### Response Header
No Special Response Header
### Response Element
No Response Element
### Special Error

Error Code|Description|HTTP Status Code|SOAP Fault Code Prefix
---|---|---|---
NoSuchUpload|The specified multipart upload is absent, Upload ID may be invalid. |404 Not Found|Client

## Examples
### Request Example
```
DELETE /example-object?uploadId=VXBsb2FkIElEIGZvciBlbHZpbmcncyBteS1tb3ZpZS5tMnRzIHVwbG9hZ HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com 
Date:  Mon, 1 Nov 2010 20:34:56 GMT
Authorization: <authorization string>
```
### Response Example
```
HTTP/1.1 204 OK
x-amz-request-id: 996c76696e6727732072657175657374
Date:  Mon, 1 Nov 2010 20:34:56 GMT
Content-Length: 0
Connection: keep-alive
Server: JDCloudOSS
```
