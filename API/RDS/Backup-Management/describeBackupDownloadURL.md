# describeBackupDownloadURL


## Description
Obtain the download link of the entire backups or  a single file in the backup. <br>- When there is a file name in the input parameter, obtain the download link of the file. <br>- When there is no file name in the input parameter, obtain the download link of the entire backups. <br>Due to the difference of backup mechanism, when using this API to download backups, SQL Server must input the file name, and each file is downloaded one by one. It does not support downloading the entire backup. The file name (excluding the suffix) in the SQL Server backup is the database name of the backup. For example, the file name is my_test_db.bak, indicating that the file is a backup of the my_test_db database. <br>MySQL can download the entire backup set, but does not support the download of a single file. <br>- Support SQL Server Only

## Request method
GET

## Request address
https://rds.jdcloud-api.com/0.2.9/regions/{regionId}/backups/{backupId}/downloadURLs

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**backupId**|String|True| |Backup ID|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**fileName**|String|False| |File name <br>]- MySQL: This parameter is not supported<br>- SQL Server: This parameter must be entered to specify the name of the file in the backup that needs to obtain the download link. The file name in the backup (excluding the suffix) is the database name of the backup. For example, the file name is my_test_db.bak, indicating that the file is a backup of the my_test_db database.|
|**urlExpirationSecond**|String|False| |Specify the expiration time of the download link in seconds. The default is 86400 seconds, which is 24 hours. <br>- MySQL: This parameter is not supported, and it can only be the default value	<br>- SQL Server: Support|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**internalURL**|String|Intranet download link, if download is not available currently, it is an empty string|
|**publicURL**|String|Public network download link, if download is not available currently, it is an empty string|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
