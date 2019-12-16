# createBackup


## Description
Create and execute Redis instance backup instance, which can only be manually backed up. The backup file name can be set

## Request Method
POST

## Request Address
https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}/backup

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of the region where the Redis instance is located. At present, there are three regions, with Region ID of cn-north-1, cn-south-1 and cn-east-2 respectively|
|**cacheInstanceId**|String|True| |Redis instance ID is the only identifier for instance access|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**fileName**|String|True| |Back up file name, and only support the combination of English letters, digits and underline, with the length not exceeding 32 characters|
|**backupType**|Integer|True| |Backup type: The manual backup is 1 and only manual backup is allowed|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#Result)|Result|
|**requestId**|String|ID of This Request|

### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**baseId**|String|This backup task ID can be used for searching result of this backup task|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
