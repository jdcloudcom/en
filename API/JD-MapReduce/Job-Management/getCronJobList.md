# getCronJobList


## 描述
Obtain the execution plan list

## 请求方式
POST

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/cronJob:list

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**jmrPlanViewModel**|[JmrPlanViewModel](##JmrPlanViewModel)|True||Required fields: az, planName, planType and planStatus|
|**selectParams**|[SelectParams](##SelectParams)|False||Optional parameters of search conditions|

### <a name="JmrPlanViewModel">JmrPlanViewModel</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**az**|String|False|||
|**clusterId**|String|False|||
|**clusterName**|String|False|||
|**createTime**|String|False||Creation time|
|**cronExpression**|String|False||Time after formatt|
|**dataCenter**|String|False||Data center, i.e. regionId|
|**description**|String|False|||
|**failurePolicy**|String|False||Policy adopted when task scheduling is failed|
|**isSync**|Boolean|False|||
|**jobGroup**|String|False|||
|**jobIds**|String|False|||
|**jobTrigger**|String|False||Trigger|
|**modifyTime**|String|False||Modification time|
|**orderBy**|String|False|||
|**planId**|Number|False||Task scheduling id|
|**planName**|String|False|||
|**planStatus**|String|False|||
|**planType**|String|False|||
### <a name="SelectParams">SelectParams</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**orderBy**|String|False||Ranking condition, optional|
|**pageNum**|Integer|False||Search paging number, optional condition|
|**pageSize**|Integer|False||Search paging size, optional condition|
|**status**|String|False|||

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**data**|Object|"Include JmrPlanViewModel list - cronJobs"<br>"And return list size - totalNum"<br>|
|**message**|String||
|**status**|String||

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
