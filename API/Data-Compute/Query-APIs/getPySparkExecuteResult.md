# getPySparkExecuteResult


## Description
Obtain the execution result of the user's PySpark script

## Request method
GET

## Request address
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwQuery:getPySparkExecuteResult

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**queryId**|String|True||Search an id|
|**userName**|String|True||User name|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**message**|String||
|**status**|Boolean||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
