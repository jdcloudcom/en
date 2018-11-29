# enableAudit


## Description
Only support enabled database audit of MySQL instance

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/audit:enableAudit

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
