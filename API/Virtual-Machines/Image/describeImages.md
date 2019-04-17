# describeImages


## Description
Query the image information list. <br>
This API allows you to query an public image of JD Cloud, a third-party image, a private image, or an image that other users share to you. <br>
This API supports paging query with 20 items per page by default.


## Request method
GET

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/images

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**imageSource**|String|False| |Image source, if no ids parameter is specified, this parameter is required to pass; value range: public, shared, thirdparty, private|
|**platform**|String|False| |Operating system platform, range of values: Windows Server, CentOS, Ubuntu|
|**ids**|String[]|False| |Image ID list, if this parameter is specified, other parameters can be null|
|**rootDeviceType**|String|False| |Image-supported system disk types, [ScanDisk, click Disk]|
|**status**|String|False| |<a href="http://docs.jdcloud.com/virtual-machines/api/image_status">Refer to image status</a>|
|**pageNumber**|Integer|False|1|Page; 1 by default|
|**pageSize**|Integer|False|20|Paging Size; 20 by default; Value range[10, 100] |


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**images**|Image[]|Image Details|
|**totalCount**|Integer|Total Number|
### Image
|Name|Type|Description|
|---|---|---|
|**imageId**|String|Image ID|
|**name**|String|Image Name|
|**platform**|String|OS Release Version. Ubuntu, CentOS, Windows Server|
|**osVersion**|String|OS Version.|
|**architecture**|String|Image Architecture. Value: i386, x86_64|
|**systemDiskSizeGB**|Integer|Image System Disk Size|
|**imageSource**|String|Image source, jcloud: public image, marketplace: image marketplace, image self: user's own image share: image shared by other users|
|**osType**|String|OS type. Value: [windows, linux]|
|**status**|String|<a href="http://docs.jdcloud.com/virtual-machines/api/image_status">refer to image status</a>|
|**createTime**|String|Creation Time|
|**sizeMB**|Integer|Image Document Size|
|**desc**|String|Image Description|
|**systemDisk**|InstanceDiskAttachment|System Disk Configuration|
|**dataDisks**|InstanceDiskAttachment[]|Package Image Data Disk Mapping Information|
|**snapshotId**|String|The cloud disk snapshot ID used for creating the cloud system disk. When the system disk type is image of the local disk, this parameter is blank.|
|**rootDeviceType**|String|The system disk type supported by the image. localDisk: Support system disk for this site.cloudDisk: Support cloud disk system disk|
|**progress**|String|Progress in image replication, in percentage, for example: 80|
### InstanceDiskAttachment
|Name|Type|Description|
|---|---|---|
|**diskCategory**|String|Disk classification, the local disk or data disk is taken.<br>The system disk supports local disk or cloud disk. The system disk selects local type, and the user must use the image localDisk type; if the system disk selects the cloud type, the user must use the image of the cloudDisk type.<br>The data disk supports cloud disk only.<br>|
|**autoDelete**|Boolean|Delete this disk with the VM automatically when the machine is deleted. The default value is true, which cannot be changed by local.<br>This parameter does not take effect if the billing method of the data disk in the VM is monthly package.<br>This parameter does not take effect if the data disk in the VM is a shared data disk.<br>|
|**localDisk**|LocalDisk|Local Disk Instance Type|
|**cloudDisk**|Disk|Cloud Disk Instance Type|
|**deviceName**|String|Data disk logical attaching point, value range: vda, vdb, vdc, vdd, vde, vdb, vdg, vdh, vdi|
|**status**|String|Data disk attach status, value range: attaching,detaching,attached,detached,error_attach,error_detach|
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
### LocalDisk
|Name|Type|Description|
|---|---|---|
|**diskType**|String|Disk Type, value range {premium-hdd, ssd}|
|**diskSizeGB**|Integer|Disk Size|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
