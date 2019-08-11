# resizeTTY


## Description
Adjust size of TTY


## Request Method
POST

## Request Address
https://nativecontainer.jdcloud-api.com/v1/regions/{regionId}/containers/{containerId}:resizeTTY

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**containerId**|String|True| |Container ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**height**|Integer|True| |tty row|
|**width**|Integer|True| |tty column|
|**execId**|String|False| |exec ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
