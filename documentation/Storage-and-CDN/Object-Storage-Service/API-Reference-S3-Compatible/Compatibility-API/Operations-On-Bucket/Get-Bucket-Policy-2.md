# Get Bucket Policy
  
## Description
The operation can return policy of designated Bucket. Only Owner of Bucket can carry out the operation.
## Request
### Syntax
```
GET /?policy HTTP/1.1
Host: <bucket>.s3.<region>.jcloudcs.com 
Date: <date>
Authorization: <authorization string> (see Authenticating Requests (AWS Signature Version4))
```
### Request Parameter
No Request Parameters
### Request Header
No Special Response Header
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
GET ?policy HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com 
Date: Wed, 28 Oct 2009 22:32:00 GMT
Authorization: <authorization string>
```
### Response Example
```
HTTP/1.1 200 OK   
x-amz-request-id: 656c76696e67SAMPLE57374  
Date: Tue, 04 Apr 2010 20:34:56 GMT  
Connection: keep-alive  
Server: JDCloudOSS  

{
"Version":"2008-10-17",
"Id":"aaaa-bbbb-cccc-dddd",
"Statement" : [
    {
        "Effect":"Deny",
        "Sid":"1", 
        "Principal" : {
            "AWS":["111122223333","444455556666"]
        },
        "Action":["s3:*"],
        "Resource":"arn:aws:s3:::bucket/*"
    }
 ] 
}
```
