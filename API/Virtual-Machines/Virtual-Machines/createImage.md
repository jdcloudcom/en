# createImage


## Description
Create a private image for the virtual machine. The virtual machine status must be <b>stopped</b>. <br>
The creation of an image is only available when there is no task in progress for virtual machine. <br>
Image is created based on system disk backup. The whole-machine image can be created by fully or partially attaching data disk (If no changes are made, then the whole-machine image is created by default). During the process of creating an image, the snapshot of the attached cloud disk will be created and it will be associated with the image. <br>
After calling the API, the user can not use the image normally until the image status becomes <b>ready</b>.


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
|**dataDisks**|InstanceDiskAttachmentSpec[]|False| |A list of data disks that add new snapshots and empty disks to, or excludes data disks from a VM after a data disk is attached with an instance.|
|**description**|String|True| |Image Description, <a href="http://docs.jdcloud.com/virtual-machines/api/general_parameters">Refer to public parameter specification</a>.|
|**name**|String|True| |Image Name, <a href="http://docs.jdcloud.com/virtual-machines/api/general_parameters">Refer to the public parameter specification </a>.|

### InstanceDiskAttachmentSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**autoDelete**|Boolean|False| |Deleting this disk with the VM automatically when the machine is deleted. The default value is true, which cannot be changed by local.<br>This parameter does not take effect if the billing method of the data disk in the VM is a monthly package.<br>This parameter does not take effect if the data disk in the VM is a shared data disk.<br>|
|**cloudDiskSpec**|DiskSpec|False| |Data Disk Configuration|
|**deviceName**|String|False| |Data disk logical attaching point, value range: vda, vdb, vdc, vdd, vde, vdb, vdg, vdh, vdi|
|**diskCategory**|String|False| |Disk classification, the local or cloud disk is taken.<br>The system disk supports local disk or cloud disk. The system disk selects local type, and the user must use the image localDisk type; if the system disk selects the cloud type, the user must use the image of the cloudDisk type.<br>The data disk supports cloud disk only.<br>|
|**noDevice**|Boolean|False| |Exclude the device, and parameter noDevice is used with deviceName.<br>Create a whole-machine image: deviceName: vdb, noDevice: true, the data disk vdb in the VM is not involved in creating an image.<br>Create a template: deviceName: vdb, noDevice: true, the data disk vdb in the image is not involved in creating the machine.<br>Create a machine: deviceName: vdb, noDevice: true, the data disk vdb in the image or the data disk vdb in the template (create machine by using the template) is not involved in creating the machine.<br>|
### DiskSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**az**|String|True| |Availability Zone, to which the cloud disk belongs|
|**charge**|ChargeSpec|False| |Billing configuration. If not specified, the default billing type is pay-as-you-go - pay by service time by default.|
|**description**|String|False| |Description of the cloud disk|
|**diskSizeGB**|Integer|True| |Size of the cloud disk, unit: GiB; ssd value range of [20,1000]GB and step size of 10G; premium-hdd value range of [20,3000]GB and step size of 10G|
|**diskType**|String|True| |Type of the cloud disk, value ssd or premium-hdd|
|**multiAttachable**|Boolean|False| |Whether the cloud disk supports the mode that one disk is attached to multiple machines. It is set as false by default (not supported).|
|**name**|String|True| |Name of the cloud disk|
|**snapshotId**|String|False| |Snapshot ID used to create a cloud disk|
### ChargeSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**chargeDuration**|Integer|False| |Pay-In-Advance billing duration, the Pay-In-Advance is compulsory and valid only when the value of chargeMode is prepaid_by_duration. When chargeUnit is month, the value shall be 1~9; when chargeUnit is year, the value shall be 1, 2 or 3|
|**chargeMode**|String|False|postpaid_by_duration|Billing model value is prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration means Pay-In-Advance; postpaid_by_usage means Pay-As-You-Go By Consumption; and postpaid_by_duration means Pay-As-You-Go by Configuration; postpaid_by_duration is by default. Please refer to the Help Documentation of specific product line to confirm the billing type supported by the production line|
|**chargeUnit**|String|False| |Billing unit of Pay-In-Advance, the Pay-In-Advance is compulsory, and valid only when chargeMode is prepaid_by_duration, and the value is month or year and month by default|

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
