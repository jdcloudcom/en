# forbidLiveStream


## Description
Ban live streaming pushing

## Request Method
PUT

## Request Address
https://live.jdcloud-api.com/v1/streams:forbid


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**appName**|String|True| |Application Name|
|**publishDomain**|String|True| |Your Accelerated Domain|
|**streamName**|String|True| |Stream Name|


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
