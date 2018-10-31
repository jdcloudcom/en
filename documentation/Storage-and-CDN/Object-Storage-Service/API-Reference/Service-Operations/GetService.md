# GetService(ListBuckets)

For service address sending a Get request, you can return all Buckets owned by the requestor, where the "/" represents the root directory.

**Request Syntax**
```
GET / HTTP/1.1
Date: GMT Date
Authorization: SignatureValue
Host:s-bj.jcloud.com
``` 
**Response Element**

|Name|Description|
|-|-|
|Buckets|Set saving Bucket results<br>Type: List<Bucket>|
|maxAge|Life Cycle of Bucket|
|crrStatus|Whether there is an object replicating externally under this Bucket<br>Type:int:0(no replication) or 1(exist replication)|
|Name|Bucket Name. <br>Type: Character String
|CreationDate|Bucket creation time<br>Type: Time (format: "EEE, d MMM yyyy HH:mm:ss   GMT")<br>Eg. Mon, 10 Jul 2017  08:49:15 GMT|
|Location|Data center where Bucket locates<br>Type: Character String<br>currently return null character string" "

Detail Analysis:

1. This GetService API will only be valid for users passing verification.

2. If there is no user check information (i.e. anonymous access) in the request, return 403 Forbidden. Error code: AccessDenied.

Request Example
```
GET / HTTP/1.1
Date: Wed, 12 Jul 2017 10:38:35 GMT
Authorization: jingdong   298718BEDE59FF1B2E96A3152937D37B:mIdihnpi2ZtWTHaji555S0BBEBA=
Host: s-bj.jcloud.com
Connection: Keep-Alive
```
Response Example
```
HTTP/1.1 200 OK
Server: nginx
Date: Wed, 12 Jul 2017 10:38:35 GMT
Content-Type: application/json;charset=UTF-8
Content-Length: 462
Connection: keep-alive
x-jss-request-id: A2FC27C60E0BC115
 
{"Buckets":[{"maxAge":0,"crrStatus":0,"Name":"oss-test-cn-north-1",
"CreationDate":"Mon,   10 Jul 2017 08:49:15   GMT","Location":""},
{"maxAge":0,"crrStatus":0,"Name":"sanitytest-object-hb","CreationDate":"Mon,   
10 Jul 2017 13:47:57 GMT","Location":""},
{"maxAge":0,"crrStatus":0,"Name":"video-test","CreationDate":"Tue,   11 Jul 2017 10:03:07   GMT","Location":""},
{"maxAge":0,"crrStatus":0,"Name":"oss-test","CreationDate":"Wed,   12 Jul 2017 07:40:46 GMT","Location":""}]}
```
