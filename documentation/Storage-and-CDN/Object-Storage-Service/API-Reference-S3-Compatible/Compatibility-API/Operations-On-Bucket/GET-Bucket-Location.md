# GET Bucket Location

## Description

This operation returns the region in which the specified Bucket is located.

## Request

### Syntax

```
GET /?location HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jcloudcs.com
Date: date
Authorization: authorization string (see Authenticating Requests (AWS Signature Version4))
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

Name|Description
-|-
LocationConstraint|The region in which the Bucket is located. <br>Type: String<br>Valid Values: huabei \| suqian \| guangzhou \| shanghai

Note:

- At present, the effective values corresponding to the LocationConstraint are: huabei (cn-north-1), suqian (cn-east-1), shanghai (cn-east-2), guangzhou (cn-south-1)

- The API will be upgraded in the future, and the effective values corresponding to the LocationConstraint will be modified as: cn-north-1, cn-east-1, cn-east-2, cn-south-1

- If you need to resolve the LocationConstraint when calling the API, please carry out compatibility at the application layer; for example, carry out equivalent compatibility between `huabei` and `cn-north-1`. After the API upgrades, you can achieve smooth transition without modifying the code.

### Special Error
No Special Error

## Examples
### Request Example

```
GET /?location HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jcloudcs.com
Date: Tue, 09 Oct 2007 20:26:04 +0000
Authorization: signatureValue
```

### Response Example

```
<?xml version="1.0" encoding="UTF-8"?>
<LocationConstraint>huabei</LocationConstraint>
```
