# describeNetworkAcl


## 描述
Query NetworkAcl resource details

## 请求方式
GET

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkAcls/{networkAclId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**networkAclId**|String|True| |networkAclId ID|
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
|**networkAcl**|NetworkAcl|NetworkAcl Resource Information|
### NetworkAcl
|名称|类型|描述|
|---|---|---|
|**createdTime**|String|NetworkAcl Creation Time|
|**description**|String|Description, allow all characters under UTF-8 coding, not exceeding 256 characters|
|**networkAclId**|String|networkAcl ID|
|**networkAclName**|String|NetworkAcl Name|
|**networkAclRules**|NetworkAclRule[]|NetworkAcl Rule List|
|**subnetIds**|String[]|NetworkAcl Associated Subnet List|
|**vpcId**|String|VPC ID|
### NetworkAclRule
|名称|类型|描述|
|---|---|---|
|**addressPrefix**|String|Prefix of Matching Address|
|**createdTime**|String|NetworkAclRule Creation Time|
|**description**|String|Description, allow all characters under UTF-8 coding, not exceeding 256 characters|
|**direction**|String|NetworkAcl Rule Direction. ingress: Inbound Rule; egress: Outbound Rule|
|**fromPort**|Integer|The Start Transport Layer Port of Rule Limit. Value Range: 1-65535; if the protocol is a transport layer protocol, the default value is 1; if the protocol is not a transport layer protocol, the setting becomes invalid and the value is constantly 0. If the rule is limited to one port, a same value is filled in the fromPort and toPort|
|**priority**|Integer|Rule Matching Priority. Value Range: [1,32768]; the smaller the priority number is, the higher priority it is|
|**protocol**|String|Rule Limits Protocol. Value Range: All, TCP, UDP, ICMP|
|**ruleAction**|String|IAM Policy: allow: allow, deny: deny|
|**ruleId**|String|NetworkAcl Rule ID|
|**toPort**|Integer|The End Transport Layer Port of Rule Limit. Value Range: 1-65535; if the protocol is a transport layer protocol, the default value is 65535; if the protocol is not a transport layer protocol, the setting becomes invalid and the value is constantly 0. If the rule is limited to one port, a same value is filled in the fromPort and toPort|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**404**|Not found|
|**500**|Internal error|
|**401**|Authentication failed|
