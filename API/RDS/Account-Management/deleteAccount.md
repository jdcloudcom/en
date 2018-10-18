# deleteAccount


## Description
Delete the database account. After the account is deleted, it cannot be restored and the user cannot use this account to log in the RDS instance.

## Request method
DELETE

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/accounts/{accountName}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**accountName**|String|True| |Account name; in the same instance, the account name cannot be duplicated.|
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
