# createSubUser


## Description
Create sub-user

## Request Method
POST

## Request Address
https://iam.jdcloud-api.com/v1/subUser


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**createSubUserInfo**|CreateSubUserInfo|True| |Sub-user Information|

### CreateSubUserInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Sub-user Name: It supports 4 to 20-digit letters, numbers as well as - and _, and it must begin with a letter|
|**description**|String|False| |Description, 0~256 characters|
|**password**|String|True| |8 to 20 digits are set by default, based on the password policy setting, and at least one lowercase letter, uppercase letter and number are contained|
|**phone**|String|True| |Mobile phone number, area code-mobile phone number|
|**email**|String|True| |Email|
|**createAk**|Boolean|False| |Create accessKey or not, false by default|
|**needResetPassword**|Boolean|False| |Whether the sub-user needs to reset password on first login, false by default|
|**consoleLogin**|Boolean|False| |Whether the sub-user supports Console login or not, true by default|
|**autoGeneratePassword**|Boolean|False| |Whether the password is automatically generated or not, false by default|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**subUser**|CreateSubUserRes| |
### CreateSubUserRes
|Name|Type|Description|
|---|---|---|
|**name**|String|User Name|
|**password**|String|Password|
|**email**|String|Email|
|**accessKey**|String|accessKey|
|**secretAccessKey**|String|AccessKey secret|
|**createTime**|String|Creation Time|
|**updateTime**|String|Update Time|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
