# describeImage


## Description
Query image details.


## Request method
GET

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/images/{imageId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**imageId**|String|True| |Image ID|
|**regionId**|String|True| |Region ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**image**|Image|Image Details|
### Image
|Name|Type|Description|
|---|---|---|
|**architecture**|String|Image Architecture. Value: i386, x86_64|
|**createTime**|String|Creation Time|
|**dataDisks**|InstanceDiskAttachment[]|Package Image Data Disk Mapping Information|
|**desc**|String|Image Description|
|**imageId**|String|Image ID|
|**imageSource**|String|Image source, jcloud: public image, marketplace: image marketplace, image self: user's own image share: image shared by other users|
|**name**|String|Image Name|
|**osType**|String|OS type. Value: [windows, linux]|
|**osVersion**|String|OS Version.|
|**platform**|String|OS Release Version. Ubuntu, CentOS, Windows Server|
|**progress**|String|Progress in image replication, in percentage, for example: 80|
|**rootDeviceType**|String|The system disk type supported by the image. localDisk: Support system disk for this site.cloudDisk: Support cloud disk system disk|
|**sizeMB**|Integer|Image Document Size|
|**snapshotId**|String|The cloud disk snapshot ID used for creating the cloud system disk. When the system disk type is image of the local disk, this parameter is blank.|
|**status**|String|<a href="http://docs.jdcloud.com/virtual-machines/api/image_status">refer to image status</a>|
|**systemDisk**|InstanceDiskAttachment|System Disk Configuration|
|**systemDiskSizeGB**|Integer|Image System Disk Size|
### InstanceDiskAttachment
|Name|Type|Description|
|---|---|---|
|**autoDelete**|Boolean|Delete this disk with the VM automatically when the machine is deleted. The default value is true, which cannot be changed by local.<br>This parameter does not take effect if the billing method of the data disk in the VM is monthly package.<br>This parameter does not take effect if the data disk in the VM is a shared data disk.<br>|
|**cloudDisk**|Disk|Cloud Disk Instance Type|
|**deviceName**|String|Data disk logical attaching point, value range: vda, vdb, vdc, vdd, vde, vdb, vdg, vdh, vdi|
|**diskCategory**|String|Disk classification, the local disk or data disk is taken.<br>The system disk supports local disk or cloud disk. The system disk selects local type, and the user must use the image localDisk type; if the system disk selects the cloud type, the user must use the image of the cloudDisk type.<br>The data disk supports cloud disk only.<br>|
|**localDisk**|LocalDisk|Local Disk Instance Type|
|**status**|String|Data disk attach status, value range: attaching,detaching,attached,detached,error_attach,error_detach|
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
|**name**|String|Name of the cloud disk only allows Chinese characters, numbers, uppercase and lowercase letters, English underscores '_' and line-through '-'. It is not allowed to be blank and shall not exceed 32 characters.|
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
|**status**|String|Attaching Status, "attaching", "attached", "detaching" or "detached"|
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
### LocalDisk
|Name|Type|Description|
|---|---|---|
|**diskSizeGB**|Integer|Disk Size|
|**diskType**|String|Disk Type, value range {premium-hdd, ssd}|

## Response code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
