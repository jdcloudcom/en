# addPermissionsToSubUser


## Description
Associate policies for sub-users

## Request Method
POST

## Request Address
https://iam.jdcloud-api.com/v1/regions/{regionId}/subUser/{subUser}/permisssions

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**subUser**|String|True| |Sub-user Name|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**addPermissionsInfo**|AddPermissionsInfo|True| |Permission Information|

### AddPermissionsInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**permissionIds**|Integer[]|True| |Permissions id Set|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
