# modifyBackupPolicy


## Description
Modify automatic backup policy for Redis instances, with backup period and backup time modifiable

## Request Method
PATCH

## Request Address
https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}/backupPolicy

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of the region where the Redis instance is located. At present, there are three regions, with Region ID of cn-north-1, cn-south-1 and cn-east-2 respectively|
|**cacheInstanceId**|String|True| |Redis instance ID is the only identifier for instance access|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**backupTime**|String|True| |Backup time, in format of HH:mm-HH:mm time zone, for example, "01:00-02:00 +0800" means 01:00 to 02:00 in UTC/GMT+08:00|
|**backupPeriod**|String|True| |Backup period, including Monday, Tuesday, Wednesday, Thursday, Friday, Saturday and Sunday, separated by commas|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of This Request|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
