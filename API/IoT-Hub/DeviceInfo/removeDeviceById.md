# removeDeviceById


## Description
Delete Device

## Request Method
DELETE

## Request Address
https://iothub.jdcloud-api.com/v2/regions/{regionId}/device/{deviceId}:deleteById

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Instance Region of Device|
|**deviceId**|String|True| |Device Id|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
