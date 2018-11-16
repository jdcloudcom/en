# queryExecutingJobList


## Description
Obtain the tasks in the plan (tasks already added to the quartz scheduler)

## Request method
GET

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/executingJob:list

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|JmrPlanViewModel[]|Execution Plan List|
|**message**|String| |
|**status**|String| |
### JmrPlanViewModel
|Name|Type|Description|
|---|---|---|
|**az**|String| |
|**clusterId**|String| |
|**clusterName**|String| |
|**createTime**|String|Creation Time|
|**cronExpression**|String|Time After Formatt|
|**dataCenter**|String|Data Center, i.e. regionId|
|**description**|String| |
|**failurePolicy**|String|Policy adopted when task scheduling is failed|
|**isSync**|Boolean| |
|**jobGroup**|String| |
|**jobIds**|String| |
|**jobTrigger**|String|Trigger|
|**modifyTime**|String|Modification Time|
|**orderBy**|String| |
|**planId**|Number|Task Scheduling id|
|**planName**|String| |
|**planStatus**|String| |
|**planType**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
