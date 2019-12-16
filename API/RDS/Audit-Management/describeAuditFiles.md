# describeAuditFiles


## Description
Obtain the list of all the audit result files under the current instance<br>- only support SQL Server

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/audit:describeAuditFiles

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeAuditFiles#Result)| |

### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**auditFiles**|[AuditFile[]](describeAuditFiles#AuditFile)| |
### <a name="AuditFile">AuditFile</a>
|Name|Type|Description|
|---|---|---|
|**name**|String|Audit log file name|
|**sizeByte**|Long|Audit log file size, unit: Byte|
|**lastUpdateTime**|String|Last update time of audit log file|
|**uploadTime**|String|Last upload time of audit log file|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
