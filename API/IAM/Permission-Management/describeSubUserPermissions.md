# describeSubUserPermissions


## Description
Search sub-user’s policy list

## Request Method
GET

## Request Address
https://iam.jdcloud-api.com/v1/regions/{regionId}/subUser/{subUser}/permisssions

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**subUser**|String|True| |Sub-user Name|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|True| |Page|
|**pageSize**|Integer|True| |Number of Roles Displayed on Each Page|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**total**|Integer|Total Number|
|**permissions**|Permission[]|Authority List Information|
### Permission
|Name|Type|Description|
|---|---|---|
|**id**|Integer|Permission id|
|**account**|String|Primary Account Pin|
|**name**|String|Permission Name|
|**description**|String|Description|
|**permissionType**|String|Permission Type|
|**version**|String|Permission Version Number|
|**content**|String|Permission Content|
|**permissionDetailList**|PermissionDetail[]|Permission Details|
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

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
