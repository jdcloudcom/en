# getDatabaseInfo


## 描述
Search the specified database information of user instance

## 请求方式
GET

## 请求地址
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwDatabase/{databaseName}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**databaseName**|String|True||Database name|
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
|**data**|[DwDatabase](##DwDatabase)||
|**message**|String||
|**status**|Boolean||
### <a name="DwDatabase">DwDatabase</a>
|名称|类型|描述|
|---|---|---|
|**category**|String|Category|
|**comments**|String|Description information|
|**createTime**|String|Creation time|
|**databaseName**|String|Database name|
|**id**|Integer|Database id|
|**lastUpdateTime**|String|Last update time|
|**location**|String|Location|
|**owner**|String|Owner|
|**physicalStorageCapacity**|String|Last update time|
|**source**|String|Source|
|**totalTableQuantity**|Integer|Number of summary lists|
|**userName**|String|User name|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
