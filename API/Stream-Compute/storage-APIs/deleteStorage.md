# deleteStorage


## Description
Delete the assigned input

## Request method
DELETE

## Request address
https://streamcompute.jdcloud-api.com/v1/regions/{regionId}/storage

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**storageId**|Integer|True||storageId|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**message**|String||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**401**|UNAUTHENTICATED|
|**500**|internal error|
