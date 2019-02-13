# clearBinlogs


## Description
Clear local binlog and release spaces. The system will only clear binlog backed up to the memory, without any influence to backup recovery of MySQL instances<br>- Support MySQL only

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/binlogs:clearBinlogs

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|

## Request Parameter
None


## Return Parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
