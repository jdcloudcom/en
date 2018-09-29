# updateRole


## 描述
Modify basic information of the role

## 请求方式
PUT

## 请求地址
https://iam.jdcloud-api.com/v1/role/{roleName}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**roleName**|String|True| |Role Name|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**updateRoleInfo**|UpdateRoleInfo|True| |Role Information|

### UpdateRoleInfo
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**description**|String|False| |Description, 0~256 characters|
|**maxSessionDuration**|Integer|False| |Maximum session duration is 3,600~43,200 seconds, 3,600 seconds by default|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |


## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
