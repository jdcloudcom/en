# saveWorkFlow


## 描述
Save the workflow information

## 请求方式
POST

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/workflow:save

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**workflow**|EmrWorkflow|True| | |

### EmrWorkflow
|名称|类型|是否必需|默认值|描述|
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

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**data**|Message| |
|**message**|String| |
|**status**|String| |
### Message
|名称|类型|描述|
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
|名称|类型|描述|
|---|---|---|
|**child**|Integer| |
|**father**|Integer| |
### Rect
|名称|类型|描述|
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

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
