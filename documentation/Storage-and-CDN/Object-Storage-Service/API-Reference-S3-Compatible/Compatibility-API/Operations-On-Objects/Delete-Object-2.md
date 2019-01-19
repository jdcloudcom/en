# Delete Object

## Description
The operation can delete Object, and DELETE permission of the Object is required.

## Request
### Syntax
```
DELETE /ObjectName HTTP/1.1
Host: <bucket>.s3.<region>.jcloudcs.com 
Date: <date>
Content-Length: <length>
Authorization: <authorization string> (see Authenticating Requests (AWS Signature Version4))
```
### Request Parameter
No Request Parameters
### Request Header
No Special Request Header
### Request Elements
No Special Element

## Response
### Response Header
No Special Response Header
### Response Element
No Response Element

## Examples
### Request Example
```
DELETE /my-second-image.jpg HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com 
Date: Wed, 12 Oct 2009 17:50:00 GMT
Authorization: <authorization string>
Content-Type: text/plain
```
### Response Example
```
HTTP/1.1 204 NoContent
x-amz-request-id: 0A49CE4060975EAC
Date: Wed, 12 Oct 2009 17:50:00 GMT
Content-Length: 0
Connection: close
Server: JDCloudOSS
```



