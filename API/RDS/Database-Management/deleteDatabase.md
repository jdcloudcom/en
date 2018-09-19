# deleteDatabase


## Description
Delete the database from the RDS instance. For management and data restoration, RDS controls user permissions. Users can only delete databases through the console or this interface.</br>Sensitive operation, enable <a href="https://www.jdcloud.com/help/detail/3786/isCatalog/1">MFA operation protection</a>

## Request method
DELETE

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/databases/{dbName}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**dbName**|String|True||Database name|
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
