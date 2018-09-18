# getCronJobTaskList


## Description
Obtain the operation record of a regular task of the job

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/cronJobTask/plan/{planId}:list

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**planId**|Number|True||long type, task ID|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**selectParams**|SelectParams|False|||

### <a name="SelectParams">SelectParams</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**orderBy**|String|False||Ranking condition, optional|
|**pageNum**|Integer|False||Search paging number, optional condition|
|**pageSize**|Integer|False||Search paging size, optional condition|
|**status**|String|False|||

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**data**|Object|"Include JmrTaskViewModel list - taskList"<br>"And returned list size - totalNum"<br>|
|**message**|String||
|**status**|String||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
