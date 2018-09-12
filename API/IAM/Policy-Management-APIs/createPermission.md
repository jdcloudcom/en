# createPermission


## 描述
Create policy

## 请求方式
POST

## 请求地址
https://iam.jdcloud-api.com/v1/regions/{regionId}/permission

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**createPermissionInfo**|[CreatePermissionInfo](##CreatePermissionInfo)|True||Permission information|

### <a name="CreatePermissionInfo">CreatePermissionInfo</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**content**|[PermissionDetail[]](##PermissionDetail)|True||Permission details|
|**description**|String|False||Description, 0~256 characters|
|**name**|String|True||Permission name, 1~32 numbers, letters, Chinese characters, underlines, underlines and line-throughs|
### <a name="PermissionDetail">PermissionDetail</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**permission**|String|True||Permission type: Read-only-R, Delete-D, Modification-M|
|**resource**|[Resource[]](##Resource)|True||Resource information|
### <a name="Resource">Resource</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**ids**|String[]|True||Resource id set, transmission * means that it is valid for all ids|
|**type**|String|True||Resource type, virtual machine-server, Image-image, cloud disk-volume, vpc-vpc, public Ip-floatingIP, load balancer-loadbalance, cloud database (mysql)-database, cloud cache-cache|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||



## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
