# grantPrivilege


## Description
Grant the database access privilege to the account, i.e., the privilege the account has to the database. An account can have access to multiple databases. <br>For ease of management, RDS classifies the privileges. Currently, it provides the following two privileges<br>- ro: Read-only privilege, with which, the user can only read the data in the database, and cannot perform creation, insertion, deletion, change, etc. <br>- rw: Read-write privilege, with which, the user can perform addition, deletion, change and other operations on the database<br>-Support SQL Server Only

## Request method
POST

## Request address
https://rds.jdcloud-api.com/0.2.9/regions/{regionId}/instances/{instanceId}/accounts/{accountName}:grantPrivilege

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**accountName**|String|True| |Account name; in the same instance, the account name cannot be duplicated.|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**accountPrivileges**|AccountPrivilege[]|True| |Access Right to the Account|

### AccountPrivilege
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**dbName**|String|False| |Database name with specific rules detailed in the Help Center Documentation: [Name and Password Restrictions](../../../documentation/Cloud-Database-and-Cache/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)|
|**privilege**|String|False| |Privilege of account to the database with the specific definition detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|

## Response parameter
None



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
