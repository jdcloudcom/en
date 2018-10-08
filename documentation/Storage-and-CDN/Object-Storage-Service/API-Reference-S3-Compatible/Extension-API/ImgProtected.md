# ImgProtected

For image files, to avoid the risk of stolen images in the business, it is required to limit the image URL that are exposed outwards so as to make anonymous visitors only get images that have been shortened or watermarked. This scenario can be implemented by turning on the original image protection.

## PUT Bucket ImgProtected Condition

Set access rules for original image protection, if original rules exist, replace the original rules, when it is configured with access rules for original image protection, it shall be viewed as turning on original image protection function.

Request Syntax

```
PUT /?imgProtected HTTP/1.1
Host: bucket.s3.region.jcloudcs.com
Content-Length: ContentLength
Content-MD5: ContentMD5
Date: Date
Authorization: <Authorization_String>

<?xml version="1.0" encoding="UTF-8"?> 
<Condition>
  <Extension>extension1</Extension>   
  <Extension>extension2</Extension> 
</Condition>

```

Request Header

|Name| Description|Must or Not|
|-|-|-|
|Content-MD5|Upload MD5 value of data to verify whether data of the user is modified during transmission process. <br>Type: Character String<br>Default Value: None|No|

Request Elements

|Name| Description|Must or Not|
|-|-|-|
|Condition|Protection conditions of original image protection<br>Type: Container<br>Parent Node: None<br>Children Node: Extension|Yes|
|Extension|Extension name of object, limit of length of a single tag: 1000 bytes, range: a-z A-Z 0-9. <br>Report error for non-conformance: 400, error code: InvalidImgProtectedCondition<br>Type: Character String<br>Parent Node: Extension|Yes|

Detailed Analysis:

1. Length of http body uploaded by the user is limited to 4K, length of xml after blank removal is limited to 2K, report error for non-conformance: 400, error code: ImgProtectedConditionTooLarge

2. Report error when xml uploaded by the user does not conform to Condition rules: 400, error code: InvalidImgProtectedCondition

3. It cannot be initiated by non-owner user, namely, original image protection rules cannot be uploaded, return 403, error code: AccessDenied

4. If bucket does not exist, return 404, error code: NoSuchBucket

Request Example:

```
PUT /?imgProtected HTTP/1.1
Host: example-bucket.s3.cn-north-1.jcloudcs.com
X-Amz-Date: 20180117T122143Z
Authorization: signatureValue
Content-MD5: yzoQScp1SjEhK6u7tdCQbw==
Content-Length: 113

<?xml version="1.0" encoding="UTF-8"?><Condition><Extension>jpg</Extension><Extension>png</Extension></Condition>
```

Response Example:

```
HTTP/1.1 200 OK
Server: nginx
Date: Wed, 17 Jan 2018 12:21:40 GMT
Content-Length: 0
Connection: keep-alive
x-amz-request-id: 888B86A04354AFE0
Cache-Control: no-cache
```

## GET Bucket ImgProtected Condition

Get configuration of bucket original image protection

Request Syntax

```
GET /?imgProtected HTTP/1.1
Host: bucket.s3.region.jcloudcs.com
Date: Date
Authorization: <Authorization_String>
```

Response Elements

|Name| Description|Must or Not|
|Condition|Protection conditions of original image protection<br>Type: Container<br>Parent Node: None<br>Children Node: Extension|Yes|
|Extension|Extension name of object, limit of length of a single tag: 1000 bytes, range: a-z A-Z 0-9. <br>Report error for non-conformance: 400, error code: InvalidImgProtectedCondition<br>Type: Character String<br>Parent Node: Extension|Yes|

Detailed Analysis:

1. If original image protection configuration does not exist, return 404, error code: NoSuchImgProtectedCondition

2. The non-owner user cannot get rules, return 403, error code: AccessDenied

3. If bucket does not exist, return 404, error code: NoSuchBucket

Request Example
```
GET /?imgProtected HTTP/1.1
Host: example-bucket.s3.cn-north-1.jcloudcs.com
X-Amz-Date: 20180117T122144Z
Authorization: signatureValue
```

Response Example
```
HTTP/1.1 200 OK
Server: nginx
Date: Wed, 17 Jan 2018 12:21:41 GMT
Content-Type: text/xml;charset=UTF-8
Content-Length: 113
Connection: keep-alive
x-amz-request-id: B713D3A9BFF851EE
Cache-Control: no-cache
 
<?xml version="1.0" encoding="UTF-8"?><Condition><Extension>jpg</Extension><Extension>png</Extension></Condition>
```

## DELETE Bucket ImgProtected Condition

Delete original image protection configuration, namely, turn off original image protection function.

Request Syntax
```
DELETE /?imgProtected HTTP/1.1
Host: bucket.s3.region.jcloudcs.com
Date: Date
Authorization: <Authorization_String>
```
Detailed Analysis:

1. The original image protection rules of such bucket will be deleted at the same time of deleting bucket.

2. The non-owner user cannot delete rules, return 403, error code: AccessDenied

3. If bucket does not exist, return 404, error code: NoSuchBucket

Request Example
```
DELETE /?imgProtected HTTP/1.1
Host: example-bucket.s3.cn-north-1.jcloudcs.com
X-Amz-Date: 20180117T122640Z
Authorization: signatureValue
```

Response Example
```
HTTP/1.1 204 No Content
Server: nginx
Date: Wed, 17 Jan 2018 12:26:37 GMT
Connection: keep-alive
x-amz-request-id: BB086C85AB71F139
Cache-Control: no-cache
```
