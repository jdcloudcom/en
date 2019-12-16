# addDevice


## Description
Register a single device and return secret key information

## Request Method
POST

## Request Address
https://iothub.jdcloud-api.com/v2/regions/{regionId}/device:add

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Instance Region of Device|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**deviceName**|String|False| |Device Name|
|**productKey**|String|False| |Product of Device|
|**model**|String|False| |Device Model|
|**manufacturer**|String|False| |Manufacturer|
|**description**|String|False| |Device Description|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**deviceName**|String|Device Name|
|**identifier**|String|Device Identifier|
|**secret**|String|Device Secrete Key|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
