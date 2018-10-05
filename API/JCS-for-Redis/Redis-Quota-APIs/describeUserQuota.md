# describeUserQuota


## Description
Query Account Quota Information

## Request method
GET

## Request address
https://redis.jdcloud-api.com/v1/regions/{regionId}/quota

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||The Region ID of the region where the Redis instance is located. At present, the Redis has North China, South China, and East China regions, and the corresponding Region IDs are cn-north-1, cn-south-1, and cn-east-2|

## Request parameter
None


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**quota**|Quota||
### <a name="Quota">Quota</a>
|Name|Type|Description|
|---|---|---|
|**max**|Integer|Quota|
|**name**|String|Name of the quota item|
|**used**|Integer|Number used|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
