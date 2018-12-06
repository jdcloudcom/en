# createBackupSynchronicity


## Description
Create a cross-region backup synchronization service.

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/backupSynchronicities

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**destRegion**|String|True| |Backup the synchronized target region|
|**instanceId**|String|True| |Source Instance ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**serviceId**|String|Cross-Region Backup Synchronization Service ID|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
