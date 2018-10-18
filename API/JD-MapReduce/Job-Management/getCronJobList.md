# getCronJobList


## Description
Obtain the execution plan list

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/cronJob:list

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**jmrPlanViewModel**|JmrPlanViewModel|True| |Required Fields: az, planName, planType and planStatus|
|**selectParams**|SelectParams|False| |Optional Parameters of Search Conditions|

### JmrPlanViewModel
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**az**|String|False| | |
|**clusterId**|String|False| | |
|**clusterName**|String|False| | |
|**createTime**|String|False| |Creation Time|
|**cronExpression**|String|False| |Time After Formatt|
|**dataCenter**|String|False| |Data Center, i.e. regionId|
|**description**|String|False| | |
|**failurePolicy**|String|False| |Policy adopted when task scheduling is failed|
|**isSync**|Boolean|False| | |
|**jobGroup**|String|False| | |
|**jobIds**|String|False| | |
|**jobTrigger**|String|False| |Trigger|
|**modifyTime**|String|False| |Modification Time|
|**orderBy**|String|False| | |
|**planId**|Number|False| |Task Scheduling id|
|**planName**|String|False| | |
|**planStatus**|String|False| | |
|**planType**|String|False| | |
### SelectParams
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**orderBy**|String|False| |Ranking Condition, optional|
|**pageNum**|Integer|False| |Search Paging Number, optional condition|
|**pageSize**|Integer|False| |Search Paging Size, optional condition|
|**status**|String|False| | |

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|Object|"Include JmrPlanViewModel list - cronJobs"<br>"And return list size - totalNum"<br>|
|**message**|String| |
|**status**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
