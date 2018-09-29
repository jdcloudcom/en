# describeNetworkSecurityGroup


## 描述
Query security group information details

## 请求方式
GET

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkSecurityGroups/{networkSecurityGroupId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**networkSecurityGroupId**|String|True| |NetworkSecurityGroup ID|
|**regionId**|String|True| |Region ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Returned Results|

### Result
|名称|类型|描述|
|---|---|---|
|**networkSecurityGroup**|NetworkSecurityGroup|Security group resource information|
### NetworkSecurityGroup
|名称|类型|描述|
|---|---|---|
|**createdTime**|String|Creation Time of Security Group|
|**description**|String|Security Group Description Information|
|**networkSecurityGroupId**|String|Security Group ID|
|**networkSecurityGroupName**|String|Security Group Name|
|**securityGroupRules**|SecurityGroupRule[]|Security Group Rule Information|
|**vpcId**|String|VPC ID of Security Group|
### SecurityGroupRule
|名称|类型|描述|
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

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**401**|Authentication failed|
