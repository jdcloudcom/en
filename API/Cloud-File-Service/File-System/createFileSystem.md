# createFileSystem


## Description
- Create a new file system and assign this file system an Id


## Request Method
POST

## Request Address
https://cfs.jdcloud-api.com/v1/regions/{regionId}/fileSystems

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |File System Name|
|**description**|String|True| |File System Description|
|**clientToken**|String|True| |Idempotence Parameter (support numbers, uppercase and lowercase letters only and cannot exceed 64 characters)|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Result Set|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**fileSystemId**|String|File System ID|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**429**|Quota exceeded|
|**500**|Internal server error|
|**503**|Service unavailable|
