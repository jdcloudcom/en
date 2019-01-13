# PUT  Bucket encryption
 This function is used for setting bucket default encryption mode. It only supports SSE-KMS.
 Refer to [Server Domain Name](https://docs.jdcloud.com/cn/object-storage-service/regions-and-endpoints)。
 
## Request Syntax
 
```
GET /eric-jdcloud/?encryption  HTTP/1.1
Host: <bucket>.s3.<region>.jcloudcs.com
Date: Wed, 06 Sep 2018 12:00:00 GMT
Authorization: authorization string  (use signature version 4)
Content-Length:  length 

default encryption configuration in the request body

```
###  Request Parameter

There is no need to request parameter.

###  Request Head

There is no need for special request head.

###  Request Body
The encryption mode information is stored in the request body and displayed in the form of xml. The following example shows setting bucket as SSE-KMS by default.

```
<ServerSideEncryptionConfiguration>
  <Rule>
    <ApplyServerSideEncryptionByDefault>
            <SSEAlgorithm>aws:kms</SSEAlgorithm>
    </ApplyServerSideEncryptionByDefault>
</Rule>
</ServerSideEncryptionConfiguration>

```

### Encryption Setting XML Element Description

|Name|Description|Compulsory or Not|
|:-|:-|:-|
|ApplyServerSideEncryptionByDefault|Collection of server-side default bucket encryption modes<br>Child node: SSEAlgorithm, KMSMasterKeyID<br>Parent node: Rule|Yes|
|Rule|Configuration collection of server-side default bucket encryption modes<br>Child node: ApplyServerSideEncryptionByDefault<br>Parent node: ServerSideEncryptionConfiguration|Yes|
|ServerSideEncryptionConfiguration|Specific configuration collection of server-side default bucket encryption modes<br>Child node: Rule<br>Parent node: None|Yes|
|SSEAlgorithm|Encryption algorithm of server-side default bucket<br>Valid value: aws:kms<br>Limit: Only can be used within ApplyServerSideEncryptionByDefault<br>Parent node: ApplyServerSideEncryptionByDefault|Yes|

## Response

### Response Head

 No Special Header.
 
### Response Element

 No Response Element.

 ### Special Error
  
  No Special Error.
  
## Example:

Request Example:
  ```
PUT /?encryption HTTP/1.1
Host: examplebucket.s3.amazonaws.com
Date: Wed, 06 Sep 2017 12:00:00 GMT
Authorization: authorization string
Content-Length: length

<ServerSideEncryptionConfiguration xmlns="http://s3.amazonaws.com/doc/2006-03-01/" >
  <Rule>
    <ApplyServerSideEncryptionByDefault>
        <SSEAlgorithm>aws:kms</SSEAlgorithm>
    </ApplyServerSideEncryptionByDefault>
  </Rule>
</ServerSideEncryptionConfiguration>

  ```
 Return Example:
 
   ```
HTTP/1.1 200 OK
Server: JDCloudOSS
Date: Wed, 14 Nov 2018 03:50:29 GMT
Content-Length: 0
Connection: keep-alive
x-req-id: A8D4BE3AD5D9B626
x-amz-request-id: A8D4BE3AD5D9B626

  ```
  
 
  
  
  
  


