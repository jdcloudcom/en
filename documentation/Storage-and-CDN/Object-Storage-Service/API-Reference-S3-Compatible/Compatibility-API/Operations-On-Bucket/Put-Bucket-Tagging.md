# PUT Bucket tagging

## Description

This operation can set Tag for the existing Bucket.

## Request
### Syntax
```HTTP
PUT /?tagging HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Date: date
Authorization: authorization string
Content-MD5: MD5
 
<Tagging>
  <TagSet>
     <Tag>
       <Key>Tag Name</Key>
       <Value>Tag Value</Value>
     </Tag>
  </TagSet>
</Tagging>
```

### Request Parameter

No Request Parameter

### Request Header

No Special Request Header

### Request Element

Name|Description|Must
---|---|---
Tagging|TagSet and Tag element container<br>Type: String|Yes
TagSet|A series of Tag element container<br>Type: Container<br>Parent Tag: Tagging|Yes
Tag|A group of Tag container<br>Type: Container<br>Parent Tag: TagSet|Yes
Key|Tag Key<br>Type: String<br>Parent Tag: Tag|Yes
Value|Tag Value<br>Type: String<br>Parent Tag: Tag|Yes

## Response
### Response Header
No Special Response Header
### Response Element
No Response Element

## Examples
### Request Example
```HTTP
PUT ?tagging HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Content-Length: 1660
x-amz-date: Thu, 12 Apr 2012 20:04:21 GMT
Authorization: authorization string

<Tagging>
  <TagSet>
    <Tag>
      <Key>Project</Key>
      <Value>Project One</Value>
    </Tag>
    <Tag>
      <Key>User</Key>
      <Value>jsmith</Value>
    </Tag>
  </TagSet>
</Tagging>
```
### Response Example
```HTTP
HTTP/1.1 200 OK
x-amz-request-id: 9E26D08072A8EF9E
Date: Wed, 14 May 2014 02:11:22 GMT
Content-Length: 0
Server: JDCloudOSS
```







