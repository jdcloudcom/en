# describeFileSystem


## Description
Search file system details

## Request Method
GET

## Request Address
https://cfs.jdcloud-api.com/v1/regions/{regionId}/fileSystems/{fileSystemId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**fileSystemId**|String|True| |File System ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|File System Information|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**fileSystem**|FileSystem| |
### FileSystem
|Name|Type|Description|
|---|---|---|
|**fileSystemId**|String|File System ID|
|**name**|String|File System Name (Parameter rules: cannot be null; it supports Chinese, numbers, uppercase and lowercase letters, English underline “_” and line-through “-” only, with 32 characters at most)|
|**description**|String|File System Description (Parameter rules: cannot exceed 256 characters)|
|**numberOfMountTargets**|Integer|Number of Attached Targets|
|**sizeByte**|SizeByte|Consumption Unit of File System Most Recently Counted:Byte|
|**status**|String|File System Status (Creating:creating, Available:available, in-use:in-use, Deleting:deleting)|
|**createTime**|String|Creation Time|
|**dnsName**|String|dns Name|
### SizeByte
|Name|Type|Description|
|---|---|---|
|**timestamp**|String|Time Stamp|
|**value**|Integer|File System Consumption Unit:Byte|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
