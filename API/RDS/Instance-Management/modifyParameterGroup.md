# modifyParameterGroup


## Description
Modify RDS instance<br>- Only support MySQL

## Request Method
PUT

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:modifyParameterGroup

|Name|Type|Required or not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md) for value range|
|**instanceId**|String|True| |RDS instance ID, which identifies a RDS instance uniquely|

## Request Parameters
|Name|Type|Required or not|Default Value|Description|
|---|---|---|---|---|
|**parameterGroupId**|String|True| |Parameter Group ID|


## Returned Parameters
None


## Return Code
|Return Code|Descripton|
|---|---|
|**200**|OK|
