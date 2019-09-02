# GET Bucket accelerate

## Description

This operation may return the transmission acceleration rules under the specified Bucket. The Get operation has the following responses:

- If the transmission acceleration status of a Bucket is Enabled, the response is:
```XML
<AccelerateConfiguration xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
  <Status>Enabled</Status>
</AccelerateConfiguration>
```

- If the transmission acceleration status of a Bucket is Suspended, the response is:
```XML
<AccelerateConfiguration xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
  <Status>Suspended</Status>
</AccelerateConfiguration>
```

- If the transmission acceleration has never been set for a Bucket, the response is:
```XML
<AccelerateConfiguration xmlns="http://s3.amazonaws.com/doc/2006-03-01/"/>
```

## Request

### Syntax

```HTTP
GET /?accelerate HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Content-Length: length
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
Request element in the same Put Bucket accelerate

## Examples
### Request Example
```HTTP
GET /?accelerate HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Content-Length: length
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

<AccelerateConfiguration xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
  <Status>Enabled</Status>
</AccelerateConfiguration>
```
