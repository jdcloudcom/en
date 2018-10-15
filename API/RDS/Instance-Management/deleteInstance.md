# deleteInstance


## Description
Delete an RDS Instance or a read-only instance of MySQL. When the primary instance of MySQL is deleted, the corresponding read-only instance of MySQL is also deleted</br>Sensitive operation, enable <a href="https://www.jdcloud.com/help/detail/3786/isCatalog/1">MFA operation protection</a>

## Request method
DELETE

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True||RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True||Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
None


## Return parameter
|Name|Type|Description|
|---|---|---|



## Return code
|Return code|Description|
|---|---|
|**200**|OK|
