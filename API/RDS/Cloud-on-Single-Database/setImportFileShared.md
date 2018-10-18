# setImportFileShared


## Description
Set or cancel whether the uploaded file is shared to other instances under the same account. By default, files are only visible and can be imported on the uploaded instance. Other instances are not visible and cannot be imported. If you need this file to be imported on other instances, you can set this file to share<br>- only support SQL Server

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/importFiles/{fileName}:setShared

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**fileName**|String|True| |The File Name of Cloud on Single Database|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**shared**|String|True| |Whether the file is shared<br>true: shared<br>false: not shared|


## Response parameter
None



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
