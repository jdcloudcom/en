# deleteServerGroup


## Description
Delete virtual server group

## Request Method
DELETE

## Request Address
https://cps.jdcloud-api.com/v1/regions/{regionId}/serverGroups/{serverGroupId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, call APIs (queryCPSLBRegions) to get regions supported by Cloud Physical Server|
|**serverGroupId**|String|True| |ID of Server Group|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**success**|Boolean|Whether the deletion operation succeeded|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
