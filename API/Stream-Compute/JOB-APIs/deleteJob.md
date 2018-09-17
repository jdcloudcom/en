# deleteJob


## Description
Delete job

## Request method
DELETE

## Request address
https://streamcompute.jdcloud-api.com/v1/regions/{regionId}/job

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
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**message**|String|Returned information of deleting job|
|**status**|Boolean||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|INTERNAL_ERROR|
