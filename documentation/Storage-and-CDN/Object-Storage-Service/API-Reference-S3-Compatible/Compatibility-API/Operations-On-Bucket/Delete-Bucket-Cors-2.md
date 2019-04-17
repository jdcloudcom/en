# Delete Bucket cors

## Description
Delete cors configuration information in specified Bucket. Only Owner of Bucket can carry out the operation.

## Request
### Syntax
```HTTP
DELETE /?cors HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Date: <date>
Authorization: <authorization string> (see Authenticating Requests (AWS Signature Version4))
```

### Request Parameter
No Request Parameters

### Request Header
No Special Header
### Request Elements
No Request Elements

## Response
### Response Header
No Special Response Header

## Examples
### Request Example
```HTTP
DELETE /?cors HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Date: Tue, 13 Dec 2011 19:14:42 GMT
Authorization: <authorization string>
```

### Response Example
```HTTP
HTTP/1.1 204 No Content
x-amz-request-id: 0CF038E9BCF63097
Date: Tue, 13 Dec 2011 19:14:42 GMT
Server: JDCloudOSS
Content-Length: 0
```
