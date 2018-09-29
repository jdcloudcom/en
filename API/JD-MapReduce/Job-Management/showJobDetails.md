# showJobDetails


## 描述
View the job details corresponding to the specified jobId

## 请求方式
POST

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/{jobId}:detail

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**jobId**|String|True| |Job Id to be Viewed|
|**regionId**|String|True| |Region ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**data**|JmrJobViewModel| |
|**message**|String| |
|**status**|String| |
### JmrJobViewModel
|名称|类型|描述|
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

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
