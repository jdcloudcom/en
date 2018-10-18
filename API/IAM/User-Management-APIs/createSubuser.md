# createSubuser


## Description
Create sub-accounts

## Request method
POST

## Request address
https://iam.jdcloud-api.com/v1/regions/{regionId}/subUser

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**createSubUserInfo**|CreateSubUserInfo|True| |Sub-account Information|

### CreateSubUserInfo
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**createAk**|Boolean|True| |Create accessKey or Not|
|**description**|String|False| |Description, 0~256 characters|
|**email**|String|True| |Email|
|**name**|String|True| |Sub-account User Name, 4-20 numbers, letters, Chinese characters, underlines and line-throughs|
|**password**|String|True| |Password, 6-20 bits, containing at least one letters and at least one number or half-width character|
|**passwordConfirm**|String|True| |Confirm Password|
|**phone**|String|True| |Mobile Number, Area Code-Mobile Number, at present only support 0086-Chinese mobile number|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
