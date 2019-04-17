# createWebRule


## Description
Add a web service rule

## Request Method
POST

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/webRules

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceId**|Long|True| |Anti-DDoS Pro Instance Id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**webRuleSpec**|WebRuleSpec|True| |Add web service rule request parameters|

### WebRuleSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |Subdomain|
|**protocol**|WebRuleProtocol|True| |Protocol: either http or https is true at least|
|**port**|Integer[]|False| |HTTP protocol port number, such as 80, 81; if protocol.http is true, please configure at least one port and at most 5 ports shall be added|
|**httpsPort**|Integer[]|False| |HTTPS protocol port number, such as 443, 8443; if protocol.https is true, please configure at least one port and at most 5 ports shall be added|
|**originType**|String|True| |Back-to-origin type, A or CNAME|
|**originAddr**|OriginAddrItem[]|False| |This field will be set if originType is A|
|**onlineAddr**|String[]|False| |The backup back-to-origin address list can be configured as one domain or several ip addresses|
|**originDomain**|String|False| |Back-to-origin domain name, and the field needs to be specified when originType is CNAME|
|**algorithm**|String|True| |Forwarding rules: wrr->round robin with weight, rr->round robin without weight|
|**forceJump**|Integer|False| |Confirm to enable https forced redirection or not, and the attribute may be configured when HTTP_HTTPS is adopted as the protocol<br>  - 0 refers to No<br>  - 1 refers to Yes|
|**customPortStatus**|Integer|False| |Confirm whether it is customized port number or not? 0->default  1->customized|
|**httpOrigin**|Integer|False| |Confirm to enable http back-to-origin or not, and the attribute may be checked if HTTPS is checked<br>  - 0 Disable<br>  - 1 Enable<br>|
|**webSocketStatus**|Integer|True| |Confirm to enable WebSocket or not, 0 refers to Yes and 1 refers to No|
|**httpsCertContent**|String|False| |Certificate Content|
|**httpsRsaKey**|String|False| |Certificate Private Key|
|**certId**|Long|False| |Certificate Id<br>  - If certId is uploaded, please confirm if corresponding certificates are uploaded<br>  - If certId is the default, certificates corresponding to httpsCertContent, httpsRsaKey will be used as the website rule|
### OriginAddrItem
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ip**|String|False| |Back-to-origin IP address|
|**weight**|Integer|False| |Weight|
|**inJdCloud**|Boolean|False| |Confirm whether it is the Private IP/EIP address of JD Cloud?|
### WebRuleProtocol
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**http**|Boolean|True| |http Protocol|
|**https**|Boolean|True| |https Protocol|

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
|**code**|Integer|0: Addition failed, 1: Addition succeeded|
|**message**|String|Please specify reasons for addition failure|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
