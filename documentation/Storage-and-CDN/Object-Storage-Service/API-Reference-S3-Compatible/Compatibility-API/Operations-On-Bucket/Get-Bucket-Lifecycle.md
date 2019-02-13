# Get Bucket Lifecycle

## Description

The operation can return the life cycle rule under the specified Bucket.

## Request

### Syntax

```
GET /?lifecycle HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jcloudcs.com
Date: date
Authorization: authorization string
```

### Request Parameter
No Request Parameter
### Request Header
No Special Request Header
### Request Elements
No Request Element

## Response
### Response Header
No Special Response Header
### Response Element
Similar to request elements in PUT Bucket Lifecycle

## Examples
### Request Example
```
GET /?lifecycle HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jcloudcs.com
Date: date
Authorization: authorization string
```
### Response Example
```
HTTP/1.1 200 OK
x-amz-request-id: 51991C342C575321
Date: Thu, 15 Nov 2012 00:17:23 GMT
Server: JDCloudOSS
Content-Length: length

<?xml version="1.0" encoding="UTF-8"?>
<LifecycleConfiguration>
    <Rule>
        <ID>delete rule</ID>
        <Filter>
           <Prefix>projectdocs/</Prefix>
        </Filter>
        <Status>Enabled</Status>
        <Expiration>
           <Days>3650</Days>
        </Expiration>
    </Rule>
</LifecycleConfiguration>
```
