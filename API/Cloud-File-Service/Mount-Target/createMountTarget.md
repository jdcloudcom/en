# createMountTarget


## Description
- Create an attached target for a file system. Through this attached target, you can attach a file system to VM instances.
- Create an attached target and assign this attached target an Id


## Request Method
POST

## Request Address
https://cfs.jdcloud-api.com/v1/regions/{regionId}/mountTargets

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**fileSystemId**|String|True| |Create a file system of attached target|
|**subnetId**|String|True| |Subnet id|
|**vpcId**|String|True| |vpcId|
|**securityGroupId**|String|True| |Security Group id|
|**clientToken**|String|True| |Idempotence Parameter (support numbers, uppercase and lowercase letters only and cannot exceed 64 characters)|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Result Set|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**mountTargetId**|String|Attached Target ID|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
