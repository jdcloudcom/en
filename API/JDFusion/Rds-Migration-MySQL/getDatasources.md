# getDatasources


## Description
Search data source

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/migration_mysqlDatasources

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-fusion-userid**|String|True| |User ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**datasources**|DatasourceInfo[]| |
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
|**200**|OK|
