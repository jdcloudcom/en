# createSubuser


## Description
Create sub-accounts

## Request method
POST

## Request address
https://iam.jdcloud-api.com/v1/regions/{regionId}/subUser

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**createSubUserInfo**|[CreateSubUserInfo](##CreateSubUserInfo)|True||Sub-account information|

### <a name="CreateSubUserInfo">CreateSubUserInfo</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**createAk**|Boolean|True||Create accessKey or not|
|**description**|String|False||Description, 0~256 characters|
|**email**|String|True||Email|
|**name**|String|True||Sub-account user name, 4-20 numbers, letters, Chinese characters, underlines and line-throughs|
|**password**|String|True||Password, 6-20 bits, containing at least one letters and at least one number or half-width character|
|**passwordConfirm**|String|True||Confirm password|
|**phone**|String|True||Mobile number, area code-mobile number, at present only support 0086-Chinese mobile number|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||



## Return code
|Return code|Description|
|---|---|
|**200**|OK|
