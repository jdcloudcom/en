# deleteInstance


## Description
Delete a single VM that is paid by configuration, or monthly package but expired. You cannot delete a VM without billing information. 

The VM status must be <b>running</b>, <b>stopped</b>, or <b>error</b>, and the deletion is only availabe when there is no task in progress of the VM. <br>
The VM that has not expired in monthly package cannot be deleted. 

If the cloud disks attached to the VM is billed by configuration and the AutoDelete attribute is true, then the data disk will be deleted along with the VM.
</br>Sensitive operation, enable<a href="https://docs.jdcloud.com/IAM/Operation-Protection">MFA operation protection</a>

## Request method
DELETE

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}

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
