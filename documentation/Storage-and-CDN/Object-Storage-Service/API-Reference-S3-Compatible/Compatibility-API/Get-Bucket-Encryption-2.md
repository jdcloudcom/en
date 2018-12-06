# GET Bucket encryption
 Return the user’s default encryption configuration of OSS bucket. This interface is compatible with S3, and only supports the compatible S3 service domain name of OSS.
Refer to [Server Domain Name](https://docs.jdcloud.com/cn/object-storage-service/regions-and-endpoints)。
 
## Request Syntax
 
```
GET /eric-jdcloud/?encryption  HTTP/1.1
Host: <bucket>.s3.<region>.jcloudcs.com
Date: Wed, 06 Sep 2018 12:00:00 GMT
Authorization: authorization string  (use signature version 4)
Content-Length:  0

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
 
### Response Element

|Name|Description|
|:-|:-|
|ApplyServerSideEncryptionByDefault|Collection of server-side default bucket encryption modes<br>Child node: SSEAlgorithm, KMSMasterKeyID<br>Parent node: Rule|
|Rule|Configuration collection of server-side default bucket encryption modes<br>Child node: ApplyServerSideEncryptionByDefault<br>Parent node: ServerSideEncryptionConfiguration|
|ServerSideEncryptionConfiguration|Specific configuration collection of server-side default bucket encryption modes<br>Child node: Rule<br>Parent node: None|
|SSEAlgorithm|Encryption algorithm of server-side default bucket<br>Valid value: aws:kms<br>Limit: Only can be used within ApplyServerSideEncryptionByDefault<br>Parent node: ApplyServerSideEncryptionByDefault|

 ### Special Error
  
  No Special Error.
  
### Return Example:
  ```
HTTP/1.1 200 OK
Server: JDCloudOSS
Date: Wed, 14 Nov 2018 03:50:32 GMT
Content-Type: text/xml;charset=UTF-8
Content-Length: 292
Connection: keep-alive
Vary: Accept-Encoding
x-req-id: 9DFB131D1820AD65
x-amz-request-id: 9DFB131D1820AD65

<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<ServerSideEncryptionConfiguration>
    <Rule>
        <ApplyServerSideEncryptionByDefault>
            <SSEAlgorithm>aws:kms</SSEAlgorithm>
        </ApplyServerSideEncryptionByDefault>
     </Rule>
</ServerSideEncryptionConfiguration>

  ```
 
  
