# updatePermission


## Description
Modify policy

## Request method
PUT

## Request address
https://iam.jdcloud-api.com/v1/regions/{regionId}/permission/{permissionId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**permissionId**|Integer|True| |Permission id|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**updatePermissionInfo**|UpdatePermissionInfo|True| |Permission Information|

### UpdatePermissionInfo
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**content**|PermissionDetail[]|True| |Permission Details|
|**description**|String|False| |Description, 0~256 characters|
|**name**|String|True| |Permission Name, 1~32 numbers, characters, Chinese characters, line-throughs and underlines|
### PermissionDetail
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**permission**|String|True| |Permission Type: Read-only-R, Delete-D, Modification-M|
|**resource**|Resource[]|True| |Resource Information|
### Resource
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ids**|String[]|True| |Resource id Set, transmission * means that it is valid for all ids|
|**type**|String|True| |Resource Type, Virtual Machine-server, Image-image, Cloud Disk-volume, vpc-vpc, Public Ip-floatingIP, Load Balancer-loadbalance, Cloud Database (mysql)-database, Cloud Cache-cache|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
