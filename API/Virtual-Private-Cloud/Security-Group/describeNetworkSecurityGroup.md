# describeNetworkSecurityGroup


## Description
Query security group information details

## Request method
GET

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkSecurityGroups/{networkSecurityGroupId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**networkSecurityGroupId**|String|True| |NetworkSecurityGroup ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Returned Results|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**networkSecurityGroup**|NetworkSecurityGroup|Security group resource information|
### NetworkSecurityGroup
|Name|Type|Description|
|---|---|---|
|**networkSecurityGroupName**|String|Security Group Name|
|**vpcId**|String|VPC ID of Security Group|
|**networkSecurityGroupId**|String|Security Group ID|
|**description**|String|Security Group Description Information|
|**createdTime**|String|Creation Time of Security Group|
|**securityGroupRules**|SecurityGroupRule[]|Security Group Rule Information|
### SecurityGroupRule
|Name|Type|Description|
|---|---|---|
|**direction**|Number|Security Group Rule Direction. 0: Inbound Rule; 1: Outbound Rule|
|**protocol**|Number|Rule Limits Protocol. 300:All; 6:TCP; 17:UDP; 1:ICMP|
|**description**|String|Description, allow all characters under UTF-8 coding, which cannot exceed 256 characters|
|**ruleId**|String|Security Group Rule ID|
|**addressPrefix**|String|Prefix of Matching Address|
|**ipVersion**|Number|Matching Address Protocol Revision 4: IPv4|
|**fromPort**|Number|The start transport layer port of rule limit, the default value is 1, if protocol is not a transport layer protocol, the value is constantly 0|
|**createdTime**|String|Creation Time of Security Group Rule|
|**toPort**|Number|The end transport layer port of rule limit, the default value is 1, if protocol is not a transport layer protocol, the value is constantly 0|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**401**|Authentication failed|
