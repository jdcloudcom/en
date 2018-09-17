# deleteTopic


## Description
Delete topic

## Request method
DELETE

## Request address
https://streambus.jdcloud-api.com/v1/regions/{regionId}/topic

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True|||


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**message**|String|Status information|
|**status**|Boolean||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT FOUND|
