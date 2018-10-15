# createRole


## Description
Create role

## Request method
POST

## Request address
https://iam.jdcloud-api.com/v1/role

None

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**createRoleInfo**|CreateRoleInfo|True| |Role Information|

### CreateRoleInfo
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**assumeRolePolicyDocument**|String|True| |Role Assumption Policy|
|**description**|String|False| |Description, 0~256 characters|
|**maxSessionDuration**|Integer|False| |Maximum session duration is 3,600~43,200 seconds, 3,600 seconds by default|
|**path**|String|False| |Role Path|
|**roleName**|String|True| |Role Name|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**roleInfo**|RoleInfo|Role Information|


### RoleInfo
|Name|Type|Description|
|---|---|---|
|**roleInfo**|RoleInfo| |
### RoleInfo
|Name|Type|Description|
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

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
