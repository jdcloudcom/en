# updateAssumeRolePolicy


## 描述
Modify role built-in policy

## 请求方式
PUT

## 请求地址
https://iam.jdcloud-api.com/v1/role/{roleName}/assumeRolePolicy

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**roleName**|String|True| |Role Name|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**updateAssumeRolePolicyInfo**|UpdateAssumeRolePolicyInfo|True| |Role Permission Information|

### UpdateAssumeRolePolicyInfo
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**assumeRolePolicyDocument**|String|False| |Role Assumption Policy|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |


## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
