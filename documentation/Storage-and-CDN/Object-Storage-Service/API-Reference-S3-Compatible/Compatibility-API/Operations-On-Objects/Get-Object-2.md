# Get Object

## Description
Operation can retrieve Object from OSS, and you must have READ permission to the Object. If the Object permission is Public and Read, then Object can be retrieved without signature verification.

## Request
### Syntax
```
GET /ObjectName HTTP/1.1
Host: <bucket>.s3.<region>.jcloudcs.com 
Date: <date>
Authorization: <authorization string> (see Authenticating Requests (AWS Signature Version4))
Range:bytes=<byte_range>
```
### Request Parameter
No Request Parameters

### Request Header
Except sharing request Header, the operation can be implemented by the following request Header with the size not exceeding 8KB.

Name|Description|Must
---|---|---
Range|Specify byte range to download ObjectObject<br>Type: String<br>Default: None<br>Constraints: None|No
If-Modified-Since|If Object is modified after specified time, the Object will be returned, otherwise 304 (not modified) will be returned<br>Type: String<br>Default: None<br>Constraints: None|No
If-Unmodified-Since|If Object is not modified after specified time, the Object will be returned, otherwise 412 (precondition failed) will be returned. <br>Type: String<br>Default: None<br>Constraints: None|No
If-Match|If the ETag is consistent with the specified ETag, the Object will be returned, otherwise 412 (precondition failed) will be returned. <br>Type: String<br>Default: None<br>Constraints: None|No
IF-None-Match|If the ETag is inconsistent with the specified ETag, the Object will be returned, otherwise 304 (not modified) will be returned. <br>Type: String<br>Default: None<br>Constraints: None|No

Note:
+ If both If-Match and If-Unmodified-Since are existed in the request, If-Match is true, and If-Unmodified-Since is false, OSS will return 200 OK
+ If both If-None-Match and If-Modified-Since are existed in the request, If-None-Match is false, and If-Modified-Since is true, OSS will return 403 Not Modified

## Response

### Response Header

Name|Description
---|---
x-amz-storage-class|Provide storage type information of Object

### Response Element
No Response Element

## Examples
### Request Example
```
GET /my-image.jpg HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com 
Date: Mon, 3 Oct 2016 22:32:00 GMT
Authorization: <authorization string>
```
### Return Example
```
HTTP/1.1 200 OK
x-amz-request-id: 318BC8BC148832E5
Date: Mon, 3 Oct 2016 22:32:00 GMT
Last-Modified: Wed, 12 Oct 2009 17:50:00 GMT
ETag: "fba9dede5f27731c9771645a39863328"
Content-Length: 434234

[434234 bytes of object data]
```





