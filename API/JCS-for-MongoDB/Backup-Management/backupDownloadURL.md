# backupDownloadURL


## Description
Get Backup Download Link

## Request method
GET

## Request address
https://mongodb.jdcloud-api.com/v1/regions/{regionId}/backups/{backupId}/downloadURL

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**backupId**|String|True||backup ID|
|**regionId**|String|True||Region ID|

## Request parameter
无


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**backupDownloadURL**|[BackupDownloadURL](##BackupDownloadURL)||
### <a name="BackupDownloadURL">BackupDownloadURL</a>
|Name|Type|Description|
|---|---|---|
|**backupInternetDownloadURL**|String|Address of Public Network Download Link|
|**backupIntranetDownloadURL**|String|Address of Intranet Download Link|
|**backupName**|String|Backup Name|
|**linkExpiredTime**|String|Expiration Time of Public Network and Intranet Download Link|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
