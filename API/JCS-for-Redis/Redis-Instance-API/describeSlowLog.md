# describeSlowLog


## Description
Get slog search log of Redis instance

## Request Method
GET

## Request Address
https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}/slowLog

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of the region where the Redis instance is located. At present, there are three regions, with Region ID of cn-north-1, cn-south-1 and cn-east-2 respectively|
|**cacheInstanceId**|String|True| |Redis instance ID is the only identifier for instance access|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Page Number; 1 by Default|
|**pageSize**|Integer|False| |Segmentation size; it is 10 by default; value range[10, 100]|
|**startTime**|String|False| |Start Time|
|**endTime**|String|False| |End Time|
|**shardId**|String|False| |Muti-part id|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#Result)|Result|
|**requestId**|String|ID of This Request|

### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**slowLogs**|[SlowLog[]](#SlowLog)|Slow Search Log List on This Page|
|**totalCount**|Integer|Total Entries of Slow Search Logs|
### <a name="SlowLog">SlowLog</a>
|Name|Type|Description|
|---|---|---|
|**command**|String|Command|
|**startTime**|String|Command execution start time (UTC time of ISO 8601 standard, in format of YYYY-MM-DDTHH:mm:ssZ)|
|**executionTime**|String|Command Execution Duration (With Unit)|
|**shardId**|String|Muti-part id of Execution Command|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
