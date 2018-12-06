# describeBackupSynchronicities


## Description
Search the Cross-Region Backup Synchronization Service List.

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/backupSynchronicities

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Page displaying the data; it is 1 by default, the value range: [1,∞); when the pages exceed total pages, show the last page, for searching the list interface|
|**pageSize**|Integer|False| |The data entries displayed on each page, which is 10 by default, with value range: 10, 20, 30, 50, 100|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**backupSynchronicities**|BackupSynchronicity[]| |
|**totalCount**|Integer| |
### BackupSynchronicity
|Name|Type|Description|
|---|---|---|
|**createTime**|String|Creation Time|
|**destRegion**|String|Backup the synchronized target region|
|**engine**|String|Database Type|
|**engineVersion**|String|Database Version|
|**instanceId**|String|RDS Instance ID|
|**newestDataTime**|String|Latest data time point of cross-region backup|
|**serviceId**|String|Cross-Region Backup Synchronization Service ID|
|**serviceStatus**|String|Cross-region backup synchronization service status, normal, running; Error, error|
|**srcRegion**|String|Source Instance Region|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
