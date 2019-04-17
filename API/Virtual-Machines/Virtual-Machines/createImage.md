# createImage


## Description
Create private images for the Virtual Machines. The Virtual Machines must be in the status of <b>stopped</b>.<br>
Images can be created only when the Virtual Machines have no running tasks.<br>
Create images on the basis of backup system disk. In addition, all or parts of the data disks attached can be used for creating the images of the complete machine (if no change is made, the images of the complete machine will be created by default). The snapshot will be created for the attached cloud disk and the images will be associated during the image creation process.<br>
After the interface is called, the image can be normally used only when the image status changes to <b>ready</b>.


## Request method
POST

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:createImage

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceId**|String|True| |VM ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True| |For the image name, <a href=”http://docs.jdcloud.com/virtual-machines/api/general_parameters”>please refer to the public parameter specification</a>.|
|**description**|String|True| |For the image description, <a href=”http://docs.jdcloud.com/virtual-machines/api/general_parameters”>please refer to the public parameter specification</a>.|
|**dataDisks**|InstanceDiskAttachmentSpec[]|False| |New snapshots, null disks or data disks (excluding the Virtual Machines) can be added to the data disk list on the basis that the instances are attached to the data disks.|

### InstanceDiskAttachmentSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**diskCategory**|String|False| |Disk classification, the local or cloud disk is taken.<br>The system disk supports local disk or cloud disk. If select the local type for the system disk , and you must use a image of localDisk type; if select the cloud type for the system disk, you must use a image of the cloudDisk type.<br>The data disk supports cloud disk only.<br>|
|**autoDelete**|Boolean|False| |Deleting this disk with the VM automatically when the VM is deleted. The default value is true, which cannot be changed for a local disk.<br>This parameter does not take effect if the billing method of the disk is a monthly package.<br>|
|**cloudDiskSpec**|DiskSpec|False| |Data Disk Configuration|
|**deviceName**|String|False| |Device name, value range: vda, vdb, vdc, vdd, vde, vdf, vdg, vdh, vdi, vdj, vdk, vdl, vdm|
|**noDevice**|Boolean|False| |Exclude the device, and parameter noDevice is used with deviceName.<br>Create a entile image that contains all the system disk and attached cloud data disks: deviceName: vdb, noDevice: true, the cloud data disk whose device name is vdb that attached to the VM will not be involved in creating the  image.<br>Create a template: deviceName: vdb, noDevice: true, the data disk whose device name is vdb in the image will not be involved in creating the VM.<br>Create a VM: deviceName: vdb, noDevice: true, the data disk vdb in the image or the data disk whose device name is vdb in the template (create a VM using the template) will not be involved in creating the machine.<br>|
### DiskSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**az**|String|True| |Availability Zone, to which the cloud disk belongs|
|**name**|String|True| |Name of the cloud disk|
|**description**|String|False| |Description of the cloud disk|
|**diskType**|String|True| |Type of the cloud disk, value ssd, premium-hdd, ssd.gp1, ssd.io1 or hdd.std1|
|**diskSizeGB**|Integer|True| |Size of the cloud disk, unit: GiB; ssd value range of [20,1000]GB and step size of 10G; premium-hdd value range of [20,3000]GB and step size of 10G|
|**snapshotId**|String|False| |Snapshot ID used to create a cloud disk|
|**charge**|ChargeSpec|False| |Billing configuration. If not specified, the default billing type is pay-as-you-go - pay by service time by default.|
|**multiAttachable**|Boolean|False| |Whether the Cloud Disk Service supports the mode that one disk is attached to multiple machines. It is set as false by default (not supported).|
|**encrypt**|Boolean|False| |Whether a Cloud Disk is encrypted, false (does not encrypt) by default|
### ChargeSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**chargeMode**|String|False|postpaid_by_duration|Billing model value is prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration means Pay-In-Advance, postpaid_by_usage means Pay-As-You-Go By Consumption and postpaid_by_duration means pay by configuration; is postpaid_by_duration by default. Please refer to the Help Documentation of specific product line to confirm the billing type supported by the production line|
|**chargeUnit**|String|False| |Billing unit of Pay-In-Advance, the Pay-In-Advance is compulsory, and valid only when chargeMode is prepaid_by_duration, and the value is month or year and month by default|
|**chargeDuration**|Integer|False| |Pay-In-Advance billing duration, the Pay-In-Advance is compulsory and valid only when the value of chargeMode is prepaid_by_duration. When chargeUnit is month, the value shall be 1~9; when chargeUnit is year, the value shall be 1, 2 or 3|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**imageId**|String|Image ID|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**429**|Quota exceeded|
|**500**|Internal server error|
|**503**|Service unavailable|
