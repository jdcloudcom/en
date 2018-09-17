# showJobDetails


## Description
View the job details corresponding to the specified jobId

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/{jobId}:detail

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**jobId**|String|True||Job Id to be viewed|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**data**|[JmrJobViewModel](##JmrJobViewModel)||
|**message**|String||
|**status**|String||
### <a name="JmrJobViewModel">JmrJobViewModel</a>
|Name|Type|Description|
|---|---|---|
|**clusterId**|String|Cluster ID|
|**clusterName**|String|Cluster name|
|**clusterStatus**|String|Extra field|
|**createTime**|String|Creation time|
|**cronExpression**|String|Regular task time|
|**dataCenter**|String|Date center|
|**id**|Integer||
|**isSelfDependence**|Integer||
|**isSendMsg**|Boolean|Whether to send a SMS notice after job is failed|
|**isVirtualTask**|Integer||
|**jobGroup**|String|Job group|
|**jobId**|String|Job ID|
|**jobName**|String|Job name|
|**jobStatus**|String|Job status|
|**jobTrigger**|String|Job trigger|
|**jobType**|String|Job type|
|**location**|String|Location|
|**orderBy**|String|Extra field, optional|
|**params**|String|Required parameter|
|**retryTimes**|Integer|Number of job retry|
|**taskScheduleType**|Integer||
|**userpin**|String|User name|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
