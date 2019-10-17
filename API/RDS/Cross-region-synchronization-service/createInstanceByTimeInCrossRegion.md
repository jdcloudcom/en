# createInstanceByTimeInCrossRegion


## Description
Create Instance according to cross-region backup synchronization time point.

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/backupSynchronicities:createInstanceByTimeInCrossRegion

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**restoreTime**|String|True| |Create New Instance Based on Which Time Point of the Source Instance|
|**serviceId**|String|True| |Cross-region Backup Synchronization Service ID|
|**instanceSpec**|RestoredNewDBInstanceSpec|True| |Create Instance Type|

### RestoredNewDBInstanceSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instanceName**|String|False| |Database Instance Name, see [Help Center Document](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md) for restrictions of Name|
|**instanceClass**|String|True| |View document [MySQL Instance Type](../Instance-Specifications/Instance-Specifications-MySQL.md) and [SQL Server Instance Type](../Instance-Specifications/Instance-Specifications-SQLServer.md) for instance type codes|
|**instanceStorageGB**|Integer|True| |Disk Size, Unit: GB|
|**azId**|String[]|True| |Availability Zone ID, the first ID must be Availability Zone where the Main Instance is located. If two Availability Zones share the same, it is required to enter two azIds|
|**vpcId**|String|True| |VPC ID|
|**subnetId**|String|True| |Subnet ID|
|**parameterGroup**|String|False| |Parameter Set ID, system will create a default parameter set by default <br>- only support MySQL|
|**chargeSpec**|ChargeSpec|True| |Billing Specification, including Billing Type, Billing Period, etc.|
|**instanceStorageType**|String|False| |Storage Type, see [Enumeration Parameter Definitions](../Enum-Definitions/Enum-Definitions.md), the default value is: LOCAL_SSD<br>- Only support MySQL|
|**instancePort**|String|False| |Application access port, only support MySQL, Percona, and MariaDB, Default value is 3306|
|**storageEncrypted**|Boolean|False| |Instance Data Encryption (data encryption will be supported only when the storage type is Cloud Disk Service). false: no encryption, true: encryption, the default is false<br> - Only support MySQL|
|**instanceType**|String|False| |Instance Availability Architecture. standalone: single machine, cluster: architecture of master and slave machines, the default is cluster<br>- Only support SQL Server|
### ChargeSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**chargeMode**|String|False|postpaid_by_duration|Billing model value is prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration means Pay-In-Advance, while postpaid_by_usage means Pay-As-You-Go By Consumption; and postpaid_by_duration means pay by configuration and is the default value. Please refer to the help documentation of specific product line to confirm the billing type supported by the production line|
|**chargeUnit**|String|False| |Billing unit of Pay-In-Advance, the Pay-In-Advance is compulsory, which is valid only when chargeMode is prepaid_by_duration, with the values of month and year and the default value of month|
|**chargeDuration**|Integer|False| |Pay-In-Advance billing hours, the Pay-In-Advance is compulsory and is valid only when the value of chargeMode is prepaid_by_duration. When chargeUnit is month, the value shall be: 1~9; when chargeUnit is year, the value shall be: 1, 2 and 3|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**instanceId**|String|Newly Created Instance ID|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
