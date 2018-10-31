# describeAccounts


## Description
View all account information in an RDS instance, including the account name, access rights to each database, etc.

## Request method
GET

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/accounts

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**accounts**|Account[]| |
### Account
|Name|Type|Description|
|---|---|---|
|**accountName**|String|Account name with specific rules detailed in the Help Center Documentation: [Name and Password Restrictions](../../../documentation/Cloud-Database-and-Cache/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)|
|**accountPrivileges**|AccountPrivilege[]|Specific Privilege|
|**accountStatus**|String|Account status, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)<br>- **MySQL: Not support, not return this field**<br>- **SQL Server: return this field**|
### AccountPrivilege
|Name|Type|Description|
|---|---|---|
|**dbName**|String|Database name with specific rules detailed in the Help Center Documentation: [Name and Password Restrictions](../../../documentation/Cloud-Database-and-Cache/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)|
|**privilege**|String|Privilege of account to the database with the specific definition detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
