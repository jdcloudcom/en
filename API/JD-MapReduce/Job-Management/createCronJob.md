# createCronJob


## Description
Create or update scheduling configuration

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/cronJob:create

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**day**|String|True||Occupy day according to the time parameter in Cron format|
|**hour**|String|True|0|Occupy hour according to the time parameter in Cron format|
|**jmrPlanViewModel**|[JmrPlanViewModel](##JmrPlanViewModel)|True||Scheduling configuration to be created or updated|
|**minute**|String|True|0|Occupy minute according to the time parameter in Cron format|
|**month**|String|True||Occupy month according to the time parameter in Cron format|
|**time**|String|True||Occupy time according to the time parameter in Cron format|
|**week**|String|True||Occupy week according to the time parameter in Cron format|

### <a name="JmrPlanViewModel">JmrPlanViewModel</a>
|Name|Type|Required or not|Default value|Description|
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

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**message**|String||
|**status**|String||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
