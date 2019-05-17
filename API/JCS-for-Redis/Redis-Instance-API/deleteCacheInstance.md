# deleteCacheInstance


## Description
Delete Redis instances with expired Pay By Configuration or Monthly Package and those with unexpired Monthly Package cannot be deleted.
Instances in the running or error status only can be deleted, while cannot be deleted in other status.
For the White List user, the expired Redis instance in Monthly Package cannot be deleted.


## Request method
DELETE

## Request address
https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of the region where the Redis instance is located. At present, there are three regions, with Region ID of cn-north-1, cn-south-1 and cn-east-2 respectively|
|**cacheInstanceId**|String|True| |Redis instance ID is the only identifier for instance access|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of This Request|


## Response code
|Return code|Description|
|---|---|
|**200**|OK|
