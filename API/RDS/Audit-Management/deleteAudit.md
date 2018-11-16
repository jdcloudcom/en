# deleteAudit


## Description
Disable Database Audit. After the database audit is disabled, the previously generated audit result files are not deleted immediately. The audit result files will be automatically deleted by the system after the expiration date. The default expiration time is 6 months<br>- Support SQL Server Only

## Request method
DELETE

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/audit

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
None


## Response parameter
None



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
