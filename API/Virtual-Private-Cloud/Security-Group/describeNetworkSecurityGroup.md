# describeNetworkSecurityGroup


## Description
Query security group information details

## Request method
GET

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkSecurityGroups/{networkSecurityGroupId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**networkSecurityGroupId**|String|True| |NetworkSecurityGroup ID|
|**regionId**|String|True| |Region ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Returned Results|


### Result
|Name|Type|Description|
|---|---|---|
|**networkSecurityGroup**|NetworkSecurityGroup|Security group resource information|
### NetworkSecurityGroup
|Name|Type|Description|
|---|---|---|
|**createdTime**|String|Creation Time of Security Group|
|**description**|String|Security Group Description Information|
|**networkSecurityGroupId**|String|Security Group ID|
|**networkSecurityGroupName**|String|Security Group Name|
|**securityGroupRules**|SecurityGroupRule[]|Security Group Rule Information|
|**vpcId**|String|VPC ID of Security Group|
### SecurityGroupRule
|Name|Type|Description|
|---|---|---|
|**addressPrefix**|String|Prefix of Matching Address|
|**createdTime**|String|Creation Time of Security Group Rule|
|**description**|String|Description, allow all characters under UTF-8 coding, which cannot exceed 256 characters|
|**direction**|Number|Security Group Rule Direction. 0: Inbound Rule; 1: Outbound Rule|
|**fromPort**|Number|The start transport layer port of rule limit, the default value is 1, if protocol is not a transport layer protocol, the value is constantly 0|
|**ipVersion**|Number|Matching Address Protocol Revision 4: IPv4|
|**protocol**|Number|Rule Limits Protocol. 300:All; 6:TCP; 17:UDP; 1:ICMP|
|**ruleId**|String|Security Group Rule ID|
|**toPort**|Number|The end transport layer port of rule limit, the default value is 1, if protocol is not a transport layer protocol, the value is constantly 0|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**401**|Authentication failed|
