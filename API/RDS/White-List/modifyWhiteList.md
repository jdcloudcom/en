# modifyWhiteList


## Description
Modify the IP White List that allows access to the instance. The White List is a list of IP/IP segments that are allowed to access the current instance. By default, the White List is open to the VPC. If the user has enabled the internet access, you need to configure a White List for the IP of the internet.

## Request method
PUT

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/whiteList

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ips**|String|True| |For IP or IP segment, different IP/IP segments shall be separated by commas, for example 0.0.0.0/0,192.168.0.10|


## Response parameter
None



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
