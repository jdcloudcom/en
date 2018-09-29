# addPermissionsToSubUser


## 描述
Associate policies for sub-users

## 请求方式
POST

## 请求地址
https://iam.jdcloud-api.com/v1/regions/{regionId}/subUser/{subUser}/permisssions

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**subUser**|String|True| |Sub-user Name|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**addPermissionsInfo**|AddPermissionsInfo|True| |Permission Information|

### AddPermissionsInfo
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**permissionIds**|Integer[]|True| |Permissions id Set|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |


## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
