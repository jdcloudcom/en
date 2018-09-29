# addNetworkSecurityGroupRules


## Description
Add security group rule

## Request method
POST

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkSecurityGroups/{networkSecurityGroupId}:addNetworkSecurityGroupRules

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**networkSecurityGroupId**|String|True| |NetworkSecurityGroup ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**networkSecurityGroupRuleSpecs**|AddSecurityGroupRules[]|True| |Security Group Rule Information|

### AddSecurityGroupRules
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**addressPrefix**|String|True| |Prefix of Matching Address|
|**description**|String|False| |Description, allow all characters under UTF-8 coding, which cannot exceed 256 characters|
|**direction**|Number|True| |Security Group Rule Direction. 0: Inbound Rule; 1: Outbound Rule|
|**fromPort**|Number|False| |The Start Transport Layer Port of Rule Limit. Value Range: 1-65535; if the protocol is a transport layer protocol, the default value is 1; if the protocol is not a transport layer protocol, the value is constantly 0. If the rule is limited to one port, a same value is filled in the fromPort and toPort|
|**protocol**|Number|True| |Rule Limits Protocol. 300:All; 6:TCP; 17:UDP; 1:ICMP|
|**toPort**|Number|False| |The End Transport Layer Port of Rule Limit. Value Range: 1-65535; if the protocol is a transport layer protocol, the default value is 65535; if the protocol is not a transport layer protocol, the value is constantly 0. If the rule is limited to one port, a same value is filled in the fromPort and toPort|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|



## Response code
|Return code|Description|
|---|---|
|**200**|Successful operation|
|**400**|Request parameter x.y.z is 'xxx', expected one of [yyy,zzz]|
|**404**|Resource Not Found|
|**500**|Internal server error|
|**409**|SecurityGroup rules not in the same vpc|
