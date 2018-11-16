# getAuditDownloadURL


## Description
Obtain the download link of a certain audit file, support both the internal and external links which are valid for 24 hours <br>- Support SQL Server Only

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/audit:getAuditDownloadURL

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**fileName**|String|True| |Audit File Name|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**internalURL**|String|Intranet download link, if download is not available currently, it is an empty string|
|**publicURL**|String|Public network download link, if download is not available currently, it is an empty string|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
