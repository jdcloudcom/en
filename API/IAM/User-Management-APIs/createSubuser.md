# createSubuser


## 描述
Create sub-accounts

## 请求方式
POST

## 请求地址
https://iam.jdcloud-api.com/v1/regions/{regionId}/subUser

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**createSubUserInfo**|[CreateSubUserInfo](##CreateSubUserInfo)|True||Sub-account information|

### <a name="CreateSubUserInfo">CreateSubUserInfo</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**createAk**|Boolean|True||Create accessKey or not|
|**description**|String|False||Description, 0~256 characters|
|**email**|String|True||Email|
|**name**|String|True||Sub-account user name, 4-20 numbers, letters, Chinese characters, underlines and line-throughs|
|**password**|String|True||Password, 6-20 bits, containing at least one letters and at least one number or half-width character|
|**passwordConfirm**|String|True||Confirm password|
|**phone**|String|True||Mobile number, area code-mobile number, at present only support 0086-Chinese mobile number|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||



## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
