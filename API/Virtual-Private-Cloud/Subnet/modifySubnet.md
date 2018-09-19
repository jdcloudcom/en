# modifySubnet


## Description
Modify Subnet Interface

## Request method
PATCH

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/subnets/{subnetId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|
|**subnetId**|String|True||Subnet ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**description**|String|False||Subnet description information, all characters allowed to enter under UTF-8 coding, which is not exceed 256 characters.|
|**subnetName**|String|False||Subnet name, only allowed to enter Chinese, numbers, capital and lowercase letters, English underline “_” and line-through “-”, must provide a name which cannot exceed 32 characters.|


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
