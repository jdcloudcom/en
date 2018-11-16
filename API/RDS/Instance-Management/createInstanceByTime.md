# createInstanceByTime


## Description
Create a new instance based on the source instance backup, and recover the data of the new instance to the same status as the data at the specified time point of the source instance by adding new logs. <br>For example, creating an instance B at the time point '2018-06-18 23:00:00' based on instance A means creating an instance B, of which the data is exactly the same as the data of instance A at the time point '2018-06-18 23:00:00'. <br>For the SQL Server, recovery/creation by time point is not supported within 30 minutes after the primary/backup switchover. For example, if the user performs the primary/backup switchover at 10:05, recovery/creation by time point is unavailable during the time period from 10:05 to 10:35. <br>- only support MySQL

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:createInstanceByTime

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceSpec**|RestoredNewDBInstanceSpec|True| |New Instance Type Created|
|**restoreTime**|String|True| |Create New Instance Based on Which Time Point of the Source Instance|

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
|**instanceId**|String|Newly Created Instance ID|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
