# modifyCacheInstanceAttribute


## Description
Modify the resource name and description of the JCS for Redis instance, at least one of the two

## Request method
PATCH

## Request address
https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**cacheInstanceId**|String|True| |The ID of the JCS for Redis instance is the unique identifier to access to instance.|
|**regionId**|String|True| |The Region ID of the region where the JCS for Redis instance is located. At present, the JCS for Redis has North China, South China, and East China regions, and the corresponding Region IDs are cn-north-1, cn-south-1, and cn-east-2|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**cacheInstanceDescription**|String|False| |The description of the JCS for Redis instance resource cannot be more than 256 characters|
|**cacheInstanceName**|String|False| |The name of JCS for Redis instance resource only supports numbers, letters, underlines, Chinese, no less than 2 characters and no more than 32 characters|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of This Modification Request|



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
