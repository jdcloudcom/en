# getSecurityToken


## Description
Obtain Token

## Request method
POST

## Request address
https://sop.jdcloud-api.com/v1/regions/{regionId}/securityToken:getSecurityToken

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**getSecurityTokenInfo**|GetSecurityTokenInfo|True| |Obtain SecurityToken parameters|

### GetSecurityTokenInfo
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**action**|String|True| |Operate action serviceName:actionName|
|**code**|String|True| |Verification Code|
|**durationSeconds**|Integer|False| |The unit of token validity period is second; verification in OpenAPI third-party MFA method is valid; the default token validity period of SMS and email is 300 seconds, and the validity period of MFA is 30 seconds|
|**type**|Integer|True| |Verification Methods of Operation Protection: 1-SMS, 2-Email, 3-MFA|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**securityToken**|String|Security Token|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
