# Put Bucket replication

## Description
The operation creates new replication configuration (or replace original replication configuration) in the specified Bucket.

## Request
### Syntax
```
PUT /?replication HTTP/1.1
Host: <bucket>.s3.<region>.jcloudcs.com 
Content-Length: <length>
Date: <date>
Authorization: <authorization string> 
Content-MD5: <MD5>

Replication configuration XML in the body
```

### Request Parameter
No Request Parameters
### Request Header

Name|Description|Must
---|---|---
Content-MD5|Perform base64 encoding for 128-bit MD5. The Header is used for determining whether the request entity is corrupted in transmission. <br>Type: String<br>Default: None|Yes

### Request Entity
One or multiple replication rules can be specified in the request entity.
```
<ReplicationConfiguration>
    <Role>IAM-role-ARN</Role>
    <Rule>
        <ID>Rule-1</ID>
        <Status>rule-status</Status>
        <Prefix>key-prefix</Prefix>
        <Destination>        
           <Bucket>arn:aws:s3:::bucket-name</Bucket>
           <StorageClass>optional-destination-storage-class-override</StorageClass>     
        </Destination>    
    </Rule>
    <Rule>
        <ID>Rule-2</ID>
         ...
    </Rule>
     ...
</ReplicationConfiguration>
```

Name|Description|Need
---|---|---
ReplicationConfiguration|Set of Replication Rules. 1,000 rules at most. Total size shall not exceed 2MB. <br>Type: Container<br>Children: Rule<br>Ancestor: None|Yes
Rule|Information Set of Characteristics Rules. <br>Type: Container<br>Ancestor:ReplicationConfiguration|Yes
ID|Rules Identifier. <br>Type: String<br>Ancestor: Rule|No
Status|Rule Status<br>Type: String<br>Ancestor: Rule<br>Valid values: Enabled, Disenabled|Yes
Prefix|Match the prefix, with length not exceeding 1,024 characters, the prefix cannot be duplicated. <br>Type: String<br>Ancestor: Rule|Yes
Destination|Destination Information Set<br>Type: Container<br>Ancestor: Rule|Yes
Bucket|Destination Bucket, which multiple replication rules must specify the same Bucket. <br>Type: String<br>Ancestor: Destination|Yes
StorageClass|Specify the storage type of replication Object. If the storage type is not specified, use Object storage type. <br>Type: String<br>Ancestor: Destination<br>Default: Storage class of the source object.<br>Valid values: STANDARD, REDUCED_REDUNDANCY|No

## Response
### Response Header
No Special Response Header
### Response Element
No Response Element
### Special Error

HTTP Error|Code|Cause
---|---|---
HTTP 400|InvalidRequest|<Account> element must be specified if the <Owner> in <AccessControlTranslation> has a value.
HTTP 400|InvalidArgument|<Account> element is empty and must contain a valid account ID.
HTTP 400|InvalidArgument|The AWS account specified in the <Account> element must match the destination bucket owner.

## Examples
### Request Example
```
PUT /?replication HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com 
Date: Wed, 11 Feb 2015 02:11:21 GMT
Content-MD5: q6yJDlIkcBaGGfb3QLY69A==
Authorization: <authorization string>
Content-Length: 406

<ReplicationConfiguration>
  <Role>arn:aws:iam::35667example:role/CrossRegionReplicationRoleForS3</Role>
  <Rule>
    <ID>rule1</ID>
    <Prefix>TaxDocs</Prefix>
    <Status>Enabled</Status>
    <Destination>
      <Bucket>arn:aws:s3:::exampletargetbucket</Bucket>
    </Destination>
  </Rule>
</ReplicationConfiguration>
```

### Response Example
```
HTTP/1.1 200 OK
x-amz-request-id: 9E26D08072A8EF9E
Date: Wed, 11 Feb 2015 02:11:22 GMT
Content-Length: 0
Server: JDCloudOSS
```
