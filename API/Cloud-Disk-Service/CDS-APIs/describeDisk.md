# describeDisk


## Description
Query details of a cloud disk

## Request method
GET

## Request address
https://disk.jdcloud-api.com/v1/regions/{regionId}/disks/{diskId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**diskId**|String|True| |Cloud Disk ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Query cloud disk details|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**disk**|Disk| |
### Disk
|Name|Type|Description|
|---|---|---|
|**diskId**|String|Cloud Disk ID|
|**az**|String|Available Zone, to which the cloud disk belongs|
|**name**|String|Name of the cloud disk only allows Chinese characters, numbers, uppercase and lowercase letters, English underscores '_' and hyphens '-'. It is not allowed to be blank and shall not exceed 32 characters.|
|**description**|String|Description of the cloud disk. It allows you to enter all characters under UTF-8 encoding, but no more than 256 characters.|
|**diskType**|String|Cloud Disk Service types, values are ssd, premium-hdd, ssd.gp1, ssd.io1 and hdd.std1|
|**diskSizeGB**|Integer|Cloud Disk Size, unit: GiB|
|**iops**|Integer|Value of iops actually applied by the Cloud Disk|
|**throughput**|Integer|Value of throughput actually applied by the Cloud Disk|
|**status**|String|Status of the Cloud Disk, creating, available, in-use, extending, restoring, deleting, deleted, error_create, error_delete, error_restore or error_extend|
|**attachments**|DiskAttachment[]|Attachment Information|
|**snapshotId**|String|Snapshot ID used to create a cloud disk|
|**multiAttachable**|Boolean|Is multiple attachment True or False|
|**encrypted**|Boolean|Whether a Cloud Disk is an encryption disk|
|**enable**|Boolean|Whether a Cloud Disk has been suspended (IOPS limit is extremely low)|
|**createTime**|String|Cloud Disk Creation Time|
|**charge**|Charge|Cloud Disk Billing Configuration|
|**tags**|Tag[]|Tag Information|
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
### DiskAttachment
|Name|Type|Description|
|---|---|---|
|**attachmentId**|String|Attach ID|
|**diskId**|String|Cloud Disk ID|
|**instanceType**|String|Instance Type, value: vm or nc|
|**instanceId**|String|Instance ID|
|**status**|String|Attaching Status, "attaching", "attached", "detaching" or "detached"|
|**attachTime**|String|Attachment Time|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
