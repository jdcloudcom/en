# createBackup


## 描述
Creating a full backup of the RDS instance can be fully backed up for the entire instance or part of the database (SQL Server supports only). At the same time, there is only be one running backup task can work<br>- Support SQL Server only

## 请求方式
POST

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/backups

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**backupSpec**|[BackupSpec](##BackupSpec)|False||Backup Specification|
|**instanceId**|String|False||RDS instance ID can identify an instance uniquely|

### <a name="BackupSpec">BackupSpec</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**backupName**|String|False||Backup name with length up to 64 English characters or Chinese characters of equal length|
|**dbNames**|String[]|False||List of Database Names to Be Backed up. If it is not filled, the whole instance will be backed up<br>- **MySQL: not support the parameter**<br>- **SQL Server: support**|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**backupId**|String|Backup Id|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
