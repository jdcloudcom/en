# createTable


## Description
Create a user instance datasheet

## Request method
POST

## Request address
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwTable

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**dbModelDBTable**|[DwTableDesc](##DwTableDesc)|True||Datasheet description information|
|**instanceName**|String|True||Instance name|

### <a name="DwTableDesc">DwTableDesc</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**comments**|String|False||Description information|
|**createTime**|String|False||Creation time (automatically generated)|
|**dbName**|String|False||Database name|
|**externalLocation**|String|False||External table location|
|**fieldsDelimit**|String|False||Field delimiter|
|**hiveFileFormat**|String|False||Storage format|
|**linesDelimit**|String|False||Row delimiter|
|**otherSerdeProperties**|Object|False||Other serde attributes|
|**owner**|String|False||Owner (automatically generated)|
|**parameters**|Object|False||Parameter|
|**rows**|[DwTableRow[]](##DwTableRow)|False||List information|
|**tableName**|String|False||Table name|
### <a name="DwTableRow">DwTableRow</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**columnName**|String|False||Field name|
|**columnType**|String|False||Field type|
|**comments**|String|False||Description information|
|**isPartition**|Boolean|False||Is the field partitioned|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**message**|String||
|**status**|Boolean||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
