# getAuditFiles


## Description
Obtain the list of all audit result files under current instance<br>- Support SQL Server Only

## Request method
POST

## Request address
https://rds.jdcloud-api.com/0.2.9/regions/{regionId}/instances/{instanceId}/audit:getAuditFiles

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
|**auditFiles**|AuditFile[]| |
### AuditFile
|Name|Type|Description|
|---|---|---|
|**lastUpdateTime**|String|Audit Log File Last Update Time|
|**name**|String|Audit Log File Name|
|**sizeByte**|Integer|Audit Log File Size, in Bytes|
|**uploadTime**|String|Audit Log File Update Time|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
