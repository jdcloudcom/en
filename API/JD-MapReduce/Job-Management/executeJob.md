# executeJob


## Description
Execute a specified job

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/job:execute

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**clusterId**|String|True||Cluster ID|
|**jmrTaskViewModel**|[JmrTaskViewModel](##JmrTaskViewModel)|True||"Required parameters: jobId, planId, workflowId and workflowInstanceId"<br>|

### <a name="JmrTaskViewModel">JmrTaskViewModel</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**dataCenter**|String|False||Data center, i.e. regionId|
|**duration**|String|False||Time of duration|
|**endTime**|String|False||End time|
|**id**|Integer|False|||
|**jobId**|String|False|||
|**planId**|String|False|||
|**startTime**|String|False||Start time|
|**status**|String|False||Status|
|**taskId**|String|False||Job Id|
|**taskName**|String|False||Job name|
|**taskType**|String|False||Job type|
|**userpin**|String|False||User name|
|**workflowId**|String|False||Workflow Id|
|**workflowInstanceId**|String|False||Workflow instance Id|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**data**|String||
|**message**|String||
|**status**|String||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
