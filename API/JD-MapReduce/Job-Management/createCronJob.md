# createCronJob


## 描述
Create or update scheduling configuration

## 请求方式
POST

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/cronJob:create

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**day**|String|True||Occupy day according to the time parameter in Cron format|
|**hour**|String|True|0|Occupy hour according to the time parameter in Cron format|
|**jmrPlanViewModel**|[JmrPlanViewModel](##JmrPlanViewModel)|True||Scheduling configuration to be created or updated|
|**minute**|String|True|0|Occupy minute according to the time parameter in Cron format|
|**month**|String|True||Occupy month according to the time parameter in Cron format|
|**time**|String|True||Occupy time according to the time parameter in Cron format|
|**week**|String|True||Occupy week according to the time parameter in Cron format|

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

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**message**|String||
|**status**|String||

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
