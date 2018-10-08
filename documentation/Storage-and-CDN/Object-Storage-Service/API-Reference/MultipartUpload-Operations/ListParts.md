# ListParts

The action is used to list Parts uploaded in Multipart Upload.

**Request Syntax**

```
GET   /ObjectName?uploadId=UploadId HTTP/1.1
Host: BucketName. s.jcloud.com
Date: GMT   Date     
Authorization: signatureValue#Please refer to "Identity and Access Management"
```
**Request Parameter**

|Name|Description|Required|
|-|-|-|
|uploadId|ID of Multipart Upload event. <br>Type: Character string<br>Default Value: None|Yes|

**Response Elements**

|Name|Description|
|-|-|
|Bucket|Bucket Name<br>Type: Character String
|Key|Object Name<br>Type: Character String
|UploadId|ID of Upload event<br>Type: Character String|
|StorageClass|Object storage type, the default value is "STANDARD" (standard storage)。 <br>Support "STANDARD" (standard storage) and "REDUCED_REDUNDANCY" (low frequency access type) storage types
|Part|Save the Set of Part Information. <br>Type: List|
|PartNumber|Number to indicate Part. <br>Type: Ingeter|
|LastModified|Part Upload Time. <br>Type: Character String|
|ETag|ETag of Uploaded Part Content. <br> Type: Character String|
|Size|Size of Uploaded Part. <br>Type: long|

Detail Analysis:

1.The action must specify UploadId, the maximum number of returned Parts is 10000.

2.The returned results of OSS are arranged in the ascending order of Part number.

3.As errors may occur during the network transmission, the results (Part Number and ETag value) from List Part are not recommended to be used to generate the final Part list of Complete Multipart.

**Request Instance**

```
GET   /multipart.data?uploadId=9E417328F6B89F0B HTTP/1.1
Host: oss-example.s-bj.jcloud.com
Date: Tue, 11 Jul 2017   12:40:40 GMT    
Authorization: jingdong   qbS5QXpLORrvdrmb:Ihjb1BaIk2pNGk11OCqBogLLL4c= 
```

**Response Example**

```
HTTP/1.1 200 OK
Server: nginx
Date: Tue, 11 Jul 2017   12:40:40 GMT
Content-Type:   application/json;charset=UTF-8
Content-Length: 466
Connection: keep-alive
Vary: Accept-Encoding
Vary: Accept-Encoding
x-jss-request-id:   9206E7FB00121B2F
X-Trace:   200-1499776840209-0-0-19-45-45
 
{
      "Bucket": "youhe",
      "Key": "multipart.data",
      "UploadId": "9E417328F6B89F0B",
      "Part": [
          {
              "PartNumber": 1,
              "LastModified": "Tue, 11 Jul 2017 12:39:15 GMT",
              "ETag": "72cfb19c8e2791bd502ce951ebc64ad8",
              "Size": 204800
          },
          {
              "PartNumber": 2,
              "LastModified": "Tue, 11 Jul 2017 12:39:28 GMT",
              "ETag": "a2a8ab7bd93851a715c8137ea5d4c720",
              "Size": 409600
          },
          {
              "PartNumber": 3,
              "LastModified": "Tue, 11   Jul 2017 12:39:42 GMT",
              "ETag": "b0721b50ee0cb102eb1f0d8216c94848",
              "Size": 614400
          }
    ],
      "StorageClass": "STANDARD"
}
```
