# updatePermission


## 描述
Modify policy

## 请求方式
PUT

## 请求地址
https://iam.jdcloud-api.com/v1/regions/{regionId}/permission/{permissionId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**permissionId**|Integer|True| |Permission id|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**updatePermissionInfo**|UpdatePermissionInfo|True| |Permission Information|

### UpdatePermissionInfo
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**content**|PermissionDetail[]|True| |Permission Details|
|**description**|String|False| |Description, 0~256 characters|
|**name**|String|True| |Permission Name, 1~32 numbers, characters, Chinese characters, line-throughs and underlines|
### PermissionDetail
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**permission**|String|True| |Permission Type: Read-only-R, Delete-D, Modification-M|
|**resource**|Resource[]|True| |Resource Information|
### Resource
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**ids**|String[]|True| |Resource id Set, transmission * means that it is valid for all ids|
|**type**|String|True| |Resource Type, Virtual Machine-server, Image-image, Cloud Disk-volume, vpc-vpc, Public Ip-floatingIP, Load Balancer-loadbalance, Cloud Database (mysql)-database, Cloud Cache-cache|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |


## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
