# describeBackups


## Description
Search Redis instance backup result (backup file list), with start time or backup task ID displayed by pages and designated

## Request Method
GET

## Request Address
https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}/backup

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
|**baseId**|String|False| |Backup Task ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#Result)|Result|
|**requestId**|String|ID of This Request|

### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**backups**|[Backup[]](#Backup)|Backup Result (Backup File) List|
|**totalCount**|Integer|Total Backup Results|
### <a name="Backup">Backup</a>
|Name|Type|Description|
|---|---|---|
|**baseId**|String|Backup Operation ID|
|**backupFileName**|String|Backup File Name|
|**cacheInstanceId**|String|Instance ID Corresponding to Backup File|
|**backupStartTime**|String|Backup Start Time (UTC time of ISO 8601 standard, in format of YYYY-MM-DDTHH:mm:ssZ)|
|**backupEndTime**|String|Backup End Time (UTC time of ISO 8601 standard, in format of YYYY-MM-DDTHH:mm:ssZ)|
|**backupType**|Integer|Backup type, 1 means manual backup and 0 means automatic backup|
|**backupSize**|Long|Total byte size of backup file. For instance cluster version, it means the total size of each multi-part backup file|
|**backupStatus**|Integer|Backup task status, 0 refers backup in progress, 1 refers failed and 2 refers succeeds|
|**backupDownloadURL**|String|Backup file download link (abandoned, getting by calling backup file download link API)|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
