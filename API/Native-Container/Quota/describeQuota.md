# describeQuota


## Description
Search resource quota and support Native Container, pod and secret.


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
|**resourceType**|String|True| |resourceType - Resource type, support many [container, pod, secret]<br>|


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
|**resourceType**|String|Type|
|**limit**|Integer|Quota|
|**used**|Integer|Used Number|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
