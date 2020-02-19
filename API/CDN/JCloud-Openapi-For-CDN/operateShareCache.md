# operateShareCache


## Description
Extensive Domain Cache Sharing

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/domain/{domain}/shareCache

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**status**|String|True| |Shared Cache only can be off or on|


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
