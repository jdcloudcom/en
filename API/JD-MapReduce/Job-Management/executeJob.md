# executeJob


## Description
Execute a specified job

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/job:execute

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**clusterId**|String|True| |Cluster ID|
|**jmrTaskViewModel**|JmrTaskViewModel|True| |"Required parameters: jobId, planId, workflowId and workflowInstanceId"<br>|

### JmrTaskViewModel
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**dataCenter**|String|False| |Data Center, i.e. regionId|
|**duration**|String|False| |Time of Duration|
|**endTime**|String|False| |End Time|
|**id**|Integer|False| | |
|**jobId**|String|False| | |
|**planId**|String|False| | |
|**startTime**|String|False| |Start Time|
|**status**|String|False| |Status|
|**taskId**|String|False| |Job ID|
|**taskName**|String|False| |Job Name|
|**taskType**|String|False| |Job Type|
|**userpin**|String|False| |User Name|
|**workflowId**|String|False| |Workflow Id|
|**workflowInstanceId**|String|False| |Workflow Instance ID|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|String| |
|**message**|String| |
|**status**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
