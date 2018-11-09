# describeInstances


## Description
Obtain the summary information about all RDS instances and MySQL read-only instances under the current account, such as instance type family, version, billing information, etc.

## Request method
GET

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Display the page number of the data. The default is 1 and the value range is [-1, ∞). When pageNumber is -1, return all data page numbers; when the total number of pages is exceeded, display the last page;|
|**pageSize**|Integer|False| |The number of data displayed per page is 100 by default and the value range is [10,100], which is used for the API to query the list|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**dbInstances**|DBInstance[]| |
|**totalCount**|Integer| |
### DBInstance
|Name|Type|Description|
|---|---|---|
|**azId**|String[]|AZ ID, the first is AZ for the primary instance, which is detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**charge**|Charge|Billing Configuration|
|**createTime**|String|Instance Creation Time|
|**engine**|String|Instance engine type, such as MySQL or SQL Server, etc., detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**engineVersion**|String|Instance engine version, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**instanceId**|String|Instance ID|
|**instanceName**|String|Instance name with specific rules detailed in the Help Center Documentation: [Name and Password Restrictions](../../../documentation/Cloud-Database-and-Cache/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)|
|**instanceStatus**|String|Instance status, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**instanceType**|String|Instance category, such as primary instances, read-only instances, etc., detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**regionId**|String|Region ID, detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
### Charge
|Name|Type|Description|
|---|---|---|
|**chargeExpiredTime**|String|Expiration Time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeMode**|String|Payment Model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
|**chargeRetireTime**|String|The Expected Release Time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStatus**|String|Cost Payment Status, the value is respectively normal, overdue and arrear.|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
