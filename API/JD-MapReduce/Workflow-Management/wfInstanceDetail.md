# wfInstanceDetail


## Description
View the detailed information of the specified workflow

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/wfInstance:detail

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**wfId**|String|True|||
|**wfInstanceId**|String|True|||


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**message**|[Message](##Message)||
### <a name="Message">Message</a>
|Name|Type|Description|
|---|---|---|
|**code**|String|Code|
|**data**|Object|Data|
|**instanceId**|String||
|**jobId**|String|Job ID|
|**path**|[Path[]](##Path)||
|**pipeline**|String||
|**rect**|[Rect[]](##Rect)||
|**result**|String|Result|
|**source**|String||
|**sourceParameterList**|String[]||
|**target**|String||
|**targetParameterList**|String[]||
|**taskId**|String||
|**total**|Integer||
### <a name="Path">Path</a>
|Name|Type|Description|
|---|---|---|
|**child**|Integer||
|**father**|Integer||
### <a name="Rect">Rect</a>
|Name|Type|Description|
|---|---|---|
|**instanceId**|Integer||
|**instanceStatus**|Integer||
|**intervalTimes**|Integer|Re-running interval of the failed task|
|**jobId**|Integer||
|**retryTimes**|Integer|Retry times after the task is failed|
|**taskDesc**|String||
|**taskId**|String||
|**taskName**|String||
|**taskType**|String||
|**x**|Number||
|**y**|Number||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
