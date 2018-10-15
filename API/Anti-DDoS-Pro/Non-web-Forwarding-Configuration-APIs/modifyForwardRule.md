# modifyForwardRule


## Description
Update a non-web service rule

## Request method
PATCH

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/forwardRules/{forwardRuleId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**forwardRuleId**|String|True| |Forwarding Rule ID|
|**instanceId**|String|True| |Instance ID|
|**regionId**|String|True| |Belonging Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**forwardRuleSpec**|ForwardRuleSpec|True| |Update non-web service rule parameters|

### ForwardRuleSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**algorithm**|String|False| |Forwarding Rules: wrr->round Robin with weight,  wlc->minimum weighted connection,  rr->round Robin without weight,  sh->source address hash|
|**onlineAddr**|String[]|False| | |
|**originAddr**|OriginAddrItem[]|False| | |
|**originDomain**|String|False| |Back-to-origin Domain Name|
|**originPort**|Integer|False| |Back-to-origin Port Number|
|**originType**|String|False| |Back-to-origin Type, ip or domain|
|**port**|Integer|False| |Port Number|
|**protocol**|String|False| |Protocol: TCP or UDP|
### OriginAddrItem
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**inJdCloud**|Boolean|False| |Confirm whether it is the Private IP/EIP address of JD Cloud?|
|**ip**|String|False| |Back-to-origin IP address|
|**weight**|Integer|False| |Weight|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
|**404**|NOT_FOUND|
|**500**|INTERNAL_SERVER_ERROR|
