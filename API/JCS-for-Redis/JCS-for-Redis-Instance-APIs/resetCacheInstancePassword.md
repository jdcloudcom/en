# resetCacheInstancePassword


## Description
Reset the password of the JCS for Redis instance to support the password-free operation

## Request method
POST

## Request address
https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}:resetCacheInstancePassword

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**cacheInstanceId**|String|True| |The ID of the JCS for Redis instance is the unique identifier to access to instance.|
|**regionId**|String|True| |The Region ID of the region where the JCS for Redis instance is located. At present, the JCS for Redis has North China, South China, and East China regions, and the corresponding Region IDs are cn-north-1, cn-south-1, and cn-east-2|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**password**|String|False| |Password contains and only supports letters and numbers with no less than 8 characters and no more than 16 characters. If the password is null, it means password-free.|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of This Reset Request|



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
