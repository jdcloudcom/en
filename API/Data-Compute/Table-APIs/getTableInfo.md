# getTableInfo


## Description
Search the specified datasheet information of user instance

## Request method
GET

## Request address
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwTable/{tableName}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**tableName**|String|True| |Datasheet Name|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**databaseName**|String|True| |Database Name|
|**instanceName**|String|True| |Instance Name|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|DwTable| |
|**message**|String| |
|**status**|Boolean| |
### DwTable
|Name|Type|Description|
|---|---|---|
|**category**|String|Category|
|**comments**|String|Description Information|
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
|Name|Type|Description|
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

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
