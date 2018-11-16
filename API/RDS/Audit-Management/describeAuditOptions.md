# describeAuditOptions


## Description
Obtain the audit option of various database version supported by the current system and the relevant options<br>- only support SQL Server

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/audit:describeAuditOptions

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**name**|String|True| |Audit option category, **case sensitivity**, currently supports two types: <br>(1) AuditOptions begin: return all the options supported by each version of SQL Server in disabled parameters, the name supported is <br>AuditOptions2008R2<br>AuditOptions2012<br>AuditOptions2014<br>AuditOptions2016<br>For instance, enter the parameter “AuditOptions2016”, return all the audit options supported by SQL Server 2016 version in the disabled field<br>(2) Begin with AuditDefault: the default option recommended by JD Cloud, which returns the options recommended to be enabled in enabled parameters and returns the options not to be enabled in disabled parameters, and the supported name is: <br>AuditDefault2008R2<br>AuditDefault2012<br>AuditDefault2014<br>AuditDefault2016<br>For instance, if the entered parameter is “AuditDefault2016”, the audit options recommended to be enabled by JD Cloud in SQL Server 2016 version are returned in the enabled field, and the options recommended not to be enabled are returned in the disabled field|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**disabled**|String[]| |
|**enabled**|String[]| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
