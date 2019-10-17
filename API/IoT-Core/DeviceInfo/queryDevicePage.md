# queryDevicePage


## Description
Search device information by pages and support one or more conditions

## Request Method
GET

## Request Address
https://iotcore.jdcloud-api.com/v2/regions/{regionId}/instances/{instanceId}/devices:queryPage

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |Instance ID of Device|
|**regionId**|String|True| |Instance Region of Device|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**deviceName**|String|False| |Device name, fuzzy matching|
|**status**|Integer|False| |Device Status 0-Nonactivated, 1-Activiating Off-line, 2-Activating On-line|
|**productKey**|String|False| |Product Key of Device|
|**deviceType**|Integer|False| |Device Type, identical to product type, 0-Device, 1-Gateway|
|**nowPage**|Integer|False| |Current Page Number|
|**pageSize**|Integer|False| |Data Entry(ies) per Page|
|**order**|String|False| |Ordering keywords--name,type,productKey,status--Support at most one field|
|**direction**|String|False| |Order, ascending and descending--asc,desc|
|**parentId**|String|False| |Parent Device Id|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**pageSize**|Integer| |
|**nowPage**|Integer| |
|**totalSize**|Integer| |
|**totalPage**|Integer| |
|**data**|DeviceVO[]| |
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
|**productName**|String|Product Name|
|**model**|String|Device Model|
|**manufacturer**|String|Device Manufacturer|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
