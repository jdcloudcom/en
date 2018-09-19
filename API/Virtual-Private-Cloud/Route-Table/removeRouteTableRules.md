# removeRouteTableRules


## Description
Remove Route Table Rule

## Request method
POST

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/routeTables/{routeTableId}:removeRouteTableRules

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|
|**routeTableId**|String|True||RouteTable ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ruleIds**|String[]|True||Route Table Rule ID List|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|



## Return code
|Return code|Description|
|---|---|
|**200**|Successful operation|
|**400**|Request field x.y.z is missing.|
|**404**|Target 'xxx' not found; TargetGroup 'xxx' not found.|
|**500**|internal server error|
