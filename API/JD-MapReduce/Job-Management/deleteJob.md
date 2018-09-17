# deleteJob


## Description
Delete a job specified by jobId

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/job/{jobId}:delete

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**jobId**|String|True||Job Id to be deleted|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**message**|String||
|**status**|String||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
