# DELETE Bucket policy

## Description
The operation deletes policy of designated Bucket, only Owner of the Bucket can carry out the operation.

## Request
### Syntax
```
DELETE /?policy HTTP/1.1
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
Contain the status of DELETE operation, including error codes of failed requests.

## Examples
### Request Example
```
DELETE /?policy HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com 
Date: Tue, 04 Apr 2010 20:34:56 GMT  
Authorization: <authorization string>
```
### Response Example
```
HTTP/1.1 204 No Content 
x-amz-request-id: 656c76696e672SAMPLE5657374  
Date: Tue, 04 Apr 2010 20:34:56 GMT  
Connection: keep-alive  
Server: JDCloudOSS
```
