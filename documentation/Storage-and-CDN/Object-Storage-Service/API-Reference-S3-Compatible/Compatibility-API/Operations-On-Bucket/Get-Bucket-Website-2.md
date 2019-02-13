# Get Bucket website

## Description
The operation returns static website hosted configuration of specified Bucket, which is only available to the Owner of the Bucket.

## Request
### Syntax
```
GET /?website HTTP/1.1
Host: <bucket>.s3.<region>.jcloudcs.com 
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
### Response Element
It is the same as request element of Put Bucket website when responding XML.

## Examples
### Request Example
```
GET ?website HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com 
Date: Thu, 27 Jan 2011 00:49:20 GMT
Authorization: <authorization string>
```
### Response Example
```
HTTP/1.1 200 OK
x-amz-request-id: 3848CD259D811111
Date: Thu, 27 Jan 2011 00:49:26 GMT
Content-Length: 240
Content-Type: application/xml
Transfer-Encoding: chunked
Server: JDCloudOSS

<?xml version="1.0" encoding="UTF-8"?>
<WebsiteConfiguration xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
  <IndexDocument>
    <Suffix>index.html</Suffix>
  </IndexDocument>
  <ErrorDocument>
    <Key>404.html</Key>
  </ErrorDocument>
</WebsiteConfiguration>
```

