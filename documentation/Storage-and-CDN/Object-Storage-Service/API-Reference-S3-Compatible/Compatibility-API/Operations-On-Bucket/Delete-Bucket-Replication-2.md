# Delete Bucket replication

## Description
Delete replication configuration of specified Bucket.

## Request
### Syntax
```
DELETE /?replication HTTP/1.1
Host: <bucket>.s3.<region>.jcloudcs.com 
Date: <date>
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

## Examples
### Request Example
```
DELETE /?replication HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com 
Date: Wed, 11 Feb 2015 05:37:16 GMT
20150211T171320Z

Authorization: <authorization string> 
```
### Response Example
```
HTTP/1.1 204 No Content  
x-amz-request-id: 656c76696e672example  
Date: Wed, 11 Feb 2015 05:37:16 GMT
Connection: keep-alive  
Server: JDCloudOSS    
```
