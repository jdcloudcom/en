# deleteCerts


## Description
Certificate Deletion<br>Sensitive operation can be enabled<a href="https://docs.jdcloud.com/en/security-operation-protection/operation-protection">MFA Operation Protection</a>

## Request Method
DELETE

## Request Address
https://ssl.jdcloud-api.com/v1/sslCert/{certId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**certId**|String|True| |Certificate Id|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Requested IdentifierId|

### Result
|Name|Type|Description|
|---|---|---|
|**code**|Integer|Status Code|
|**message**|String|Message|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
