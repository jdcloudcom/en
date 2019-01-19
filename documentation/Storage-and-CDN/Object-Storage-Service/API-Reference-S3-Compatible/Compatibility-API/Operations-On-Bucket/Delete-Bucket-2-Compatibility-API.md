# Delete Bucket

## Description
The operation can delete specified Bucket. Before deleting a Bucket, all Objects in it shall be deleted.

## Request
### Syntax
```
DELETE / HTTP/1.1
Host: <bucket>.s3.<region>.jcloudcs.com 
Date: <date>
Authorization: <authorization string> (see Authenticating Requests (AWS Signature Version4))
```

### Request Parameter
No Request Parameters

### Request Header
The operation only uses general request Header, please see Headers of common requests.

### Request Elements
No Request Elements

## Response
### Response Header
The operation only uses general response Header, please see common response Header.

## Examples
### Request Example
The request deletes the bucket named "oss-example".
```
DELETE / HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com 
Date: Wed, 01 Mar  2006 12:00:00 GMT
Authorization: <authorization string>
```
### Response Example
```
HTTP/1.1 204 No Content
x-amz-request-id: 32FE2CEB32F5EE25
Date: Wed, 01 Mar  2006 12:00:00 GMT
Connection: close
Server: JDCloudOSS
```
