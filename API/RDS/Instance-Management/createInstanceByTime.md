# createInstanceByTime


## Description
Create a new instance based on the source instance backup, and recover the data of the new instance to the same status as the data at the specified time point of the source instance by adding new logs. <br>For example, creating an instance B at the time point '2018-06-18 23:00:00' based on instance A means creating an instance B, of which the data is exactly the same as the data of instance A at the time point '2018-06-18 23:00:00'. <br>For the SQL Server, recovery/creation by time point is not supported within 30 minutes after the primary/backup switchover. For example, if the user performs the primary/backup switchover at 10:05, recovery/creation by time point is unavailable during the time period from 10:05 to 10:35.

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:createInstanceByTime

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**restoreTime**|String|True| |Create New Instance Based on Which Time Point of the Source Instance|
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
|**instanceId**|String|Newly Created Instance ID|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
