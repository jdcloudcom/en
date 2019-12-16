# describeBinlogDownloadURL


## Description
Obtain the binlog download link of MySQL instance<br>- Only support MySQL, Percona and MariaDB

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/binlogs/{binlogBackupId}:describeBinlogDownloadURL

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|
|**binlogBackupId**|String|True| |Backup ID of binlog, which may be obtained through describeBinlogs|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**seconds**|Integer|False| |Set an expiration time to link address, the unit is second, the default value is 300 seconds, and the maximum time cannot exceed the value range of 1 ~ 86400 seconds|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeBinlogDownloadURL#Result)| |

### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**publicURL**|String|Public network download link|
|**internalURL**|String|Intranet download link|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
