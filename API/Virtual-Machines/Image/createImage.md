# createImage


## Description
Create a private image for a VM. The VM status must be <b>stopped</b>. 

The creation of an image is only available when there is no task in progress of the VM. 

The image creation is based on backing up the system disk. A image can be created containing all or partial attached cloud data disks (If no change is made, then the entile image contains all cloud data disks is created by default). During the process of creating an image, the snapshots of the choosen attached cloud disks will be created and will be associated with the image. 

After calling the API, you can not use the image normally until the image status becomes <b>ready</b>.


## Request method
POST

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:createImage

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |VM ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**dataDisks**|InstanceDiskAttachmentSpec[]|False| |A list of data disks that you can add new snapshots and empty disks to, or excludes currently attached cloud data disks.|
|**description**|String|True| |Image Description, <a href="http://docs.jdcloud.com/virtual-machines/api/general_parameters">Refer to public parameter specification</a>.|
|**name**|String|True| |Image Name, <a href="http://docs.jdcloud.com/virtual-machines/api/general_parameters">Refer to the public parameter specification </a>.|

### InstanceDiskAttachmentSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**autoDelete**|Boolean|False| |Deleting this disk with the VM automatically when the VM is deleted. The default value is true, which cannot be changed for a local disk.<br>This parameter does not take effect if the billing method of the disk is a monthly package.<br>|
|**cloudDiskSpec**|DiskSpec|False| |Data Disk Configuration|
|**deviceName**|String|False| |Device name, value range: vda, vdb, vdc, vdd, vde, vdf, vdg, vdh, vdi, vdj, vdk, vdl, vdm|
|**diskCategory**|String|False| |Disk classification, the local or cloud disk is taken.<br>The system disk supports local disk or cloud disk. If select the local type for the system disk , and you must use a image of localDisk type; if select the cloud type for the system disk, you must use a image of the cloudDisk type.<br>The data disk supports cloud disk only.<br>|
|**noDevice**|Boolean|False| |Exclude the device, and parameter noDevice is used with deviceName.<br>Create a entile image that contains all the system disk and attached cloud data disks: deviceName: vdb, noDevice: true, the cloud data disk whose device name is vdb that attached to the VM will not be involved in creating the  image.<br>Create a template: deviceName: vdb, noDevice: true, the data disk whose device name is vdb in the image will not be involved in creating the VM.<br>Create a VM: deviceName: vdb, noDevice: true, the data disk vdb in the image or the data disk whose device name is vdb in the template (create a VM using the template) will not be involved in creating the machine.<br>|

### DiskSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**az**|String|True| |Availability Zone, to which the cloud disk belongs|
|**charge**|ChargeSpec|False| |Billing configuration. If not specified, the default billing type is postpaid_by_duration(Pay by Configuration) by default.|
|**description**|String|False| |Description of the cloud disk|
|**diskSizeGB**|Integer|True| |Size of the cloud disk, unit: GB; for ssd, the value range is [20,1000]GB and the step size of 10G; for premium-hdd, the value range is [20,3000]GB and the step size of 10G|
|**diskType**|String|True| |Type of the cloud disk, value is ssd or premium-hdd|
|**multiAttachable**|Boolean|False| |Whether the cloud disk supports to be attached to multiple VMs. It is set as false by default (not supported yet).|
|**name**|String|True| |Name of the cloud disk|
|**snapshotId**|String|False| |Snapshot ID used to create a cloud disk|
### ChargeSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**chargeDuration**|Integer|False| |Pay-In-Advance billing duration, the Pay-In-Advance is compulsory and valid only when the value of chargeMode is prepaid_by_duration. When chargeUnit is month, the value shall be 1~9; when chargeUnit is year, the value shall be 1, 2 or 3|
|**chargeMode**|String|False|postpaid_by_duration|The Billing model value is prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration means Pay-In-Advance; postpaid_by_usage means Pay-As-You-Go By Consumption; and postpaid_by_duration means Pay-As-You-Go by Configuration; postpaid_by_duration by default. Please refer to the Help Documentation to confirm the billing type supported|
|**chargeUnit**|String|False| |Billing unit of Pay-In-Advance, the Pay-In-Advance is compulsory, and valid only when chargeMode is prepaid_by_duration, and the value is month or year and is month by default|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**imageId**|String|Image ID|

## Response code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**500**|Internal server error|
|**503**|Service unavailable|
|**200**|OK|
|**404**|Not found|
|**429**|Quota exceeded|
