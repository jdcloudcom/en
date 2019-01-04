# deleteImportFile


## Description
Delete database backup file uploaded by users via the tool of Cloud on Single Database<br>- Support SQL Serve onlyr

## Request Method
DELETE

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/importFiles/{fileName}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**fileName**|String|True| |File Name for Cloud on Single Database|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**sharedFileGid**|String|False| |The global ID of the shared file can be gotten from the uploaded file search APIs describeImportFiles. If such file is not shared, do not enter the field|


## Return Parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
