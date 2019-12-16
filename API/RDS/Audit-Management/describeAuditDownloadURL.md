# describeAuditDownloadURL


## Description
Obtain the download link of a certain audit file, both internal and external links are supported, and the validity time of the link is 24 hours<br>- only support SQL Server

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/audit:describeAuditDownloadURL

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**fileName**|String|True| |Audit File Name|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeAuditDownloadURL#Result)| |

### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**publicURL**|String|Public network download link, and if not downloadable currently, it is an empty string|
|**internalURL**|String|Intranet download link, and if not downloadable currently, it is an empty string|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
