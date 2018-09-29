# getAuditOptions


## Description
Get the audit options and corresponding recommended options for the various database versions supported by the current system<br>- Support SQL Server Only

## Request method
POST

## Request address
https://rds.jdcloud-api.com/0.2.9/regions/{regionId}/instances/{instanceId}/audit:getOptions

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True| |Audit option category, **Case Sensitivity**. It currently supports two types: <br>(1) AuditOptions at the beginning: It returns all options supported by each version of SQL Server in the disalbed parameter with supported name of <br>AuditOptions2008R2<br>AuditOptions2012<br>AuditOptions2014<br>AuditOptions2016<br>For example, if the input parameter is 'AuditOptions2016', then it returns all the audit options supported by the SQL Server 2016 version in the disabled field<br>(2)AuditDefault at the beginning: The default option suggested by JD Cloud, which returns the recommended options to be enabled in the enabled parameter, and returns the options not to be enabled in the disabled parameter, with supported name of: <br>AuditDefault2008R2<br>AuditDefault2012<br>AuditDefault2014<br>AuditDefault2016<br>For example, if the input parameter is 'AuditDefault2016', then it returns the audit options recommended by JD Cloud to be enabled in the SQL Server 2016 version in the enabled field, and the options recommended not to be enabled in the disabled field|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**disabled**|String[]| |
|**enabled**|String[]| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
