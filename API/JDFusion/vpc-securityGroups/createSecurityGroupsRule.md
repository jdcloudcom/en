# createSecurityGroupsRule


## Description
Add a security group rule

## Request Method
POST

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_securityGroups/{id}/rule

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|True| |Security Group ID|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-fusion-cloudid**|String|True| |Cloud Registration Information ID|
|**sgRule**|CreateSgRule|True| |Add a security group rule|

### CreateSgRule
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ruleType**|String|True| |Rules Type, ingress, egress|
|**protocol**|String|True| |Protocol, tcp, udp, icmp or all|
|**fromPort**|Integer|True| |Start Port|
|**toPort**|Integer|True| |Termination Port|
|**securityGroupId**|String|True| |Security Group ID|
|**nicType**|String|False| |Network Type, internet, intranet|
|**policy**|String|False| |Certification Policy, accept, drop|
|**priority**|Integer|False| |Weight of Certification Policy, 1-100.|
|**cidrIp**|String|True| |Destination IP Address Range|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**task**|ResourceTFInfo| |
### ResourceTFInfo
|Name|Type|Description|
|---|---|---|
|**uuid**|String|uuid|
|**body**|String|Request Body|
|**status**|String|Status|
|**result**|String|Execution Results|
|**createdTime**|String|Creation Time|
|**updateTime**|String|Update Time|
|**provider**|String|cloud provider|
|**cloudId**|String|cloud ID|
|**userId**|String|user ID|

## Return Code
|Return Code|Description|
|---|---|
|**202**|ACCEPTED|
|**404**|securityGroup not found|
