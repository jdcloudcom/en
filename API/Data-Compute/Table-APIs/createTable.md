# createTable


## Description
Create a user instance datasheet

## Request method
POST

## Request address
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwTable

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**dbModelDBTable**|DwTableDesc|True| |Datasheet Description Information|
|**instanceName**|String|True| |Instance Name|

### DwTableDesc
|Name|Type|Required or not|Default value|Description|
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
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**columnName**|String|False| |Field Name|
|**columnType**|String|False| |Field Type|
|**comments**|String|False| |Description  Information|
|**isPartition**|Boolean|False| |Is the field partitioned|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**message**|String| |
|**status**|Boolean| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
