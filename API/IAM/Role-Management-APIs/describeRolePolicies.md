# describeRolePolicies


## 描述
Query Role Authorization Policy List

## 请求方式
GET

## 请求地址
https://iam.jdcloud-api.com/v1/role/{roleName}/policies

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**roleName**|String|True| |Role Name|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**keyword**|String|False| |Keyword|
|**pageNumber**|Integer|True| |Page|
|**pageSize**|Integer|True| |Number of Roles Displayed on Each Page|
|**sort**|Integer|True| |Ranking Policy, 0-rank in sequential order by create time  1-rank in inverted order by create time|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**policies**|RolePolicy[]|Role Authorization List|
|**total**|Integer|Total Number|
### RolePolicy
|名称|类型|描述|
|---|---|---|
|**description**|String|Description|
|**policyJrn**|String|Permission Resource Description|
|**policyName**|String|Permission Name|
|**type**|String|Permission Type|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
