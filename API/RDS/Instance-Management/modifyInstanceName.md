# modifyInstanceName


## Description
Modify the instance name, which may support Chinese, and the specific rules of instance name may refer to the help center document: [name and password restrictions](../../../documentation/Cloud-Database-and-Cache/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)<br>- only support SQL Server

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:modifyInstanceName

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**instanceName**|String|True| |Instance name, which supports Chinese, and the specific rules of instance name may refer to the help center document: [name and password restrictions](../../../documentation/Cloud-Database-and-Cache/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)|


## Return Parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
