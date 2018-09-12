# getTableInfo


## 描述
Search the specified datasheet information of user instance

## 请求方式
GET

## 请求地址
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwTable/{tableName}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|
|**tableName**|String|True||Datasheet name|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**databaseName**|String|True||Database name|
|**instanceName**|String|True||Instance name|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**data**|[DwTable](##DwTable)||
|**message**|String||
|**status**|Boolean||
### <a name="DwTable">DwTable</a>
|名称|类型|描述|
|---|---|---|
|**category**|String|Category|
|**comments**|String|Description information|
|**createTime**|String|Creation time|
|**dbName**|String|Database name|
|**encryption**|String|Is it encrypted or not|
|**hiveFileFormat**|String|File storage type|
|**hiveObjectPrivileges**|[DwHiveObjectPrivileges](##DwHiveObjectPrivileges)|hive table permission information|
|**id**|Integer|Database id|
|**lastUpdateTime**|String|Last update time|
|**location**|String|Location|
|**owner**|String|Owner|
|**parameters**|Object|Parameter|
|**physicalStorageCapacity**|String|Physical storage|
|**source**|String|Source|
|**tableName**|String|Table name|
|**userName**|String|User name|
### <a name="DwHiveObjectPrivileges">DwHiveObjectPrivileges</a>
|名称|类型|描述|
|---|---|---|
|**alter**|Boolean|alter permission|
|**create**|Boolean|create permission|
|**delete**|Boolean|delete permission|
|**drop**|Boolean|drop permission|
|**insert**|Boolean|insert permission|
|**message**|String|Return information|
|**owner**|Boolean|Is it the owner or not|
|**select**|Boolean|select permission|
|**status**|Boolean|Status|
|**update**|Boolean|update permission|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
