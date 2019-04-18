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
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**bucket**|OssBucketDetailInfo| |
### OssBucketDetailInfo
|Name|Type|Description|
|---|---|---|
|**name**|String|Bucket Name|
|**acl**|String|Bucket Permission|
|**intranetEndpoint**|String|Intranet endpoint|
|**extranetEndpoint**|String|Internet endpoint|
|**creationDate**|String|Creation Time|
|**cloudID**|String|Cloud Information|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
|**404**|OSS bucket not found|
