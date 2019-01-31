# Delete Bucket Lifecycle

## Description
Delete the life cycle configuration of specified Bucket.

## Request
### Syntax
```
DELETE /?lifecycle HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jcloudcs.com
Date: date
Authorization: authorization string
```
### Request Parameter
No Request Parameter
### Request Header
No Special Request Header
### Request Elements
No Request Element

## Response
### Response Header
No Special Response Header

## Examples
### Request Example
```
DELETE /?lifecycle HTTP/1.1·
Host: <BUCKET_NAME>.s3.<REGION>.jcloudcs.com
Date: date
Authorization: authorization string 
```

### Response Example
```
HTTP/1.1 204 No Content  
x-amz-request-id: 656c76696e672example  
Date: Wed, 11 Feb 2015 05:37:16 GMT
Connection: keep-alive  
Server: JDCloudOSS    
```
