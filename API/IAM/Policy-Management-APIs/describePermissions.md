# describePermissions


## Description
Search policy list

## Request method
GET

## Request address
https://iam.jdcloud-api.com/v1/regions/{regionId}/permissions

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**keyword**|String|False||Keyword|
|**pageNumber**|Integer|True||Page|
|**pageSize**|Integer|True||Number displayed per page|
|**queryType**|Integer|True||Permission type, 0-All, 1- System Permissions, 2-Customized permission|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**permissions**|[Permission[]](##Permission)|Authority list information|
|**total**|Integer|Total amount|
### <a name="Permission">Permission</a>
|Name|Type|Description|
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
|Name|Type|Description|
|---|---|---|
|**permission**|String|Permission type: Read-only-R, Delete-D, Modification-M|
|**resource**|[Resource[]](##Resource)|Resource information|
### <a name="Resource">Resource</a>
|Name|Type|Description|
|---|---|---|
|**ids**|String[]|Resource id set, transmission * means that it is valid for all ids|
|**type**|String|Resource type, virtual machine-server, Image-image, cloud disk-volume, vpc-vpc, public Ip-floatingIP, load balancer-loadbalance, cloud database (mysql)-database, cloud cache-cache|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
