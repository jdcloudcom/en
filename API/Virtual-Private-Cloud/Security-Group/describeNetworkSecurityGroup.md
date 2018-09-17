# describeNetworkSecurityGroup


## Description
Query security group information details

## Request method
GET

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkSecurityGroups/{networkSecurityGroupId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**networkSecurityGroupId**|String|True||NetworkSecurityGroup ID|
|**regionId**|String|True||Region ID|

## Request parameter
无


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|[Result](##Result)|Return result|


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**networkSecurityGroup**|[NetworkSecurityGroup](##NetworkSecurityGroup)|Security group resource information|
### <a name="NetworkSecurityGroup">NetworkSecurityGroup</a>
|Name|Type|Description|
|---|---|---|
|**createdTime**|String|Creation time of security group|
|**description**|String|Security group description information|
|**networkSecurityGroupId**|String|Security group ID|
|**networkSecurityGroupName**|String|Security group name|
|**securityGroupRules**|[SecurityGroupRule[]](##SecurityGroupRule)|Security group rule information|
|**vpcId**|String|vpc Id of security group|
### <a name="SecurityGroupRule">SecurityGroupRule</a>
|Name|Type|Description|
|---|---|---|
|**addressPrefix**|String|Prefix of matching address|
|**createdTime**|String|Creation time of security group rule|
|**description**|String|Description, all characters allowed to enter under UTF-8 encoding, which is not exceed 256 characters|
|**direction**|Number|Security group rule direction. 0: inbound rule; 1: outbound rule|
|**fromPort**|Number|The start transport layer port of rule limit, the default value is 1, if protocol is not a transport layer protocol, the value is constantly 0|
|**ipVersion**|Number|Matching address protocol version. 4：IPv4|
|**protocol**|Number|Rule limits protocol. 300:All; 6:TCP; 17:UDP; 1:ICMP|
|**ruleId**|String|Security group rule ID|
|**toPort**|Number|The end transport layer port of rule limit, the default value is 1, if protocol is not a transport layer protocol, the value is constantly 0|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**401**|Authentication failed|
