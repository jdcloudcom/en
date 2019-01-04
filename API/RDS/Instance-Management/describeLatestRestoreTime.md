# describeLatestRestoreTime


## Description
When recover/create the obtained SQL Server instances based on the time point, the latest time point can be recovered<br>- Support SQL Serve onlyr

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:describeLatestRestoreTime

|Name|Type|Required or Not|Default Value|Description|
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
|**latestRestoreTime**|String|When recover instances based on the time point, the latest time point can be recovered|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
