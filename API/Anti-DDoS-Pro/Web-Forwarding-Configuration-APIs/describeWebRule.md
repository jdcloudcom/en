# describeWebRule


## Description
Search a web service rule

## Request method
GET

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/webRules/{webRuleId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |Instance ID|
|**regionId**|String|True| |Belonging Region ID|
|**webRuleId**|String|True| |Web Service Rule ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|WebRule| |
### WebRule
|Name|Type|Description|
|---|---|---|
|**algorithm**|String|Forwarding Rules: wrr->Round Robin with weight  rr->Round Robin without weight|
|**ccStatus**|Integer|0->CC disabled  1->CC enabled|
|**cname**|String|cname of Rules|
|**customPortStatus**|Integer|Confirm whether it is customized port number or not? 0->default  1->customized|
|**domain**|String|Subdomain Name|
|**forceJump**|Integer|Confirm to enable https forced jump? The attribute may be configured when the protocol is HTTP_HTTPS  0->no  1->yes|
|**httpCertStatus**|Integer|Certificate Status: 0->exceptional  1->normal|
|**httpOrigin**|Integer|Confirm to enable http back-to-origin, 0->no  1->yes. The attribute may be configured when HTTPS is checked|
|**httpsCertContent**|String|Certificate Content|
|**httpsPort**|String|HTTPS protocol port number, such as 443 and 8443, and multiple port numbers are separated by commas|
|**httpsRsaKey**|String|Certificate Private Key|
|**id**|Integer|Rule ID|
|**instanceId**|Integer|Instance ID|
|**onlineAddr**|String[]| |
|**originAddr**|OriginAddrItem[]| |
|**originDomain**|String|Back-to-origin domain name, and the field is returned when originType is CNAME|
|**originType**|String|Back-to-origin Type: A or CNAME|
|**port**|String|HTTP protocol port number, such as 80 and 81, and multiple port numbers are separated by commas|
|**protocol**|String|Protocol: HTTP, HTTPS and HTTP_HTTPS|
|**status**|Integer|0->defense Status  1->back-to-origin Status|
### OriginAddrItem
|Name|Type|Description|
|---|---|---|
|**inJdCloud**|Boolean|Confirm whether it is the Private IP/EIP address of JD Cloud?|
|**ip**|String|Back-to-origin IP address|
|**weight**|Integer|Weight|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
