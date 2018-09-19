# stopJob


## Description
Stop Job Running

## Request method
GET

## Request address
https://streamcompute.jdcloud-api.com/v1/regions/{regionId}/job:stop

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**jobId**|Integer|True|||
|**namespaceId**|String|True|||


## Return parameter
|Name|Type|Description|
|---|---|---|
|**regionId**|String||
|**result**|Result||


### Result
|Name|Type|Description|
|---|---|---|
|**message**|String|Returned Information Upon Successfully Enabling Job|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|INTERNAL_ERROR      |
