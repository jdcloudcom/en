# setIpBlackList


## Description
Set ip blacklist

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/domain/{domain}/ipBlackList

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ips**|String[]|True| |ip black list, url cannot exceed 50 entries in ips|


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
