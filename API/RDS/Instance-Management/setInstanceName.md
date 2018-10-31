# setInstanceName


## Description
Modify the instance name to support Chinese. The specific rules for the instance name can be found in the Help Center document: [Name and Password Restrictions] (../../../documentation/Cloud-Database-and-Cache/RDS/Introduction /Restrictions/SQLServer-Restrictions.md)<br>-  Support SQL Server Only

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:setInstanceName

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceName**|String|True| |The instance name, which supports Chinese, and the specific rules for the instance name can be found in the Help Center documentation: [Name and Password Restrictions] (../../../documentation/Cloud-Database-and-Cache/RDS/Introduction/ Restrictions/SQLServer-Restrictions.md)|


## Response parameter
None



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
