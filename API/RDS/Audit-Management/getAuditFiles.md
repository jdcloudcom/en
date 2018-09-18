# getAuditFiles


## Description
Obtain the list of all audit result files under current instance<br>- Support SQL Server Only

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/audit:getAuditFiles

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True||RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True||Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
None


## Return parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**auditFiles**|AuditFile[]||
### <a name="AuditFile">AuditFile</a>
|Name|Type|Description|
|---|---|---|
|**lastUpdateTime**|String|Audit Log File Last Update Time|
|**name**|String|Audit Log File Name|
|**sizeByte**|Integer|Audit Log File Size, in Bytes|
|**uploadTime**|String|Audit Log File Update Time|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
