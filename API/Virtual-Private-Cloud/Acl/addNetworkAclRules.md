# addNetworkAclRules


## Description
Add NetworkAcl rule API

## Request method
POST

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkAcls/{networkAclId}:addNetworkAclRules

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**networkAclId**|String|True| |networkAclId ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**networkAclRuleSpecs**|AddNetworkAclRuleSpec[]|True| |NetworkAcl Rule List|

### AddNetworkAclRuleSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**protocol**|String|True| |Rule Limits Protocol. Value Range: All, TCP, UDP, ICMP|
|**fromPort**|Integer|False| |The Start Transport Layer Port of Rule Limit. Value Range: 1-65535; if the protocol is a transport layer protocol, the default value is 1; if the protocol is not a transport layer protocol, the setting becomes invalid and the value is constantly 0. If the rule is limited to one port, a same value is filled in the fromPort and toPort|
|**toPort**|Integer|False| |The End Transport Layer Port of Rule Limit. Value Range: 1-65535; if the protocol is a transport layer protocol, the default value is 65535; if the protocol is not a transport layer protocol, the setting becomes invalid and the value is constantly 0. If the rule is limited to one port, a same value is filled in the fromPort and toPort|
|**direction**|String|True| |NetworkAcl Rule Direction. ingress: Inbound Rule; egress: Outbound Rule|
|**addressPrefix**|String|True| |Prefix of Matching Address|
|**ruleAction**|String|True| |IAM Policy: allow: allow, deny: deny|
|**priority**|Integer|True| |Rule Matching Priority. Value Range: [1,32768]; the smaller the priority number is, the higher priority it is|
|**description**|String|False| |Description, allow all characters under UTF-8 coding, not exceeding 256 characters|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


## Response code
|Return code|Description|
|---|---|
|**200**|Successful operation|
|**400**|Invalid parameter|
|**404**|Not found|
|**429**|Quota exceeded|
|**500**|Internal error|
