# listTableInfo


## Description
Search all the datasheet information under the specified database of user instance

## Request method
GET

## Request address
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwTable

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**databaseName**|String|True||Database name|
|**instanceName**|String|True||Instance name|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**data**|[DwTable[]](##DwTable)||
|**message**|String||
|**status**|Boolean||
### <a name="DwTable">DwTable</a>
|Name|Type|Description|
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
|Name|Type|Description|
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

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
