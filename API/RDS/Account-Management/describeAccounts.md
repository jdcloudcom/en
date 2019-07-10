# describeAccounts


## Description
View all account information in an RDS instance, including the account name, access rights to each database, etc.

## Request method
GET

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/accounts

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|

## Request parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |The page displaying the data, which is 1 by default, with value range: [-1,∞). When the pageNumber is -1, all data pages are returned; when it exceeds the total pages, the last page is displayed;|
|**pageSize**|Integer|False| |The data entries displayed on each page, which is 100 by default, with the value range: [10,100], which is used for searching interfaces of lists|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**accounts**|Account[]| |
|**totalCount**|Integer| |
### Account
|Name|Type|Description|
|---|---|---|
|**accountName**|String|Account Name, see Help Center Document: [Name and Password Restrictions](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md) for specific rules of Account Name|
|**accountStatus**|String|Account status, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)<br>- **MySQL: Not support, not return this field**<br>- **SQL Server: return this field**|
|**accountPrivileges**|AccountPrivilege[]|Specific Privilege|
### Account
|Name|Type|Description|
|---|---|---|
|**dbName**|String|Database Name, see Help Center Document: [Name and Password Restrictions](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md) for specific rules|
|**privilege**|String|Privilege of account to the database with the specific definition detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
