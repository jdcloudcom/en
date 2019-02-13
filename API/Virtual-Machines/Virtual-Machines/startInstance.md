# startInstance


## Description
Start a VM. Only the VM in the status of <b>stopped</b> can be started, and the start operation is only available when there is no task in progress of the VM.<br>
Only the VM with normal billing status can be started.


## Request method
POST

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:startInstance

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceId**|String|True| |VM ID|

## Request parameter
None


## Response parameter
None


## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
