# getCronJobList


## Description
Obtain the execution plan list

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/cronJob:list

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**jmrPlanViewModel**|JmrPlanViewModel|True||Required fields: az, planName, planType and planStatus|
|**selectParams**|SelectParams|False||Optional parameters of search conditions|

### <a name="JmrPlanViewModel">JmrPlanViewModel</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**az**|String|False|||
|**clusterId**|String|False|||
|**clusterName**|String|False|||
|**createTime**|String|False||Creation time|
|**cronExpression**|String|False||Time after formatt|
|**dataCenter**|String|False||Data center, i.e. regionId|
|**description**|String|False|||
|**failurePolicy**|String|False||Policy adopted when task scheduling is failed|
|**isSync**|Boolean|False|||
|**jobGroup**|String|False|||
|**jobIds**|String|False|||
|**jobTrigger**|String|False||Trigger|
|**modifyTime**|String|False||Modification time|
|**orderBy**|String|False|||
|**planId**|Number|False||Task scheduling id|
|**planName**|String|False|||
|**planStatus**|String|False|||
|**planType**|String|False|||
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
|**data**|Object|"Include JmrPlanViewModel list - cronJobs"<br>"And return list size - totalNum"<br>|
|**message**|String||
|**status**|String||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
