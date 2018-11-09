# modifyBackupPolicy


## Description
Modify the RDS instance backup policy. Currently only the modification by the user of the “automatic backup start time window” parameter is supported, and other parameters are not open for modification

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:modifyBackupPolicy

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**startWindow**|String|False| |Automatic backup start time window. For instance: 00:00-01:00, representing that the database is backed up automatically from 00:00 to 01:00, and the backup completion time is related to the instance size, which is not certainly within the time range<br>SQL Server: range: 00:00-23:59, with the time range tolerance no less than 30 minutes. <br>MySQL, only the following values are allowed:<br>00:00-01:00<br>01:00-02:00<br>......<br>23:00-24:00|


## Return Parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
