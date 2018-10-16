# startInstance


## Description
Start a VM. 

Only the VM in the status of <b>stopped</b> can be started, and the start operation is only available when there is no task in progress of the VM. 

Only the VM with normal billing status can be started and if the VM in the status of stopped due to arrearage or expiration it can not be started.


## Request method
POST

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:startInstance

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |VM ID|
|**regionId**|String|True| |Region ID|

## Request parameter
None


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

