# createRole


## Description
Create roles

## Request Method
POST

## Request Address
https://iam.jdcloud-api.com/v1/role


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**createRoleInfo**|CreateRoleInfo|True| |Role Information|

### CreateRoleInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**path**|String|False| |Role Path|
|**roleName**|String|True| |The role name supports 4 to 64-digit letters, numbers as well as - and _, and it must begin with a letter|
|**type**|Integer|True| |Role Type, 3 - Service Role, 4 - User Role|
|**assumeRolePolicyDocument**|String|True| |Role Trust Relationship Policy|
|**description**|String|False| |Description, 0~256 Characters|
|**maxSessionDuration**|Integer|False| |Maximum Session Duration 3,600~43,200s, 3,600s by Default|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**roleInfo**|RoleInfo|Role Information|
### RoleInfo
|Name|Type|Description|
|---|---|---|
|**path**|String|Role Path|
|**roleId**|String|Role ID|
|**roleName**|String|Role Name|
|**type**|Integer|Role Type, 2 - Service-related Role, 3 - Service Role, 4 - User Role|
|**assumeRolePolicyDocument**|String|Trusted Entity Information|
|**description**|String|Description, 0~256 Characters|
|**maxSessionDuration**|Integer|Maximum Session Duration 3,600~43,200s, 3,600s by Default|
|**jrn**|String|JD Cloud Resource Identifier (jrn)|
|**createTime**|String|Role Creation Time|
|**account**|String|Primary Account of Role|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
