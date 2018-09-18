# describeWebRules


## Description
Search web service rules under an instance

## Request method
GET

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/webRules

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
|**dataList**|WebRule[]||
|**totalCount**|Integer||
### <a name="WebRule">WebRule</a>
|Name|Type|Description|
|---|---|---|
|**algorithm**|String|Forwarding rules: wrr->Round Robin with weight  rr->Round Robin without weight|
|**ccStatus**|Integer|0->CC disabled  1->CC enabled|
|**cname**|String|cname of rules|
|**customPortStatus**|Integer|Confirm whether it is customized port number or not? 0->default  1->customized|
|**domain**|String|Subdomain name|
|**forceJump**|Integer|Confirm to enable https forced jump? The attribute may be configured when the protocol is HTTP_HTTPS  0->no  1->yes|
|**httpCertStatus**|Integer|Certificate status: 0->exceptional  1->normal|
|**httpOrigin**|Integer|Confirm to enable http back-to-origin, 0->no  1->yes. The attribute may be configured when HTTPS is checked|
|**httpsCertContent**|String|Certificate content|
|**httpsPort**|String|HTTPS protocol port number, such as 443 and 8443, and multiple port numbers are separated by commas|
|**httpsRsaKey**|String|Certificate private key|
|**id**|Integer|Rule ID|
|**instanceId**|Integer|Instance ID|
|**onlineAddr**|String[]||
|**originAddr**|OriginAddrItem[]||
|**originDomain**|String|Back-to-origin domain name, and the field is returned when originType is CNAME|
|**originType**|String|Back-to-origin type, A or CNAME|
|**port**|String|HTTP protocol port number, such as 80 and 81, and multiple port numbers are separated by commas|
|**protocol**|String|Protocol: HTTP, HTTPS and HTTP_HTTPS|
|**status**|Integer|0->defense status  1->back-to-origin status|
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
