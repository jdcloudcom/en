# describePermissionDetail


## Description
Search policy details

## Request method
GET

## Request address
https://iam.jdcloud-api.com/v1/regions/{regionId}/permission/{permissionId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**permissionId**|Integer|True| |Permission id|
|**regionId**|String|True| |Region ID|

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
|**permission**|Permission|Permission Information|
### Permission
|Name|Type|Description|
|---|---|---|
|**account**|String|Primary Account Pin|
|**content**|String|Permission Content|
|**description**|String|Description|
|**id**|Integer|Permission id|
|**name**|String|Permission Name|
|**permissionDetailList**|PermissionDetail[]|Permission Details|
|**permissionType**|String|Permission Type|
|**version**|String|Permission Version Number|
### PermissionDetail
|Name|Type|Description|
|---|---|---|
|**permission**|String|Permission Type: Read-only-R, Delete-D, Modification-M|
|**resource**|Resource[]|Resource Information|
### Resource
|Name|Type|Description|
|---|---|---|
|**ids**|String[]|Resource id Set, transmission * means that it is valid for all ids|
|**type**|String|Resource Type, Virtual Machine-server, Image-image, Cloud Disk-volume, vpc-vpc, Public Ip-floatingIP, Load Balancer-loadbalance, Cloud Database (mysql)-database, Cloud Cache-cache|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
