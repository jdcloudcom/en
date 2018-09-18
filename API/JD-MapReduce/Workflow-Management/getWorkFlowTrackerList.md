# getWorkFlowTrackerList


## Description
Obtain the workflow operation record list

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/workFlowTracker:list

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
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
|**data**|Object|"Include workflow list - workFlowTrackerList"<br>"And list size - totalNum"<br>|
|**message**|String||
|**status**|String||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
