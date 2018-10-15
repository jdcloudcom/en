# restoreDatabaseFromFile


## Description
Restore a single database from the backup file uploaded by the user to the cloud through the Cloud on Single Database<br>- only support SQL Server

## Request method
POST

## Request address
https://rds.jdcloud-api.com/0.2.9/regions/{regionId}/instances/{instanceId}/databases/{dbName}:restoreDatabaseFromFile

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**dbName**|String|True| |Database name|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**fileName**|String|True| |The name of the backup file uploaded by the user (including suffix name of the file ), for example, mydb1.bak|
|**sharedFileGid**|String|False| |The global ID of the shared file can be obtained from the query API to upload file [describeImportFiles](../import/describeImportFiles.md); if the file is not a shared file, you do not need to enter this parameter|


## Response parameter
None



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
