# describeBinlogs


## Description
Obtain the binlog detailed information in MySQL instance<br>- only support MySQL

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/binlogs

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**endTime**|String|False| |Query the end time, with the format as: YYYY-MM-DD HH:mm:ss, the duration from the start time to the end time is no more than three days|
|**pageNumber**|Integer|False| |The page displaying the data, which is 1 by default, with value range: [-1,∞). When the pageNumber is -1, all data pages are returned; when it exceeds the total pages, the last page is displayed.|
|**pageSize**|Integer|False| |The data entries displayed on each page, which is 10 by default, with value range: 10, 20, 30, 50, 100|
|**startTime**|String|False| |Query the start time, with the format as: YYYY-MM-DD HH:mm:ss, the duration from the start time to the end time is no more than three days|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**binlogs**|Binlog[]|Backup Set|
|**totalCount**|Integer|Number of Total Records|
### Binlog
|Name|Type|Description|
|---|---|---|
|**binlogBackupId**|String|binlog log backup ID|
|**binlogEndTime**|String|binlog end time, with the format as: YYYY-MM-DD HH:mm:ss|
|**binlogName**|String|binlog log name|
|**binlogSizeKB**|Long|binlog log size, unitKB|
|**binlogStartTime**|String|binlogStart time, with the format as: YYYY-MM-DD HH:mm:ss|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
