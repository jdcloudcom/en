# updatePermission


## Description
Modify policy

## Request Method
PUT

## Request Address
https://iam.jdcloud-api.com/v1/regions/{regionId}/permission/{permissionId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**permissionId**|Integer|True| |Permission id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**updatePermissionInfo**|UpdatePermissionInfo|True| |Permission Information|

### UpdatePermissionInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Permission Name, 1~32 numbers, characters, Chinese characters, line-throughs and underlines|
|**description**|String|False| |Description, 0~256 characters|
|**content**|PermissionDetail[]|True| |Permission Details|
### PermissionDetail
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**permission**|String|True| |Permission Type: Read-only-R, Delete-D, Modification-M|
|**resource**|Resource[]|True| |Resource Information|
### Resource
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ids**|String[]|True| |Resource id Set, transmission * means that it is valid for all ids|
|**type**|String|True| |Resource Type, Virtual Machine-server, Image-image, Cloud Disk-volume, vpc-vpc, Public Ip-floatingIP, Load Balancer-loadbalance, Cloud Database (mysql)-database, Cloud Cache-cache|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
