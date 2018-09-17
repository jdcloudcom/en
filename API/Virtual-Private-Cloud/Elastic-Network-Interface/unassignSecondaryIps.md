# unassignSecondaryIps


## Description
Delete secondaryIp interface from network interface

## Request method
POST

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkInterfaces/{networkInterfaceId}:unassignSecondaryIps

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**networkInterfaceId**|String|True||networkInterface ID|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**secondaryIps**|String[]|False||Assign deleted secondaryIp address|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|



## Return code
|Return code|Description|
|---|---|
|**200**|Successful operation|
|**400**|Request parameter x.y.z is 'xxx', expected one of [yyy,zzz]|
|**404**|Resource not found|
