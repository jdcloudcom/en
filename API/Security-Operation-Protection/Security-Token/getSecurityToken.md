# getSecurityToken


## 描述
Obtain Token

## 请求方式
POST

## 请求地址
https://sop.jdcloud-api.com/v1/regions/{regionId}/securityToken:getSecurityToken

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**getSecurityTokenInfo**|GetSecurityTokenInfo|True| |Obtain SecurityToken parameters|

### GetSecurityTokenInfo
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**action**|String|True| |Operate action serviceName:actionName|
|**code**|String|True| |Verification Code|
|**durationSeconds**|Integer|False| |The unit of token validity period is second; verification in OpenAPI third-party MFA method is valid; the default token validity period of SMS and email is 300 seconds, and the validity period of MFA is 30 seconds|
|**type**|Integer|True| |Verification Methods of Operation Protection: 1-SMS, 2-Email, 3-MFA|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**securityToken**|String|Security Token|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
