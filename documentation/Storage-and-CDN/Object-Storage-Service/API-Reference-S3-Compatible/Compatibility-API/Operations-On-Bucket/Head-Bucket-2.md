# Head Bucket

## Description
The operation is used for confirming whether specified Bucket is existed.

## Request

## Syntax
```
HEAD / HTTP/1.1     
Host: <bucket>.s3.<region>.jcloudcs.com 
Date: <date>
Authorization: <authorization string> (see Authenticating Requests (AWS Signature Version4))    
```
### Request Parameter
No Request Parameters

### Request Elements
No Request Elements

### Request Header
The operation only uses general request Header, please see Headers of common requests.

## Response
### Response Header
The operation only uses general response Header, please see common response Header.
### Response Element
No Response Element

## Examples
### Request Example
```
HEAD / HTTP/1.1
Date: Fri, 10 Feb 2012 21:34:55 GMT
Authorization: <authorization string>
Host: oss-example.s3.<region>.jcloudcs.com 
Connection: Keep-Alive
```
### Response Example
```
HTTP/1.1 200 OK
x-amz-request-id: 32FE2CEB32F5EE25
Date: Fri, 10 2012 21:34:56 GMT
Server: JDCloudOSS
```
