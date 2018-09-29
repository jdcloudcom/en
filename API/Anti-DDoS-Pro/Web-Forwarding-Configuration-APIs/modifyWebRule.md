# modifyWebRule


## Description
Update a web service rule

## Request method
PATCH

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/webRules/{webRuleId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |Instance ID|
|**regionId**|String|True| |Belonging Region ID|
|**webRuleId**|String|True| |Web Service Rule ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**webRuleSpec**|WebRuleSpec|True| |Update web service rule parameters|

### WebRuleSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**algorithm**|String|False| |Forwarding Rules: wrr->Round Robin with weight  rr->Round Robin without weight|
|**customPortStatus**|Integer|False| |Confirm whether it is customized port number or not? 0->default  1->customized|
|**domain**|String|False| |Subdomain Name|
|**forceJump**|Integer|False| |Confirm to enable https forced jump? The attribute may be configured when the protocol is HTTP_HTTPS  0->no  1->yes|
|**httpOrigin**|Integer|False| |Confirm to enable http back-to-origin, 0->no  1->yes. The attribute may be configured when HTTPS is checked|
|**httpsCertContent**|String|False| |Certificate Content|
|**httpsPort**|String|False| |HTTPS protocol port number, such as 443 and 8443, and multiple port numbers are separated by commas|
|**httpsRsaKey**|String|False| |Certificate Private Key|
|**onlineAddr**|String[]|False| | |
|**originAddr**|OriginAddrItem[]|False| | |
|**originDomain**|String|False| |Back-to-origin domain name, and the field needs to be specified when originType is CNAME|
|**originType**|String|False| |Back-to-origin Type: A or CNAME|
|**port**|String|False| |HTTP protocol port number, such as 80 and 81, and multiple port numbers are separated by commas|
|**protocol**|String|False| |Protocol: HTTP, HTTPS and HTTP_HTTPS|
|**websocketStatus**|Integer|False| |Confirm to enable WebSocket or not, 0 is no, and 1 is yes|
### OriginAddrItem
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**inJdCloud**|Boolean|False| |Confirm whether it is the Private IP/EIP address of JD Cloud?|
|**ip**|String|False| |Back-to-origin IP address|
|**weight**|Integer|False| |Weight|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
|**404**|NOT_FOUND|
|**500**|INTERNAL_SERVER_ERROR|
