# getBucketFiles


## Description
Get file list on the designated OSS bucket according to the filtering conditions

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/oss_buckets/{name}/files

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of OSS Bucket|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|
|**marker**|String|False| |Start Point of This Query (key Value of File)|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**isTruncated**|Boolean|Whether it is intercepted (meaning not more data)|
|**marker**|String|Start Point of This Query (key Value of File)|
|**files**|OssFileInfo[]| |
### OssFileInfo
|Name|Type|Description|
|---|---|---|
|**bucketName**|String|Bucket Name|
|**key**|String|Key Value of File Storage|
|**size**|Double|File Size (byte)|
|**lastModifiedTime**|String|Last Modification Time|
|**storageClass**|String|Storage Type|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
|**404**|OSS bucket not found|
