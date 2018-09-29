# getCronJobList


## 描述
Obtain the execution plan list

## 请求方式
POST

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/cronJob:list

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**jmrPlanViewModel**|JmrPlanViewModel|True| |Required Fields: az, planName, planType and planStatus|
|**selectParams**|SelectParams|False| |Optional Parameters of Search Conditions|

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
### SelectParams
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**orderBy**|String|False| |Ranking Condition, optional|
|**pageNum**|Integer|False| |Search Paging Number, optional condition|
|**pageSize**|Integer|False| |Search Paging Size, optional condition|
|**status**|String|False| | |

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**data**|Object|"Include JmrPlanViewModel list - cronJobs"<br>"And return list size - totalNum"<br>|
|**message**|String| |
|**status**|String| |

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
