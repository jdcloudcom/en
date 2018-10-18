# createInstanceFromBackup


## Description
Creates a new instance based on the full backup of the source instance. The data of the new instance is the same as the data status of the source instance when the backup is created. <br>For example, create a new instance B according to a full backup 'mybak' of source instance A. The backup is created in '2018-8-18 03:23:54'. Then the data status of the new instance B is consistent with the status of the instance A'2018-8-18 03:23:54'<br>- only support MySQL

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances:createInstanceFromBackup

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**backupId**|String|True| |Backup ID|
|**engine**|String|True| |The identifier is an instance of what type is created, such as MySQL, SQL Server, etc. For details, see the document [Enumeration Parameter Definition] (../Enum-Definitions/Enum-Definitions.md)<br>** Note: The engine that backs up the source instance must be the same as the engine of the instance to be created**|
|**instanceSpec**|RestoredNewDBInstanceSpec|True| |New Instance Type Created|

### RestoredNewDBInstanceSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**azId**|String[]|True| |AZ ID, the first ID must be AZ where the primary instance is located. If the two AZs are the same, you also need to enter two azIds.|
|**chargeSpec**|ChargeSpec|True| |Billing specification, including billing type, billing period, etc.|
|**instanceClass**|String|True| |Instance type code, which can be obtained through [describeInstanceClasses](../instance/describeInstanceClasses.md) API|
|**instanceName**|String|False| |Database instance name with restrictions detailed in the [Help Center Documentation](../../../documentation/Cloud-Database-and-Cache/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)|
|**instanceStorageGB**|Integer|True| |Disk Size, Unit: GB|
|**subnetId**|String|True| |Subnet ID|
|**vpcId**|String|True| |VPC ID|
### ChargeSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**chargeDuration**|Integer|False| |Pay-In-Advance billing duration, the Pay-In-Advance is compulsory and valid only when the value of chargeMode is prepaid_by_duration. When chargeUnit is month, the value shall be 1~9; when chargeUnit is year, the value shall be 1, 2 or 3|
|**chargeMode**|String|False|postpaid_by_duration|Billing model value is prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration means Pay-In-Advance, postpaid_by_usage means Pay-As-You-Go By Consumption and postpaid_by_duration means pay by configuration; is postpaid_by_duration by default. Please refer to the Help Documentation of specific product line to confirm the billing type supported by the production line|
|**chargeUnit**|String|False| |Billing unit of Pay-In-Advance, the Pay-In-Advance is compulsory, and valid only when chargeMode is prepaid_by_duration, and the value is month or year and month by default|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**instanceId**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
