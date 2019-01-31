# List Multipart Uploads

## Description
The operation lists the multipart upload in progress. Up to 1,000 multipart uploads can be returned.

## Request
### Syntax
```
GET /?uploads HTTP/1.1
Host: <bucket>.s3.<region>.jcloudcs.com 
Date: <Date>
Authorization: <authorization string>			
```
### Request Parameter

Parameter|Description|Must
---|---|---
delimiter|Characters used for grouping. Use the character that between prefix and first delimiter for grouping all objects and take it as CommonPrefixes. If you do not specify prefix, it will begin from the first character. Objects grouped in CommonPrefixes will not respond return of other places. <br>Type: String|No
encoding-type|Request OSS encoding response and specify encoding method. <br>Type: String<br>Default: None<br>Valid value: url|No
prefix|List objects of multipart upload in progress matching specify prefix. <br>Type: String|No

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
ListMultipartUploadsResult|Response set. <br>Children: Bucket, KeyMarker, UploadIdMarker, NextKeyMarker, NextUploadIdMarker, MaxUploads, Delimiter, Prefix, CommonPrefixes, IsTruncated<br>Type: Container<br>Ancestor: None
Bucket|Bucket where multipart upload is located. <br>Type: String<br>Ancestor: ListMultipartUploadsResult
Encoding-Type|Encoding type of OSS encoding Object. <br>If encoding-type request parameter is  specified, OSS will contain the element in the response and return encoded values of Delimiter, Prefix and Key in the following response elements. <br>Type: String<br>Ancestor: ListBucketResult
Upload|Information set of specific multipart upload, in which one response contains zero or multiple Upload elements. <br>Type: ContainerChildren: Key, UploadId, InitiatorOwner, StorageClass, Initiated<br>Ancestor: ListMultipartUploadsResult
Key|Objects executing multipart upload. <br>Type: Integer<br>Ancestor: Upload
UploadID|Identify ID of multipart upload. <br>Type: Integer<br>Ancestor: Upload
Initiator|Identify user Information set of started multipart upload. <br>Children: ID, DisplayName<br>Type: Container<br>Ancestor: Upload
ID|User ID<br>Type: String<br>Ancestor: Initiator, Owner
DisplayName|User Name<br>Type: String<br>Ancestor: Initiator, Owner
Owner|Information Set of Object Owner. Type: Container<br>Children: ID, DisplayName<br>Ancestor: Upload
StorageClass|Storage Type<br>Type: String<br>Ancestor: Upload
Initiated|Creation Time of Multipart Upload. <br>Type: Date<br>Ancestor:Upload
ListMultipartUploadsResult.Prefix|When prefix is specified in the request, the field will contain the designated prefix. The result only contains Objects with specified prefix. Type: String<br>Ancestor: ListMultipartUploadsResult
Delimiter|Specified delimiter in the request. <br>Type: String<br>Ancestor: ListMultipartUploadsResult
CommonPrefixes|If you specify delimiter in the request, prefix with delimiter will return in CommonPrefixes. Type: Container<br>Ancestor: ListMultipartUploadsResult
CommonPrefixes.Prefix|If the request contains no Prefix parameter, the element only displays character string(s) before first delimiter. If the request contains Prefix parameter, the element will display character string(s) between the prefix and first delimiter. <br>Type: String<br>Ancestor: CommonPrefixes

## Examples
### Request Example
```
GET /?uploads&max-uploads=3 HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com 
Date: Mon, 1 Nov 2010 20:34:56 GMT
Authorization: <authorization string>
```
### Response Example
```
HTTP/1.1 200 OK
x-amz-request-id: 656c76696e6727732072657175657374
Date: Mon, 1 Nov 2010 20:34:56 GMT
Content-Length: 1330
Connection: keep-alive
Server: JDCloudOSS

<?xml version="1.0" encoding="UTF-8"?>
<ListMultipartUploadsResult xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
  <Bucket>bucket</Bucket>
  <KeyMarker></KeyMarker>
  <UploadIdMarker></UploadIdMarker>
  <NextKeyMarker>my-movie.m2ts</NextKeyMarker>
  <NextUploadIdMarker>YW55IGlkZWEgd2h5IGVsdmluZydzIHVwbG9hZCBmYWlsZWQ</NextUploadIdMarker>
  <MaxUploads>3</MaxUploads>
  <IsTruncated>true</IsTruncated>
  <Upload>
    <Key>my-divisor</Key>
    <UploadId>XMgbGlrZSBlbHZpbmcncyBub3QgaGF2aW5nIG11Y2ggbHVjaw</UploadId>
    <Initiator>
      <ID>arn:aws:iam::111122223333:user/user1-11111a31-17b5-4fb7-9df5-b111111f13de</ID>
      <DisplayName>user1-11111a31-17b5-4fb7-9df5-b111111f13de</DisplayName>
    </Initiator>
    <Owner>
      <ID>75aa57f09aa0c8caeab4f8c24e99d10f8e7faeebf76c078efc7c6caea54ba06a</ID>
      <DisplayName>OwnerDisplayName</DisplayName>
    </Owner>
    <StorageClass>STANDARD</StorageClass>
    <Initiated>2010-11-10T20:48:33.000Z</Initiated>  
  </Upload>
  <Upload>
    <Key>my-movie.m2ts</Key>
    <UploadId>VXBsb2FkIElEIGZvciBlbHZpbmcncyBteS1tb3ZpZS5tMnRzIHVwbG9hZA</UploadId>
    <Initiator>
      <ID>b1d16700c70b0b05597d7acd6a3f92be</ID>
      <DisplayName>InitiatorDisplayName</DisplayName>
    </Initiator>
    <Owner>
      <ID>b1d16700c70b0b05597d7acd6a3f92be</ID>
      <DisplayName>OwnerDisplayName</DisplayName>
    </Owner>
    <StorageClass>STANDARD</StorageClass>
    <Initiated>2010-11-10T20:48:33.000Z</Initiated>
  </Upload>
  <Upload>
    <Key>my-movie.m2ts</Key>
    <UploadId>YW55IGlkZWEgd2h5IGVsdmluZydzIHVwbG9hZCBmYWlsZWQ</UploadId>
    <Initiator>
      <ID>arn:aws:iam::444455556666:user/user1-22222a31-17b5-4fb7-9df5-b222222f13de</ID>
      <DisplayName>user1-22222a31-17b5-4fb7-9df5-b222222f13de</DisplayName>
    </Initiator>
    <Owner>
      <ID>b1d16700c70b0b05597d7acd6a3f92be</ID>
      <DisplayName>OwnerDisplayName</DisplayName>
    </Owner>
    <StorageClass>STANDARD</StorageClass>
    <Initiated>2010-11-10T20:49:33.000Z</Initiated>
  </Upload>
</ListMultipartUploadsResult>
```
