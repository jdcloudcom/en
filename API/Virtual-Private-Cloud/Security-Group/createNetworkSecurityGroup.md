# createNetworkSecurityGroup


## Description
Create security group

## Request method
POST

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkSecurityGroups/

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**description**|String|False||Description, all characters allowed to enter under UTF-8 encoding, without exceeding 256 characters|
|**networkSecurityGroupName**|String|True||Security group name, only allowed to enter Chinese, numbers, capital and lowercase letters, English underline “_” and line-through “-”, must provide a name which cannot exceed 32 characters. |
|**vpcId**|String|True||Virtual private cloud ID|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|[Result](##Result)|Return result|


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**networkSecurityGroupId**|String|Security group ID|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**404**|Resource not found|
|**500**|Internal server error|
