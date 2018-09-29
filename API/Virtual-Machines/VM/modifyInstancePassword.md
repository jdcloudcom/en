# modifyInstancePassword


## Description
Modify the virtual machine password and the machine is not allowed to operate when there is no ongoing task. <br>
The new password will take effect after the VM is rebooted.


## Request method
POST

## Request address
https://vm.jdcloud-api.com/1.0.3/regions/{regionId}/instances/{instanceId}:modifyInstancePassword

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |VM ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**password**|String|True| |Password, <a href = 'https://www.jdcloud.com/help/detail/3870/isCatalog/1'>Refer to the public parameter specification</a>.|


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
