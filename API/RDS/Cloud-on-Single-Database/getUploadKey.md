# getUploadKey


## Description
Obtain the required key for uploading files from Cloud on Single Database. Cloud on Single Database needs the correct key value to connect to JD Cloud<br>- only support SQL Server

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/importFiles:getUploadKey

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**key**|String|The Key to be used to upload the file|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
