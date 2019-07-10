# describeDatabases


## Description
Obtain a list of all database details for the current instance

## Request method
GET

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/databases

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**dbName**|String|False| |Database Name If you do not specify a database name, return all database lists <br> -**MySQL: This field is not supported **<br>- **SQL Server: This field is supported**|
|**pageNumber**|Integer|False| |Pages displaying data, which is 1 by default with value range: [-1,∞).   When pageNumber is 1, return all data page numbers; when exceeding total pages, display the last page;|
|**pageSize**|Integer|False| |Data entries displayed on each page, which 100 by default, with the value range:[10,100], used for searching interfaces of list|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**databases**|Database[]| |
|**totalCount**|Integer| |
### Database
|Name|Type|Description|
|---|---|---|
|**dbName**|String|Database Name, see Help Center Document: [Name and Password Restrictions](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md) for specific rules|
|**dbStatus**|String|Database status, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)<br>- **MySQL: Not support, not return this field**<br>- **SQL Server: return this field**|
|**characterSetName**|String|Character set, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**createTime**|String|Database creation time, with the format: YYYY-MM-DD HH:mm:ss<br>- only support SQL Serverer|
|**accessPrivilege**|DBAccessPrivilege[]|List of Database Related Account Privilege|
### DBAccessPrivilege
|Name|Type|Description|
|---|---|---|
|**accountName**|String|Account Name|
|**privilege**|String|Privilege of account to the database with the specific definition detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
