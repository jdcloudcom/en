# describeRoles


## 描述
Query role list

## 请求方式
GET

## 请求地址
https://iam.jdcloud-api.com/v1/roles

无

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**pageNumber**|Integer|True| |Page|
|**pageSize**|Integer|True| |Number of Roles Displayed on Each Page|
|**pathPrefix**|String|False| |Path Prefix|
|**roleNamePrefix**|String|False| |Role Name Prefix|
|**sort**|Integer|True| |Ranking Policy, 0-rank in sequential order by create time  1-rank in inverted order by create time|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**roles**|ListRoleInfo[]|Role List|
|**total**|Integer|Total Number|
### ListRoleInfo
|名称|类型|描述|
|---|---|---|
|**createTime**|String|Role Creation Time|
|**description**|String|Description, 0~1,000 characters|
|**roleName**|String|Role Name|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
