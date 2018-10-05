# modifyCacheInstanceAttribute


## Description
Modify the resource name and description of the Redis instance, at least one of the two

## Request method
PATCH

## Request address
https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**cacheInstanceId**|String|True||The ID of the Redis instance is the unique identifier to access to instance.|
|**regionId**|String|True||The Region ID of the region where the Redis instance is located. At present, the Redis has North China, South China, and East China regions, and the corresponding Region IDs are cn-north-1, cn-south-1, and cn-east-2|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**cacheInstanceDescription**|String|False||The description of the Redis instance resource can not be more than 256 characters|
|**cacheInstanceName**|String|False||The name of cache Redis instance resource only supports numbers, letters, underlines, Chinese, no less than 2 characters and no more than 32 characters|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of This Modification Request|



## Return code
|Return code|Description|
|---|---|
|**200**|OK|
