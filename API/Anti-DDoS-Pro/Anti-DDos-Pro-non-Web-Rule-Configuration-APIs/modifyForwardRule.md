# modifyForwardRule


## Description
Update a non-web service rule

## Request Method
PATCH

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/forwardRules/{forwardRuleId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceId**|Long|True| |Anti-DDoS Pro Instance Id|
|**forwardRuleId**|Long|True| |Forwarding Rule Id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**forwardRuleSpec**|ForwardRuleSpec|True| |Update non-web service rule parameters|

### ForwardRuleSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**protocol**|String|True| |Protocol: TCP or UDP|
|**port**|Integer|True| |Port number, value range [1, 65535]|
|**algorithm**|String|True| |Forwarding rules<br>- wrr Round robin with weights <br>- wlc Minimum weighted connection<br>- rr  Round robin without weights<br>- sh  Source address hash<br>|
|**originType**|String|True| |Back-to-origin type: A or CNAME|
|**originAddr**|OriginAddrItem[]|False| | |
|**onlineAddr**|String[]|False| |The backup back-to-origin address list can be configured as one domain or several ip addresses|
|**originDomain**|String|False| |Back-to-origin Domain Name|
|**originPort**|Integer|True| |Back-to-origin port number, value range [1, 65535]|
### OriginAddrItem
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ip**|String|False| |Back-to-origin IP address|
|**weight**|Integer|False| |Weight|
|**inJdCloud**|Boolean|False| |Confirm whether it is the Private IP/EIP address of JD Cloud?|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |
|**error**|Error| |

### Error
|Name|Type|Description|
|---|---|---|
|**code**|Integer|Request Error Status Code|
|**status**|String|Request Error Status Code|
|**message**|String|Request Error Notification|
### Result
|Name|Type|Description|
|---|---|---|
|**code**|Integer|0: Rule update failed, 1: Rule update succeeded|
|**message**|String|Please specify reasons for rule update failure|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
