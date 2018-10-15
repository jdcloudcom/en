# createDatabase


## Description
Create a Database. For instance management and data restoration, RDS restricts user permissions, and users can only create databases through the console or this API.

## Request method
POST

## Request address
https://rds.jdcloud-api.com/0.2.9/regions/{regionId}/instances/{instanceId}/databases

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**characterSetName**|String|True| |About the character set name of the database and the currently supported character set, please see[Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**dbName**|String|True| |About database name and database name restrictions, please refer to[Help Center Documentation](../../../documentation/Cloud-Database-and-Cache/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)|


## Response parameter
None



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
