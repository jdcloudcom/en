# describeMountTargets


## Description
-   Search attached target list.


## Request Method
GET

## Request Address
https://cfs.jdcloud-api.com/v1/regions/{regionId}/mountTargets

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|page; it is 1 by default, the value range: [1,∞)|
|**pageSize**|Integer|False|20|Paging size; it is 20 by default; value range[10, 100]|
|**filters**|Filter[]|False| |fileSystemId - File System ID, Exact Match, Support Multiple<br>mountTargetId - Attached Target ID, Exact Match, Support Multiple<br>|

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
|**mountTargets**|MountTarget[]|Attached Target Information List|
|**totalCount**|Integer|Number of Searched Attached Targets|
### MountTarget
|Name|Type|Description|
|---|---|---|
|**fileSystemId**|String|File System ID|
|**ipAddress**|String|ipv4 Address|
|**status**|String|Attached Target Status|
|**mountTargetId**|String|Attached Target ID|
|**subnetId**|String|Subnet ID|
|**vpcId**|String|vpcID|
|**createTime**|String|Creation Time|
|**dnsName**|String|dns Name|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**500**|Internal server error|
|**503**|Service unavailable|
