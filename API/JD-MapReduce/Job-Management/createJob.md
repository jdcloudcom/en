# createJob


## 描述
Create a job based on the parameter information transferred in

## 请求方式
POST

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/job:create

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**jmrJobViewModel**|[JmrJobViewModel](##JmrJobViewModel)|True||clusterId, jobName, jobType, location, jobArgs, retryTimes and isSendMsg are required|

### <a name="JmrJobViewModel">JmrJobViewModel</a>
|名称|类型|是否必需|默认值|描述|
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

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**message**|String||
|**status**|String||

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
