# modifyWebRule


## Description
Modify web service rules

## Request Method
PATCH

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/webRules/{webRuleId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|
|**instanceId**|String|True| |Anti-DDoS Pro instance Id|
|**webRuleId**|String|True| |Web Rule Id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**webRuleSpec**|WebRuleSpec|True| |Update web service rule parameters|

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
|**originDomain**|String|False| |Back-to-origin domain, when originType is CNAME, this field is required to be designated|
|**algorithm**|String|True| |Forwarding rules. <br>- wrr: Round robin with weight<br>- rr:  Round robin without weight<br>- sh:  Source address hash|
|**forceJump**|Integer|False| |Enable HTTPS forced redirection or not, when protocol.http and protocol.https are true, this parameter takes effect. <br>- 0: No. <br>- 1: Yes|
|**customPortStatus**|Integer|False| |Is customized port number or not. 0: Default<br>- 1: Customized|
|**httpOrigin**|Integer|False| |Enable HTTP back-to-origin or not, when protocol.https is true, this parameter takes effect. <br>- 0: Disable. <br>- 1: Enable|
|**webSocketStatus**|Integer|True| |Enable WebSocket or not.<br>- 0: Disable<br>- 1: Enable|
|**httpsCertContent**|String|False| |Certificate Content|
|**httpsRsaKey**|String|False| |Certificate Private Key|
|**certId**|String|False| |Certificate Id. <br>- When certId is uploaded, please confirm if corresponding certificates are uploaded<br>- When certId is the default, certificates corresponding to httpsCertContent, httpsRsaKey will be used as web rules|
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
|**code**|Integer|Modification results of web service rule, 0: Modification failed, 1: Modification succeeded|
|**message**|String|Please specify reasons for modification failure|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
