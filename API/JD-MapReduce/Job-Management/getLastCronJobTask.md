# getLastCronJobTask


## Description
Obtain the last operation record of a job of a regular task

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/lastCronJobTask/{jobId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**jobId**|String|True||Job ID|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**planId**|String|True||Regular task ID, required|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**data**|String||
|**message**|String||
|**status**|String||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
