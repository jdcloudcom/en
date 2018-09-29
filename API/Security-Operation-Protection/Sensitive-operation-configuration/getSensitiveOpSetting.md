# getSensitiveOpSetting


## 描述
Obtain the settings information of Operation Protection

## 请求方式
GET

## 请求地址
https://sop.jdcloud-api.com/v1/regions/{regionId}/sensitiveOpSetting

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**action**|String|True| |Operate action serviceName:actionName|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**extInfo**|String|Expansion information is the mobile number after the mask when type=1, and is the email address after the mask when type=2|
|**status**|Integer|Enabling status of Operation Protection: 0-not enabled, 1-enabled|
|**type**|Integer|Verification methods of Operation Protection: 0-none, 1-SMS, 2-email, 3-MFA|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
