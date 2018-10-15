# createInstance


## Description
Create an RDS instance and the user can use the corresponding database client or application to link to the RDS instance through the domain name and port to operate.

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceSpec**|DBInstanceSpec|True||New Instance Type Created|

### <a name="DBInstanceSpec">DBInstanceSpec</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**azId**|String[]|True||AZ ID, the first ID must be AZ where the primary instance is located. If the two AZs are the same, you also need to enter two azIds.|
|**chargeSpec**|ChargeSpec|True||Billing specification, including billing type, billing period, etc.|
|**engine**|String|True||Instance engine type, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**engineVersion**|String|True||Instance engine version, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**instanceClass**|String|True||Instance type code, which can be obtained through [describeInstanceClasses](../instance/describeInstanceClasses.md) interface|
|**instanceName**|String|False||Instance name with specific rules detailed in the Help Center Documentation: [Name and Password Restrictions](../../../documentation/Cloud-Database-and-Cache/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)|
|**instanceStorageGB**|Integer|True||Disk Size, in GB|
|**subnetId**|String|True||Subnet ID|
|**vpcId**|String|True||VPC ID|
### <a name="ChargeSpec">ChargeSpec</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**chargeDuration**|Integer|False||Pay-In-Advance billing duration, the Pay-In-Advance is compulsory and valid only when the value of chargeMode is prepaid_by_duration. When chargeUnit is month, the value shall be 1~9; when chargeUnit is year, the value shall be 1, 2 or 3|
|**chargeMode**|String|False|postpaid_by_duration|Billing model value is prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration means Pay-In-Advance, postpaid_by_usage means Pay-As-You-Go By Consumption and postpaid_by_duration means pay by configuration; is postpaid_by_duration by default. Please refer to the Help Documentation of specific product line to confirm the billing type supported by the production line|
|**chargeUnit**|String|False||Billing unit of Pay-In-Advance, the Pay-In-Advance is compulsory, and valid only when chargeMode is prepaid_by_duration, and the value is month or year and month by default|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**instanceId**|String||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
