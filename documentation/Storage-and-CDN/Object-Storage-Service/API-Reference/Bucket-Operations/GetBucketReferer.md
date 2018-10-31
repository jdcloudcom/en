# GetBucketReferer

Get Bucket Referer Action is used to view Referer relevant configuration of Bucket anti-leech chain. 

**Request Syntax**
```
GET   /?bucketReferer HTTP/1.1
Host: BucketName.s-bj.jcloud.com
Date: GMT Date
Authorization: signatureValue
```
**Response Elements**

|Name|Description|
|-|-|
|Effect|Blacklist and White List set <br>Type: Enumerated character string<br>Effective value: DENIED or ALLOW<br>ALLOW: White List, DENIED: Blacklist|
|Value|Save Namelist Container<br>Type: List<String>Container
|AllowNull|Assign request access whether allows referer field is null. <br>Effective value: TRUE (maybe null), FALSE(cannot be null)<br>Type: Enumerated character string

Detail Analysis:

1.If Bucket does not exist, return 404 error. Error code: NoSuchBucket.

2.Only the owner of Bucket can view Referer configuration information of Bucket, or return 403 Forbidden Error, error code: AccessDenied.

3.If Bucket is not subject to the Referer relevant configuration, OSS will return the default AllowNull Value and a Null Value.

**Request Example**
```
GET   /?bucketReferer HTTP/1.1
Date: Tue, 11 Jul 2017   09:12:11 GMT
Authorization: jingdong   qbS5QXpLORrvdrmb:x7J06zQT3CJ5qF3CXKTKWjVBLvc=
Host: oss-test.s-bj.jcloud.com
Connection: Keep-Alive
```

**Already set return example of Referer rules**
```
HTTP/1.1 200 OK
Server: nginx
Date: Tue, 11 Jul 2017   09:12:10 GMT
Content-Type:   application/json;charset=UTF-8
Content-Length: 43
Connection: keep-alive
x-jss-request-id:   A84C875C916A1E24
{"AllowNull":false,"Effect":"ALLOW","Value":["www.abc.com","www.*.com"]}
```

**Response example of Referer rules is not set**
```
HTTP/1.1 204 No   Content
Server: nginx
Date: Tue, 11 Jul 2017   09:52:11 GMT
Connection: keep-alive
x-jss-request-id: A4EA285FA0BCED06
{"AllowNull":false,"Effect":"ALLOW","Value":[]}
```
