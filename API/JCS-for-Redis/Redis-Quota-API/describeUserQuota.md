# describeUserQuota


## Description
Search Redis quota information of the account

## Request method
GET

## Request address
https://redis.jdcloud-api.com/v1/regions/{regionId}/quota

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of the region where the Redis instance is located. At present, there are three regions, with Region ID of cn-north-1, cn-south-1 and cn-east-2 respectively|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**quota**|Quota| |
### Quota
|Name|Type|Description|
|---|---|---|
|**name**|String|Name of the Quota Item|
|**max**|Integer|Quota|
|**used**|Integer|Used Number|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
