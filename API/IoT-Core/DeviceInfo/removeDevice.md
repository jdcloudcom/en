# removeDevice


## Description
Delete Device

## Request Method
DELETE

## Request Address
https://iotcore.jdcloud-api.com/v2/regions/{regionId}/instances/{instanceId}/products/{productKey}/device/{deviceName}:delete

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**deviceName**|String|True| |Device Name|
|**instanceId**|String|True| |Instance ID of Device|
|**regionId**|String|True| |Instance Region of Device|
|**productKey**|String|True| |Product Key|

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
