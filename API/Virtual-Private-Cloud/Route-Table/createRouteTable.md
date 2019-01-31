# createRouteTable


## Description
Create route table

## Request method
POST

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/routeTables/

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**vpcId**|String|True| |VPC ID of Route Table|
|**routeTableName**|String|True| |Route table name, only allow Chinese, numbers, capital and lowercase letters, English underline “_” and line-through “-”, must provide a name which cannot exceed 32 characters.|
|**description**|String|False| |Description, allow all characters under UTF-8 coding, which cannot exceed 256 characters|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Returned Results|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**routeTableId**|String|Route Table ID|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**404**|Resource not found|
|**500**|Internal server error|
