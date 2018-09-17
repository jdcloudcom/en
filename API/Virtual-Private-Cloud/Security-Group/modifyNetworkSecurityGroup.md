# modifyNetworkSecurityGroup


## Description
Modify security group attribute

## Request method
PATCH

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkSecurityGroups/{networkSecurityGroupId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**networkSecurityGroupId**|String|True||NetworkSecurityGroup ID|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**description**|String|False||Security group description, value range: 0-256 of all characters entered under UTF-8 encoding|
|**networkSecurityGroupName**|String|False||Security group name. Value range of name: 1-32 Chinese, English capital and lowercase letters, numbers and underline delimiter|


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
