# createTable


## 描述
Create a user instance datasheet

## 请求方式
POST

## 请求地址
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwTable

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**dbModelDBTable**|DwTableDesc|True| |Datasheet Description Information|
|**instanceName**|String|True| |Instance Name|

### DwTableDesc
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**comments**|String|False| |Description  Information|
|**createTime**|String|False| |Creation Time (automatically generated)|
|**dbName**|String|False| |Database Name|
|**externalLocation**|String|False| |External Table Location|
|**fieldsDelimit**|String|False| |Field Delimiter|
|**hiveFileFormat**|String|False| |Storage Format|
|**linesDelimit**|String|False| |Row Delimiter|
|**otherSerdeProperties**|Object|False| |Other Serde Attributes|
|**owner**|String|False| |Owner (automatically generated)|
|**parameters**|Object|False| |Parameter|
|**rows**|DwTableRow[]|False| |List Information|
|**tableName**|String|False| |Table Name|
### DwTableRow
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**columnName**|String|False| |Field Name|
|**columnType**|String|False| |Field Type|
|**comments**|String|False| |Description  Information|
|**isPartition**|Boolean|False| |Is the field partitioned|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**message**|String| |
|**status**|Boolean| |

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
