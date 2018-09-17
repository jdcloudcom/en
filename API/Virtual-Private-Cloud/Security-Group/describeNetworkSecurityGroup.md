# describeNetworkSecurityGroup


## 描述
Query security group information details

## 请求方式
GET

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkSecurityGroups/{networkSecurityGroupId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**networkSecurityGroupId**|String|True||NetworkSecurityGroup ID|
|**regionId**|String|True||Region ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|[Result](##Result)|Returned results|


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**networkSecurityGroup**|[NetworkSecurityGroup](##NetworkSecurityGroup)|Security group resource information|
### <a name="NetworkSecurityGroup">NetworkSecurityGroup</a>
|名称|类型|描述|
|---|---|---|
|**createdTime**|String|Creation time of security group|
|**description**|String|Security group description information|
|**networkSecurityGroupId**|String|Security group ID|
|**networkSecurityGroupName**|String|Security group name|
|**securityGroupRules**|[SecurityGroupRule[]](##SecurityGroupRule)|Security group rule information|
|**vpcId**|String|vpc Id of security group|
### <a name="SecurityGroupRule">SecurityGroupRule</a>
|名称|类型|描述|
|---|---|---|
|**addressPrefix**|String|Prefix of matching address|
|**createdTime**|String|Creation time of security group rule|
|**description**|String|Description, all characters allowed to enter under UTF-8 coding, which is not exceed 256 characters|
|**direction**|Number|Security group rule direction. 0: inbound rule; 1: outbound rule|
|**fromPort**|Number|The start transport layer port of rule limit, the default value is 1, if protocol is not a transport layer protocol, the value is constantly 0|
|**ipVersion**|Number|Matching address protocol revision 4：IPv4|
|**protocol**|Number|Rule limits protocol. 300:All; 6:TCP; 17:UDP; 1:ICMP|
|**ruleId**|String|Security group rule ID|
|**toPort**|Number|The end transport layer port of rule limit, the default value is 1, if protocol is not a transport layer protocol, the value is constantly 0|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**401**|Authentication failed|
