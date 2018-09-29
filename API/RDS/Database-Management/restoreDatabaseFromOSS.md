# restoreDatabaseFromOSS


## Description
Restore a single database from the backup file uploaded to OSS<br> - only support SQL Server

## Request method
POST

## Request address
https://rds.jdcloud-api.com/0.2.9/regions/{regionId}/instances/{instanceId}/databases/{dbName}:restoreDatabaseFromOSS

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**dbName**|String|True| |Database name|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ossURL**|String|True| |The inner link of the backup file uploaded by the user to Object Storage Service, OSS|


## Response parameter
None



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
