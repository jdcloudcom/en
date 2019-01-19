# Get Bucket cors

## Description
Return cors configuration information in the specified Bucket, which is only available to the Owner of Bucket.

## Request
### Syntax
```
GET /?cors HTTP/1.1
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

Name|Description
---|---
CORSConfiguration|Set of CORSrule Elements, which is 100 Nr. at most. <br>Type: Container<br>Children: CORSRules<br>Ancestor: None
CORSRule|Allowed Sources and Methods. 100 Nr. at most. <br>Type: Container<br>Children: AllowedOrigin, AllowedMethod, MaxAgeSeconds, ExposeHeader, ID.<br>Ancestor: CORSConfiguration
ID|ID of Unique Identifier of Each Rule. Maximum characters of ID is 255. <br>Type: String<br>Ancestor: CORSRule
AllowedMethod|HTTP Method allowing Source Execution. <br>Type: Enum (GET, PUT, HEAD, POST, DELETE)<br>Ancestor: CORSRule
AllowedOrigin|Allow source of cross-origin request, which supports wildcard "*" and at most contains one wildcard<br>Type: String<br>Ancestor: CORSRule
AllowedHeader|Specified Header allowed by Access-Control-Request-Headers in the pre-request. OSS will return allowed Header in the request. <br>Type: String<br>Ancestor: CORSRule
MaxAgeSeconds|Specified response time of pre-request of OSS in browser cache, 1 Nr. at most<br>Type: Integer (seconds)<br>Ancestor: CORSRule
ExposeHeader|The header list exposed to the browser, i.e., response header that users access from the application. <br>Type: String<br>Ancestor: CORSRule

## Examples
### Request Example
```
GET /?cors HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com 
Date: Tue, 13 Dec 2011 19:14:42 GMT
Authorization: <authorization string>
```

### Response Example
```
HTTP/1.1 200 OK
x-amz-request-id: 0CF038E9BCF63097
Date: Tue, 13 Dec 2011 19:14:42 GMT
Server: JDCloudOSS
Content-Length: 280

<CORSConfiguration>
     <CORSRule>
       <AllowedOrigin>http://www.example.com</AllowedOrigin>
       <AllowedMethod>GET</AllowedMethod>
       <MaxAgeSeconds>3000</MaxAgeSec>
       <ExposeHeader>x-amz-server-side-encryption</ExposeHeader>
     </CORSRule>
</CORSConfiguration>
```
