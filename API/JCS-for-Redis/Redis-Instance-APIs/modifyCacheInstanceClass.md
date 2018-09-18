# modifyCacheInstanceClass


## Description
Changing the configuration of the Redis instance can only change the instance configuration in the running status and the specification of the changed configuration cannot be the same as the previous one
Pay-in-advance users, from the cluster version to the principal/subordinate version, the  memory size of the new specification is larger than the old size of the memory size, from the principal/subordinate version to the cluster version, the memory size of the new specification is no less than the memory size of the old specification


## Request method
POST

## Request address
https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}:modifyCacheInstanceClass

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**cacheInstanceId**|String|True||The ID of the Redis instance is the unique identifier to access to instance.|
|**regionId**|String|True||The Region ID of the region where the Redis instance is located. At present, the Redis has North China, South China, and East China regions, and the corresponding Region IDs are cn-north-1, cn-south-1, and cn-east-2|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**cacheInstanceClass**|String|True||The modified Redis type after the change, see: <a href="https://www.jdcloud.com/help/detail/411/isCatalog/1">instance type code</a>|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of This Change Request|
|**result**|Result|The Result Information of This Request.|


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**orderNum**|String|The Order Number of This Change Request.|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
