# updateDevice


## Description
Modify Device Details

## Request Method
POST

## Request Address
https://iothub.jdcloud-api.com/v2/regions/{regionId}/device/{deviceId}:update

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Instance Region of Device|
|**deviceId**|String|True| |Device Id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**model**|String|False| |Device Model|
|**manufacturer**|String|False| |Device Manufacturer|
|**description**|String|False| |Device Description|
|**status**|Integer|False| |Device Status|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**device**|DeviceVO|Equipment Details|
### DeviceVO
|Name|Type|Description|
|---|---|---|
|**deviceId**|String|Device ID|
|**deviceName**|String|Device Name|
|**parentId**|String|Parent Device Id|
|**deviceType**|String|Device Type, identical to product type, 0-Ordinary Device, 1-Gateway, 2-Edge|
|**status**|Integer|Device Status, 0-Nonactivated, 1-Actived and Off-line, 2-Actived and On-line|
|**productKey**|String|Product Key|
|**identifier**|String|Device Identifier|
|**secret**|String|Device Secrete Key|
|**description**|String|Device Description|
|**activatedTime**|Long|Activation Time|
|**lastConnectedTime**|Long|Last Connection Time|
|**createdTime**|Long|Registration Time|
|**updatedTime**|Long|Modification Time|
|**productSecret**|String|Product Secret Key|
|**productName**|String|Product Name|
|**model**|String|Device Model|
|**manufacturer**|String|Device Manufacturer|
|**dynamicRegister**|Integer|Enable dynamic registration or not, 0: Disable, 1: Enable, the device verification type for enabling dynamic registration is one type and one password or one machine and one password|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
