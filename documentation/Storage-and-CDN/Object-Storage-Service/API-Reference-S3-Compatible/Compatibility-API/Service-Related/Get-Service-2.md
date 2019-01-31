# Get Service

## Description

The operation carries out Get request to the service address, which can return all Buckets that the requester owns.

The operation requires identity verification to the requesters, you must use AccessKey and AccessKeySecret registered in JD Cloud to complete the verification, which anonymous request cannot list Buckets.

## Request

### Syntax

```
GET / HTTP/1.1
Host: s3.<region>.jcloudcs.com 
Date: <date>
Authorization: <authorization string> (see Authenticating Requests (AWS Signature Version4))
```

### Request Parameter

The operation needs no request parameters.

### Request Header

The operation only uses general request Header, please see Headers of common requests.

### Request Elements

The operation needs no request elements.

## Response

### Response Element

 Name|Description
---|---
 Bucket | Bucket Information Set<br>Type: Container<br>Children:Name,CreationDate<br>Ancestor:ListAllMyBucketsResult.Buckets
 Buckets | Multiple Bucket Information Set<br>Type: Container<br>Children: Bucket<br>Ancestor: ListAllMyBucketsResult
 CreationDate | Creation date of the Bucket<br>Type: date ( of the form yyyy-mm-ddThh:mm:ss.timezone, e.g., 2009-02-03T16:45:09.000Z)<br>Ancestor: ListAllMyBucketsResult.Buckets.Bucket
 DispalyName | Name of the Bucket Owner<br>Type: String<br>Ancestor: ListAllMyBucketsResult.Owner
 ID | ID of the Bucket Owner<br>Type: String<br>Ancestor: ListAllMyBucketsResult.Owner
 ListAllMyBucketsResult | Response Set<br>Children: Owner, Buckets<br>Ancestor: None
 Name | Bucket Name<br>Type: String<br>Ancestor: ListAllMyBucketsResult.Buckets.Bucket
 Owner | Information Set of the Bucket Owner<br>Type: Container<br>Ancestor: ListAllMyBucketsResult

## Examples

### Request Example
```
GET / HTTP/1.1
Host: s3.<region>.jcloudcs.com
Date: Wed, 01 Mar  2006 12:00:00 GMT
Authorization: <authorization string>
```

### Return Example
```
<?xml version="1.0" encoding="UTF-8"?>
<ListAllMyBucketsResult xmlns="http://s3.amazonaws.com/doc/2006-03-01">
  <Owner>
    <ID>bcaf1ffd86f461ca5fb16fd081034f</ID>
    <DisplayName>webfile</DisplayName>
  </Owner>
  <Buckets>
    <Bucket>
      <Name>quotes</Name>
      <CreationDate>2006-02-03T16:45:09.000Z</CreationDate>
    </Bucket>
    <Bucket>
      <Name>samples</Name>
      <CreationDate>2006-02-03T16:41:58.000Z</CreationDate>
    </Bucket>
  </Buckets>
</ListAllMyBucketsResult>
```
