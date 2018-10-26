# deleteNamespace


## Description
Delete namespace; if there are other subordinate resources associated with it, it is not allowed to delete it

## Request method
DELETE

## Request address
https://streamcompute.jdcloud-api.com/v1/regions/{regionId}/namespace

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**namespaceId**|Integer|True| | |


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**status**|Boolean|Delete the namespace successful marker|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|INTERNAL_ERROR|
|**400**|INTERNAL_ERROR|
