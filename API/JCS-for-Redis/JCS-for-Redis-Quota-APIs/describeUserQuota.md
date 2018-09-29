# describeUserQuota


## Description
Query account quota information

## Request method
GET

## Request address
https://redis.jdcloud-api.com/v1/regions/{regionId}/quota

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |The Region ID of the region where the JCS for Redis instance is located. At present, the JCS for Redis has North China, South China, and East China regions, and the corresponding Region IDs are cn-north-1, cn-south-1, and cn-east-2|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**quota**|Quota| |
### Quota
|Name|Type|Description|
|---|---|---|
|**max**|Integer|Quota|
|**name**|String|Name of the Quota Item|
|**used**|Integer|Number Used|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
