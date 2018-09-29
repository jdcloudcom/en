# enableInternetAccess


## Description
Enable the internet access function of the RDS instance. After enabling, users can access RDS instances through the internet

## Request method
POST

## Request address
https://rds.jdcloud-api.com/0.2.9/regions/{regionId}/instances/{instanceId}:enableInternetAccess

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
None


## Response parameter
None



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
