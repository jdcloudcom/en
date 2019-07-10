# createAudit


## Description
It enables the database audit function of SQL Server and currently supports instance-level database audit. Users can enable and disable the audit function, customize audit policies, and download audit files as needed. The audit file is a native SQL Server audit file and is saved for 6 months by default. <br>- Support SQL Server Only

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/audit

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**enabled**|String|True| |The audit options to be enabled are separated by English commas or Spaces, such as DATABASE_OBJECT_ACCESS_GROUP,ACKUP_RESTORE_GROU<br>The audit option supported by each Database Version can be obtained by API[describeAuditOptions](./describeAuditOptions.md), and see Official Microsoft Document for specific meanings of each audit option|


## Response parameter
None


## Response code
|Return code|Description|
|---|---|
|**200**|OK|
