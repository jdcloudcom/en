# describeInstanceVncUrl


## Description
Get the VM vnc for connection management of virtual machines. <br>
The vnc address is valid for 1 hour. If the vnc address is not used within 1 hour after being obtained, it will become invalid automatically and need to be re-acquired again.


## Request method
GET

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/vnc

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |VM ID|
|**regionId**|String|True| |Region ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**vncUrl**|String| |

## Response code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
