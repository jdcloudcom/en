# setLiveStreamNotifyConfig


## Description
Set live streaming status notification

## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/streamNotifys


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**notifyUrl**|String|True| |Set the URL address to which the live streaming information is pushed|
|**publishDomain**|String|True| |Your Accelerated Domain|


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
