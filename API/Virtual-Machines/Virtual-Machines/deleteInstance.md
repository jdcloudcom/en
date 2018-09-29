# deleteInstance


## Description
Delete a single virtual machine that is paid by configuration, or expires in a monthly package. You cannot delete a virtual machine without billing information. <br>
The virtual machine status must be </b>running</b>, </b>stopped<b>, <b>error<b>, and the virtual machine is not in progress to delete. <br>
The virtual machine that has not expired in monthly package cannot be deleted. The white list user cannot delete the virtual machine that has expired in monthly package. <br>
If the data disk attached in the machine is the cloud disk billed by instance type and is not a shared Cloud Disk Service, and the AutoDelete property is true, then the data disk is deleted along with the machine.
</br>Sensitive operation, enable<a href="https://docs.jdcloud.com/IAM/Operation-Protection">MFA operation protection</a>

## Request method
DELETE

## Request address
https://vm.jdcloud-api.com/1.0.3/regions/{regionId}/instances/{instanceId}

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
|**404**|Not Found  |
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
