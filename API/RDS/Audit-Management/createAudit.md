# createAudit


## Description
It enables the database audit function of SQL Server and currently supports instance-level database audit. Users can enable and disable the audit function, customize audit policies, and download audit files as needed. The audit file is a native SQL Server audit file and is saved for 6 months by default. <br>- Support SQL Server Only

## Request method
POST

## Request address
https://rds.jdcloud-api.com/0.2.9/regions/{regionId}/instances/{instanceId}/audit

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**enabled**|String|True| |The audit options to be enable shall be separated from each other by a comma or a space, for example: DATABASE_OBJECT_ACCESS_GROUP,ACKUP_RESTORE_GROU, etc. <br>The audit options supported by each database version can be obtained via the API [getAuditOptions](./getAuditOptions.md), and the specific meaning of each audit option can be found in the official document of Microsoft.|


## Response parameter
None



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
