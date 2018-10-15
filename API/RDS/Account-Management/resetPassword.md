# resetPassword


## Description
Reset Database Account Password. If the user forgets the password of the account, he/she can use this API to reset the specified account password. After the password is reset, the previous password will not be available and you must log in or connect to the database instance with the new password after the reset.

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/accounts/{accountName}:resetPassword

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**accountName**|String|True| |Account name; in the same instance, the account name cannot be duplicated.|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**accountPassword**|String|True| |New password with specific rules detailed in the Help Center Documentation: [Name and Password Restrictions](../../../documentation/Cloud-Database-and-Cache/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)|


## Response parameter
None



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
