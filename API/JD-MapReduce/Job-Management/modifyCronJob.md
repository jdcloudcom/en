# modifyCronJob


## 描述
Modify the execution plan of deployment job

## 请求方式
POST

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/cronJob:modify

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**day**|String|True| |Occupy day according to the time parameter in Cron format|
|**hour**|String|True| |Occupy hour according to the time parameter in Cron format|
|**jmrPlanViewModel**|JmrPlanViewModel|True| |"Required fields: planId, jobIds, planName, planType and failurePolicy"<br>|
|**minute**|String|True| |Occupy minute according to the time parameter in Cron format|
|**month**|String|True| |Occupy month according to the time parameter in Cron format|
|**time**|String|True| |Occupy time according to the time parameter in Cron format|
|**week**|String|True| |Occupy week according to the time parameter in Cron format|

### JmrPlanViewModel
|名称|类型|是否必需|默认值|描述|
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

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**message**|String| |
|**status**|String| |

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
