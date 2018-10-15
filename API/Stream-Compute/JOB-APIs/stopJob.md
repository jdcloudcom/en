# stopJob


## Description
Stop job running

## Request method
GET

## Request address
https://streamcompute.jdcloud-api.com/v1/regions/{regionId}/job:stop

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**jobId**|Integer|True| | |
|**namespaceId**|String|True| | |


## Response parameter
|Name|Type|Description|
|---|---|---|
|**regionId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**message**|String|Returned Information Upon Successfully Enabling Job|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|INTERNAL_ERROR|
