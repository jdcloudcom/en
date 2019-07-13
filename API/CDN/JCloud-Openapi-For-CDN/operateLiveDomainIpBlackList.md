# operateLiveDomainIpBlackList


## Description
Enable or disable ip blacklist

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/liveDomain/{domain}/ipBlackList:operate

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**blackIpsEnable**|String|False| | |


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
