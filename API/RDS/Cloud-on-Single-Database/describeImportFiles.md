# describeImportFiles


## Description
Obtain the list of files uploaded by the user to the instance through Cloud on Single Database<br>- only support SQL Server

## Request method
GET

## Request address
https://rds.jdcloud-api.com/0.2.9/regions/{regionId}/instances/{instanceId}/importFiles

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
|**importFiles**|ImportFile[]|Collection of Imported Files|
### ImportFile
|Name|Type|Description|
|---|---|---|
|**isLocal**|String|Whether it belongs to the current instance. <br> 1: Current instance; <br>0: It does not belong to current instance, and is a shared file|
|**name**|String|File Name|
|**sharedFileGid**|String|If the file is a shared file, it has a global ID, and it is empty if it is not a shared file. This global ID is needed when the file is deleted.|
|**sizeByte**|Integer|File Size, Unit: Byte|
|**uploadTime**|String|File upload completion time, format: YYYY-MM-DD HH:mm:ss|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
