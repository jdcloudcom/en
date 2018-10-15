# ListMultipartUploads

List Multipart Uploads may list the MultipartUpload not completed under the specified Bucket, and some query conditions may be used to limit return results during request. The action may return up to 10000 Multipart Uploads. If the results meeting query conditions exceeds 10000. For more than 10000 Multipart Upload, 400 error will be returned, and error code TooManyMultipartUploads will be returned.

**Request Syntax**
```
GET /BucketName?uploads HTTP/1.1
Host: BucketName.s-bj.jcloud.com
Date: GMT Date
Authorization: signatureValue
```

**Request Parameter**

|Name|Description|
|-|-|
|prefix|Limit that the returned object key must use a prefix as prefix. It is noted that when using prefix for query, the returned key will still include prefix. <br>Type: Character string|

**Response Elements**

|Name|Description|
|-|-|
|Bucket|Bucket Name<br>Type: Character String|
|Key|Initialize Object name of Multipart Upload event<br>Type: Character string|
|UploadId|ID of Multipart Upload event<br>Type: Character string|
|Initiated|Initialization time of Multipart Upload event<br>Type: Date|
|Enable-Encryption|Confirm to encrypt the uploaded content<br>Valid Value: TRUE (encrypt), FALSE (do not encrypt)<br>Type: Enumerated Character String|
|StorageClass|Object storage type, the default value is "STANDARD" (standard storage)<br>Support "STANDARD" (standard storage) and "REDUCED_REDUNDANCY" (low frequency access type) storage types<br>Note: Currently "REDUCED_REDUNDANCY" (low frequency access type) is only supported by the machine room in North China<br>Type: Character string<br>Default Value: "STANDARD" (standard storage)|

Detail Analysis:

1. The maximum "max-uploads" parameter is 10000.

2. The returned results are arranged in the order of Key and UploadId dictionary.  

**Request Example**

```
GET   /?uploads HTTP/1.1
Date:   Wed, 12 Jul 2017 13:58:14 GMT
Authorization:   jingdong   298718BEDE59FF1B2E96A3152937D37B:YVbn+CqITQzQNRWzVKcxPq3V0PY=
Host: oss-test.s-bj.jcloud.com
Connection:   Keep-Alive
```

**Response Example**

```
HTTP/1.1 200 OK
Server: nginx
Date: Wed, 12 Jul 2017   13:58:14 GMT
Content-Type:   application/json;charset=UTF-8
Content-Length: 714
Connection: keep-alive
x-jss-request-id:   A9E0EE26B6EF677E
 
{"Bucket":"oss-test","Prefix":null,"Upload":[{"Key":"oss-test-mul1","UploadId":"97D11DAE98672320",
"Initiated":"Wed,   12 Jul 2017 13:58:02 GMT","Enable-Encryption":"false","Summary":null,"StorageClass":"STANDARD"},
{"Key":"oss-test-mul2","UploadId":"8238F7E35F3FFCFE","Initiated":"Wed,   12 Jul 2017 13:58:02   GMT",
"Enable-Encryption":"false","Summary":null,"StorageClass":"STANDARD"},{"Key":"oss-test-mul3",
"UploadId":"90895A4BB2A635DF","Initiated":"Wed,   12 Jul 2017 13:58:02   GMT",
"Enable-Encryption":"false","Summary":null,"StorageClass":"STANDARD"},
{"Key":"oss-test-mul4","UploadId":"857A7712C57EA243","Initiated":"Wed,   12 Jul 2017 13:58:02   GMT",
"Enable-Encryption":"false","Summary":null,"StorageClass":"STANDARD"}]}
```
