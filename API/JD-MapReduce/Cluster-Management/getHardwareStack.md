# getHardwareStack


## Description
Hardware configuration information list

## Request method
GET

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/hardwareStack

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
None


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**data**|HardWareStackData|Hardware information queried|
|**message**|String||
|**status**|String||
### <a name="HardWareStackData">HardWareStackData</a>
|Name|Type|Description|
|---|---|---|
|**disk**|Disk[]||
|**scale**|Scale[]||
### <a name="Disk">Disk</a>
|Name|Type|Description|
|---|---|---|
|**limit**|String|Maximum disk capacity|
|**volumeType**|String|Disk capacity type|
### <a name="Scale">Scale</a>
|Name|Type|Description|
|---|---|---|
|**core**|Integer|CPU core number|
|**memory**|Integer|Memory size, with the unit of G|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
