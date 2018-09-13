# getCronJobDetail


## Description
Obtain the regular task details

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/cronJob/{planId}:detail

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**planId**|String|True||Execution plan Id|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**selectParams**|[SelectParams](##SelectParams)|False|||

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
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**data**|Object|"Include JmrJobViewModel list - jobList"<br>"And returned list size - totalNum"<br>|
|**message**|String||
|**status**|String||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
