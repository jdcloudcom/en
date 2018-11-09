# describeQuota


## Description
Search resource quota and support Native Container and secret.


## Request method
GET

## Request address
https://nc.jdcloud-api.com/v1/regions/{regionId}/quotas

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**resourceType**|String|True| |resourceType - Resource type, support many [container, secret]<br>|


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
|**limit**|Integer|Quota|
|**used**|Integer|Used Number|

## Response code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
