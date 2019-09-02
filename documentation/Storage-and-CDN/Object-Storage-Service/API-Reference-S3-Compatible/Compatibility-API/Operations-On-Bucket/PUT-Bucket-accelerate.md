# PUT Bucket accelerate

## Description

This operation can set acceleration for the existing Bucket, and supports enabling and pause.

## Request
### Syntax
```HTTP
PUT /?accelerate HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Content-Length: length
Date: date
Authorization: authorization string
 
<AccelerateConfiguration xmlns="http://s3.amazonaws.com/doc/2006-03-01/"> 
  <Status>transfer acceleration state</Status> 
</AccelerateConfiguration>
```

### Request Parameter

No Request Parameter

### Request Header

No Special Request Header

### Request Element

Name|Description|Must
---|---|---
AccelerateConfiguration|Set of acceleration status settings. <br>Type: Container<br>Subtag: Status|Yes
Status|Acceleration Status<br>Type: Enum<br>Effective Value: Enabled, Suspended<br>Parent Tag: AccelerateConfiguration|Yes

## Response
### Response Header
No Special Response Header
### Response Element
No Response Element
### Special Error

HTTP Status Code|Error Code|Error Meaasge|Description
-|-|-|-
400|MalformedXML|The XML you provided was not well-formed or did not validate against our published schema|The request XML is illegal
403|AccessForbidden|put accelerate failed, please open cdn service first|Disable CDN Service

## Examples
### Request Example
```HTTP
PUT /?accelerate HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Date: Mon, 11 Apr 2016 12:00:00 GMT
Authorization: authorization string
Content-Type: text/plain
Content-Length: length
 
<AccelerateConfiguration xmlns="http://s3.amazonaws.com/doc/2006-03-01/"> 
  <Status>Enabled</Status> 
</AccelerateConfiguration>
```
### Response Example
```HTTP
HTTP/1.1 200 OK
x-amz-request-id: 9E26D08072A8EF9E
Date: Wed, 14 May 2014 02:11:22 GMT
Content-Length: 0
Server: JDCloudOSS
```







