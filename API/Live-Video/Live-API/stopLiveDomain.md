# stopLiveDomain


## Description
Disable domain

## Request Method
PUT

## Request Address
https://live.jdcloud-api.com/v1/domains:stop


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Domain to be Disabled|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ruquestId|


## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
