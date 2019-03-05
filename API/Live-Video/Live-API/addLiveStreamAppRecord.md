# addLiveStreamAppRecord


## Description
Add APP record configuration

## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/recordApps:config


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**appName**|String|True| |Application Name of the Live Streaming|
|**publishDomain**|String|True| |Your Pushing Streaming Accelerated Domain|
|**template**|String|True| |Record Template|


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
