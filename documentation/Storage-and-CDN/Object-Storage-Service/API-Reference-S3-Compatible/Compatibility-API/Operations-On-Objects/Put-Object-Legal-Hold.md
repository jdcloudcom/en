# PUT Object legal hold

## Description

Via this operation, legal hold of file can be enabled or disabled.

## Request
### Syntax

```HTTP
PUT /<object-key>?legal-hold HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Date: date
Authorization: authorization string
 
<LegalHold>
   <Status><value></Status>
</LegalHold>  
```

### Request Parameter
No Request Parameter

### Request Element

Name|Description|Must
---|---|---
LegalHold|Status container<br>Type: Container|Yes
Status|Legal Hold Status<br>Valid value: ON and OFF<br>Type: String<br>Parent tag: LegalHold|Yes

## Examples
### Request Example

```HTTP
PUT /<object-key>?legal-hold HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Content-Length: 341
Date: Thu, 12 Apr 2018 21:37:21 GMT
Authorization: authorization string

<LegalHold>
   <Status>ON</Status>
</LegalHold>  
```

### Response Example
```HTTP
HTTP/1.1 200 OK
x-amz-request-id: 7F26D08072A8EF2Z
x-amz-date: Thu, 12 Apr 2018 21:37:21 GMT
Content-Length: 0
Server: JDCloudOSS
```
