# createForwardRule


## Description
Add a non-web service rule

## Request method
POST

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/forwardRules

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True||Instance ID|
|**regionId**|String|True||Belonging region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**forwardRuleSpec**|ForwardRuleSpec|True||Non-web service rule parameter|

### <a name="ForwardRuleSpec">ForwardRuleSpec</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**algorithm**|String|False||Forwarding rules: wrr->Round Robin with weight  wlc->minimum weighted connection  rr->Round Robin without weight  sh->source address hash|
|**onlineAddr**|String[]|False|||
|**originAddr**|OriginAddrItem[]|False|||
|**originDomain**|String|False||Back-to-origin domain name|
|**originPort**|Integer|False||Back-to-origin port number|
|**originType**|String|False||Back-to-origin type, ip or domain|
|**port**|Integer|False||Port number|
|**protocol**|String|False||Protocol: TCP or UDP|
### <a name="OriginAddrItem">OriginAddrItem</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**inJdCloud**|Boolean|False||Confirm whether it is the Private IP/EIP address of JD Cloud?|
|**ip**|String|False||Back-to-origin IP address|
|**weight**|Integer|False||Weight|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||



## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
|**404**|NOT_FOUND|
|**500**|INTERNAL_SERVER_ERROR|
