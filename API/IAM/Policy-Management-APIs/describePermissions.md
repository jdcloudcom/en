# describePermissions


## 描述
Search policy list

## 请求方式
GET

## 请求地址
https://iam.jdcloud-api.com/v1/regions/{regionId}/permissions

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**keyword**|String|False| |Keyword|
|**pageNumber**|Integer|True| |Page|
|**pageSize**|Integer|True| |Number of Roles Displayed on Each Page|
|**queryType**|Integer|True| |Permission Type, 0-All, 1- System Permission, 2-Customized Permission|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**permissions**|Permission[]|Authority List Information|
|**total**|Integer|Total Number|
### Permission
|名称|类型|描述|
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
|名称|类型|描述|
|---|---|---|
|**permission**|String|Permission Type: Read-only-R, Delete-D, Modification-M|
|**resource**|Resource[]|Resource Information|
### Resource
|名称|类型|描述|
|---|---|---|
|**ids**|String[]|Resource id Set, transmission * means that it is valid for all ids|
|**type**|String|Resource Type, Virtual Machine-server, Image-image, Cloud Disk-volume, vpc-vpc, Public Ip-floatingIP, Load Balancer-loadbalance, Cloud Database (mysql)-database, Cloud Cache-cache|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
