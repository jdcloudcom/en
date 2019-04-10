# Put Bucket

## Description
The operation can implement creating a Bucket; the region where created Bucket located is consistent with the region corresponding to the Endpoint sending request. After confirmation of region where the Bucket is located, all Objects under the Bucket will be always stored in the corresponding regions. At most 20 Buckets can be created in each Region.

Naming Rules of Bucket:<br>
1. The length must be between 3 - 63 characters<br>
2. The name can only be composed of lowercase letters, numbers, and line-through (-)<br>
3. The name must start and end with a lowercase letter or number<br>

## Request

## Syntax
```HTTP
PUT / HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Content-Length: <length>
Date: <date>
Authorization: <authorization string> (see Authenticating Requests (AWS Signature Version4))

<CreateBucketConfiguration xmlns="http://s3.amazonaws.com/doc/2006-03-01/"> 
  <LocationConstraint>BucketRegion</LocationConstraint> 
</CreateBucketConfiguration>
```
### Request Parameter
The operation has no request parameters

### Request Header
The operation only uses general request Header, please see Headers of common requests.

### Request Elements
No Request Elements

## Response

## Response Element
The operation has no response elements

## Examples

### Request Example
```HTTP
PUT / HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Content-Length: 0
Date: Wed, 01 Mar  2006 12:00:00 GMT
Authorization: <authorization string>
```
### Response Example
```HTTP
HTTP/1.1 200 OK
x-amz-request-id: 236A8905248E5A01
Date: Wed, 01 Mar  2006 12:00:00 GMT
Content-Length: 0
Connection: close
Server: JDCloudOSS
```
