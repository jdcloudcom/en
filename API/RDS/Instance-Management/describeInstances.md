# describeInstances


## Description
Obtain the summary information about all RDS instances and MySQL read-only instances under the current account, such as instance type family, version, billing information, etc.

## Request method
GET

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Display the page number of the data. The default is 1 and the value range is [-1, ∞). When pageNumber is -1, return all data page numbers; when the total number of pages is exceeded, display the last page;|
|**pageSize**|Integer|False| |The number of data displayed per page is 100 by default and the value range is [10,100], which is used for the API to query the list|
|**filters**|Filter[]|False| |Filtering parameters, the relationship among multiple filtering parameters is "and" (and) <br>, supporting filtering with the following attributes: <br>instanceId, support operator option: eq<br>instanceName, support operator option: eq<br>engine, support operator option: eq<br>engineVersion, support operator option: eq<br>instanceStatus, support operator option: eq<br>chargeMode, support operator option: eq<br>vpcId, support operator option: eq<br>|
|**tagFilters**|TagFilter[]|False| |Resource Tag|

### TagFilter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**key**|String|True| |Tag Key|
|**values**|String[]|True| |Tag Value|
### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

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
|**instanceId**|String|Instance ID|
|**instanceName**|String|Instance Name, see Help Center Document [Name and Password Restrictions](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md) for specific rules|
|**instanceType**|String|Instance category, such as primary instances, read-only instances, etc., detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**engine**|String|Instance engine type, such as MySQL or SQL Server, etc., detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**engineVersion**|String|Instance engine version, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**instanceClass**|String|Instance Type Code|
|**instanceStorageGB**|Integer|Disk, Unit: GB|
|**instanceCPU**|Integer|CPU Core Number|
|**instanceMemoryMB**|Integer|Memory, Unit: MB|
|**regionId**|String|Region ID, detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**azId**|String[]|AZ ID, the first is AZ for the primary instance, which is detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**vpcId**|String|VPC ID|
|**subnetId**|String|Subnet ID|
|**instanceStatus**|String|Instance status, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**createTime**|String|Instance Creation Time|
|**backupSynchronicity**|BackupSynchronicityAbstract[]|Instance Cross-region Backup Service enables relevant information|
|**charge**|Charge|Billing Configuration|
|**tags**|Tag[]|Tag Information|
|**sourceInstanceId**|String|Main Instance ID Corresponded To MySQL Read-only Instance|
### Tag
|Name|Type|Description|
|---|---|---|
|**key**|String|Tag Key|
|**value**|String|Tag Value|
### Charge
|Name|Type|Description|
|---|---|---|
|**chargeMode**|String|Payment Model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
|**chargeStatus**|String|Cost Payment Status, the value is respectively normal, overdue and arrear.|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeExpiredTime**|String|Expiration Time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeRetireTime**|String|The Expected Release Time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
### BackupSynchronicityAbstract
|Name|Type|Description|
|---|---|---|
|**serviceId**|String|Cross-region Backup Synchronization Service ID|
|**destRegion**|String|Backup the synchronized target region|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
