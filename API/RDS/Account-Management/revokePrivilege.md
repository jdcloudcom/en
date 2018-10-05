# revokePrivilege


## Description
Cancel all permissions of the account to a certain database. After the permissions are canceled, the account will not be able to access the database. Cancel the access permission of the account to a certain database without affecting the access permissions of the account to other databases<br>- only support MySQL

## Request method
POST

## Request address
https://rds.jdcloud-api.com/0.2.9/regions/{regionId}/instances/{instanceId}/accounts/{accountName}:revokePrivilege

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**accountName**|String|True| |Account name; in the same instance, the account name cannot be duplicated.|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**dbNames**|String[]|True| |The Name of the Database of Which the Authorization is Cancelled is Required. After the permissions are canceled, the account will not be able to access the database|


## Response parameter
None



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
