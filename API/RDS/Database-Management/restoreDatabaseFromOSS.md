# restoreDatabaseFromOSS


## Description
Restore a single database from the backup file uploaded to OSS<br> - only support SQL Server

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/databases/{dbName}:restoreDatabaseFromOSS

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**dbName**|String|True| |Database name|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ossURL**|String|True| |The path where the user uploads the backup files to the Object Storage Service OSS. <br>For example, if the bucket uploaded by the user for backup is db_backup, and the file is test_server/db1.bak, then ossULR is db_backup/test_server/db1.bak. <br>**Authorization Description**You need to grant the account ID: 785455908940, read permission to this bucket. Specific steps can be viewed at [Document](https://docs.jdcloud.com/cn/object-storage-service/set-bucket-policy-2).|


## Response parameter
None


## Response code
|Return code|Description|
|---|---|
|**200**|OK|
