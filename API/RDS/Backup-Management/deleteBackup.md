# deleteBackup


## Description
Deletes the RDS instance backup. Only the user-generated backups are allowed to be deleted and the system automatic backups are not allow to be deleted.

## Request method
DELETE

## Request address
https://rds.jdcloud-api.com/0.2.9/regions/{regionId}/backups/{backupId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**backupId**|String|True| |Backup ID|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
None


## Response parameter
None



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
