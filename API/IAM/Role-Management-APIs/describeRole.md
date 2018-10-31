# describeRole


## Description
Query role details

## Request method
GET

## Request address
https://iam.jdcloud-api.com/v1/role/{roleName}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**roleName**|String|True| |Role Name|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**roleInfo**|RoleInfo|Role Information|
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
