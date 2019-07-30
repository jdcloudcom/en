# GET Bucket tagging

## Description

This operation may return the tag set under specified Bucket.

## Request

### Syntax

```HTTP
GET /?tagging HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Date: date
Authorization: authorization string
```

### Request Parameter
No Request Parameter
### Request Header
No Special Request Header
### Request Element
No Request Element

## Response
### Response Header
No Special Response Header
### Response Element
Request element in the same Put Bucket tagging

## Examples
### Request Example
```HTTP
GET ?tagging HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Date: date
Authorization: authorization string
```
### Response Example
```HTTP
HTTP/1.1 200 OK
x-amz-request-id: 51991C342C575321
Date: Thu, 15 Nov 2012 00:17:23 GMT
Server: JDCloudOSS
Content-Length: length

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
