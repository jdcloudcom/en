# createRole


## 描述
Create role

## 请求方式
POST

## 请求地址
https://iam.jdcloud-api.com/v1/role

无

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**createRoleInfo**|CreateRoleInfo|True| |Role Information|

### CreateRoleInfo
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**assumeRolePolicyDocument**|String|True| |Role Assumption Policy|
|**description**|String|False| |Description, 0~256 characters|
|**maxSessionDuration**|Integer|False| |Maximum session duration is 3,600~43,200 seconds, 3,600 seconds by default|
|**path**|String|False| |Role Path|
|**roleName**|String|True| |Role Name|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**roleInfo**|RoleInfo|Role Information|

### RoleInfo
|名称|类型|描述|
|---|---|---|
|**roleInfo**|RoleInfo| |
### RoleInfo
|名称|类型|描述|
|---|---|---|
|**account**|String|Primary Account of Owner|
|**assumeRolePolicyDocument**|String|Role Assumption Policy|
|**createTime**|String|Role Creation Time|
|**description**|String|Description, 0~256 characters|
|**jrn**|String|Resource Description|
|**maxSessionDuration**|Integer|Maximum session duration is 3,600~43,200 seconds, 3,600 seconds by default|
|**path**|String|Role Path|
|**roleId**|String|Role ID|
|**roleName**|String|Role Name|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
