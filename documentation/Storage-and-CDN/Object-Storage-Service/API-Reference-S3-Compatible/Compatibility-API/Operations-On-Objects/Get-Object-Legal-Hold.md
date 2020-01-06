# GET Object legal hold

## Description

Via this operation, file legal hold status can be gotten.

## Request
### Syntax

```HTTP
GET /<object-key>?legal-hold HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Date: date
Authorization: authorization string
```

### Request Parameter
No Request Parameter

## Response

### Response Element
Request element in the same Put Object legal hold

## Examples
### Request Example

```HTTP
GET /<object-key>?legal-hold HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Date: Thu, 12 Apr 2018 21:37:21 GMT
Authorization: authorization string
```

### Response Example
```HTTP
HTTP/1.1 200 OK
x-amz-request-id: 0M26D08072A8EX6A
x-amz-date: Thu, 12 Apr 2018 21:37:21 GMT
Content-Length: 341
Server: JDCloudOSS

<LegalHold>
   <Status>ON</Status>
</LegalHold>  
```
