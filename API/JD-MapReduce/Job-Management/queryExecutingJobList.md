# queryExecutingJobList


## 描述
Obtain the tasks in the plan (tasks already added to the quartz scheduler)

## 请求方式
GET

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/executingJob:list

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**data**|JmrPlanViewModel[]|Execution Plan List|
|**message**|String| |
|**status**|String| |
### JmrPlanViewModel
|名称|类型|描述|
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

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
