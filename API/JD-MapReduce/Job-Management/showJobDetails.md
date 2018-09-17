# showJobDetails


## 描述
View the job details corresponding to the specified jobId

## 请求方式
POST

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/{jobId}:detail

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**jobId**|String|True||Job Id to be viewed|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**data**|[JmrJobViewModel](##JmrJobViewModel)||
|**message**|String||
|**status**|String||
### <a name="JmrJobViewModel">JmrJobViewModel</a>
|名称|类型|描述|
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

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
