# getBucketByName


## Description
Search corresponding OSS bucket information according to the cloud providers

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/oss_buckets/{name}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of OSS Bucket|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**bucket**|OssBucketInfo| |
### OssBucketInfo
|Name|Type|Description|
|---|---|---|
|**cloudID**|String|Cloud Information|
|**creationDate**|String|Creation Time|
|**name**|String|Bucket Name|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
|**404**|OSS bucket not found|
