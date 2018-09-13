# getJobList


## Description
Obtain the job list under the specified cluster

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/jobView:list

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**jmrJobViewModel**|[JmrJobViewModel](##JmrJobViewModel)|True||"Required fields: clusterId and az"<br>"Optional fields: jobName, jobType and clusterName"<br>|
|**selectParams**|[SelectParams](##SelectParams)|False|||

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
### <a name="SelectParams">SelectParams</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**orderBy**|String|False||Ranking condition, optional|
|**pageNum**|Integer|False||Search paging number, optional condition|
|**pageSize**|Integer|False||Search paging size, optional condition|
|**status**|String|False|||

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**data**|Object|"Include the JmrJobViewModel list - jmrJobViewModelList"<br>"And returned list size - totalNum"<br>|
|**message**|String||
|**status**|String||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
