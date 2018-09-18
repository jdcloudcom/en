# describeBackups


## Description
View Backup

## Request method
GET

## Request address
https://mongodb.jdcloud-api.com/v1/regions/{regionId}/backups

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**filters**|Filter[]|False||instanceId - Instance ID, Accurate Matching<br>backupId - Backup ID, Accurate Matching<br>|
|**pageNumber**|Integer|False||Page number; default: 1; value range: [1, ∞)|
|**pageSize**|Integer|False||Page size; default: 10; value range: [10,100]|

### <a name="Filter">Filter</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True||Name of filter requirements|
|**operator**|String|False||Operator of filter requirements is eq by default|
|**values**|String[]|True||Value of filter requirements|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**backups**|Backup[]||
|**pageNumber**|Integer||
|**totalCount**|Integer||
### <a name="Backup">Backup</a>
|Name|Type|Description|
|---|---|---|
|**backupEndTime**|String|Backup End Time|
|**backupId**|String|Backup ID|
|**backupMode**|String|Backup Mode, Automated (System Automatic Backup), Manual (Manual Backup)|
|**backupName**|String|Backup Name|
|**backupSizeByte**|Integer|Size of Whole Backup Set, in Byte|
|**backupStartTime**|String|Backup Start Time|
|**backupStatus**|String|Backup Status, Waiting (Waiting), Running (Backing-up), Finished (Finished), Failed (Error)|
|**instanceId**|String|Backup Instance ID|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
