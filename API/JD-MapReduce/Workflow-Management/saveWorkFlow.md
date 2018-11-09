# saveWorkFlow


## Description
Save the workflow information

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/workflow:save

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**workflow**|EmrWorkflow|True| | |

### EmrWorkflow
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**createTime**|String|False| |Workflow Creation Time|
|**dataCenter**|String|False| |Data Center, i.e. regionId|
|**id**|Number|False| | |
|**isSelfDependence**|Boolean|False| |"Whether it is self-dependent"<br>"1: Self-dependent (default), 0: Non-dependent"<br>|
|**isSendMsg**|Boolean|False| |Whether to send a notice after failed|
|**modifyTime**|String|False| |Last Time of Modification|
|**status**|String|False| |Workflow Status|
|**taskScheduleType**|Integer|False| |"0: Real-time Task (default)"<br>"1: Periodic Task"<br>"2: Regular Task"<br>|
|**userpin**|String|False| |User Name|
|**workflowId**|String|False| |Workflow ID|
|**workflowName**|String|False| |Workflow Name|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|Message| |
|**message**|String| |
|**status**|String| |
### Message
|Name|Type|Description|
|---|---|---|
|**code**|String|Code|
|**data**|Object|Data|
|**instanceId**|String| |
|**jobId**|String|Job ID|
|**path**|Path[]| |
|**pipeline**|String| |
|**rect**|Rect[]| |
|**result**|String|Result|
|**source**|String| |
|**sourceParameterList**|String[]| |
|**target**|String| |
|**targetParameterList**|String[]| |
|**taskId**|String| |
|**total**|Integer| |
### Path
|Name|Type|Description|
|---|---|---|
|**child**|Integer| |
|**father**|Integer| |
### Rect
|Name|Type|Description|
|---|---|---|
|**instanceId**|Integer| |
|**instanceStatus**|Integer| |
|**intervalTimes**|Integer|Re-running Interval of the Failed Task|
|**jobId**|Integer| |
|**retryTimes**|Integer|Retry times after the task is failed|
|**taskDesc**|String| |
|**taskId**|String| |
|**taskName**|String| |
|**taskType**|String| |
|**x**|Number| |
|**y**|Number| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
