# describeForwardRules


## Description
Search the non-web forwarding configuration under an instance

## Request method
GET

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/forwardRules

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True||Instance ID|
|**regionId**|String|True||Belonging region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False||Page number; 1 by default|
|**pageSize**|Integer|False||Paging size; it is 20 by default; value range [10, 100]|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**dataList**|ForwardRule[]||
|**totalCount**|Integer||
### <a name="ForwardRule">ForwardRule</a>
|Name|Type|Description|
|---|---|---|
|**algorithm**|String|Forwarding rules, wrr->Round Robin with weight  wlc->minimum weighted connection  rr->Round Robin without weight  sh->source address hash|
|**cname**|String|cname of rules|
|**id**|Integer|Rule ID|
|**instanceId**|Integer|Instance ID|
|**onlineAddr**|String[]|Online address|
|**originAddr**|OriginAddrItem[]||
|**originDomain**|String|Back-to-origin domain name|
|**originPort**|Integer|Back-to-origin port number|
|**originType**|String|Back-to-origin type, ip or domain|
|**port**|Integer|Port number|
|**protocol**|String|TCP or UDP|
|**status**|Integer|Status, 0->defense status  1->back-to-origin status|
### <a name="OriginAddrItem">OriginAddrItem</a>
|Name|Type|Description|
|---|---|---|
|**inJdCloud**|Boolean|Confirm whether it is the Private IP/EIP address of JD Cloud?|
|**ip**|String|Back-to-origin IP address|
|**weight**|Integer|Weight|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
