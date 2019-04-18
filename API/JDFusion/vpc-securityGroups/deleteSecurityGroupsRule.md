# deleteSecurityGroupsRule


## Description
Delete a security group rule

## Request Method
DELETE

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
|**ruleType**|String|True| |Rules Type, ingress, egress|
|**protocol**|String|True| |Protocol, tcp, udp, icmp or all|
|**fromPort**|String|True| |Start Port|
|**toPort**|String|True| |Termination Port|
|**nicType**|String|False| |Network Type, internet, intranet|
|**policy**|String|False| |Certification Policy, accept, drop|
|**priority**|String|False| |Weight of Certification Policy, 1-100|
|**cidrIp**|String|False| |Destination IP Address Range|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


## Return Code
|Return Code|Description|
|---|---|
|**204**|OK|
|**404**|securityGroup not found, or rule not found|
