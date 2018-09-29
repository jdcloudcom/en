# getJobList


## 描述
Obtain the job list under the specified cluster

## 请求方式
POST

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/jobView:list

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**jmrJobViewModel**|JmrJobViewModel|True| |"Required Fields: clusterId and az"<br>"Optional Fields: jobName, jobType and clusterName"<br>|
|**selectParams**|SelectParams|False| | |

### JmrJobViewModel
|名称|类型|是否必需|默认值|描述|
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
|**data**|Object|"Include the JmrJobViewModel list - jmrJobViewModelList"<br>"And returned list size - totalNum"<br>|
|**message**|String| |
|**status**|String| |

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
