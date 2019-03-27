# addLiveDomain


## Description
Add live domain

## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/domains


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**playDomain**|String|True| |Live Playing Domain|
|**publishDomain**|String|True| |Live Pushing Streaming Domain|


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
