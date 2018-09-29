# describeDisks


## 描述
-   filters, between multiple filter conditions is logic AND, and multiple values ​​inside each condition is logic OR


## 请求方式
GET

## 请求地址
https://disk.jdcloud-api.com/v1/regions/{regionId}/disks

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**filters**|Filter[]|False| |diskId - Cloud Disk ID, accurate match, support multiple<br>diskType - Type of Cloud Disk, accurate match, support multiple, value: ssd or premium-hdd<br>instanceId - ID of the Machine, to which the cloud disk is attached, accurate match, support multiple<br>instanceType - Type of the Machine, to which the cloud disk is attached, accurate match, support multiple<br>status - Availability Zone, accurate match, support multiple<br>az - Status of the cloud disk, accurate match, support multiple<br>name - Name of the cloud disk, fuzzy match, support single<br>multiAttach - Whether the cloud disk is multi-point attached, accurate match, support multiple<br>|
|**pageNumber**|Integer|False|1|Page Number: 1 by default; value range: [1, ∞)|
|**pageSize**|Integer|False|20|Paging Size: 20 by default; value range: [10,100]|
|**tags**|TagFilter[]|False| |Tag Filter Condition|

### Filter
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|
### TagFilter
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**key**|String|True| |Tag Key|
|**values**|String[]|True| |Tag Value|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Query Result Set|

### Result
|名称|类型|描述|
|---|---|---|
|**disks**|Disk[]|List of cloud disk details queried|
|**totalCount**|Integer|Number of cloud disks queried|
### Disk
|名称|类型|描述|
|---|---|---|
|**attachments**|DiskAttachment[]|Attach Information|
|**az**|String|AZ, to which the cloud disk belongs|
|**charge**|Charge|Configuration Information for Cloud Disk Service Billing|
|**createTime**|String|Cloud Disk Creating Time|
|**description**|String|Description of the cloud disk. It allows you to enter all characters under UTF-8 encoding, but no more than 256 characters.|
|**diskId**|String|Cloud Disk ID|
|**diskSizeGB**|Integer|Disk Size, in GiB|
|**diskType**|String|Disk Type, ssd or premium-hdd|
|**multiAttachable**|Boolean|Does the Cloud Disk Service support multiple attachments?|
|**name**|String|Name of the cloud disk only allows Chinese characters, numbers, uppercase and lowercase letters, English underscores '_' or hyphens '-'. It is not allowed to be blank and shall not exceed 32 characters.|
|**snapshotId**|String|Snapshot ID used to create a cloud disk|
|**status**|String|Status of the Cloud Disk, creating, available, in-use, extending, restoring, deleting, deleted, error_create, error_delete, error_restore or error_extend|
|**tags**|Tag[]|Tag Information|
### DiskAttachment
|名称|类型|描述|
|---|---|---|
|**attachTime**|String|Attaching Time|
|**attachmentId**|String|Attach ID|
|**diskId**|String|Cloud Disk ID|
|**instanceId**|String|ID of Instance Attached|
|**instanceType**|String|Type of the Instance Attached, value: vm or nc|
|**status**|String|Attaching Status, 'attaching', 'attached', 'detaching' or 'detached'|
### Charge
|名称|类型|描述|
|---|---|---|
|**chargeExpiredTime**|String|Expiration Time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeMode**|String|Payment Model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
|**chargeRetireTime**|String|The Expected Release Time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStatus**|String|Cost Payment Status, the value is respectively normal, overdue and arrear.|
### Tag
|名称|类型|描述|
|---|---|---|
|**key**|String|Tag Key|
|**value**|String|Tag Value|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**500**|Internal server error|
|**401**|Authentication failed|
|**503**|Service unavailable|
