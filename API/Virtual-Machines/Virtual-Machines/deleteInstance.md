# deleteInstance


## Description
Delete a single VM that is paid by configuration, or expires in monthly package. You cannot delete a VM without billing information. <br>
The virtual machine status must be </b>running</b>, </b>stopped<b>, or <b>error<b>, and the deletion is only availabe when there is no task in progress for virtual machine. <br>
The virtual machine that has not expired in monthly package cannot be deleted. The white list user cannot delete the virtual machine that has expired in monthly package. <br>
If the data disk attached to the machine is the cloud disk billed by configuration and is not a shared cloud disk, and the AutoDelete attribute is true, then the data disk is deleted along with the machine.
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
