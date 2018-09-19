# getJobList


## Description
Query All the Jobs Under the Assigned Applications

## Request method
GET

## Request address
https://streamcompute.jdcloud-api.com/v1/regions/{regionId}/jobList

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**namespaceId**|String|True|||


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### Result
|Name|Type|Description|
|---|---|---|
|**data**|Object[]|Job Objects Queried out|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|INTERNAL_ERROR                                |
