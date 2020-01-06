# PUT Object retention

## Description

Via this operation, file retention period can be set.

## Request
### Syntax

```HTTP
PUT /<object-key>?retention HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Date: date
Authorization: authorization string
 
<Retention>
    <Mode><value></Mode>
    <RetainUntilDate><value></RetainUntilDate>
</Retention>
```

### Request Parameter
No Request Parameter

### Request Element

Name|Description|Must
---|---|---
Retention|Mode and RetainUntilDate Container<br>Type: Container|Yes
Mode|Retention period mode<br>Valid value: GOVERNANCE and COMPLIANCE<br>Type: String<br>Parent tag: Retention|No
RetainUntilDate|Retention expiration date<br>Type: dateTime (such as 2019-06-16T10:00:00.000Z)<br>Parent tag: Retention|Exist only when there is a Mode

## Examples
### Request Example

```HTTP
PUT /<object-key>?retention HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Content-Length: 643
Date: Thu, 12 Apr 2018 21:37:21 GMT
Authorization: authorization string

<Retention>
    <Mode>GOVERNANCE</Mode>
    <RetainUntilDate>2019-06-16T10:00:00.000Z</RetainUntilDate>
</Retention>
```

### Response Example
```HTTP
HTTP/1.1 200 OK
x-amz-request-id: 7F26D08072A8EF2Z
x-amz-date: Thu, 12 Apr 2018 21:37:21 GMT
Content-Length: 0
Server: JDCloudOSS
```
