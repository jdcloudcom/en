# modifyInstanceSpec


## Description
Instance Expansion, Supports Upgrading the Instance CPU, Memory and Disk. Instance configuration downgrade not supported currently<br>- only support MySQL

## Request method
POST

## Request address
https://rds.jdcloud-api.com/0.2.9/regions/{regionId}/instances/{instanceId}:modifyInstanceSpec

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**newInstanceClass**|String|True| |Instance Type after Expansion|
|**newInstanceStorageGB**|Integer|True| |Instance Disk Size after Expansion|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**orderId**|String|Generated Order Number|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
