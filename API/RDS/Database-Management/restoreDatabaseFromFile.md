# restoreDatabaseFromFile


## Description
Restore a single database from the backup file uploaded by the user to the cloud through the Cloud on Single Database<br>- only support SQL Server

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/databases/{dbName}:restoreDatabaseFromFile

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**dbName**|String|True| |Database name|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**sharedFileGid**|String|False| |The global ID of the shared file can be obtained from the uploaded file search APIs [describeImportFiles](../Cloud-on-Single-Database/describeImportFiles.md); if such file is not the shared file, it is not required to enter the parameter|
|**fileName**|String|True| |The name of the backup file uploaded by the user (including suffix name of the file ), for example, mydb1.bak|


## Response parameter
None


## Response code
|Return code|Description|
|---|---|
|**200**|OK|
