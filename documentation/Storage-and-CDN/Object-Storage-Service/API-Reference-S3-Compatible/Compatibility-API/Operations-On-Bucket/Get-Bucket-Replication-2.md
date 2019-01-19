# Get Bucket replication

## Description
Return replication configuration information of specified Bucket.

## Request
### Syntax
```
GET /?replication HTTP/1.1
Host: <bucket>.s3.<region>.jcloudcs.com 
Date: <date>
Authorization: <authorization string> 
```
### Request Parameter
No Request Parameters
### Request Header
No Special Request Header
### Request Elements
No Request Elements

## Response
### Response Header
No Special Response Header
### Response Element
The operation response elements are similar to request elements in Put Bucket replication.

### Special Error

Error Code|Description|Http Status Code|SOAP Fault Code Prefix
---|---|---|---
NoSuchReplicationConfiguration|The replication configuration does not exist.|404 Not Found|Client

## Examples
### Request Example
```
GET /?replication HTTP/1.1
Host: <bucket>.s3.<region>.jcloudcs.com 
Date: Tue, 10 Feb 2015 00:17:21 GMT
Authorization: <authorization string>
```

### Response Example
```
HTTP/1.1 200 OK
x-amz-request-id: 51991C342example
Date: Tue, 10 Feb 2015 00:17:23 GMT
Server: JDCloudOSS
Content-Length: <length>

<?xml version="1.0" encoding="UTF-8"?>
<ReplicationConfiguration xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
  <Rule>
    <ID>rule1</ID>
    <Status>Enabled</Status>
    <Prefix></Prefix>
    <Destination>
      <Bucket>arn:aws:s3:::exampletargetbucket</Bucket>
      <StorageClass>STANDARD_IA</StorageClass>
    </Destination>
  </Rule>
  <Role>arn:aws:iam::35667example:role/CrossRegionReplicationRoleForS3</Role>
</ReplicationConfiguration>
```
