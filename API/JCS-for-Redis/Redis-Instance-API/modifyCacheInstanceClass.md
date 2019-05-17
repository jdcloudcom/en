# modifyCacheInstanceClass


## Description
Change Redis instance type (configuration change), only the running instance type can be changed and the specification shall be different to the original one after change.
Pay-in-advance users, from the cluster version to the principal/subordinate version, the memory size of the new specification is larger than the old size of the memory size, from the principal/subordinate version to the cluster version, the memory size of the new specification is no less than the memory size of the old specification


## Request method
POST

## Request address
https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}:modifyCacheInstanceClass

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of the region where the Redis instance is located. At present, there are three regions, with Region ID of cn-north-1, cn-south-1 and cn-east-2 respectively|
|**cacheInstanceId**|String|True| |Redis instance ID is the only identifier for instance access|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**cacheInstanceClass**|String|True| |Instance Type After Change|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Result|
|**requestId**|String|ID of This Request|

### Result
|Name|Type|Description|
|---|---|---|
|**orderNum**|String|Order Number of This Change Request|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
