# describeForwardRule


## Description
Search a non-web service rule

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/forwardRules/{forwardRuleId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceId**|Long|True| |Anti-DDoS Pro Instance Id|
|**forwardRuleId**|Long|True| |Forwarding Rule Id|

## Request Parameter
None


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
|**data**|ForwardRule| |
### ForwardRule
|Name|Type|Description|
|---|---|---|
|**id**|Long|Rule ID|
|**instanceId**|Long|Instance ID|
|**protocol**|String|TCP or UDP|
|**cname**|String|cname of Rules|
|**originType**|String|Back-to-origin Type: ip or domain|
|**port**|Integer|Port Number|
|**algorithm**|String|Forwarding rules<br>- wrr Round robin with weights <br>- wlc Minimum weighted connection<br>- rr  Round robin without weights<br>- sh  Source address hash<br>|
|**originAddr**|OriginAddrItem[]| |
|**onlineAddr**|String[]|Backup Back-to-origin Address List|
|**originDomain**|String|Back-to-origin Domain Name|
|**originPort**|Integer|Back-to-origin Port Number|
|**status**|Integer|0 defense Status  1 back-to-origin Status|
### OriginAddrItem
|Name|Type|Description|
|---|---|---|
|**ip**|String|Back-to-origin IP address|
|**weight**|Integer|Weight|
|**inJdCloud**|Boolean|Confirm whether it is the Private IP/EIP address of JD Cloud?|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
