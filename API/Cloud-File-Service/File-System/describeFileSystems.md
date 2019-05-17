# describeFileSystems


## Description
-   Search file system list.
-   Logic and (AND) are among multiple filter conditions of filters and logic and (OR) are multiple values inside each condition


## Request Method
GET

## Request Address
https://cfs.jdcloud-api.com/v1/regions/{regionId}/fileSystems

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|page; it is 1 by default, the value range: [1,∞)|
|**pageSize**|Integer|False|20|Paging size; it is 20 by default; value range[10, 100]|
|**filters**|Filter[]|False| |fileSystemId - File System ID, Exact Match, Support Multiple <br>name - File System Name, Fuzzy Match, Support Single<br>status - File System Status, Exact Match, Support Multiple FileSystem Status/creating, available, in-use<br>|

### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Search Result Set|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**fileSystems**|FileSystem[]|File System Information List|
|**totalCount**|Integer|Number of Searched File Systems|
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
|**500**|Internal server error|
|**503**|Service unavailable|
