# modifyNetworkInterface


## Description
Modify Elastic Network Interface APIs

## Request method
PATCH

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkInterfaces/{networkInterfaceId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**networkInterfaceId**|String|True||networkInterface ID|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**description**|String|False||Description, all characters allowed to enter under UTF-8 coding, which is not exceed 256 characters|
|**networkInterfaceName**|String|False||Elastic Network Interface name, only allowed to enter Chinese, numbers, capital and lowercase letters, English underline “_” and line-through “-”, must provide a name which cannot exceed 32 characters|
|**securityGroups**|String[]|False||To replace the Security Group with mode update of the original Security Group. If the Security Group ID list is updated, a maximum of 5 Security Groups can be done|


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
