# setNodeGroupCA


## Description
Set automatic scaling of working node group

## Request Method
POST

## Request Address
https://kubernetes.jdcloud-api.com/v1/regions/{regionId}/nodeGroups/{nodeGroupId}:setNodeGroupCA

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**nodeGroupId**|String|True| |Working Node Group ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**caConfig**|[CAConfigSpec](setnodegroupca#caconfigspec)|True| |Auto Scaling Configuration where enable must be specified|

### <div id="caconfigspec">CAConfigSpec</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**enable**|Boolean|False| |Whether to enable auto scaling, false<br> is set by default|
|**maxNode**|Integer|False| |Maximum working node number is in automatically scaling with the value range being [1, min (2000, subnet surplus ip)]|
|**minNode**|Integer|False| |Minimum working node number is in automatically scaling with the range being [0, min(2000, maxNode)]|

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
|**500**|Internal server error|
|**503**|Service unavailable|
