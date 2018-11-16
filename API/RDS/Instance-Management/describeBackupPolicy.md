# describeBackupPolicy


## Description
View RDS instance backup policy. The supported backup policies differ based on different database type. See the detailed instructions in return parameters

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:describeBackupPolicy

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
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
|**backupBinlog**|String|Backup binlog or not<br>true: represents backup<br>false: represents not backup<br> - **SQL Server does not support**<br>- **supported by MySQL**|
|**cycleMode**|Integer|Automatic backup loop mode<br>1: represents full backup every day<br>2: represents automatic backup in the full, increment, increment mode, such as full backup for the first day, increment backup for the second and third day; full backup again for the fourth day by analogy.<br>- **supported by SQL Server**<br>- **not supported by MySQL**|
|**retentionPeriod**|Integer|Automatic backup reservation period, unit: days, the default is 7 days, with the range of 7-730|
|**startWindow**|String|Automatic backup start time window, with the range of 00:00-23:59, with the time range tolerance shall not be less than 30 minutes. <br>For instance: 00:00-01:00, representing that the database is backed up automatically from 00:00 to 01:00, and the backup completion time is related to the instance size, which is not certainly within the time range|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
