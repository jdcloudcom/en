# restoreInstance


## Description
Recover to a backup of Redis instance

## Request Method
POST

## Request Address
https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}/restore

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
|**requestId**|String|ID of This Request|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
