# DELETE Bucket encryption
 Delete the default encryption configuration of OSS bucket. This interface is compatible with S3, and only supports the compatible S3 service domain name of OSS.
Refer to [Server Domain Name](https://docs.jdcloud.com/cn/object-storage-service/regions-and-endpoints)。
 
## Request Syntax
 
```
DELETE /eric-jdcloud/?encryption HTTP/1.1
Host: <bucket>.s3.<region>.jcloudcs.com
Date: Wed, 06 Sep 2018 12:00:00 GMT
Authorization: authorization string  (use signature version 4)

```
###  Request Parameter

There is no need to request parameter.

###  Request Head

There is no need for special request head.

###  Request Body

There is no need for request body.

## Response

### Response Head

 No Special Header.
 
### Example:

  Request Example:
  
```
DELETE /eric-jdcloud/?encryption HTTP/1.1
Host: examplebucket.s3.cn-north-1.jcloudcs.com
Date: Wed, 06 Sep 2018 12:00:00 GMT
Authorization: signatureValue   (use signature version 4)

```

Response Example:
  
```
HTTP/1.1 200 OK
Server: JDCloudOSS
Date: Wed, 14 Nov 2018 03:48:31 GMT
Content-Length: 0
Connection: keep-alive
x-req-id: 9DD9D36C74E86398
x-amz-request-id: 9DD9D36C74E86398


```

  
  
  
  


