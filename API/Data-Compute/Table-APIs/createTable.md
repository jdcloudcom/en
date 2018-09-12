# createTable


## 描述
Create a user instance datasheet

## 请求方式
POST

## 请求地址
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwTable

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**dbModelDBTable**|[DwTableDesc](##DwTableDesc)|True||Datasheet description information|
|**instanceName**|String|True||Instance name|

### <a name="DwTableDesc">DwTableDesc</a>
|名称|类型|是否必需|默认值|描述|
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
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**columnName**|String|False||Field name|
|**columnType**|String|False||Field type|
|**comments**|String|False||Description information|
|**isPartition**|Boolean|False||Is the field partitioned|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**message**|String||
|**status**|Boolean||

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
