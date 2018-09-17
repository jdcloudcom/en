# addNetworkSecurityGroupRules


## 描述
Add security group rule

## 请求方式
POST

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkSecurityGroups/{networkSecurityGroupId}:addNetworkSecurityGroupRules

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**networkSecurityGroupId**|String|True||NetworkSecurityGroup ID|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**networkSecurityGroupRuleSpecs**|[AddSecurityGroupRules[]](##AddSecurityGroupRules)|True||Security group rule information|

### <a name="AddSecurityGroupRules">AddSecurityGroupRules</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**addressPrefix**|String|True||Prefix of matching address|
|**description**|String|False||Description, all characters allowed to enter under UTF-8 coding, which is not exceed 256 characters|
|**direction**|Number|True||Security group rule direction. 0: inbound rule; 1: outbound rule|
|**fromPort**|Number|False||The start transport layer port of rule limit, value range:1-65535; if the protocol is a transport layer protocol, the default value is 1; if the protocol is not a transport layer protocol, the value is constantly 0. If the rule is limited to one port, a same value is filled in the fromPort and toPort|
|**protocol**|Number|True||Rule limits protocol. 300:All; 6:TCP; 17:UDP; 1:ICMP|
|**toPort**|Number|False||The end transport layer port of rule limit, value range:1-65535; if the protocol is a transport layer protocol, the default value is 65535; if the protocol is not a transport layer protocol, the value is constantly 0. If the rule is limited to one port, a same value is filled in the fromPort and toPort|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|



## 返回码
|返回码|描述|
|---|---|
|**200**|Successful operation|
|**400**|Request parameter x.y.z is 'xxx', expected one of [yyy,zzz]|
|**404**|Resource not found|
|**500**|Internal server error|
|**409**|SecurityGroup rules not in the same vpc|
