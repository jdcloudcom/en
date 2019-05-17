# modifyCacheInstanceAttribute


## Description
Modify the resource name and description of Redis instance, alternatively

## Request method
PATCH

## Request address
https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of the region where the Redis instance is located. At present, there are three regions, with Region ID of cn-north-1, cn-south-1 and cn-east-2 respectively|
|**cacheInstanceId**|String|True| |Redis instance ID is the only identifier for instance access|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**cacheInstanceName**|String|False| |Instance name must be numbers, letters, English underline and Chinese, and cannot be less than 2 characters and no more than 32 characters|
|**cacheInstanceDescription**|String|False| |Instance description cannot exceed 256 characters|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of This Request|


## Response code
|Return code|Description|
|---|---|
|**200**|OK|
