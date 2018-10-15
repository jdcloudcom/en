# getInstanceList


## Description
Obtain the machine specification list (Filter out the low-memory specifications; remove the ones inferior to quad-core.)

## Request method
GET

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/instances

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
|**data**|InstanceList[]|Machine Specification List|
|**message**|String| |
|**status**|String| |
### InstanceList
|Name|Type|Description|
|---|---|---|
|**label**|String|Classification of Machine Models|
|**options**|Options[]| |
### Options
|Name|Type|Description|
|---|---|---|
|**label**|String|CPU and Memory Size of the Machine|
|**value**|String|Specification Description of the Corresponding Machine|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
