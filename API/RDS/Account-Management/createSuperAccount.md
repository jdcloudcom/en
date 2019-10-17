# createSuperAccount


## Description
Create a database account, and then users can use the client, applications or others to log in to RDS database instance through this account and password via client, applications, etc. <br>For management and recovery, RDS has restricted accounts, database account can only create, delete and authorize accounts, etc. through Console or OpenAPI, and users cannot take relevant actions to their accounts by the SQL statement.

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/accounts:createSuperAccount

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS Instance ID, the Unique Identifier of One RDS Instance|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**accountName**|String|True| |For Account Name, in the same RDS instance, the Account Name cannot be repeated. See Help Center Document: [Name and Password Restrictions](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md) for specific rules of Account Name|
|**accountPassword**|String|True| |Password, see Help Center Document: [Name and Password Restrictions](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md) for specific rules of Password|


## Return Parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
