# getBackupPolicy


## 描述
View the backup policy of the RDS instance. The supported backup policies are slightly different depending on the types of database. For details, please refer to the detailed description in the returned parameters<br>- only support SQL Server

## 请求方式
POST

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:getBackupPolicy

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True||RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True||Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**backupBinlog**|String|Whether to back up binlog<br>true: indicates backup<br>false: indicates no backup- <br>**SQL Server does not support**<br>- **MySQL supports**|
|**cycleMode**|Integer|The cyclical pattern of automatic backup<br>1: indicates backup that the daily backup is full<br>2: indicates that the automatic backup is performed in full, incremental, such as the first day is full backup, then the second and third days are incremental backup; the fourth day is full backup, and so on.<br>- **SQL Server supports**<br>- **MySQL does not support **|
|**retentionPeriod**|Integer|The retention period of automatic backup, in days, defaults to 7 days, range is 7-730|
|**startWindow**|String|The range of start time window to automatically backup is 00:00-23:59, and the time range difference must not be less than 30 minutes. <br>For example: 00:00-01:00, it means that the database is automatically backed up from 0:00 to 01:00, and the time of backup completion is related to the size of the instance, not necessarily within this time range.|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
