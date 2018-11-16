# PutBucket

PutBucket is used to create Bucket (it does not support anonymous access). Region where the created Bucket is located is identical to the Region corresponded to Endpoint sending the request. After confirming data center where Bucket is located, all Objects under the Bucket will be always stored in corresponding regions.

Request Syntax
```
PUT / HTTP/1.1
Date: GMT Date
Authorization: signatureValue
Host: BucketName.s-bj.jcloud.com 
```

Detail Analysis:

1.If requested Bucket already exists, and the requester is the owner, return 409 Conflict, error code: BucketAlreadyOwnedByYou

2.If requested Bucket already exists, but is not owned by the requester, return 409 Conflict. Error code: BucketAlreadyExists.

3.If Bucket wanted to create does not conform to the naming convention, return 400 Bad Request Message. Error code: InvalidBucketName.

4.If it finds that it has exceeded the maximum number of buckets created during PutBucket, each Region has 10 by default, return 400 Bad Request Message. Error code: TooManyBuckets.

Request Example
```
PUT / HTTP/1.1
Date: GMT Date
Authorization: signatureValue
Host: BucketName.s-bj.jcloud.com 
```
Response Example 
```
HTTP/1.1 201   Created
Server: nginx
Date: Tue, 11 Jul 2017   07:28:28 GMT
Content-Length: 0
Connection: keep-alive
x-jss-request-id:   AC661DAB5260B409
```
