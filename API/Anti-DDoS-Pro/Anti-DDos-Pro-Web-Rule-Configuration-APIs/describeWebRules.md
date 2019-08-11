# describeWebRules


## Description
Search web service rules under an instance

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/webRules

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|
|**instanceId**|String|True| |Anti-DDoS Pro instance Id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Page Number: 1 by default|
|**pageSize**|Integer|False| |Paging Size: 10 by default; value range [10, 100]|
|**searchType**|String|False| |Query Type Name, Domain: Origin Server Domain Name, ip: Origin Server IP, rawDomain: Domain Name|
|**searchValue**|String|False| |Query Type Value|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**dataList**|WebRule[]| |
|**currentCount**|Integer|Current Page Counts|
|**totalCount**|Integer|Total Amount|
|**totalPage**|Integer|Total Number of Pages|
### WebRule
|Name|Type|Description|
|---|---|---|
|**id**|String|Rule Id|
|**instanceId**|String|Instance Id|
|**domain**|String|Subdomain|
|**cname**|String|CNAME of Rules|
|**cnameStatus**|Integer|CNAME resolution status, 0: Abnormal resolution, 1: Normal resolution|
|**protocol**|WebRuleProtocol| |
|**customPortStatus**|Integer|Confirm whether it is customized port number or not, 0: default, 1: customized|
|**port**|Integer[]|HTTP protocol port number, such as 80,81|
|**httpsPort**|Integer[]|HTTPS protocol port number, such as 443,8443|
|**httpOrigin**|Integer|Enable HTTP back-to-origin or not, 0: No, 1: Yes, this attribute can be configured when HTTPS is checked|
|**status**|Integer|0: defense status, 1: back-to-origin status|
|**originType**|String|Back-to-origin type: A or CNAME|
|**originAddr**|OriginAddrItem[]|Back-to-origin domain, when originType is A, return this field|
|**originDomain**|String|Back-to-origin domain, the field is returned when originType is CNAME|
|**onlineAddr**|String[]|Backup back-to-origin address list, is a domain or multiple IP addresses|
|**httpCertStatus**|Integer|Certificate Status. <br>- 0: Abnormal<br>- 1: Normal<br>- 2: Certificate un-uploaded|
|**certId**|String|Certificate Id|
|**certName**|String|Certificate Name|
|**httpsCertContent**|String|Certificate Content|
|**httpsRsaKey**|String|Certificate Private Key|
|**forceJump**|Integer|Enable HTTPS forced redirection or not, this attribute can be configured when the protocol is HTTP_HTTPS<br>- 0: No<br>- 1: Yes|
|**algorithm**|String|Forwarding rules. <br>- wrr: Round robin with weight<br>- rr:  Round robin without weight<br>- sh:  Source address hash|
|**ccStatus**|Integer|CC status, 0: CC Disabled, 1: CC Enabled|
|**webSocketStatus**|Integer|webSocket status, 0: Disable, 1: Enable|
|**blackListEnable**|Integer|Blacklist status, 0: Disable, 1: Enable|
|**whiteListEnable**|Integer|Whitelist status, 0: Disable, 1: Enable|
### OriginAddrItem
|Name|Type|Description|
|---|---|---|
|**ip**|String|Back-to-origin IP address|
|**weight**|Integer|Weight|
|**inJdCloud**|Boolean|Confirm whether it is the Private IP/EIP address of JD Cloud?|
### WebRuleProtocol
|Name|Type|Description|
|---|---|---|
|**http**|Boolean|http Protocol|
|**https**|Boolean|https Protocol|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
