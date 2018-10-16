# modifyInstanceAttribute


## Description
Modify partial information of a VM, including name and description.


## Request method
POST

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:modifyInstanceAttribute

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |VM ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**description**|String|False| |Description, <a href="http://docs.jdcloud.com/virtual-machines/api/general_parameters">Refer to the public parameter specification</a>.|
|**name**|String|False| |Name, <a href="http://docs.jdcloud.com/virtual-machines/api/general_parameters">Refer to the public parameter specification </a>.|


## Response parameter
None


## Response code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
