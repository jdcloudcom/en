# listDatabaseInfo


## 描述
Search all the database information of user instance

## 请求方式
GET

## 请求地址
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwDatabase

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceName**|String|True||Instance name|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**data**|[DwDatabaseInfo[]](##DwDatabaseInfo)||
|**message**|String||
|**status**|Boolean||
### <a name="DwDatabaseInfo">DwDatabaseInfo</a>
|名称|类型|描述|
|---|---|---|
|**comments**|String|Description information|
|**databaseName**|String|Database name|
|**owner**|String|Owner|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
