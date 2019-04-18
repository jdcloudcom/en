# getBuckets


## Description
Search corresponding OSS bucket list according to the cloud providers

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/oss_buckets

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**buckets**|OssBucketInfo[]| |
### OssBucketInfo
|Name|Type|Description|
|---|---|---|
|**name**|String|Bucket Name|
|**creationDate**|String|Creation Time|
|**cloudID**|String|Cloud Information|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
