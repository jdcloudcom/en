# updateRole


## Description
Modify basic information of the role

## Request method
PUT

## Request address
https://iam.jdcloud-api.com/v1/role/{roleName}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**roleName**|String|True| |Role Name|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**updateRoleInfo**|UpdateRoleInfo|True| |Role Information|

### UpdateRoleInfo
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**description**|String|False| |Description, 0~256 characters|
|**maxSessionDuration**|Integer|False| |Maximum session duration is 3,600~43,200 seconds, 3,600 seconds by default|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
