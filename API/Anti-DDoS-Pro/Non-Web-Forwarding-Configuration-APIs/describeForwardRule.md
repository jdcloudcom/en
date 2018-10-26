# describeForwardRule


## Description
Search a non-web service rule

## Request method
GET

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/forwardRules/{forwardRuleId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**forwardRuleId**|String|True| |Forwarding Rule ID|
|**instanceId**|String|True| |Instance ID|
|**regionId**|String|True| |Region ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|ForwardRule| |
### ForwardRule
|Name|Type|Description|
|---|---|---|
|**algorithm**|String|Forwarding Rules: wrr->round Robin with weight,  wlc->minimum weighted connection,  rr->round Robin without weight,  sh->source address hash|
|**cname**|String|cname of Rules|
|**id**|Integer|Rule ID|
|**instanceId**|Integer|Instance ID|
|**onlineAddr**|String[]| |
|**originAddr**|OriginAddrItem[]| |
|**originDomain**|String|Back-to-origin Domain Name|
|**originPort**|Integer|Back-to-origin Port Number|
|**originType**|String|Back-to-origin Type: ip or domain|
|**port**|Integer|Port Number|
|**protocol**|String|TCP or UDP|
|**status**|Integer|0->defense Status  1->back-to-origin Status|
### OriginAddrItem
|Name|Type|Description|
|---|---|---|
|**inJdCloud**|Boolean|Confirm whether it is the Private IP/EIP address of JD Cloud?|
|**ip**|String|Back-to-origin IP address|
|**weight**|Integer|Weight|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
