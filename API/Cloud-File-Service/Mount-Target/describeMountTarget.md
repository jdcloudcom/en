# describeMountTarget


## Description
Search attached target details

## Request Method
GET

## Request Address
https://cfs.jdcloud-api.com/v1/regions/{regionId}/mountTargets/{mountTargetId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**mountTargetId**|String|True| |Attached Target ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Attached Target Information|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**mountTarget**|MountTarget| |
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
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
