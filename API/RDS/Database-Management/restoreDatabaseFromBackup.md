# restoreDatabaseFromBackup


## 描述
Restore the single database from backup, and support recovery from backups of other instances (but must be instances under the same account). For example, you can restore from a backup of a database instance in a production environment to a database in a test environment. <br>- Support SQL Server Only

## 请求方式
POST

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/databases/{dbName}:restoreDatabaseFromBackup

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**dbName**|String|True||Database name|
|**instanceId**|String|True||RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True||Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**backupFileName**|String|True||Specify the name of the file in the backup used to restore the database. Normally the file name (excluding the suffix) is the database name of the backup. For example, the file name is my_test_db.bak, indicating that the file is a backup of the my_test_db database.|
|**backupId**|String|True||Backup ID, which can be obtained from the backup query interface, describeBackups|


## 返回参数
|名称|类型|描述|
|---|---|---|



## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
