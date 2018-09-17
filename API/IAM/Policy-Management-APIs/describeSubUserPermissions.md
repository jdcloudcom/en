# describeSubUserPermissions


## 描述
Search sub-user’s policy list

## 请求方式
GET

## 请求地址
https://iam.jdcloud-api.com/v1/regions/{regionId}/subUser/{subUser}/permisssions

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|
|**subUser**|String|True||Sub-user name|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**pageNumber**|Integer|True||Page|
|**pageSize**|Integer|True||Number displayed per page|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**permissions**|[Permission[]](##Permission)|Authority list information|
|**total**|Integer|Total amount|
### <a name="Permission">Permission</a>
|名称|类型|描述|
|---|---|---|
|**account**|String|Primary account pin|
|**content**|String|Permission content|
|**description**|String|Description|
|**id**|Integer|Permission id error|
|**name**|String|Permission name|
|**permissionDetailList**|[PermissionDetail[]](##PermissionDetail)|Permission details|
|**permissionType**|String|Permission type|
|**version**|String|Permission revision number|
### <a name="PermissionDetail">PermissionDetail</a>
|名称|类型|描述|
|---|---|---|
|**permission**|String|Permission type: Read-only-R, Delete-D, Modification-M|
|**resource**|[Resource[]](##Resource)|Resource information|
### <a name="Resource">Resource</a>
|名称|类型|描述|
|---|---|---|
|**ids**|String[]|Resource id set, transmission * means that it is valid for all ids|
|**type**|String|Resource type, virtual machine-server, Image-image, cloud disk-volume, vpc-vpc, public Ip-floatingIP, load balancer-loadbalance, cloud database (mysql)-database, cloud cache-cache|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
