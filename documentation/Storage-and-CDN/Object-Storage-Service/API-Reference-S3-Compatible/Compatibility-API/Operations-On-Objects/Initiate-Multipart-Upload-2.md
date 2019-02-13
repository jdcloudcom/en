# Initiate Multipart Upload

## Description
The operation will enable multipart upload and return Upload ID. The Upload ID is used to associate with all multiparts uploaded by specific segments. You can specify the Upload ID in the request for each time you execute the subsequent multipart upload; you can also specify the Upload ID in the last request to complete multipart upload.

## Request
### Syntax
```
POST /ObjectName?uploads HTTP/1.1
Host: <bucket>.s3.<region>.jcloudcs.com 
Date: <date>
Authorization: <authorization string> (see Authenticating Requests (AWS Signature Version4))
```
### Request Parameter
No Request Parameters
### Request Header

Name|Description|Need
---|---|---
Cache-Control|Specify cache behavior in the whole request/response chain. <br>Type: String<br>Default: None|No
Content-Disposition|Specify which form will the returned Object be displayed; See RFC2616 for detailed description.<br>Type: String<br>Default: None<br>Constraints: None|No
Content-Encoding|Its value presents what kind of content encoding conversion that the message body carried out, which is used to inform the client how to decode for obtaining media type content indicated in Content-Type; see RFC2616 for detailed description.<br>Type: String<br>Default: None<br>Constraints: None|No
Content-Length|The size unit of Object is byte; see RFC2616 for detailed description.<br>Type: String<br>Default: None<br>Constraints: None|Yes
Content-MD5|Obtain 128-bit binary number from packet body with MD5 algorithm, then write it into Centen-MD5 through Base64 coding, which is applied to check data integrity. <br>Type: String<br>Default: None<br>Constraints: None|No
Content-Type|Present MIME type in the request. <br>Type: String<br>Default: binary/octet-stream<br>Valid Values: MIME types<br>Constraints: None|No
Expect|The client uses Expect to inform OSS, expecting to occur certain specific behavior. If errors occur because OSS cannot respond, request packet body will not be sent. <br>Type: String<br>Default: None<br>Valid Values: 100-continue<br>Constraints: None|No
Expires|Object Cache Expiration Time. <br>Type: String<br>Default: None<br>Constraints: None|No
x-amz-storage-class| Object Storage Type, if it is not specified, it will be standard storage by default. <br>Type: Enum<br>Default: STANDARD<br>Valid Values: STANDARD, REDUCED_REDUNDANCY|No

### Request Elements
No Request Elements

## Response
### Response Header
No Special Header

### Response Element

Name|Description
---|---
InitiateMultipartUploadResult|Response Set. <br>Type: Container<br>Children: Bucket, Key, UploadId<br>Ancestors: None
Bucket|Name of Bucket where multipart upload is executed<br>Type: String<br>Ancestors: InitiateMultipartUploadResult
Key|Objects executing multipart upload. <br>Type: String<br>Ancestors: InitiateMultipartUploadResult
UploadID|ID of multipart upload. <br>Type: String<br>Ancestors: InitiateMultipartUploadResul

## Examples
### Request Example
```
POST /example-object?uploads HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com 
Date: Mon, 1 Nov 2010 20:34:56 GMT
Authorization: <authorization string>
```
### Response Example
```
HTTP/1.1 200 OK
x-amz-request-id: 656c76696e6727732072657175657374
Date:  Mon, 1 Nov 2010 20:34:56 GMT
Content-Length: 197
Connection: keep-alive
Server: JDCloudOSS

<?xml version="1.0" encoding="UTF-8"?>
<InitiateMultipartUploadResult xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
  <Bucket>example-bucket</Bucket>
  <Key>example-object</Key>
  <UploadId>VXBsb2FkIElEIGZvciA2aWWpbmcncyBteS1tb3ZpZS5tMnRzIHVwbG9hZA</UploadId>
</InitiateMultipartUploadResult>
```
