# describeBackupDownloadURL


## 描述
Obtain the download link of the entire backups or  a single file in the backup. <br>- When there is a file name in the input parameter, obtain the download link of the file. <br>- When there is no file name in the input parameter, obtain the download link of the entire backups. <br>Due to the difference of backup mechanism, when using this interface to download backups, SQL Server must input the file name, and each file is downloaded one by one. It does not support downloading the entire backup. The file name (excluding the suffix) in the SQL Server backup is the database name of the backup. For example, the file name is my_test_db.bak, indicating that the file is a backup of the my_test_db database. <br>MySQL can download the entire backup set, but does not support the download of a single file. <br>- Support SQL Server Only

## 请求方式
GET

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/backups/{backupId}/downloadURLs

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**backupId**|String|True||Backup ID|
|**regionId**|String|True||Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**fileName**|String|False|||
|**urlExpirationSecond**|String|False||Specify the expiration time of the download link in seconds. The default is 86400 seconds, which is 24 hours. <br>- MySQL: This parameter is not supported, and it can only be the default value	<br>- SQL Server: Support|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**internalURL**|String|Intranet download link, if download is not available currently, it is an empty string|
|**publicURL**|String|Public network download link, if download is not available currently, it is an empty string|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
