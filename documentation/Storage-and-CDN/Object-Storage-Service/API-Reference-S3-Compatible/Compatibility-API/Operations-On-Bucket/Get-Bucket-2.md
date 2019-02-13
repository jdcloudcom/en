# Get Bucket(List Objects)Version 2

## Description
The operation can list part of or all (maximum 1,000 Nr.) Objects in the Bucket. You can take request parameters as filter conditions of selection to list part of objects.

Note: Even if the access permission of Bucket is public, this action is also not allowed to be used anonymously, which requires to assign Authorization.

## Request

### Syntax
```
GET /?list-type=2 HTTP/1.1
Host: <bucket>.s3.<region>.jcloudcs.com 
Date: <date>
Authorization: <authorization string> (see Authenticating Requests (AWS Signature Version4))
```

### Request Parameter
Parameter|Description|Must
---|---|---
delimiter| Be a character used for grouping Object names. All names include assigned prefixes and the object between the first occurred delimiter characters is used as a set of elements--CommonPrefixes. If prefix is not specified, it will be calculated from the beginning of the name. <br>Type: String<br>Default: None|No
encoding-type| Code for response and specify code type. <br>Objcet Key can contain any Unicode character. But, XML1.0 cannot parse some characters, e.g., characters with ASCII values from 0 to 10. For characters not supported in XML 1.0, you can add the parameter to request OSS to encode the keys in the response. <br>Type: String<br>Default: None<br>Valid value: url|No
max-keys| Limit the maximum count of returned objects in this time. If you need to retrieve less than the default 1,000 objects, you can add it to your request. <br>If the count of objects in response is greater than set maximum count, the extra objects will not be returned and <IsTruncated>true</IsTruncated>will be contained in response. If you need to return extra objects, please see NextContinuationToken. <br>Type: String<br>Default: 1,000|No
prefix| Returned objects must be prefixed with prefix by limit. You can use prefix to divide objects into different groups. <br>Type: String<br>Default: None|No
list-type| API Version 2 needs the parameter, and the value of the parameter must be set as 2. <br>Type: String<br>Default:2|Yes
continuation-token| If the response element of IsTruncated is true, then NextContinuationToken elements will be contained in response, you can use NextContinuationToken as continuation-token in next request to return next batch of objects. <br>Type: String<br>Default: None|No
fetch-owner| The owner information of the Bucket will not be returned by default, and if you need to return information of the owner, you need to specify the value of fetch-owner as true<br>Type: String<br>Default: false|No
start-after| If you need to return relevant objects followed a specific object, you can set the specific object name as the parameter value. <br>Type: String<br>Default: None|No

### Request Elements
No Request Elements

### Request Header
The operation only uses general request Header, please see Headers of common requests.

## Response
### Response Header
The operation only uses general response Header, please see common response Header.

### Response Element
Name|Description
---|---
Contents| Metadata returned by each object<br>Type: XML metadata<br>Ancestor: ListBucketResult
CommonPrefixes| When returning, all objects containing specified prefix and with first occurred delimiter are returned as single CommonPrefixes. <br>Only return CommonPrefixes when designating delimiter. <br>Type: String<br>Ancestor: ListBucketResult
Delimiter| Be a character used for grouping Object names. <br>Type: String<br>Ancestor: ListBucketResult
DisplayName| Name of object Owner<br>Type: String<br>Ancestor: ListBucketResult.Contents.Owner
Encoding-Type| Code for response and specify code type. <br>Type: String<br>Ancestor: ListBucketResult
ETag | ETag is Hash value of Object in JD Cloud Storage Service, which only reflects data contents of Object other than Metadata. <br>Type: String<br>Ancestor: ListBucketResult.Contents
ID| ID of object Owner. <br>Type: String<br>Ancestor: ListBucketResult.Contents.Owner
IsTruncated| If the object count exceeds the value of MaxKeys, then more objects may be returned, the value is true; if all results are returned, the value is false. <br>Type: Boolean<br>Ancestor: ListBucketResult
Key| object key<br>Type: String<br>Ancestor: ListBucketResult.Contents
LastModified | Last Modification time of object. <br>Type: Date<br>Ancestor: ListBucketResult.Contents
MaxKeys| Limit the maximum count of returned objects in this time. <br>Type: Date<br>Ancestor: ListBucketResult.Contents
Name| Name of bucket. <br>Type: String<br>Ancestor: ListBucketResult
Owner| Owner of bucket. <br>Type: String<br>Children: DisplayName, ID<br>Ancestor: ListBucketResult.Contents | CommonPrefixes
Prefix |Returned object key must be prefixed with prefix by limit. <br>Type: String<br>Ancestor: ListBucketResult
Size| Size of object. <br>Type: String<br>Ancestor: ListBucketResult.Contents
StorageClass| Storage type: STANDARD, REDUCED_REDUNDANCY<br>Type: String<br>Ancestor: ListBucketResult.Contents
ContinuationToken| If the element is contained in the request, then it is also contained in the response. <br>Type: String<br>Ancestor: ListBucketResult
KeyCount| Count of returned objects in the response. <br>Type: String<br>Ancestor: ListBucketResult
NextContinuationToken| If the response is truncated, then OSS will return a continuous Token. You can take the Token as the continuation-token of next request to fetch the remaining objects. <br>Type: String<br>Ancestor: ListBucketResult
StartAfter| If the element is contained in the request, then it is also contained in the response. <br>Type: String<br>Ancestor: ListBucketResult

## Examples

### Example 1: Listing Keys
The request can return objects in a specific bucket. The request specifies list-type element to be 2.
#### Request Example
```
GET /?list-type=2 HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com 
x-amz-date: 20160430T233541Z
Authorization: <authorization string>
Content-Type: text/plain
```
#### Response Example
```
HTTP/1.1 200 OK
x-amz-request-id: 3B3C7C725673C630
Date: Sat, 30 Apr 2016 23:29:37 GMT
Content-Type: application/xml
Content-Length: length
Connection: close
Server: JDCloudOSS

<?xml version="1.0" encoding="UTF-8"?>
<ListBucketResult xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
    <Name>oss-example</Name>
    <Prefix/>
    <KeyCount>205</KeyCount>
    <MaxKeys>1000</MaxKeys>
    <IsTruncated>false</IsTruncated>
    <Contents>
        <Key>my-image.jpg</Key>
        <LastModified>2009-10-12T17:50:30.000Z</LastModified>
        <ETag>&quot;fba9dede5f27731c9771645a39863328&quot;</ETag>
        <Size>434234</Size>
        <StorageClass>STANDARD</StorageClass>
    </Contents>
    <Contents>
       ...
    </Contents>
    ...
</ListBucketResult>
```
### Example 2: Listing Keys (use max-keys, prefix and start-after elements)
#### Request Example
```
GET /?list-type=2&max-keys=3&prefix=E&start-after=ExampleGuide.pdf HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com 
x-amz-date: 20160430T232933Z
Authorization: <authorization string>
```
#### Response Example
```
HTTP/1.1 200 OK
x-amz-request-id: 3B3C7C725673C630
Date: Sat, 30 Apr 2016 23:29:37 GMT
Content-Type: application/xml
Content-Length: length
Connection: close
Server: JDCloudOSS

<?xml version="1.0" encoding="UTF-8"?>
<ListBucketResult xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
  <Name>oss-example</Name>
  <Prefix>E</Prefix>
  <StartAfter>ExampleGuide.pdf</StartAfter>
  <KeyCount>1</KeyCount>
  <MaxKeys>3</MaxKeys>
  <IsTruncated>false</IsTruncated>
  <Contents>
    <Key>ExampleObject.txt</Key>
    <LastModified>2013-09-17T18:07:53.000Z</LastModified>
    <ETag>&quot;599bab3ed2c697f1d26842727561fd94&quot;</ETag>
    <Size>857</Size>
    <StorageClass>REDUCED_REDUNDANCY</StorageClass>
  </Contents>
</ListBucketResult>
```
### Example 3: Listing Keys (use prefix and delimiter elements)
The example uses prefix and delimiter elements in the request, provided that bucket contains the following objects:<br>
sample.jpg<br>
photos/2006/January/sample.jpg<br>
photos/2006/February/sample2.jpg<br>
photos/2006/February/sample3.jpg<br>
photos/2006/February/sample4.jpg<br>

**The following example specifies the value of delimiter as "/":**
```
GET /?list-type=2&delimiter=/ HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com 
x-amz-date: 20160430T235931Z
Authorization: <authorization string>			
```
sample.jpg contains no delimiter character, so OSS returns it into Contents element. Other objects contain delimiter character and common prefix:photos/, so OSS returns them as a single CommonPrefixes element.
```
<ListBucketResult xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
  <Name>oss-example</Name>
  <Prefix></Prefix>
  <KeyCount>2</KeyCount>
  <MaxKeys>1000</MaxKeys>
  <Delimiter>/</Delimiter>
  <IsTruncated>false</IsTruncated>
  <Contents>
    <Key>sample.jpg</Key>
    <LastModified>2011-02-26T01:56:20.000Z</LastModified>
    <ETag>&quot;bf1d737a4d46a19f3bced6905cc8b902&quot;</ETag>
    <Size>142863</Size>
    <StorageClass>STANDARD</StorageClass>
  </Contents>
  <CommonPrefixes>
    <Prefix>photos/</Prefix>
  </CommonPrefixes>
</ListBucketResult>
```

**The following example specifies the value of delimiter as "/" and the value of prefix as "photos/2006"**
```
GET /?list-type=2&prefix=photos/2006/&delimiter=/ HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com 
x-amz-date: 20160501T000433Z
Authorization: <authorization string>
```
In response, OSS will return specified prefix and take different character strings containing prefix and with first occurred delimiter character as different CommonPrefixes for grouping and return.
```
<ListBucketResult xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
  <Name>oss-example</Name>
  <Prefix>photos/2006/</Prefix>
  <KeyCount>3</KeyCount>
  <MaxKeys>1000</MaxKeys>
  <Delimiter>/</Delimiter>
  <IsTruncated>false</IsTruncated>
  <Contents>
    <Key>photos/2006/</Key>
    <LastModified>2016-04-30T23:51:29.000Z</LastModified>
    <ETag>&quot;d41d8cd98f00b204e9800998ecf8427e&quot;</ETag>
    <Size>0</Size>
    <StorageClass>STANDARD</StorageClass>
  </Contents>

  <CommonPrefixes>
    <Prefix>photos/2006/February/</Prefix>
  </CommonPrefixes>
  <CommonPrefixes>
    <Prefix>photos/2006/January/</Prefix>
  </CommonPrefixes>
</ListBucketResult>
```

### Example 4: Use Continuation Token
In this example, the count of objects returned by initial request exceeds 1,000. In the response, OSS returns the IsTruncated and NextContinuationToken elements with the value of true.
```
GET /?list-type=2 HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com 
Date: Mon, 02 May 2016 23:17:07 GMT
Authorization: <authorization string>
```

The following is a response example:
```
HTTP/1.1 200 OK
x-amz-request-id: 3B3C7C725673C630
Date: Sat, 30 Apr 2016 23:29:37 GMT
Content-Type: application/xml
Content-Length: length
Connection: close
Server: JDCloudOSS

<ListBucketResult xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
  <Name>oss-example</Name>
  <Prefix></Prefix>
  <NextContinuationToken>1ueGcxLPRx1Tr/XYExHnhbYLgveDs2J/wm36Hy4vbOwM=</NextContinuationToken>
  <KeyCount>1000</KeyCount>
  <MaxKeys>1000</MaxKeys>
  <IsTruncated>true</IsTruncated>
  <Contents>
    <Key>happyface.jpg</Key>
    <LastModified>2014-11-21T19:40:05.000Z</LastModified>
    <ETag>&quot;70ee1738b6b21e2c8a43f3a5ab0eee71&quot;</ETag>
    <Size>11</Size>
    <StorageClass>STANDARD</StorageClass>
  </Contents>
   ...
</ListBucketResult>
```

Shown as below, we add continuation-token as the request parameter in the subsequent request and take the previously returned <NextContinuationToken> as the value of the parameter.
```
GET /?list-type=2 HTTP/1.1
GET /?list-type=2&continuation-token=1ueGcxLPRx1Tr/XYExHnhbYLgveDs2J/wm36Hy4vbOwM= HTTP/1.1

Host: oss-example.s3.<region>.jcloudcs.com 
Date: Mon, 02 May 2016 23:17:07 GMT
Authorization: <authorization string>  
```
In the following example of return, OSS will return objects not returned in the last request due to exceeding limit.
```
HTTP/1.1 200 OK
x-amz-request-id: 3B3C7C725673C630
Date: Sat, 30 Apr 2016 23:29:37 GMT
Content-Type: application/xml
Content-Length: length
Connection: close
Server: JDCloudOSS

<ListBucketResult xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
  <Name>oss-example</Name>
  <Prefix></Prefix>
  <ContinuationToken>1ueGcxLPRx1Tr/XYExHnhbYLgveDs2J/wm36Hy4vbOwM=</ContinuationToken>
  <KeyCount>112</KeyCount>
  <MaxKeys>1000</MaxKeys>
  <IsTruncated>false</IsTruncated>
  <Contents>
    <Key>happyfacex.jpg</Key>
    <LastModified>2014-11-21T19:40:05.000Z</LastModified>
    <ETag>&quot;70ee1738b6b21e2c8a43f3a5ab0eee71&quot;</ETag>
    <Size>1111</Size>
    <StorageClass>STANDARD</StorageClass>
  </Contents>
   ...
</ListBucketResult>
```
