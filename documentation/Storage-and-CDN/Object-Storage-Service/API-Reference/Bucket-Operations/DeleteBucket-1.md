# DeleteBucket

Delete Bucket is used to delete some Bucket. 

**Request Syntax**
```
DELETE / HTTP/1.1
Host: BucketName. s-bj.jcloud.com
Date: GMT Date
Authorization: signatureValue
```
Detail Analysis: 

1.If Bucket does not exist, return 404 error. Error code: NoSuchBucket.

2.In order to avoid delete by mistake, OSS does not allow the user to delete a non-empty Bucket.

3.If trying to delete a Bucket that is not empty, return 409 Conflict Error, error code: BucketNotEmpty

4.Only owner of Bucket can delete such Bucket. If trying to delete a Bucket that does not have corresponding Bucket, return 403 Forbidden Error. Error code: AccessDenied.

**Request Example**
```
DELETE / HTTP/1.1
Date: Tue, 11 Jul 2017   07:01:25 GMT
Authorization: jingdong   qbS5QXpLORrvdrmb:he65YAWaAh7cV1D2RmaKABAu9dk=
Host: oss-test.s-bj.jcloud.com
Connection: Keep-Alive
```

**Response Example** 
```
HTTP/1.1 204 No   Content
Server: nginx
Date: Tue, 11 Jul 2017   07:01:24 GMT
Connection: keep-alive
x-jss-request-id:   8DFE3EA7D288983C
```
