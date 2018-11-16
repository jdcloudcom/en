# describeBinlogDownloadURL


## Description
Obtain the binlog download link of MySQL instance<br>- only support MySQL

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/binlogs/{binlogBackupId}:describeBinlogDownloadURL

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**binlogBackupId**|String|True| |Backup ID of binlog, which may be obtained through describeBinlogs|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**internalURL**|String|Intranet download link|
|**publicURL**|String|Public network download link|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
