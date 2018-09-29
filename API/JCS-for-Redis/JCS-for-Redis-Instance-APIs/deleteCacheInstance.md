# deleteCacheInstance


## Description
Delete a single JCS for Redis instance that is paid by configuration billing or the monthly package has expired and the monthly package that has not expired cannot be deleted
Only in the running<b>running</b>or error<b>error</b>status can be deleted, but other status cannot be deleted
The user in the White List cannot delete the virtual machine that the monthly package has expired


## Request method
DELETE

## Request address
https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**cacheInstanceId**|String|True| |The ID of the JCS for Redis instance is the unique identifier to access to instance.|
|**regionId**|String|True| |The Region ID of the region where the JCS for Redis instance is located. At present, the JCS for Redis has North China, South China, and East China regions, and the corresponding Region IDs are cn-north-1, cn-south-1, and cn-east-2|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of This Delete Request|



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
