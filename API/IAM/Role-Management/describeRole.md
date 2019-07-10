# describeRole


## Description
Search role details

## Request Method
GET

## Request Address
https://iam.jdcloud-api.com/v1/role/{roleName}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**roleName**|String|True| |Role Name|

## Request Parameter
None


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
