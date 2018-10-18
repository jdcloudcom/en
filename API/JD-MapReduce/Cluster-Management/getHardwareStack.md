# getHardwareStack


## Description
Hardware Configuration Information List

## Request method
GET

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/hardwareStack

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|HardWareStackData|Hardware Information Queried|
|**message**|String| |
|**status**|String| |
### HardWareStackData
|Name|Type|Description|
|---|---|---|
|**disk**|Disk[]| |
|**scale**|Scale[]| |
### Disk
|Name|Type|Description|
|---|---|---|
|**limit**|String|Maximum Disk Capacity|
|**volumeType**|String|Disk Capacity Type|
### Scale
|Name|Type|Description|
|---|---|---|
|**core**|Integer|Number of CPU Cores|
|**memory**|Integer|Memory Size, Unit: G|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
