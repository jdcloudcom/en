# createDatasource


## Description
Create data source

## Request Method
POST

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/migration_mysqlDatasources

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**datasource**|DatasourceInfo|True| |Create data source|
|**x-jdcloud-fusion-userid**|String|True| |User ID|

### DatasourceInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**address**|String|False| |Server Address|
|**id**|String|False| |ID|
|**password**|String|False| |Database Password|
|**port**|Integer|False| |Port|
|**username**|String|False| |Database Account|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**datasource**|DatasourceInfo| |
### DatasourceInfo
|Name|Type|Description|
|---|---|---|
|**address**|String|Server Address|
|**id**|String|ID|
|**password**|String|Database Password|
|**port**|Integer|Port|
|**username**|String|Database Account|

## Return Code
|Return Code|Description|
|---|---|
|**201**|OK|
