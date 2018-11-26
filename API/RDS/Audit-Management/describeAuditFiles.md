# describeAuditFiles


## Description
Obtain the list of all the audit result files under the current instance<br>- only support SQL Server

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/audit:describeAuditFiles

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**auditFiles**|AuditFile[]| |
### AuditFile
|Name|Type|Description|
|---|---|---|
|**lastUpdateTime**|String|Last update time of audit log file|
|**name**|String|Audit log file name|
|**sizeByte**|Long|Audit log file size, unit: Byte|
|**uploadTime**|String|Last upload time of audit log file|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
