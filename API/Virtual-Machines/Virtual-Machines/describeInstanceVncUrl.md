# describeInstanceVncUrl


## Description
Get the vnc address of a VM to connect and manage the VM.
The vnc address is valid for one hour. If the vnc address is not used within one hour after being obtained, it will become invalid automatically and need to be request again.


## Request method
GET

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/vnc

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceId**|String|True| |VM ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**vncUrl**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
