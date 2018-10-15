# showJobDetails


## Description
View the job details corresponding to the specified jobId

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/{jobId}:detail

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**jobId**|String|True| |Job Id to be Viewed|
|**regionId**|String|True| |Region ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|JmrJobViewModel| |
|**message**|String| |
|**status**|String| |
### JmrJobViewModel
|Name|Type|Description|
|---|---|---|
|**clusterId**|String|Cluster ID|
|**clusterName**|String|Cluster Name|
|**clusterStatus**|String|Extra Field|
|**createTime**|String|Creation Time|
|**cronExpression**|String|Regular Task Time|
|**dataCenter**|String|Data Center|
|**id**|Integer| |
|**isSelfDependence**|Integer| |
|**isSendMsg**|Boolean|Whether to send a SMS notice after job is failed|
|**isVirtualTask**|Integer| |
|**jobGroup**|String|Job Group|
|**jobId**|String|Job ID|
|**jobName**|String|Job Name|
|**jobStatus**|String|Job Status|
|**jobTrigger**|String|Job Trigger|
|**jobType**|String|Job Type|
|**location**|String|Location|
|**orderBy**|String|Extra Field, optional|
|**params**|String|Required Parameter|
|**retryTimes**|Integer|Number of Job Retry|
|**taskScheduleType**|Integer| |
|**userpin**|String|User Name|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
