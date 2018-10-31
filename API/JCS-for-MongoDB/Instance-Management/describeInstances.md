# describeInstances


## Description
Query Instance Information

## Request method
GET

## Request address
https://mongodb.jdcloud-api.com/v1/regions/{regionId}/instances

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**filters**|Filter[]|False| |instanceId - Instance ID, Accurate Matching<br>instanceName - Instance Name, Fuzzy Matching<br>instanceStatus - mongodb status, accurate matching, support multiple RUNNING: Running, ERROR: Error, BUILDING: Creating, DELETING: Deleting, RESTORING: Restoring, RESIZING: under Configuration Change<br>chargeMode - Billing Type, Accurate Matching<br>|
|**pageNumber**|Integer|False| |Page Number; Default: 1; Value range: [1, ∞)|
|**pageSize**|Integer|False| |Page Size; Default: 10; Value range: [1,100]|
|**sorts**|Sort[]|False| |createTime - Creation Time, asc (Positive Order), desc (Reverse Order)<br>|

### Filter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|
### Sort
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**direction**|String|False| |Direction of Sorting Requirements|
|**name**|String|False| |Name of Sorting Requirements|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**dbInstances**|DBInstance[]| |
|**pageNumber**|Integer| |
|**totalCount**|Integer| |
### DBInstance
|Name|Type|Description|
|---|---|---|
|**accountName**|String|Default User Name|
|**azId**|String[]|AZ ID, AZs at primary, secondary and hidden nodes in turn.|
|**backupRetentionPeriod**|Integer|Automatic Backup Retention Time|
|**charge**|Charge|Billing Information|
|**createTime**|String|Creation Time|
|**dBName**|String|Default Database Name|
|**engine**|String|Database Type|
|**engineVersion**|String|Database Version|
|**instanceCPU**|Integer|Number of CPU Cores|
|**instanceClass**|String|Instance Type Code|
|**instanceDomain**|String|Domain Name|
|**instanceId**|String|Instance ID|
|**instanceMemoryGB**|Integer|Memory, Unit: GB|
|**instanceName**|String|Instance Name|
|**instancePort**|String|Application Access Port|
|**instanceStatus**|String|Instance Status. RUNNING: Running, ERROR: Error, BUILDING: Creating, DELETING: Deleting, RESTORING: Restoring, RESIZING: under Configuration Change|
|**instanceStorageGB**|Integer|Storage Space|
|**isSetSecurityIps**|Boolean|Whether to set White List, true: set, false: not set|
|**preferredBackupWindow**|String|Automatic Backup Time, for example: 00:00-02:00, indicating automatic backup of the database from 0 to 2|
|**preferredmaintenanceWindow**|String|System Maintenance Time, for example: 00:00-02:00, indicating system maintenance from 0 to 2|
|**replicaSetName**|String|Name of Replica Set|
|**subnetId**|String|Subnet ID|
|**vpcId**|String|VPCID|
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
