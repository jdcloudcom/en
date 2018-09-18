# queryServerQuota


## Description
Query the remaining server quota

## Request method
GET

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/serverQuota:query

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
|**data**|AvailableNumData|Remaining service quota|
|**message**|String||
|**status**|String||
### <a name="AvailableNumData">AvailableNumData</a>
|Name|Type|Description|
|---|---|---|
|**serverNum**|Integer|Number of available services|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
