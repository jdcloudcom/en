# removePermissionOfSubUser


## Description
Disassociate policies for sub-users

## Request Method
DELETE

## Request Address
https://iam.jdcloud-api.com/v1/regions/{regionId}/subUser/{subUser}/permissions/{permissionId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**permissionId**|Integer|True| |Permission id|
|**subUser**|String|True| |Sub-user Name|

## Request Parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
