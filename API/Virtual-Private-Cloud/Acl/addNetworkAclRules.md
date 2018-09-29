# addNetworkAclRules


## 描述
Add NetworkAcl rule API

## 请求方式
POST

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkAcls/{networkAclId}:addNetworkAclRules

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**networkAclId**|String|True| |networkAclId ID|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**networkAclRuleSpecs**|AddNetworkAclRuleSpec[]|True| |NetworkAcl Rule List|

### AddNetworkAclRuleSpec
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**addressPrefix**|String|True| |Prefix of Matching Address|
|**description**|String|False| |Description, allow all characters under UTF-8 coding, which cannot exceed 256 characters|
|**direction**|String|True| |NetworkAcl Rule Direction. ingress: Inbound Rule; egress: Outbound Rule|
|**fromPort**|Integer|False| |The Start Transport Layer Port of Rule Limit. Value Range: 1-65535; if the protocol is a transport layer protocol, the default value is 1; if the protocol is not a transport layer protocol, the setting becomes invalid and the value is constantly 0. If the rule is limited to one port, a same value is filled in the fromPort and toPort|
|**priority**|Integer|True| |Rule Matching Priority. Value Range: [1,32768]; the smaller the priority number is, the higher priority it is|
|**protocol**|String|True| |Rule Limits Protocol. Value Range: All, TCP, UDP, ICMP|
|**ruleAction**|String|True| |IAM Policy: allow: allow, deny: deny|
|**toPort**|Integer|False| |The End Transport Layer Port of Rule Limit. Value Range: 1-65535; if the protocol is a transport layer protocol, the default value is 65535; if the protocol is not a transport layer protocol, the setting becomes invalid and the value is constantly 0. If the rule is limited to one port, a same value is filled in the fromPort and toPort|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|


## 返回码
|返回码|描述|
|---|---|
|**200**|Successful Operation|
|**400**|Invalid parameter|
|**404**|Not found|
|**500**|Internal error|
|**429**|Quota exceeded|
