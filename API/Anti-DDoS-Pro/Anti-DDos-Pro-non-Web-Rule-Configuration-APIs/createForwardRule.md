# createForwardRule


## Description
Add a non-web service rule

## Request Method
POST

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/forwardRules

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|
|**instanceId**|String|True| |Anti-DDoS Pro instance Id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**forwardRuleSpec**|ForwardRuleSpec|True| |Add non-web service rule request parameters|

### ForwardRuleSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**protocol**|String|True| |Protocol: TCP or UDP|
|**port**|Integer|True| |Port number, value range [1, 65535]|
|**algorithm**|String|True| |Forwarding rules. <br>- wrr: Round robin with weight<br>- rr:  Round robin without weight<br>- sh:  Source address hash|
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
|**err**|Err| |
### Err
|Name|Type|Description|
|---|---|---|
|**code**|Long|Same as http code|
|**details**|Object| |
|**message**|String| |
|**status**|String|Specific Error|
### Result
|Name|Type|Description|
|---|---|---|
|**code**|Integer|0: Failed to add rules, 1: Succeeded to add rules|
|**message**|String|Please specify reasons for rule adding failure|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
