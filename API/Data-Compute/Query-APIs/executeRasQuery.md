# executeRasQuery


## 描述
Execute the Spark SQL script written by the user

## 请求方式
POST

## 请求地址
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwQuery:executeRasQuery

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**callBackURL**|String|False||Callback address name|
|**databaseName**|String|False||Database name|
|**instanceName**|String|True||Instance name|
|**instanceOwnerName**|String|False||Instance owner name|
|**isExplain**|String|False||Is interpretation required or not|
|**queueName**|String|False||Queue name|
|**source**|String|False||Resource name|
|**sql**|String|True||sql script|
|**userName**|String|True||User name|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**data**|Integer||
|**message**|String||
|**status**|Boolean||

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
