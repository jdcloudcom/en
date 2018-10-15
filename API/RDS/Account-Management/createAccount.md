# createAccount


## Description
Create a database account. The user can use the client, application, etc. to log in to the RDS database instance through the account and password. <br>For ease of management and recovery, RDS restricts accounts. Database accounts can only be created, deleted, and authorized by the console or OpenAPI. Users cannot perform related operations on accounts through SQL statements.

## Request method
POST

## Request address
https://rds.jdcloud-api.com/0.2.9/regions/{regionId}/instances/{instanceId}/accounts

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**accountName**|String|True| |Account name; in the same RDS instance, the account name cannot be duplicated. The specific rules of account name can be seen the Help Center Documentation: [Name and Password Restrictions](../../../documentation/Cloud-Database-and-Cache/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)|
|**accountPassword**|String|True| |Password with specific rules detailed in the Help Center Documentation: [Name and Password Restrictions](../../../documentation/Cloud-Database-and-Cache/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)|


## Response parameter
None



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
