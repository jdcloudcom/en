# describeRoles


## Description
Query role list

## Request method
GET

## Request address
https://iam.jdcloud-api.com/v1/roles

None

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|True| |Page|
|**pageSize**|Integer|True| |Number of Roles Displayed on Each Page|
|**pathPrefix**|String|False| |Path Prefix|
|**roleNamePrefix**|String|False| |Role Name Prefix|
|**sort**|Integer|True| |Ranking Policy, 0-rank in sequential order by create time  1-rank in inverted order by create time|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**roles**|ListRoleInfo[]|Role List|
|**total**|Integer|Total Number|
### ListRoleInfo
|Name|Type|Description|
|---|---|---|
|**createTime**|String|Role Creation Time|
|**description**|String|Description, 0~1,000 characters|
|**roleName**|String|Role Name|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
