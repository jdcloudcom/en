# describeDisk


## Description
Query details of a cloud disk

## Request method
GET

## Request address
https://disk.jdcloud-api.com/v1/regions/{regionId}/disks/{diskId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**diskId**|String|True| |Cloud Disk ID|
|**regionId**|String|True| |Region ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Query cloud disk details|


### Result
|Name|Type|Description|
|---|---|---|
|**disk**|Disk| |
### Disk
|Name|Type|Description|
|---|---|---|
|**attachments**|DiskAttachment[]|Attachment Information|
|**az**|String|Available Zone, to which the cloud disk belongs|
|**charge**|Charge|Cloud Disk Billing Configuration|
|**createTime**|String|Cloud Disk Creation Time|
|**description**|String|Description of the cloud disk. It allows you to enter all characters under UTF-8 encoding, but no more than 256 characters.|
|**diskId**|String|Cloud Disk ID|
|**diskSizeGB**|Integer|Disk Size, in GiB|
|**diskType**|String|Disk Type, ssd or premium-hdd|
|**multiAttachable**|Boolean|Is multiple attachment True or False|
|**name**|String|Name of the cloud disk only allows Chinese characters, numbers, uppercase and lowercase letters, English underscores '_' and hyphens '-'. It is not allowed to be blank and shall not exceed 32 characters.|
|**snapshotId**|String|Snapshot ID used to create a cloud disk|
|**status**|String|Status of the Cloud Disk, creating, available, in-use, extending, restoring, deleting, deleted, error_create, error_delete, error_restore or error_extend|
|**tags**|Tag[]|Tag Information|
### DiskAttachment
|Name|Type|Description|
|---|---|---|
|**attachTime**|String|Attachment Time|
|**attachmentId**|String|Attach ID|
|**diskId**|String|Cloud Disk ID|
|**instanceId**|String|Instance ID|
|**instanceType**|String|Instance Type, value: vm or nc|
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

## Response code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
