# DeleteObject

The action is used to delete an Object.

**Request Syntax**

```
DELETE  /ObjectName HTTP/1.1
Host: BucketName. s.jcloud.com
Date: GMT  Date     
Authorization: signatureValue#Please refer to "Identity and Access Management"
```

Detail Analysis:

1.If the Object to be deleted does not exist, OSS will return the status code 404 Not Found(NoSuchKey).

2.If Bucket does not exist, 404 Not Found(NoSuchBucket) will be returned.

**Request Example**

```
DELETE /example.jpg HTTP/1.1
Host: oss-example.s-bj.jcloud.com
Date: Tue, 11 Jul 2017 07:37:23   GMT    
Authorization: jingdong   qbS5QXpLORrvdrmb:Qt+ThnjyLwBb9xMZ8PZG3wsj3qU=
```

**Response Example**

```
HTTP/1.1 204 No   Content
Server: nginx
Date: Tue, 11 Jul 2017   07:37:23 GMT
Connection: keep-alive
x-jss-request-id:   80EC9E2F4D29D732
X-Trace:   204-1499758643347-0-0-19-50-5
```
