# modifyNetworkSecurityGroupRules


## 描述
Modify security group rule

## 请求方式
POST

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkSecurityGroups/{networkSecurityGroupId}:modifyNetworkSecurityGroupRules

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**networkSecurityGroupId**|String|True||NetworkSecurityGroup ID|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**modifySecurityGroupRuleSpecs**|[ModifySecurityGroupRules[]](##ModifySecurityGroupRules)|True||Security group rule information|

### <a name="ModifySecurityGroupRules">ModifySecurityGroupRules</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**addressPrefix**|String|False||Prefix of security group rule, value range: correct CIDR  |
|**description**|String|False||Security group rule description, value range: 0-256 of all characters entered under UTF-8 coding|
|**fromPort**|Integer|False||Start port of security group rule. Value range: 1-65535|
|**protocol**|Number|False||Rule limits protocol. 300:All; 6:TCP; 17:UDP; 1:ICMP|
|**ruleId**|String|True||Security group rule ID.|
|**toPort**|Integer|False||End port of security group rule. Value range: 1-65535|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|



## 返回码
|返回码|描述|
|---|---|
|**200**|Successful operation|
|**400**|invalid parameter|
|**404**|SecurityGroup or SecurityGroupRule not found|
|**500**|Internal server error|
