# describeClusterInfo


## Description
Search internal cluster information of Redis instances

## Request Method
GET

## Request Address
https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}/clusterInfo

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of the region where the Redis instance is located. At present, there are three regions, with Region ID of cn-north-1, cn-south-1 and cn-east-2 respectively|
|**cacheInstanceId**|String|True| |Redis instance ID is the only identifier for instance access|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Result|
|**requestId**|String|ID of This Request|

### Result
|Name|Type|Description|
|---|---|---|
|**info**|ClusterInfo|Internal Cluster Information|
### ClusterInfo
|Name|Type|Description|
|---|---|---|
|**proxies**|Proxy|proxy List|
|**shards**|Shard|shard List|
### Shard
|Name|Type|Description|
|---|---|---|
|**id**|String| |
### Proxy
|Name|Type|Description|
|---|---|---|
|**id**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
