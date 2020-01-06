# GET Object retention

## Description

Via this operation, file retention period can be gotten.

## Request
### Syntax

```HTTP
GET /<object-key>?retention HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Date: date
Authorization: authorization string
```

### Request Parameter
No Request Parameter

## Response

### Response Element
Request element in the same Put Object retention

## Examples
### Request Example

```HTTP
GET /<object-key>?retention HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Date: Thu, 12 Apr 2018 21:37:21 GMT
Authorization: authorization string
```

### Response Example
```HTTP
HTTP/1.1 200 OK
x-amz-request-id: 0M26D08072A8EX6A
x-amz-date: Thu, 12 Apr 2018 21:37:21 GMT
Content-Length: 643
Server: JDCloudOSS

<Retention>
    <Mode>GOVERNANCE</Mode>
    <RetainUntilDate>2019-06-16T10:00:00.000Z</RetainUntilDate>
</Retention>
```
