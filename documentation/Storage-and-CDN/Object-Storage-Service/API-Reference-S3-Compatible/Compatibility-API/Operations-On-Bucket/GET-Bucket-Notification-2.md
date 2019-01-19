# GET Bucket notification

## Description
The operation can return NotificationConfiguration of specified Bucket, if NotificationConfiguration is not configured, the operation will return null NotificationConfiguration element.

## Request
### Syntax
```
GET /?notification HTTP/1.1
Host: <bucket>.s3.<region>.jcloudcs.com
Date: <date>
Authorization: <authorization string> (see Authenticating Requests (AWS Signature Version 4))
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
Similar to request elements in PUT Bucket notification

## Examples
### Request Example
```
GET ?notification HTTP/1.1 
Host: oss-example.s3.<region>.jcloudcs.com
Date: Wed, 15 Oct 2014 16:59:03 GMT
Authorization: <authorization string>
```
### Response Example
```
HTTP/1.1 200 OK
x-amz-request-id: 236A8905248E5A02
Date: Wed, 15 Oct 2014 16:59:04 GMT
Server: JDcloudOSS
<?xml version="1.0" encoding="UTF-8"?>

<NotificationConfiguration xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
    <TopicConfiguration>
        <Id>1</Id>
        <Filter>
            <S3Key>
                <FilterRule>
                    <Name>prefix</Name>
                    <Value>images/</Value>
                </FilterRule>
                <FilterRule>
                    <Name>suffix</Name>
                    <Value>.jpg</Value>
                </FilterRule>
           </S3Key>
        </Filter>
        <Topic>NS:http://116.196.97.17:1601/post/callback</Topic>
        <Event>s3:ObjectCreated:Put</Event>
    </TopicConfiguration>
</NotificationConfiguration>
```
