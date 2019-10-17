# updateLogDownloadURLInternal


## Description
Set a download link expiration time to log file, and refresh to generate a log file download link to PostgreSQL

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/log/{logId}:updateLogDownloadURLInternal

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS Instance ID, the Unique Identifier of One RDS Instance|
|**logId**|String|True| |Log File ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**seconds**|Integer|True| |Set an expiration time to link address, unit: Second, the maximum time cannot exceed the value range of 1 ~ 86400 seconds|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**publicURL**|String|Public network download link|
|**internalURL**|String|Intranet download link|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
