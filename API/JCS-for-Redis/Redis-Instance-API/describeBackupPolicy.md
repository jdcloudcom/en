# describeBackupPolicy


## Description
Search automatic backup policy of Redis instance

## Request Method
GET

## Request Address
https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}/backupPolicy

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of the region where the Redis instance is located. At present, there are three regions, with Region ID of cn-north-1, cn-south-1 and cn-east-2 respectively|
|**cacheInstanceId**|String|True| |Redis instance ID is the only identifier for instance access|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#Result)|Result|
|**requestId**|String|ID of This Request|

### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**backupPeriod**|String|Backup period, including Monday, Tuesday, Wednesday, Thursday, Friday, Saturday and Sunday, separated by commas|
|**backupTime**|String|Backup time, in format of HH:mm-HH:mm time zone, for example, "01:00-02:00 +0800" means 01:00 to 02:00 in UTC/GMT+08:00|
|**nextBackupTime**|String|Time of next automatic backup, UTC time of ISO 8601 standard, in format of YYYY-MM-DDTHH:mm:ssZ~YYYY-MM-DDTHH:mm:ssZ|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
