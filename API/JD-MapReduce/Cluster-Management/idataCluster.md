# idataCluster


## 描述
Query the cluster list corresponding to the user-assigned clusterId and related sevice information

## 请求方式
GET

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/idata

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**id**|String|True||Cluster ID: composed of eight characters|
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
|**data**|Object|"Include cluster information list - clusters"<br>"Cluster machine total number - total"<br>|
|**message**|String||
|**status**|String||

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
