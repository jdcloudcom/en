# modifyRouteTable


## Description
Modify Route Table Attribute

## Request method
PATCH

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/routeTables/{routeTableId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|
|**routeTableId**|String|True||RouteTable ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**description**|String|False||Route Table Description. Value Range: 0-256 of all characters entered under UTF-8 coding|
|**routeTableName**|String|False||Route Table Name Value Range: 1-32 Chinese, English capital and lowercase letters, numbers and underline delimiter|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|



## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Request parameter x.y.z is 'xxx', expected one of [yyy,zzz]|
|**404**|Resource not found|
