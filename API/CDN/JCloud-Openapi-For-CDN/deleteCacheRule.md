# deleteCacheRule


## Description
Delete cache rules

## Request Method
DELETE

## Request Address
https://cdn.jdcloud-api.com/v1/domain/{domain}/cacheRule

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**configId**|Long|True| |Cache Rule Configuration ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Object| |
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
