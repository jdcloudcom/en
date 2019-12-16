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
|**instanceId**|String|True| |Source Instance ID|
|**destRegion**|String|True| |Backup the synchronized target region|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](createBackupSynchronicity#Result)| |

### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**serviceId**|String|Cross-Region Backup Synchronization Service ID|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
