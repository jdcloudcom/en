# describeForwardRule


## Description
Search a non-web service rule

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/forwardRules/{forwardRuleId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|
|**instanceId**|String|True| |Anti-DDoS Pro instance Id|
|**forwardRuleId**|String|True| |Forwarding rule Id|

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
|**data**|ForwardRule| |
### ForwardRule
|Name|Type|Description|
|---|---|---|
|**id**|String|Rule Id|
|**instanceId**|String|Instance Id|
|**protocol**|String|TCP or UDP|
|**cname**|String|CNAME of Rules|
|**originType**|String|Back-to-origin Type: ip or domain|
|**port**|Integer|Port Number|
|**algorithm**|String|Forwarding rules. <br>- wrr: Round robin with weight<br>- rr:  Round robin without weight<br>- sh:  Source address hash|
|**originAddr**|OriginAddrItem[]| |
|**onlineAddr**|String[]|Backup Back-to-origin Address List|
|**originDomain**|String|Back-to-origin Domain Name|
|**originPort**|Integer|Back-to-origin Port Number|
|**status**|Integer|0: Defense Status<br>1: Back-to-origin Status|
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
