# setBackupPolicy


## Description
Modify the RDS instance backup policy. At present, only the user can modify the 'start time window of the automatic backup' parameter and other parameters are not open for modification.

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:setBackupPolicy

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**startWindow**|String|False| |The range of start time window to automatically backup is 00:00-23:59, and the time range difference must not be less than 30 minutes. <br>For example: 00:00-01:00, it means that the database is automatically backed up from 0:00 to 01:00, and the time of backup completion is related to the size of the instance, not necessarily within this time range.|


## Response parameter
None



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
