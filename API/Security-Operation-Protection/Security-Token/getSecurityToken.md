# getSecurityToken


## 描述
Obtaining Token

## 请求方式
POST

## 请求地址
https://sop.jdcloud-api.com/v1/regions/{regionId}/securityToken:getSecurityToken

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**getSecurityTokenInfo**|[GetSecurityTokenInfo](##GetSecurityTokenInfo)|True||Obtain SecurityToken parameters|

### <a name="GetSecurityTokenInfo">GetSecurityTokenInfo</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**action**|String|True||Action action serviceName:actionName|
|**code**|String|True||Verification code|
|**durationSeconds**|Integer|False||The unit of token validity period is second; verification in OpenAPI third-party MFA method is valid; the default token validity period of SMS and email is 300 seconds, and the validity period of MFA is 30 seconds|
|**type**|Integer|True||Verification methods of operation protection: 1-SMS, 2-email, 3-MFA|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**securityToken**|String|Security token|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
