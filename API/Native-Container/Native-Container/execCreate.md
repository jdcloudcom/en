# execCreate


## Description
Create exec


## Request Method
POST

## Request Address
https://nativecontainer.jdcloud-api.com/v1/regions/{regionId}/containers/{containerId}:execCreate

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**containerId**|String|True| |Container ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**command**|String[]|True| |Execute command|
|**tty**|Boolean|False| |Whether to add tty for executing command|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](execcreate#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**execId**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
