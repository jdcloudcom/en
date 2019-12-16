# describeBackupDownloadURL


## Description
Obtain the download link of the entire backups or  a single file in the backup. <br>- When there is a file name in the input parameter, obtain the download link of the file. <br>- When there is no file name in the input parameter, obtain the download link of the entire backups. <br>Due to the difference of backup mechanism, when using this API to download backups, SQL Server must input the file name, and each file is downloaded one by one. It does not support downloading the entire backup. The file name (excluding the suffix) in the SQL Server backup is the database name of the backup. For example, the file name is my_test_db.bak, indicating that the file is a backup of the my_test_db database. <br>MySQL can download the entire backup set, but does not support the download of a single file. <br>- Support SQL Server Only

## Request method
GET

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/backups/{backupId}/downloadURLs

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**backupId**|String|True| |Backup ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**fileName**|String|False| |File name <br>]- MySQL: This parameter is not supported<br>- SQL Server: This parameter must be entered to specify the name of the file in the backup that needs to obtain the download link. The file name in the backup (excluding the suffix) is the database name of the backup. For example, the file name is my_test_db.bak, indicating that the file is a backup of the my_test_db database.|
|**urlExpirationSecond**|String|False| |Designate expiration time of download link, with the unit of second and value range of 1 ~ 86400 seconds; SQL Server is supported; the default value is 86400 seconds. Support MySQL, Percona and MariaDB: The default value is 300 seconds.|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeBackupDownloadURL#Result)| |

### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**publicURL**|String|Public network download link, if download is not available currently, it is an empty string|
|**internalURL**|String|Intranet download link, if download is not available currently, it is an empty string|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
