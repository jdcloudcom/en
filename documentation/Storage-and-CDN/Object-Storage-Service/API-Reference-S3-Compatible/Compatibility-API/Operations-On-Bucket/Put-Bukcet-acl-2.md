# Put Bucket acl

## Description
The action can specify the IAM list (acl) of Bucket.
Currently Bucket has three access permissions: private, public-read, and public-read-write. Put Bucket ACL action is set through "x-amz-acl" header in Put request.
Only the creator of the Bucket has the permission to execute the action. If the action succeeds, 200 will be returned; otherwise, the corresponding error code and notification information will be returned.

## Request
### Syntax
```HTTP
PUT /?acl HTTP/1.1
x-amz-acl：<Permission>
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Date: <date>
Authorization: <authorization string> (see Authenticating Requests (AWS Signature Version4))

```
### Request Parameter
No Request Parameter
### Request Header
Except public request Headers, the following Headers can also be used:

Through Headers, you can use the following methods to set the access permission:
* Specify Fixed ACL
OSS supports a group of pre-defined ACLs (fixed ACLs), and each fixed ACL has a group of pre-defined authorized persons and permissions. To use the fixed ACL to set the access permission, please use the following Headers, and specify the fixed ACL name (default private read/write private).

Name|Description|Must
---|---|---
x-amz-acl|Specify the fixed ACL to set ACL of Bucket. <br>Type: String<br>Valid Values: private, public-read and public-read-write<br>Default: private|No

If you want to clearly specify the permission of each authorized person, please use [put Bucket policy](https://docs.jdcloud.com/en/object-storage-service/put-bucket-policy-2) 
to complete fine-grained authorization.


### Request Example
```HTTP
PUT /?acl HTTP/1.1
x-amz-acl：public-read
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Date: <date>
Authorization: <authorization string> (see Authenticating Requests (AWS Signature Version4))

```
### Response Example

```HTTP
HTTP/1.1 200 OK
x-amz-request-id: 656c76696e672SAMPLE5657374  
Date: Tue, 04 Apr 2017 20:34:56 GMT  
Connection: keep-alive  
Server: JDCloudOSS

```




