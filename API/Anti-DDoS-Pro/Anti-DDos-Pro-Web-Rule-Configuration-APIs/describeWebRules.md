# describeWebRules


## Description
Search web service rules under an instance

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/webRules

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceId**|Long|True| |Anti-DDoS Pro Instance Id|

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
|**id**|Long|Rule ID|
|**instanceId**|Long|Instance ID|
|**domain**|String|Subdomain|
|**cname**|String|cname of Rules|
|**protocol**|WebRuleProtocol| |
|**customPortStatus**|Integer|Confirm whether it is customized port number or not, 0: default, 1: customized|
|**port**|Integer[]|HTTP protocol port number, such as 80,81|
|**httpsPort**|Integer[]|HTTPS protocol port number, such as 443,8443|
|**httpOrigin**|Integer|Confirm to enable http back-to-origin, 0: No, 1: Yes. The attribute may be configured when HTTPS is checked|
|**status**|Integer|0: defense status, 1: back-to-origin status|
|**originType**|String|Back-to-origin type: A or CNAME|
|**originAddr**|OriginAddrItem[]| |
|**originDomain**|String|Back-to-origin domain, the field is returned when originType is CNAME|
|**onlineAddr**|String[]| |
|**httpCertStatus**|Integer|Certificate status, 0: abnormal, 1: normal, 2: certificate un-uploaded|
|**certId**|Long|Certificate Id|
|**certName**|String|Certificate Name|
|**httpsCertContent**|String|Certificate Content|
|**httpsRsaKey**|String|Certificate Private Key|
|**forceJump**|Integer|Confirm to enable https forced redirection, the attribute may be configured when the protocol is HTTP_HTTPS<br>  - 0 refers to No<br>  - 1 refers to Yes<br>|
|**algorithm**|String|Forwarding rules: wrr: round robin with weight, rr: round robin without weight|
|**ccStatus**|Integer|CC status, 0: CC Disabled, 1: CC Enabled|
|**webSocketStatus**|Integer|webSocketStatus, 0: Disabled, 1: Enabled|
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
