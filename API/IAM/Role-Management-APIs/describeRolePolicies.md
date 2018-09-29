# describeRolePolicies


## Description
Query Role Authorization Policy List

## Request method
GET

## Request address
https://iam.jdcloud-api.com/v1/role/{roleName}/policies

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**roleName**|String|True| |Role Name|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**keyword**|String|False| |Keyword|
|**pageNumber**|Integer|True| |Page|
|**pageSize**|Integer|True| |Number of Roles Displayed on Each Page|
|**sort**|Integer|True| |Ranking Policy, 0-rank in sequential order by create time  1-rank in inverted order by create time|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**policies**|RolePolicy[]|Role Authorization List|
|**total**|Integer|Total Number|
### RolePolicy
|Name|Type|Description|
|---|---|---|
|**description**|String|Description|
|**policyJrn**|String|Permission Resource Description|
|**policyName**|String|Permission Name|
|**type**|String|Permission Type|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
