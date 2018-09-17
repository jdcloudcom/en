# addPermissionsToSubUser


## 描述
Associate policies for sub-users

## 请求方式
POST

## 请求地址
https://iam.jdcloud-api.com/v1/regions/{regionId}/subUser/{subUser}/permisssions

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|
|**subUser**|String|True||Sub-user name|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**addPermissionsInfo**|[AddPermissionsInfo](##AddPermissionsInfo)|True||Permission information|

### <a name="AddPermissionsInfo">AddPermissionsInfo</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**permissionIds**|Integer[]|True||Permissions id set|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||



## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
