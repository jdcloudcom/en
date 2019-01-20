# describeNetworkAcls


## Description
Query Acl List

## Request method
GET

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkAcls/

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page; it is 1 by default. Value Range: [1,∞); when the pages exceed total pages, show the last page|
|**pageSize**|Integer|False|20|Paging Size: 20 by default. Value Range: [10, 100]|
|**filters**|Filter[]|False| | |

### Filter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|
|**name**|String|True| |Name of Filter Requirements|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Returned Results|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**totalCount**|Number|Total Number|
|**networkAcls**|NetworkAcl[]|NetworkAcl Resource Information List|
### NetworkAcl
|Name|Type|Description|
|---|---|---|
|**networkAclRules**|NetworkAclRule[]|NetworkAcl Rule List|
|**networkAclId**|String|networkAcl ID|
|**vpcId**|String|VPC ID|
|**description**|String|Description, allow all characters under UTF-8 coding, not exceeding 256 characters|
|**createdTime**|String|NetworkAcl Creation Time|
|**subnetIds**|String[]|NetworkAcl Associated Subnet List|
|**networkAclName**|String|NetworkAcl Name|
### NetworkAclRule
|Name|Type|Description|
|---|---|---|
|**direction**|String|NetworkAcl Rule Direction. ingress: Inbound Rule; egress: Outbound Rule|
|**protocol**|String|Rule Limits Protocol. Value Range: All, TCP, UDP, ICMP|
|**description**|String|Description, allow all characters under UTF-8 coding, not exceeding 256 characters|
|**ruleId**|String|NetworkAcl Rule ID|
|**addressPrefix**|String|Prefix of Matching Address|
|**priority**|Integer|Rule Matching Priority. Value Range: [1,32768]; the smaller the priority number is, the higher priority it is|
|**fromPort**|Integer|The Start Transport Layer Port of Rule Limit. Value Range: 1-65535; if the protocol is a transport layer protocol, the default value is 1; if the protocol is not a transport layer protocol, the setting becomes invalid and the value is constantly 0. If the rule is limited to one port, a same value is filled in the fromPort and toPort|
|**ruleAction**|String|IAM Policy: allow: allow, deny: deny|
|**createdTime**|String|NetworkAclRule Creation Time|
|**toPort**|Integer|The End Transport Layer Port of Rule Limit. Value Range: 1-65535; if the protocol is a transport layer protocol, the default value is 65535; if the protocol is not a transport layer protocol, the setting becomes invalid and the value is constantly 0. If the rule is limited to one port, a same value is filled in the fromPort and toPort|

## Response code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**500**|Internal error|
|**200**|OK|
|**404**|Not found|
|**429**|Quota exceeded|
