# Delete Bukcet website

## Description
The operation deletes static website hosted configuration in specified Bucket, only Owner of the Bucket can carry out the operation.

## Request
### Syntax
```
DELETE /?website HTTP/1.1
Host: <bucket>.s3.<region>.jcloudcs.com 
Date: <date>
Authorization: <authorization string> (see Authenticating Requests (AWS Signature Version4))
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

## Examples
### Request Example
```
DELETE ?website HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com 
Date: Thu, 27 Jan 2011 12:00:00 GMT
Authorization: <authorization string>
```

### Response Example
```
HTTP/1.1 204 No Content
x-amz-request-id: AF1DD829D3B49707
Date: Thu, 03 Feb 2011 22:10:26 GMT
Server: JDCloudOSS
```
