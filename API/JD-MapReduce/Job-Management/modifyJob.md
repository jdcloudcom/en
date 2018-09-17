# modifyJob


## Description
Modify the corresponding job information based on the parameter information transferred in

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/job:modify

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**jmrJobViewModel**|[JmrJobViewModel](##JmrJobViewModel)|True||clusterId, jobName, jobType, location, jobArgs, retryTimes and isSendMsg are required|

### <a name="JmrJobViewModel">JmrJobViewModel</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**clusterId**|String|False||Cluster ID|
|**clusterName**|String|False||Cluster name|
|**clusterStatus**|String|False||Extra field|
|**createTime**|String|False||Creation time|
|**cronExpression**|String|False||Regular task time|
|**dataCenter**|String|False||Date center|
|**id**|Integer|False|||
|**isSelfDependence**|Integer|False|||
|**isSendMsg**|Boolean|False||Whether to send a SMS notice after job is failed|
|**isVirtualTask**|Integer|False|||
|**jobGroup**|String|False||Job group|
|**jobId**|String|False||Job ID|
|**jobName**|String|False||Job name|
|**jobStatus**|String|False||Job status|
|**jobTrigger**|String|False||Job trigger|
|**jobType**|String|False||Job type|
|**location**|String|False||Location|
|**orderBy**|String|False||Extra field, optional|
|**params**|String|False||Required parameter|
|**retryTimes**|Integer|False||Number of job retry|
|**taskScheduleType**|Integer|False|||
|**userpin**|String|False||User name|

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
