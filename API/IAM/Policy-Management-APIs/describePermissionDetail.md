# describePermissionDetail


## Description
Policy details query

## Request method
GET

## Request address
https://iam.jdcloud-api.com/v1/regions/{regionId}/permission/{permissionId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**permissionId**|Integer|True||Permission id error|
|**regionId**|String|True||Region ID|

## Request parameter
None


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**permission**|Permission|Permission information|
### <a name="Permission">Permission</a>
|Name|Type|Description|
|---|---|---|
|**account**|String|Primary account pin|
|**content**|String|Permission content|
|**description**|String|Description|
|**id**|Integer|Permission id error|
|**name**|String|Permission name|
|**permissionDetailList**|PermissionDetail[]|Permission details|
|**permissionType**|String|Permission type|
|**version**|String|Permission revision number|
### <a name="PermissionDetail">PermissionDetail</a>
|Name|Type|Description|
|---|---|---|
|**permission**|String|Permission type: Read-only-R, Delete-D, Modification-M|
|**resource**|Resource[]|Resource information|
### <a name="Resource">Resource</a>
|Name|Type|Description|
|---|---|---|
|**ids**|String[]|Resource id set, transmission * means that it is valid for all ids|
|**type**|String|Resource type, virtual machine-server, Image-image, cloud disk-volume, vpc-vpc, public Ip-floatingIP, load balancer-loadbalance, cloud database (mysql)-database, cloud cache-cache|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
