# Put Bucket Cors

## Description
Add cors configuration for specified Bucket. If configuration is existed, OSS will replace it, and only Owner of Bucket can carry out the operation. You can set the configuration for the Bucket so that Bucket can provide service for cross-origin access.

cors rules are displayed in the form of XML text, containing sources and HTTP method. The maximum size of the text is 64KB. E.g., cors configuration of Bucket has the following two rules:
* First, CORSRule allows cross-origin requests of PUT, POST, DELETE from https://www.example.com. The rule also allows to initiate a pre-request through Access-Control-Request-Headers. So, in order to respond OPTIONS pre-request, OSS will return all request Header.
* Second, CORSRule allows all cross-origin GET requests and wildcard of "*" refers to all sources.
```
<CORSConfiguration>
 <CORSRule>
   <AllowedOrigin>http://www.example.com</AllowedOrigin>

   <AllowedMethod>PUT</AllowedMethod>
   <AllowedMethod>POST</AllowedMethod>
   <AllowedMethod>DELETE</AllowedMethod>

   <AllowedHeader>*</AllowedHeader>
 </CORSRule>
 <CORSRule>
   <AllowedOrigin>*</AllowedOrigin>
   <AllowedMethod>GET</AllowedMethod>
 </CORSRule>
</CORSConfiguration>
```
cors configuration also allows other optional parameters, shown as below:
```
<CORSConfiguration>
 <CORSRule>
   <AllowedOrigin>http://www.example.com</AllowedOrigin>
   <AllowedMethod>PUT</AllowedMethod>
   <AllowedMethod>POST</AllowedMethod>
   <AllowedMethod>DELETE</AllowedMethod>
   <AllowedHeader>*</AllowedHeader>
   <MaxAgeSeconds>3000</MaxAgeSeconds>
   <ExposeHeader>x-amz-server-side-encryption</ExposeHeader>
 </CORSRule>
</CORSConfiguration>
```
CORSRule includes the following additional optional parameters:
* MaxAgeSeconds- specifies response time of pre-request of OSS in browser cache. The value of the parameter is 3,000 seconds in the example. Cache can avoid browsers to repeatedly initial OPTIONS pre-request to OSS.
* ExposeHeader- the header list exposed to the browser, i.e., response header that users access from the application.
When OSS receives cross-origin request (OPTIONS pre-request), it will match requests from browsers in turn according to cors configuration in the Bucket and CORSRule. The succeeded matching requires the following conditions:
* Origin Header in the request must match AllowedOrigin element
* The request method or pre-request method must match allowedMethod element
* All Access-Control-Request-Headers headers in the pre-request must match AllowedHeader element

## Request
### Syntax
```
PUT /?cors HTTP/1.1
Host: <Bucket>.s3.<region>.jcloudcs.com 
Content-Length: <length>
Date: <date>
Authorization: <authorization string> (see Authenticating Requests (AWS Signature Version4))
Content-MD5: <MD5>

<CORSConfiguration>
  <CORSRule>
    <AllowedOrigin>Origin you want to allow cross-domain requests from</AllowedOrigin>
    <AllowedOrigin>...</AllowedOrigin>
    ...
    <AllowedMethod>HTTP method</AllowedMethod>
    <AllowedMethod>...</AllowedMethod>
    ...
    <MaxAgeSeconds>Time in seconds your browser to cache the pre-flight OPTIONS response for a resource</MaxAgeSeconds>
    <AllowedHeader>Headers that you want the browser to be allowed to send</AllowedHeader>
    <AllowedHeader>...</AllowedHeader>
     ...
    <ExposeHeader>Headers in the response that you want accessible from client application</ExposeHeader>
    <ExposeHeader>...</ExposeHeader>
     ...
  </CORSRule>
  <CORSRule>
    ...
  </CORSRule>
    ...
</CORSConfiguration>
```
### Request Parameter
No Request Parameters
### Request Header

Name|Description|Must
---|---|---
Content-MD5|Obtain 128-bit binary number from packet body with MD5 algorithm, then write it into Centen-MD5 through Base64 coding, which is applied to check data integrity. |Yes

### Request Elements

Name|Description|Must
---|---|---
CORSConfiguration|Set of CORSrule Elements, which is 100 Nr. at most. <br>Type: Container<br>Children: CORSRules<br>Ancestor: None|Yes
CORSRule|Allowed Sources and Methods. 100 Nr. at most. <br>Type: Container<br>Children: AllowedOrigin, AllowedMethod, MaxAgeSeconds, ExposeHeader, ID.<br>Ancestor: CORSConfiguration|Yes
ID|ID of Unique Identifier of Each Rule. Maximum characters of ID is 255. <br>Type: String<br>Ancestor: CORSRule|No
AllowedMethod|HTTP Method allowing Source Execution. <br>Type: Enum (GET, PUT, HEAD, POST, DELETE)<br>Ancestor: CORSRule|Yes
AllowedOrigin|Allow source of cross-origin request, support wildcard of "*" and contain up to one wildcard <br>Type: String<br>Ancestor: CORSRule|Yes
AllowedHeader|Specified Header allowed by Access-Control-Request-Headers in the pre-request. OSS will return allowed Header in the request. <br>Type: String<br>Ancestor: CORSRule|No
MaxAgeSeconds|Specify response time of pre-request of OSS in browser cache, 1 Nr. at most<br>Type: Integer (seconds)<br>Ancestor: CORSRule|No
ExposeHeader|The header list exposed to the browser, i.e., response header that users access from the application. <br>Type: String<br>Ancestor: CORSRule|No

## Response
### Response Header
No Special Response Header
### Response Element
No Response Element

## Examples
### Request Example
```
PUT /?cors HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com 
x-amz-date: Tue, 21 Aug 2012 17:54:50 GMT
Content-MD5: 8dYiLewFWZyGgV2Q5FNI4W==
Authorization: authorization string
Content-Length: 216

<CORSConfiguration>
 <CORSRule>
   <AllowedOrigin>http://www.example.com</AllowedOrigin>
   <AllowedMethod>PUT</AllowedMethod>
   <AllowedMethod>POST</AllowedMethod>
   <AllowedMethod>DELETE</AllowedMethod>
   <AllowedHeader>*</AllowedHeader>
   <MaxAgeSeconds>3000</MaxAgeSec>
   <ExposeHeader>x-amz-server-side-encryption</ExposeHeader>
 </CORSRule>
 <CORSRule>
   <AllowedOrigin>*</AllowedOrigin>
   <AllowedMethod>GET</AllowedMethod>
   <AllowedHeader>*</AllowedHeader>
   <MaxAgeSeconds>3000</MaxAgeSeconds>
 </CORSRule>
</CORSConfiguration>
```

### Response Example
```
HTTP/1.1 200 OK
x-amz-request-id: BDC4B83DF5096BBE
Date: Tue, 21 Aug 2012 17:54:50 GMT
Server: JDCloudOSS
```
