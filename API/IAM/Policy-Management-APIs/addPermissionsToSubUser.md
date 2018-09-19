# addPermissionsToSubUser


## Description
Associate Policies for Sub-users

## Request method
POST

## Request address
https://iam.jdcloud-api.com/v1/regions/{regionId}/subUser/{subUser}/permisssions

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|
|**subUser**|String|True||Sub-user Name|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**addPermissionsInfo**|AddPermissionsInfo|True||Permission Information|

### AddPermissionsInfo
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**permissionIds**|Integer[]|True||Permissions id Set|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||



## Return code
|Return code|Description|
|---|---|
|**200**|OK|
