# modifyFileSystemAttribute


## Description
Modify file system attributes (name or description must be designated)

## Request Method
PATCH

## Request Address
https://cfs.jdcloud-api.com/v1/regions/{regionId}/fileSystems/{fileSystemId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**fileSystemId**|String|True| |File System ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|False| |File System Name (Parameter rules: cannot be null; it supports Chinese, numbers, uppercase and lowercase letters, English underline “_” and line-through “-” only, with 32 characters at most)|
|**description**|String|False| |File System Description (Parameter rules: cannot exceed 256 characters)|


## Return Parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
