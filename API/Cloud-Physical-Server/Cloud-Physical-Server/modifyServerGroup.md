# modifyServerGroup


## Description
Modify virtual server group

## Request Method
POST

## Request Address
https://cps.jdcloud-api.com/v1/regions/{regionId}/serverGroups/{serverGroupId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, call APIs (queryCPSLBRegions) to get regions supported by Cloud Physical Server|
|**serverGroupId**|String|True| |ID of Server Group|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|False| |Name|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**loadBalancerId**|String|Load Balancer ID|
|**serverGroupId**|String|ID of Server Group|
|**name**|String|Name|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
