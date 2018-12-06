# deleteBackupSynchronicity


## Description
Delete a cross-region backup synchronization service.

## Request Method
DELETE

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/backupSynchronicities/{serviceId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**serviceId**|String|True| |Cross-Region Backup Synchronization Service ID|

## Request Parameter
None


## Return Parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
