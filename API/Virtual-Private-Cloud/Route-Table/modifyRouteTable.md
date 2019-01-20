# modifyRouteTable


## Description
Modify route table attribute

## Request method
PATCH

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/routeTables/{routeTableId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**routeTableId**|String|True| |RouteTable ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**routeTableName**|String|False| |Route Table Name Value Range: 1-32 Chinese, English capital and lowercase letters, numbers and underline delimiter|
|**description**|String|False| |Route Table Description. Value Range: 0-256 of all characters entered under UTF-8 coding|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Request parameter x.y.z is 'xxx', expected one of [yyy,zzz]|
|**404**|Resource not found|
