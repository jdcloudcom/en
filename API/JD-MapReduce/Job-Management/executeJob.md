# executeJob


## 描述
Execute a specified job

## 请求方式
POST

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/job:execute

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**clusterId**|String|True| |Cluster ID|
|**jmrTaskViewModel**|JmrTaskViewModel|True| |"Required parameters: jobId, planId, workflowId and workflowInstanceId"<br>|

### JmrTaskViewModel
|名称|类型|是否必需|默认值|描述|
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

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**data**|String| |
|**message**|String| |
|**status**|String| |

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
