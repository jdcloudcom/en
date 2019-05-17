# describeInstanceClass


## Description
Search Redis Instance Type List under one region

## Request method
GET

## Request address
https://redis.jdcloud-api.com/v1/regions/{regionId}/instanceClass

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of the region where the Redis instance is located. At present, there are three regions, with Region ID of cn-north-1, cn-south-1 and cn-east-2 respectively|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**redisVersion**|String|False| |Version Number of Redis: At present, Versions 2.8 and 4.0 are provided and Version 2.8 is the default|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**instanceClasses**|InstanceClass[]| |
|**totalCount**|Integer| |
### InstanceClass
|Name|Type|Description|
|---|---|---|
|**instanceClass**|String|Specification code: redis 2.8 and redis 4.0 are different in specification code, and please refer to https://docs.jdcloud.com/en/jcs-for-redis/specifications for details|
|**instanceType**|String|Specification type: master-slave means the master-slave version and cluster means the cluster version|
|**cpu**|Integer|cpu core number|
|**memoryMB**|Integer|Total memory capacity (MB)|
|**diskGB**|Integer|Total disk capacity (GB)|
|**maxConnection**|Integer|Largest Connection Number|
|**bandwidthMbps**|Integer|Intranet Bandwidth (MBps)|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
