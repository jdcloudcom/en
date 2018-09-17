# queryExecutingJobList


## Description
Obtain the tasks in the plan (tasks already added to the quartz scheduler)

## Request method
GET

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/executingJob:list

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
None


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**data**|[JmrPlanViewModel[]](##JmrPlanViewModel)|Execution plan list|
|**message**|String||
|**status**|String||
### <a name="JmrPlanViewModel">JmrPlanViewModel</a>
|Name|Type|Description|
|---|---|---|
|**az**|String||
|**clusterId**|String||
|**clusterName**|String||
|**createTime**|String|Creation time|
|**cronExpression**|String|Time after formatt|
|**dataCenter**|String|Data center, i.e. regionId|
|**description**|String||
|**failurePolicy**|String|Policy adopted when task scheduling is failed|
|**isSync**|Boolean||
|**jobGroup**|String||
|**jobIds**|String||
|**jobTrigger**|String|Trigger|
|**modifyTime**|String|Modification time|
|**orderBy**|String||
|**planId**|Number|Task scheduling id|
|**planName**|String||
|**planStatus**|String||
|**planType**|String||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
