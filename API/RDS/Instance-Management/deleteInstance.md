# deleteInstance


## Description
Delete an RDS instance or read-only instance of MySQL. MySQL Read-only Instance will also be deleted while deleting the Main MySQL Instance<br>Sensitive Operation, enable<a href="https://docs.jdcloud.com/en/security-operation-protection/operation-protection">MFA Operation Protection</a>

## Request method
DELETE

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|

## Request parameter
None


## Response parameter
None


## Response code
|Return code|Description|
|---|---|
|**200**|OK|
