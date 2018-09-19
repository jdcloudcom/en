# createRouteTable


## Description
Create Route Table

## Request method
POST

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/routeTables/

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**description**|String|False||Description, all characters allowed to enter under UTF-8 coding, which is not exceed 256 characters|
|**routeTableName**|String|True||Route table name, only allowed to enter Chinese, numbers, capital and lowercase letters, English underline “_” and line-through “-”, must provide a name which cannot exceed 32 characters.|
|**vpcId**|String|True||VPC ID of Route Table|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Returned Results|


### Result
|Name|Type|Description|
|---|---|---|
|**routeTableId**|String|Route Table ID|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**404**|Resource not found|
|**500**|Internal server error|
