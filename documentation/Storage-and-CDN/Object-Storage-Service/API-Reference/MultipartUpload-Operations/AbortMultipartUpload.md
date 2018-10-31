# AbortMultipartUpload

The interface may terminate its corresponding Multipart Upload event based on the Upload ID provided by user. When a Multipart Upload event is terminated, its UploadId will also be canceled, and the Bucket occupied by all the uploaded Parts in Multipart Upload will be released. 

**Request Syntax**
```
DELETE /BucketName/ObjectName?uploadId=UploadIdHTTP/1.1
Host: BucketName. s-bj.jcloud.com
Date: GMT Date
Authorization: signatureValue
```

Detailed analysis: If the input Upload Id does not exist, OSS will return 404 error, with the error code: NoSuchUpload. 

**Request Example**
```
DELETE   /oss-test-mul?uploadId=8BE181320822A189 HTTP/1.1
Date: Wed, 12 Jul 2017   13:36:37 GMT
Authorization: jingdong   298718BEDE59FF1B2E96A3152937D37B:FGic1+W0ggmbzXiwwwfbnJrQEkE=
Host: oss-test.s-bj.jcloud.com
Connection: Keep-Alive
```

**Response Example**
```
HTTP/1.1 204 No   Content
Server: nginx
Date: Wed, 12 Jul 2017   13:36:36 GMT
Connection: keep-alive
x-jss-request-id:   A27711FCD88D6666
```
