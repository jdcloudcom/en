# describeImage


## Description
Query image details.


## Request method
GET

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/images/{imageId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**imageId**|String|True||Image ID|
|**regionId**|String|True||Region ID|

## Request parameter
None


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**image**|[Image](##Image)|image details|
### <a name="Image">Image</a>
|Name|Type|Description|
|---|---|---|
|**architecture**|String|Image architecture. i386, x86_64|
|**createTime**|String|Creation time|
|**dataDisks**|[InstanceDiskAttachment[]](##InstanceDiskAttachment)|Package image data disk mapping information|
|**desc**|String|Image description|
|**imageId**|String|Image ID|
|**imageSource**|String|image source,  jcloud: public image,  marketplace: image marketplace,  image self: user's own image share: image shared by other users|
|**name**|String|Image name|
|**osType**|String|OS type. Value: [windows, linux]|
|**osVersion**|String|OS version.|
|**platform**|String|OS Release version. Ubuntu, CentOS, Windows Server|
|**progress**|String|progress in image replication,  in percentage,  for example: 80|
|**rootDeviceType**|String||
|**sizeMB**|Integer|Image document size|
|**snapshotId**|String|The snapshot ID of the cloud disk for creating the system disk of the cloud disk, when the system disk type is image of the local disk, this parameter is blank.|
|**status**|String|<a href="https://www.jdcloud.com/help/detail/3871/isCatalog/1">参考镜像状态</a>|
|**systemDisk**|[InstanceDiskAttachment](##InstanceDiskAttachment)|System disk configuration|
|**systemDiskSizeGB**|Integer|Image system disk size|
### <a name="InstanceDiskAttachment">InstanceDiskAttachment</a>
|Name|Type|Description|
|---|---|---|
|**autoDelete**|Boolean|Deleting this disk with the VM automatically when the machine is deleted. The default value is true, which cannot be changed by local.<br>This parameter does not take effect if the data disk in the VM is a monthly package.<br>This parameter does not take effect if the data disk in the VM is a shared data disk.<br>|
|**cloudDisk**|[Disk](##Disk)|Cloud disk service instance type|
|**deviceName**|String|Data disk logical attach point, value range: vda, vdb, vdc, vdd, vde, vdb, vdg, vdh, vdi|
|**diskCategory**|String|Disk classification, the local disk or data disk is taken.<br>The system disk supports local disk or cloud disk. The system disk selects local Type, and the user must use the image localDisk type; If the system disk selects the cloud type, the user must use the image of the cloudDisk type.<br>The data disk supports cloud disk only.<br>|
|**localDisk**|[LocalDisk](##LocalDisk)|Local disk instance type|
### <a name="Disk">Disk</a>
|Name|Type|Description|
|---|---|---|
|**attachments**|[DiskAttachment[]](##DiskAttachment)|Attach Information|
|**az**|String|AZ, to which the cloud disk service belongs|
|**charge**|[Charge](##Charge)|Configuration information for cloud disk service billing|
|**createTime**|String|Cloud disk service creating time|
|**description**|String|Description of the cloud disk service. It allows you to enter all characters under UTF-8 encoding, but no more than 256 characters.|
|**diskId**|String|Cloud Disk Service ID|
|**diskSizeGB**|Integer|Disk size, in GiB|
|**diskType**|String|Disk type, ssd or premium-hdd|
|**multiAttachable**|Boolean|Does the cloud disk support multiple attachments?|
|**name**|String|Name of the cloud disk service. Only Chinese, numbers, uppercase and lowercase letters, English underline "_" and line-through "-" are allowed. It is not allowed to be blank and shall not exceed 32 characters.|
|**snapshotId**|String|Snapshot ID used to create the cloud disk service|
|**status**|String|Status of the cloud disk service, creating, available, in-use, extending, restoring, deleting, deleted, error_create, error_delete, error_restore or error_extend|
|**tags**|[Tag[]](##Tag)|Tag information|
### <a name="DiskAttachment">DiskAttachment</a>
|Name|Type|Description|
|---|---|---|
|**attachTime**|String|Attaching Time|
|**attachmentId**|String|Attach ID|
|**diskId**|String|Cloud Disk Service ID|
|**instanceId**|String|ID of instance attached|
|**instanceType**|String|Type of the instance  attached, vm or nc|
|**status**|String|Attaching state, "attaching", "attached", "detaching" or "detached"|
### <a name="Charge">Charge</a>
|Name|Type|Description|
|---|---|---|
|**chargeExpiredTime**|String|Expiration time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeMode**|String|Payment model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
|**chargeRetireTime**|String|The expected release time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStatus**|String|Cost payment status, the value is respectively normal, overdue and arrear.|
### <a name="Tag">Tag</a>
|Name|Type|Description|
|---|---|---|
|**key**|String|Tag Key|
|**value**|String|Tag Value|
### <a name="LocalDisk">LocalDisk</a>
|Name|Type|Description|
|---|---|---|
|**diskSizeGB**|Integer|Disk size|
|**diskType**|String|Disk type, value range {premium-hdd,  ssd}|

## Return code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
