# deleteFileSystem


## Description
-   Delete a file system. Once deleted, this file system will not exist and any contents in the deleted file system cannot be accessed.


## Request Method
DELETE

## Request Address
https://cfs.jdcloud-api.com/v1/regions/{regionId}/fileSystems/{fileSystemId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**fileSystemId**|String|True| |File System ID|

## Request Parameter
None


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
