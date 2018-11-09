# modifyJob


## Description
Modify the corresponding job information based on the parameter information transferred in

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/job:modify

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**jmrJobViewModel**|JmrJobViewModel|True| |clusterId, jobName, jobType, location, jobArgs, retryTimes and isSendMsg are required|

### JmrJobViewModel
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**clusterId**|String|False| |Cluster ID|
|**clusterName**|String|False| |Cluster Name|
|**clusterStatus**|String|False| |Extra Field|
|**createTime**|String|False| |Creation Time|
|**cronExpression**|String|False| |Regular Task Time|
|**dataCenter**|String|False| |Data Center|
|**id**|Integer|False| | |
|**isSelfDependence**|Integer|False| | |
|**isSendMsg**|Boolean|False| |Whether to send a SMS notice after job is failed|
|**isVirtualTask**|Integer|False| | |
|**jobGroup**|String|False| |Job Group|
|**jobId**|String|False| |Job ID|
|**jobName**|String|False| |Job Name|
|**jobStatus**|String|False| |Job Status|
|**jobTrigger**|String|False| |Job Trigger|
|**jobType**|String|False| |Job Type|
|**location**|String|False| |Location|
|**orderBy**|String|False| |Extra Field, optional|
|**params**|String|False| |Required Parameter|
|**retryTimes**|Integer|False| |Number of Job Retry|
|**taskScheduleType**|Integer|False| | |
|**userpin**|String|False| |User Name|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**message**|String| |
|**status**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
