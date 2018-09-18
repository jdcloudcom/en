# getInstanceList


## Description
Obtain the machine specification list (Filter out the low-memory specifications; remove the ones inferior to quad-core.)

## Request method
GET

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/instances

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
|**data**|InstanceList[]|Machine specification list|
|**message**|String||
|**status**|String||
### <a name="InstanceList">InstanceList</a>
|Name|Type|Description|
|---|---|---|
|**label**|String|Classification of machine models|
|**options**|Options[]||
### <a name="Options">Options</a>
|Name|Type|Description|
|---|---|---|
|**label**|String|CPU and memory size of the machine|
|**value**|String|Specification description of the corresponding machine|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
