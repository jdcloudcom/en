# POST Object restore

## Description

This operation can restore a temporary replica of an object of GLACIER storage type Support the life cycle of a specified temporary replica when restoring, that is, after a specified period of time, OSS will delete the temporary replica. This operation does not affect the restored source object.

When restoring archived objects, you can specify the following restore options:
- Expedited: Fast Restore
- Standard: Standard Restore
- Bulk: Bulk Restore

## Request

### Request Syntax
```
POST /ObjectName?restore HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Date: date
Authorization: authorization string

 request body 
```

### Request Parameter
No Request Parameter

### Request Header
No Special Header

### Request Element
XML Example of Request Body:
```
<RestoreRequest>
   <Days>2</Days> 
   <GlacierJobParameters>
     <Tier>Bulk</Tier>
   </GlacierJobParameters> 
</RestoreRequest> 
```

Name|Description|Must
-|-|-
RestoreRequest|Collection of Retrieval Information. <br>Type: Container |Yes
Days|Retrieved Life Cycle of Temporary Replica. The minimum number of days to restore objects from Glacier is 1. When a replica of an object reaches the specified life cycle, OSS deletes it from the bucket. <br>Type: Positive Integer<br>Parent Tag: RestoreRequest|Yes
GlacierJobParameters|Collection of Glacier Retrieval Task Parameter. <br>Type: Container<br>Parent Tag: RestoreRequest|No
Tier|Restore option, Standard by default. <br>Type: Enum<br>Valid Value: Expedited, Standard, Bulk <br>Parent Tag: GlacierJobParameters|No

## Response

### Response Header
No Special Header
### Response Element
No Response Element
### Special Error
Error Code|Description|HTTP Status Code
-|-|-
RestoreAlreadyInProgress|Object restoration is already in process. |409 Conflict

## Examples
This request restores the replica of photo1.jpg from the archival storage with the restore option as Expedited and the life cycle of the copy is 2 days.
```
POST /photo1.jpg?restore HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Date: Mon, 22 Oct 2012 01:49:52 GMT
Authorization: authorization string
Content-Length: content length

<RestoreRequest>
  <Days>2</Days>
  <GlacierJobParameters>
    <Tier>Expedited</Tier>
  </GlacierJobParameters>
</RestoreRequest>
```
If there is no replica of the restored object in the Bucket, OSS will start the restore the task and return the 202 Accepted response.
```
HTTP/1.1 202 Accepted
x-amz-request-id: 9F341CD3C4BA79E0
Date: Sat, 20 Oct 2012 23:54:05 GMT
Content-Length: 0
Server: JDCloudOSS
```

