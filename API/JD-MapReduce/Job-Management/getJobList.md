# getJobList


## Description
Obtain the job list under the specified cluster

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/jobView:list

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**jmrJobViewModel**|JmrJobViewModel|True| |"Required Fields: clusterId and az"<br>"Optional Fields: jobName, jobType and clusterName"<br>|
|**selectParams**|SelectParams|False| | |

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
### SelectParams
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**orderBy**|String|False| |Ranking Condition, optional|
|**pageNum**|Integer|False| |Search Paging Number, optional condition|
|**pageSize**|Integer|False| |Search Paging Size, optional condition|
|**status**|String|False| | |

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|Object|"Include the JmrJobViewModel list - jmrJobViewModelList"<br>"And returned list size - totalNum"<br>|
|**message**|String| |
|**status**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
