# describeRole


## 描述
Query role details

## 请求方式
GET

## 请求地址
https://iam.jdcloud-api.com/v1/role/{roleName}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**roleName**|String|True| |Role Name|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**roleInfo**|RoleInfo|Role Information|
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
