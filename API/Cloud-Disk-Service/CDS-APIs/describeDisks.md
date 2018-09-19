# describeDisks


## Description
-   filters, between multiple filter conditions is logic AND, and multiple values ​​inside each condition is logic OR


## Request method
GET

## Request address
https://disk.jdcloud-api.com/v1/regions/{regionId}/disks

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**filters**|Filter[]|False||diskId - Cloud Disk ID, Accurate Match, Support Multiple<br>diskType - Type of Cloud Disk, Accurate Match, Support Multiple, ssd or premium-hdd<br>instanceId - ID of the Machine, to which the Cloud Disk is Attached, Accurate Match, Support Multiple<br>instanceType - Type of the Machine, to which the Cloud Disk is Attached, Accurate Match, Support Multiple<br>status - Availability Zone, Accurate Match, Support Multiple<br>az - Status of Cloud Disk, Accurate Match, Support Multiple<br>name - Name of Cloud Disk, Fuzzy Match, Support Single<br>multiAttach - Whether the Cloud Disk is multi-point attached, Accurate Match, Support Single<br>|
|**pageNumber**|Integer|False|1|Page Number, Defaults is 1; Value Range: [1, ∞)|
|**pageSize**|Integer|False|20|Page Size, Default is 20; Value Range: [10,100]|
|**tags**|TagFilter[]|False||Tag Filter Condition|

### Filter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True||Name of Filter Requirements|
|**operator**|String|False||Operator of filter requirements is eq by default|
|**values**|String[]|True||Value of Filter Requirements|
### TagFilter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**key**|String|True||Tag Key|
|**values**|String[]|True||Tag Value|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Query Result Set|


### Result
|Name|Type|Description|
|---|---|---|
|**disks**|Disk[]|List of Cloud Disk Details queried|
|**totalCount**|Integer|Number of Cloud Disks queried|
### Disk
|Name|Type|Description|
|---|---|---|
|**attachments**|DiskAttachment[]|Attach Information|
|**az**|String|AZ, to which the Cloud Disk belongs|
|**charge**|Charge|Configuration Information for Cloud Disk Service Billing|
|**createTime**|String|Cloud Disk Creating Time|
|**description**|String|Description of the Cloud Disk. It allows you to enter all characters under UTF-8 encoding, but no more than 256 characters.|
|**diskId**|String|Cloud Disk ID|
|**diskSizeGB**|Integer|Disk Size, in GiB|
|**diskType**|String|Disk Type, ssd or premium-hdd|
|**multiAttachable**|Boolean|Does the Cloud Disk service support multiple attachments?|
|**name**|String|Name of the Cloud Disk. Only Chinese characters, numbers, uppercase and lowercase letters, English underscores '_' or hyphens '-' are allowed. It is not allowed to be blank and shall not exceed 32 characters.|
|**snapshotId**|String|Snapshot ID used to create the Cloud Disk|
|**status**|String|Status of the Cloud Disk, creating, available, in-use, extending, restoring, deleting, deleted, error_create, error_delete, error_restore or error_extend|
|**tags**|Tag[]|Tag Information|
### DiskAttachment
|Name|Type|Description|
|---|---|---|
|**attachTime**|String|Attaching Time|
|**attachmentId**|String|Attach ID|
|**diskId**|String|Cloud Disk ID|
|**instanceId**|String|ID of Instance Attached|
|**instanceType**|String|Type of the Instance Attached, vm or nc|
|**status**|String|Attaching Status, 'attaching', 'attached', 'detaching' or 'detached'|
### Charge
|Name|Type|Description|
|---|---|---|
|**chargeExpiredTime**|String|Expiration Time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeMode**|String|Payment Model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
|**chargeRetireTime**|String|The Expected Release Time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStatus**|String|Cost Payment Status, the value is respectively normal, overdue and arrear.|
### Tag
|Name|Type|Description|
|---|---|---|
|**key**|String|Tag Key|
|**value**|String|Tag Value|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**500**|Internal server error|
|**401**|Authentication failed|
|**503**|Service unavailable|
