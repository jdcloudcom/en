# getClusterCronJobCount


## 描述
Obtain the cluster deployment job number

## 请求方式
POST

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/clusterCronJob/{clusterId}:count

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**clusterId**|String|True||Cluster Id|
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
|**data**|Object|"Include JmrPlanViewModel list - cronJobs"<br>"And return list size - totalNum"<br>|
|**message**|String||
|**status**|String||

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
