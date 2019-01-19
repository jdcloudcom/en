# Delete Multiple Objects

## Description
The operation can delete multiple Objects through single HTTP request, which contains 1,000 Objects at most. If specified Object is not found in the request, OSS will return Deleted.

Batch deletion supports two response methods, which are verbose method and quiet method respectively. If the default method is verbose, the response contains deletion results of all Objects; if quiet mode is specified, the response only contains Objects with errors.

## Request
### Syntax
```
POST /?delete HTTP/1.1
Host: <bucket>.s3.<region>.jcloudcs.com 
Authorization: <authorization string>
Content-Length: <Size>
Content-MD5: <MD5>

<?xml version="1.0" encoding="UTF-8"?>
<Delete>
    <Quiet>true</Quiet>
    <Object>
         <Key>Key</Key>
         <VersionId>VersionId</VersionId>
    </Object>
    <Object>
         <Key>Key</Key>
    </Object>
    ...
</Delete>			
```

### Request Parameter
No Request Parameters
### Request Header

Name|Description|Must
---|---|---
Content-MD5|Perform base64 encoding for 128-bit MD5. The Header is used for determining whether the request entity is corrupted in transmission. <br>Type: String<br>Default: None|Yes
Content-Length|Entity length<br>Type: String<br>Default: None|Yes

### Request Elements

Name|Description|Request
---|---|---
Delete|Request Set. <br>Ancestor: None<br>Type: Container<br>One or multiple Object Elements and Optional Quiet Elements. |Yes
Quiet|Enable quiet mode, and when adding the element, its value shall be specified as true. <br>Ancestor: Delete<br>Type: Boolean<br>Default: false|No
Object|Delete set of specified Objects in the request. <br>Ancestor: Delete<br>Type: Container<br>Children: Key|Yes
Key|object Name<br>Ancestor: Object<br>Type: String|Yes

## Response
### Request Header
No Request Header
### Request Elements

Name|Description
---|---
DeleteResult|Response Set<br>Children: Deleted, Error<br>Type: Container<br>Ancestor: None
Deleted|Deleted Element Set. <br>Children: Key<br>Type: Container<br>Ancestor: DeleteResult
Key|Object Name Executing Deletion Operation. <br>Type: String<br>Ancestor: Deleted, or Error
Error|Error Information Set. <br>Children: Key, Code, Message.<br>Type: String<br>Ancestor: DeleteResult
Code|Delete returned Status Code of Failure. <br>Type: String<br>Values: AccessDenied, InternalError<br>Ancestor: Error
Message|Error Description<br>Type: String<br>Ancestor: Error

## Examples
### Request Example
```
POST /?delete HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com 
Accept: */*
x-amz-date: Wed, 30 Nov 2011 03:39:05 GMT
Content-MD5: p5/WA/oEr30qrEEl21PAqw==
Authorization: <authorization string>
Content-Length: 125
Connection: Keep-Alive

<Delete>
  <Object>
    <Key>sample1.txt</Key>
  </Object>
  <Object>
    <Key>sample2.txt</Key>
  </Object>
</Delete>
```
### Response Example
```
HTTP/1.1 200 OK
x-amz-request-id: A437B3B641629AEE
Date: Fri, 02 Dec 2011 01:53:42 GMT
Content-Type: application/xml
Server: JDCloudOSS
Content-Length: 251

<?xml version="1.0" encoding="UTF-8"?>
<DeleteResult xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
  <Deleted>
    <Key>sample1.txt</Key>
  </Deleted>
  <Error>
    <Key>sample2.txt</Key>
    <Code>AccessDenied</Code>
    <Message>Access Denied</Message>
  </Error>
</DeleteResult>
```
