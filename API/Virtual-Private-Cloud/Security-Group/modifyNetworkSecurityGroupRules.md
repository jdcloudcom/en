# modifyNetworkSecurityGroupRules


## Description
Modify security group rule

## Request method
POST

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkSecurityGroups/{networkSecurityGroupId}:modifyNetworkSecurityGroupRules

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**networkSecurityGroupId**|String|True||NetworkSecurityGroup ID|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**modifySecurityGroupRuleSpecs**|ModifySecurityGroupRules[]|True||Security group rule information|

### <a name="ModifySecurityGroupRules">ModifySecurityGroupRules</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**addressPrefix**|String|False||Prefix of security group rule, value range: correct CIDR  |
|**description**|String|False||Security group rule description, value range: 0-256 of all characters entered under UTF-8 coding|
|**fromPort**|Integer|False||Start port of security group rule. Value range: 1-65535|
|**protocol**|Number|False||Rule limits protocol. 300:All; 6:TCP; 17:UDP; 1:ICMP|
|**ruleId**|String|True||Security group rule ID.|
|**toPort**|Integer|False||End port of security group rule. Value range: 1-65535|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|



## Return code
|Return code|Description|
|---|---|
|**200**|Successful operation|
|**400**|invalid parameter|
|**404**|SecurityGroup or SecurityGroupRule not found|
|**500**|Internal server error|
