# stopMonitor


## Description
Stop origin server monitoring. Origin server monitoring related configuration is not supported in the acceleration outside China/on a global scale

## Request mode
POST

## Request address
https://cdn.jdcloud-api.com/v1/domain/{domain}/monitor:stop

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User domain|

## Request parameter
None


## Return parameter
|Name|Type|Description|
|---|---|---|
|**result**|Object| |
|**requestId**|String| |


## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
