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
|**x-jdcloud-fusion-userid**|String|True| |User ID|
|**datasource**|DatasourceInfo|True| |Create data source|

### DatasourceInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|False| |ID|
|**address**|String|False| |Server Address|
|**port**|Integer|False| |Port|
|**username**|String|False| |Database Account|
|**password**|String|False| |Database Password|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**datasource**|DatasourceInfo| |
### DatasourceInfo
|Name|Type|Description|
|---|---|---|
|**id**|String|ID|
|**address**|String|Server Address|
|**port**|Integer|Port|
|**username**|String|Database Account|
|**password**|String|Database Password|

## Return Code
|Return Code|Description|
|---|---|
|**201**|OK|
