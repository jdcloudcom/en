# List Parts

## Description
The operation can list all multiparts under specified multipart upload. The request must contain Upload ID. The request returns 1,000 multiparts at most, the default count of returned multiparts is 1,000, and return count can be limited by specifying max-parts parameter. If there are over 1,000 multiparts in segment upload, IsTruncated with the value of true and NextPartNumberMarker element will be returned in the response. In the subsequent requests, you can use part-number-marker parameter and set its value as the field value of NextPartNumberMarker in the previous response.

## Request
### Syntax
```
GET /ObjectName?uploadId=UploadId HTTP/1.1
Host: <bucket>.s3.<region>.jcloudcs.com 
Date: <date>
Authorization: <authorization string>
```

### Request Parameter

Parameter|Description|Must
---|---|---
encoding-type|Request OSS to encode the response and specify the encoding method. <br>Type: String<br>Default: None<br>Valid value: url|No
uploadID|Identify a certain multipart upload. <br>Type: String<br>Default: None|Yes
max-parts|Set the maximum return count of multiparts. <br>Type: String<br>Default: 1,000|No
part-number-marker|Specify the multiparts to be listed after the certain position of the List. <br>Type: String<br>Default: None|No

### Request Header
No Special Request Header
### Request Elements
No Request Elements

## Response
### Response Header
No Special Response Header
### Response Element

Name|Description
---|---
x-amz-abort-date|If the life cycle rules of the Bucket are configured as terminating uncompleted multipart upload (it will be supported after launch of put bucket lifecycle), and the prefix in the rule is consistent with the name of Object in the request, then the response contains the Header. <br>Type: String
x-amz-abort-rule-id|It will be returned with x-amz-abort-date, which are used to identify life cycle rules. <br>Type: String
ListPartsResult|Response Information Set. <br>Children: Bucket, Key, UploadId, Initiator, Owner, StorageClass, PartNumberMarker, NextPartNumberMarker, MaxParts, IsTruncated, Part<br>Type: Container
Bucket|Bucket where multipart upload is located. Type: String<br>Ancestor: ListPartsResult
Encoding-Type|Encoding type of Object name in XML response, if encoding-type parameter is specified in the request, the response contains the element. Type: String<br>Ancestor: ListBucketResult
key|Object of Multipart Upload. <br>Type: String<br>Ancestor: ListPartsResult
UploadID|Identify multipart upload. <br>Type: String<br>Ancestor: ListPartsResult
Initiator|Identify user Information set of started multipart upload. <br>Children: ID, DisplayName<br>Type: Container<br>Ancestor: ListPartsResult
ID|User ID<br>Type: String<br>Ancestor: Initiator
DisplayName|User Name<br>Type: String<br>Ancestor: Initiator
Owner|Information Set of Object Owner. <br>Children: ID, DisplayName<br>Type: Container<br>Ancestor: ListPartsResult
StorageClass|Storage Type<br>Type: String<br>Ancestor: ListPartsResult
PartNumberMarker|List multiparts after a certain number. <br>Type: Integer<br>Ancestor: ListPartsResult
NextPartNumberMarker|When part count is exceeded, the element specifies the next multipart in the list, with its value being the parameter of part-number-marker in the next request. <br>Type: Integer<br>Ancestor: ListPartsResult
MaxParts|Return maximum count of multiparts. <br>Type: Integer<br>Ancestor: ListPartsResult
IsTruncated|Indicate whether returned multipart list is truncated. True presents it is truncated. <br>Type: Boolean<br>Ancestor: ListPartsResult
Part|Multipart Information Set. <br>Children: PartNumber, LastModified, ETag, Size<br>Type: String<br>Ancestor: ListPartsResult
PartNumber|Multipart Identifier Number. <br>Type: Integer<br>Ancestor: Part
LastModified|Time of multipart upload completion. <br>Type: Date<br>Ancestor: Part
ETag|Returned Entity Tag of Multipart Upload. <br>Type: String<br>Ancestor: Part
Size|Multipart Size<br>Type: Integer<br>Ancestor: Part

## Examples
### Request Example
```
GET /example-object?uploadId=XXBsb2FkIElEIGZvciBlbHZpbmcncyVcdS1tb3ZpZS5tMnRzEEEwbG9hZA&max-parts=2&part-number-marker=1 HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com 
Date: Mon, 1 Nov 2010 20:34:56 GMT
Authorization: <authorization string>
```
### Response Example
```
HTTP/1.1 200 OK
x-amz-request-id: 656c76696e6727732072657175657374
Date: Mon, 1 Nov 2010 20:34:56 GMT
Content-Length: 985
Connection: keep-alive
Server: JDCloudOSS

<?xml version="1.0" encoding="UTF-8"?>
<ListPartsResult xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
  <Bucket>example-bucket</Bucket>
  <Key>example-object</Key>
  <UploadId>XXBsb2FkIElEIGZvciBlbHZpbmcncyVcdS1tb3ZpZS5tMnRzEEEwbG9hZA</UploadId>
  <Initiator>
      <ID>arn:aws:iam::111122223333:user/some-user-11116a31-17b5-4fb7-9df5-b288870f11xx</ID>
      <DisplayName>umat-user-11116a31-17b5-4fb7-9df5-b288870f11xx</DisplayName>
  </Initiator>
  <Owner>
    <ID>75aa57f09aa0c8caeab4f8c24e99d10f8e7faeebf76c078efc7c6caea54ba06a</ID>
    <DisplayName>someName</DisplayName>
  </Owner>
  <StorageClass>STANDARD</StorageClass>
  <PartNumberMarker>1</PartNumberMarker>
  <NextPartNumberMarker>3</NextPartNumberMarker>
  <MaxParts>2</MaxParts>
  <IsTruncated>true</IsTruncated>
  <Part>
    <PartNumber>2</PartNumber>
    <LastModified>2010-11-10T20:48:34.000Z</LastModified>
    <ETag>"7778aef83f66abc1fa1e8477f296d394"</ETag>
    <Size>10485760</Size>
  </Part>
  <Part>
    <PartNumber>3</PartNumber>
    <LastModified>2010-11-10T20:48:33.000Z</LastModified>
    <ETag>"aaaa18db4cc2f85cedef654fccc4a4x8"</ETag>
    <Size>10485760</Size>
  </Part>
</ListPartsResult>
```
