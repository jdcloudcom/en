# describeDownloadUrl


## Description
Backup file temporary download link for getting Redis instance

## Request Method
GET

## Request Address
https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}/backup:describeDownloadUrl

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of the region where the Redis instance is located. At present, there are three regions, with Region ID of cn-north-1, cn-south-1 and cn-east-2 respectively|
|**cacheInstanceId**|String|True| |Redis instance ID is the only identifier for instance access|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**baseId**|String|True| |Backup Task ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#Result)|Result|
|**requestId**|String|ID of This Request|

### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**downloadUrls**|[DownloadUrl[]](#DownloadUrl)|Backup File Download Information List|
### <a name="DownloadUrl">DownloadUrl</a>
|Name|Type|Description|
|---|---|---|
|**name**|String|Name|
|**link**|String|Download Link|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
