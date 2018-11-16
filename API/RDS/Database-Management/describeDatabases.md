# describeDatabases


## Description
Obtain a list of all database details for the current instance

## Request method
GET

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/databases

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**dbName**|String|False| |Database Name If you do not specify a database name, return all database lists <br> -**MySQL: This field is not supported **<br>- **SQL Server: This field is supported**|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**databases**|Database[]| |
### Database
|Name|Type|Description|
|---|---|---|
|**accessPrivilege**|DBAccessPrivilege[]|List of Database Related Account Privilege|
|**characterSetName**|String|Character set, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**dbName**|String|Database name with specific rules detailed in the Help Center Documentation: [Name and Password Restrictions](../../../documentation/Cloud-Database-and-Cache/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)|
|**dbStatus**|String|Database status, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)- **MySQL: Not support, not return this field**- **SQL Server: return this field**|
### DBAccessPrivilege
|Name|Type|Description|
|---|---|---|
|**accountName**|String|Account Name|
|**privilege**|String|Privilege of account to the database with the specific definition detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
