# getSecurityToken


## Description
Obtaining Token

## Request method
POST

## Request address
https://sop.jdcloud-api.com/v1/regions/{regionId}/securityToken:getSecurityToken

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**getSecurityTokenInfo**|[GetSecurityTokenInfo](##GetSecurityTokenInfo)|True||Obtain SecurityToken parameters|

### <a name="GetSecurityTokenInfo">GetSecurityTokenInfo</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**action**|String|True||Action action serviceName:actionName|
|**code**|String|True||Verification code|
|**durationSeconds**|Integer|False||The unit of token validity period is second; verification in OpenAPI third-party MFA method is valid; the default token validity period of SMS and email is 300 seconds, and the validity period of MFA is 30 seconds|
|**type**|Integer|True||Verification methods of operation protection: 1-SMS, 2-email, 3-MFA|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**securityToken**|String|Security token|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
