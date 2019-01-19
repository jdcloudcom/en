# GET Bucket acl

## Description
The operation can list specified Bucket(s), which is only available to the Owner of Bucket.

## Request
### Syntax
```
GET /?acl HTTP/1.1
Host: <bucket>.s3.<region>.jcloudcs.com 
Date: <date>
Authorization: <authorization string> (see Authenticating Requests (AWS Signature Version4))
```

###  Request Parameter
No Request Parameters
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
AccessControlList|acl information set <br>Type: Container<br>Ancestors: AccessControlPolicy
AccessControlPolicy|ACL Elements Set for Each Grantee. <br>Type: String<br>Ancestors: None
DisplayName|Name of Bucket Owner. <br>Type: String<br>Ancestors: AccessControlPolicy.Owner
Grant|Grantee and Permissions Information Set <br>Type: Container<br>Ancestors: AccessControlPolicy.AccessControlList
Grantee|Grantee<br>Type: String<br>Ancestors: AccessControlPolicy.AccessControlList.Grant
ID|ID of bucket Owner or Grantee<br>Type: String<br>Ancestors: AccessControlPolicy. Owner<br> AccessControlPolicy.AccessControlList.Grant
Owner|Information Set of bucket Owner<br>Type: Container<br>Ancestors: AccessControlPolicy
Permission|Specified Permissions<br>Type: String<br>Valid Values: FULL_CONTROL, WRITE and READ <br>Ancestors: AccessControlPolicy.AccessControlList.Grant

## Examples
### Request Example
```
GET ?acl HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com 
Date: Wed, 28 Oct 2009 22:32:00 GMT
Authorization: <authorization string>
```
### Response Example
```
HTTP/1.1 200 OK
x-amz-request-id: 318BC8BC148832E5
Date: Wed, 28 Oct 2009 22:32:00 GMT
Last-Modified: Sun, 1 Jan 2006 12:00:00 GMT
Content-Length: 124
Content-Type: text/plain
Connection: close
Server: JDCloudOSS

<AccessControlPolicy>
  <Owner>
    <ID>75aa57f09aa0c8caeab4f8c24e99d10f8e7faeebf76c078efc7c6caea54ba06a</ID>
    <DisplayName>CustomersName@amazon.com</DisplayName>
  </Owner>
  <AccessControlList>
    <Grant>
      <Grantee xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			xsi:type="CanonicalUser">
        <ID>75aa57f09aa0c8caeab4f8c24e99d10f8e7faeebf76c078efc7c6caea54ba06a</ID>
        <DisplayName>CustomersName@amazon.com</DisplayName>
      </Grantee>
      <Permission>FULL_CONTROL</Permission>
    </Grant>
  </AccessControlList>
</AccessControlPolicy> 
```
