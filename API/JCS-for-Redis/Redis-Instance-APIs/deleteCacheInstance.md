# deleteCacheInstance


## Description
Delete a single Redis instance that is paid by configuration billing or the monthly package has expired and the monthly package that has not expired cannot be deleted
Only in the status of runningrunningor errorerrorstatus can be deleted, but other status cannot be deleted
The user in white list cannot delete the virtual machine that the monthly package has expired


## Request method
DELETE

## Request address
https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**cacheInstanceId**|String|True||The ID of the Redis instance is the unique identifier to access to instance.|
|**regionId**|String|True||The Region ID of the region where the Redis instance is located. At present, the Redis has North China, South China, and East China regions, and the corresponding Region IDs are cn-north-1, cn-south-1, and cn-east-2|

## Request parameter
None


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of This Delete Request|



## Return code
|Return code|Description|
|---|---|
|**200**|OK|
