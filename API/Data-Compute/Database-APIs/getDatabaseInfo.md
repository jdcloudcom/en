# getDatabaseInfo


## 描述
Search the specified database information of user instance

## 请求方式
GET

## 请求地址
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwDatabase/{databaseName}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**databaseName**|String|True| |Database Name|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceName**|String|True| |Instance Name|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**data**|DwDatabase| |
|**message**|String| |
|**status**|Boolean| |
### DwDatabase
|名称|类型|描述|
|---|---|---|
|**category**|String|Category|
|**comments**|String|Description  Information|
|**createTime**|String|Creation Time|
|**databaseName**|String|Database Name|
|**id**|Integer|Database ID|
|**lastUpdateTime**|String|Last Update Time|
|**location**|String|Location|
|**owner**|String|Owner|
|**physicalStorageCapacity**|String|Last Update Time|
|**source**|String|Source|
|**totalTableQuantity**|Integer|Number of Summary Lists|
|**userName**|String|User Name|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
