# restoreDatabaseFromBackup


## Description
Restore the single database from backup, and support recovery from backups of other instances (but must be instances under the same account). For example, you can restore from a backup of a database instance in a production environment to a database in a test environment. <br>- Support SQL Server Only

## Request method
POST

## Request address
https://rds.jdcloud-api.com/0.2.9/regions/{regionId}/instances/{instanceId}/databases/{dbName}:restoreDatabaseFromBackup

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**dbName**|String|True| |Database name|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**backupFileName**|String|True| |Specify the name of the file in the backup used to restore the database. Normally the file name (excluding the suffix) is the database name of the backup. For example, the file name is my_test_db.bak, indicating that the file is a backup of the my_test_db database.|
|**backupId**|String|True| |Backup ID, which can be obtained from the backup query API, describeBackups|


## Response parameter
None



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
