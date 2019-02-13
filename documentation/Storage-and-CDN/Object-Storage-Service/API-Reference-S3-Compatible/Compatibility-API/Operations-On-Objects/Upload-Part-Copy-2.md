# Upload Part-Copy

## Description
Replicate existed Objects as the source data multipart upload. You can specify source data through x-amz-copy-source Header, and the x-amz-copy-source-range request Header specifies data range. Before uploading multiparts, a multipart upload must be started,and at this moment OSS will return an Upload ID, you must include the ID in the multipart upload request.

## Request
### Syntax
```
PUT /ObjectName?partNumber=PartNumber&uploadId=UploadId HTTP/1.1
Host: <target-bucket>.s3.<region>.jcloudcs.com 
x-amz-copy-source: /source_bucket/sourceObject
x-amz-copy-source-range:bytes=<first-last>
Date: <date>
Authorization: <authorization string>
```

### Request Parameter

Name|Description|Must
---|---|---
partNumber|Multipart Number, which is the unique identifier of a multipart and also is the location identifier of the multipart in the whole Object. <br>Type: String|Yes
uploadId|Upload ID, which is the unique identifier returned in the initialization multipart upload request. <br>Type: String|Yes
### Request Header
Except public request Headers, the following Headers also can be used

Name|Description|Must
---|---|---
x-amz-copy-source|Source Bucket and source Object are separated by "/". <br>Type: String<br>Default: None|Yes
x-amz-copy-source-range|The Data Range of Source Object. <br>Type: Integer<br>Default: None|No

### Request Elements
No Request Elements

## Response
### Response Header
No Special Response Header

### Response Element

Name|Description
---|---
CopyPartResult|Response Element Set. <br>Type: Container<br>Ancestor: None
ETag|Return ETag of new multipart. <br>Type: String<br>Ancestor: CopyPartResult
LastModified|Return the modification time of multiparts. <br>Type: String<br>Ancestor: CopyPartResult

### Special Error

Error Code|Description|HTTP Status Code
---|---|---
NoSuchUpload|Specified multipart upload ID is absent, which may be invalid. |404 Not Found
InvalidRequest|Specified replication source does not support Range replication. |400 Bad Request

## Examples
### Request Example
```
PUT /newobject?partNumber=2&uploadId=VCVsb2FkIElEIGZvciBlbZZpbmcncyBteS1tb3ZpZS5tMnRzIHVwbG9hZR HTTP/1.1
Host: target-bucket.s3.<region>.jcloudcs.com
Date:  Mon, 11 Apr 2011 20:34:56 GMT
x-amz-copy-source: /source-bucket/sourceobject
x-amz-copy-source-range:bytes=500-6291456
Authorization: <authorization string>
```

### Response Example
```
HTTP/1.1 200 OK
x-amz-request-id: 656c76696e6727732072657175657374
Date:  Mon, 11 Apr 2011 20:34:56 GMT
Server: JDCloudOSS 

<CopyPartResult>
   <LastModified>2011-04-11T20:34:56.000Z</LastModified>
   <ETag>"9b2cf535f27731c974343645a3985328"</ETag>
</CopyPartResult>
```
