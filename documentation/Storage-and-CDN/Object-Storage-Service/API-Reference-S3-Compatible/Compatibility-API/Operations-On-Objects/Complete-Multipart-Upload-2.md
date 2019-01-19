# Complete Multipart Upload

## Description
The operation completes multipart upload through multipart uploaded before combination.

First, initial multipart upload, and then use Upload Parts to upload multipart. After successfully uploading all multiparts, multipart upload can be completed by calling the API. After OSS receives the request, it will perform ascending connection by multipart number to create Object. In the request, complete multipart list, number and Etag of each multipart shall be provided.

It takes several minutes to combine all multiparts, so OSS will reply 200 OK after beginning to process the request. During the processing, OSS will regularly send blank characters to prevent connection time-out. The request may fail after sending 200 OK response, you need to check the response body to determine whether the request succeeded or failed.

## Request
### Syntax
```
POST /ObjectName?uploadId=UploadId HTTP/1.1
Host: <bucket>.s3.<region>.jcloudcs.com 
Date: <Date>
Content-Length: <Size>
Authorization: <authorization string>

<CompleteMultipartUpload>
  <Part>
    <PartNumber>PartNumber</PartNumber>
    <ETag>ETag</ETag>
  </Part>
  ...
</CompleteMultipartUpload>
```
### Request Parameter
No Request Parameters
### Request Header
No Special Header
### Request Elements

Name|Description|Must
---|---|---
CompleteMultipartUpload|Request Set. <br>Ancestor: None<br>Type: Container<br>Children: One or more Part elements|Yes
Part|Set of PartNumber and ETage Information of Previously Uploaded Multiparts. <br>Ancestor: CompleteMultipartUpload<br>Type: Container<br>Children: PartNumber, ETag|Yes
PartNumber|Unique Identifier of Multipart. <br>Ancestor: Part<br>Type: Integer|Yes
ETag|Returned Entity Tag after Multipart Upload. <br>Ancestor: Part<br>Type: String|Yes

## Response
### Response Header
Except public response Headers, there are following Headers:

Header|Description
---|---
x-amz-expiration|If the Object has expiration time (it will be supported after Put Bucket lifecycle launch), the Header will be contained in the response. <br>Type: String

### Response Element

Name|Description
---|---
CompleteMultipartUploadResult|Response Set. <br>Type: Container<br>Children: Bucket, Key, UploadId<br>Ancestors: None
Location|URL of Created Bucket. <br>Type: URI<br>Ancestors: CompleteMultipartUploadResult
Bucket|Name of the Bucket<br>Type: String<br>Ancestors: CompleteMultipartUploadResult
Key|Name of Created Object. <br>Type: String<br>Ancestors: CompleteMultipartUploadResult
Etag|Etag can identify created Object data. Different Objects have different Etags. <br>Type: String<br>Ancestors: CompleteMultipartUploadResult

### Special Error

Error Code|Description|HTTP Status Code
---|---|---
EntityTooSmall|Each multipart shall be at least 5MB while the last multipart has no limit. |400 Bad Request
InvalidPart|One or multiple specified multiparts is/are absent. The multipart may not be uploaded or specified Etag does not match the Etag of the multipart. |400 Bad Request
InvalidPartOrder|Multipart list does not arrange in ascending order. |400 Bad Request
NoSuchUpload|Specified multipart upload is absent, and Upload ID is invalid. |404 Not Found

## Examples
### Request Example
```
POST /example-object?uploadId=AAAsb2FkIElEIGZvciBlbHZpbmcncyWeeS1tb3ZpZS5tMnRzIRRwbG9hZA HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com 
Date:  Mon, 1 Nov 2010 20:34:56 GMT
Content-Length: 391
Authorization: <authorization string>

<CompleteMultipartUpload>
  <Part>
    <PartNumber>1</PartNumber>
    <ETag>"a54357aff0632cce46d942af68356b38"</ETag>
  </Part>
  <Part>
    <PartNumber>2</PartNumber>
    <ETag>"0c78aef83f66abc1fa1e8477f296d394"</ETag>
  </Part>
  <Part>
    <PartNumber>3</PartNumber>
    <ETag>"acbd18db4cc2f85cedef654fccc4a4d8"</ETag>
  </Part>
</CompleteMultipartUpload>
```
### Response Example
```
HTTP/1.1 200 OK
x-amz-request-id: 656c76696e6727732072657175657374
Date: Mon, 1 Nov 2010 20:34:56 GMT
Connection: close
Server: JDCloudOSS

<?xml version="1.0" encoding="UTF-8"?>
<CompleteMultipartUploadResult xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
  <Location>http://Example-Bucket.s3.amazonaws.com/Example-Object</Location>
  <Bucket>Example-Bucket</Bucket>
  <Key>Example-Object</Key>
  <ETag>"3858f62230ac3c915f300c664312c11f-9"</ETag>
</CompleteMultipartUploadResult>
```


