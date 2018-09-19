# removePermissionOfSubUser


## Description
Disassociate Policies for Sub-users

## Request method
DELETE

## Request address
https://iam.jdcloud-api.com/v1/regions/{regionId}/subUser/{subUser}/permissions/{permissionId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**permissionId**|Integer|True||Permission id|
|**regionId**|String|True||Region ID|
|**subUser**|String|True||Sub-user Name|

## Request parameter
None


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||



## Return code
|Return code|Description|
|---|---|
|**200**|OK|
