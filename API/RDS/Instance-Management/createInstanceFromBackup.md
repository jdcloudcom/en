# createInstanceFromBackup


## Description
Creates a new instance based on the full backup of the source instance. The data of the new instance is the same as the data status of the source instance when the backup is created. <br>For example, create a new instance B according to a full backup 'mybak' of source instance A. The backup is created in '2018-8-18 03:23:54'. Then the data status of the new instance B is consistent with the status of the instance A'2018-8-18 03:23:54'

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
|**engine**|String|True| |The identifier is an instance of what type is created, such as MySQL, SQL Server, etc. For details, see the document [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)<br>** Note: The engine that backs up the source instance must be the same as the engine of the instance to be created**|
|**instanceSpec**|RestoredNewDBInstanceSpec|True| |New Instance Type Created|

### RestoredNewDBInstanceSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceName**|String|False| |Database Instance Name, see [Help Center Document](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md) for restrictions of Name|
|**instanceClass**|String|True| |View document [MySQL instance type](../Instance-Specifications/Instance-Specifications-MySQL.md) and [SQL Server instance type](../Instance-Specifications/Instance-Specifications-SQLServer.md) for instance type code|
|**instanceStorageGB**|Integer|True| |Disk Size, Unit: GB|
|**azId**|String[]|True| |AZ ID, the first ID must be AZ where the primary instance is located. If the two AZs are the same, you also need to enter two azIds.|
|**vpcId**|String|True| |VPC ID|
|**subnetId**|String|True| |Subnet ID|
|**parameterGroup**|String|False| |Parameter Set ID, system will create a default parameter set by default <br>- only support MySQL|
|**chargeSpec**|ChargeSpec|True| |Billing specification, including billing type, billing period, etc.|
|**instanceStorageType**|String|False| |Storage Type, see [Enumeration Parameter Definitions](../Enum-Definitions/Enum-Definitions.md), the default value is: LOCAL_SSD<br>- Only support MySQL|
|**instancePort**|String|False| |Application access port, only support MySQL, Percona, and MariaDB, Default value is 3306|
|**storageEncrypted**|Boolean|False| |Instance Data Encryption (data encryption will be supported only when the storage type is Cloud Disk Service). false: no encryption, true: encryption, the default is false<br> - Only support MySQL|
|**instanceType**|String|False| |Instance Availability Architecture. standalone: single machine, cluster: architecture of master and slave machines, the default is cluster<br>- Only support SQL Server|
### ChargeSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**chargeMode**|String|False|postpaid_by_duration|Billing model value is prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration means Pay-In-Advance, postpaid_by_usage means Pay-As-You-Go By Consumption and postpaid_by_duration means pay by configuration; is postpaid_by_duration by default. Please refer to the Help Documentation of specific product line to confirm the billing type supported by the production line|
|**chargeUnit**|String|False| |Billing unit of Pay-In-Advance, the Pay-In-Advance is compulsory, and valid only when chargeMode is prepaid_by_duration, and the value is month or year and month by default|
|**chargeDuration**|Integer|False| |Pay-In-Advance billing duration, the Pay-In-Advance is compulsory and valid only when the value of chargeMode is prepaid_by_duration. When chargeUnit is month, the value shall be 1~9; when chargeUnit is year, the value shall be 1, 2 or 3|

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
