# setNodeGroupSize


## Description
Adjust instance count of node group

## Request Method
POST

## Request Address
https://kubernetes.jdcloud-api.com/v1/regions/{regionId}/nodeGroups/{nodeGroupId}:setNodeGroupSize

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**nodeGroupId**|String|True| |ID of Node Group|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**expectCount**|Integer|True| |Create a cluster request parameter model|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**429**|Quota exceeded|
|**500**|Internal server error|
|**503**|Service unavailable|
