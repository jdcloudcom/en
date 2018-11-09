# PutBucketReferer

PutBucketReferer Action can set an anti-leech chain of a Bucket, referer accesses White List and request access whether allows referer field is null.

**Request Syntax**

```
PUT /  ?bucketReferer
&Effect=
&RefererList =
&IsAllowNull=
Date: GMT Date
Authorization: SignatureValue
Host: BucketName.s-bj.jcloud.com
```
**Request Parameter**

|Name|Description|If Compulsory|
|-|-|-|
|Effect|BlackList and White List set <br>Type: Enumerated character string<br>Effective value: DENIED or ALLOW<br>ALLOW: White List, DENIED: Blacklist|Yes|
|RefererList|Specific contents of White List and Blacklist<br>Type: List<String><br>Effective value: if it is null, it is RefererList=[]|Yes|
|IsAllowNull|Assign request access whether allows referer field is null. <br>Type: Enumerated character string<br>Effective value: true or false Default value: true|Yes|

Detail Analysis:
1.Only the owner of Bucket can initiate Put Bucket Referer request, or return 403 Forbidden Message. Error code: AccessDenied.

2.Configurations assigned in IsAllowNull will replace previous IsAllowNull configurations, the field is a compulsory item, IsAllowNull configurations in the system by default are true.

3.This action will use the White List to replace the previously configured White List, when the RefererList uploaded by the user is blank (not inclusive of Referer request parameter), the action will replace the configured White List, which means deleting the previously configured RefererList.

**Not inclusive of request example of Referer**
```
PUT   /?bucketReferer&Effect=ALLOW&RefererList=%5B%5D&IsAllowNull=false   HTTP/1.1
Date: Tue, 11 Jul 2017   13:39:32 GMT
Authorization: jingdong qbS5QXpLORrvdrmb:AcXz2BHxhfC/z5T5YX/rvdS/2z4=
Host: oss-test.s-bj.jcloud.com
```
**Inclusive of request example of Referer**
```
PUT   /?bucketReferer&Effect=ALLOW&RefererList=%5B%22+www.baidu.com%22%2C%22+www.google.com%22%5D& 
IsAllowNull=false  HTTP/1.1
Date: Tue, 11 Jul 2017   13:43:53 GMT
Authorization: jingdong   qbS5QXpLORrvdrmb:Nd8NwDDzyj28M1jfGrTC7DGc1cg=
Host: oss-test.s-bj.jcloud.com
```

**Response Example** 
```
HTTP/1.1 200 OK
Server: nginx
Date: Tue, 11 Jul 2017   13:43:52 GMT
Content-Length: 0
Connection: keep-alive
x-jss-request-id:   8B5EDFD33A8FA3DB
X-Trace: 200-1499780632726-0-0-19-47-47
```
