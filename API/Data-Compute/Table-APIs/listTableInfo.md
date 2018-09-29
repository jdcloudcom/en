# listTableInfo


## 描述
Search all the datasheet information under the specified database of user instance

## 请求方式
GET

## 请求地址
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwTable

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**databaseName**|String|True| |Database Name|
|**instanceName**|String|True| |Instance Name|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**data**|DwTable[]| |
|**message**|String| |
|**status**|Boolean| |
### DwTable
|名称|类型|描述|
|---|---|---|
|**category**|String|Category|
|**comments**|String|Description  Information|
|**createTime**|String|Creation Time|
|**dbName**|String|Database Name|
|**encryption**|String|Is it encrypted or not|
|**hiveFileFormat**|String|File Storage Type|
|**hiveObjectPrivileges**|DwHiveObjectPrivileges|Hive Table Permission Information|
|**id**|Integer|Database ID|
|**lastUpdateTime**|String|Last Update Time|
|**location**|String|Location|
|**owner**|String|Owner|
|**parameters**|Object|Parameter|
|**physicalStorageCapacity**|String|Physical Storage|
|**source**|String|Source|
|**tableName**|String|Table Name|
|**userName**|String|User Name|
### DwHiveObjectPrivileges
|名称|类型|描述|
|---|---|---|
|**alter**|Boolean|Alter Permission|
|**create**|Boolean|Create Permission|
|**delete**|Boolean|Delete Permission|
|**drop**|Boolean|Drop Permission|
|**insert**|Boolean|Insert Permission|
|**message**|String|Return Information|
|**owner**|Boolean|Is it the owner or not|
|**select**|Boolean|Select Permission|
|**status**|Boolean|Status|
|**update**|Boolean|Update Permission|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
