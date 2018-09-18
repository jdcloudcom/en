# updatePermission


## Description
Modify strategies

## Request method
PUT

## Request address
https://iam.jdcloud-api.com/v1/regions/{regionId}/permission/{permissionId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**permissionId**|Integer|True||Permission id error|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**updatePermissionInfo**|UpdatePermissionInfo|True||Permission information|

### <a name="UpdatePermissionInfo">UpdatePermissionInfo</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**content**|PermissionDetail[]|True||Permission details|
|**description**|String|False||Description, 0~256 characters|
|**name**|String|True||Permission name, 1~32 numbers, characters, Chinese characters, line-throughs and underlines|
### <a name="PermissionDetail">PermissionDetail</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**permission**|String|True||Permission type: Read-only-R, Delete-D, Modification-M|
|**resource**|Resource[]|True||Resource information|
### <a name="Resource">Resource</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ids**|String[]|True||Resource id set, transmission * means that it is valid for all ids|
|**type**|String|True||Resource type, virtual machine-server, Image-image, cloud disk-volume, vpc-vpc, public Ip-floatingIP, load balancer-loadbalance, cloud database (mysql)-database, cloud cache-cache|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||



## Return code
|Return code|Description|
|---|---|
|**200**|OK|
