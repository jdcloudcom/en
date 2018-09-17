# createImage


## 描述
Create a private image for the virtual machine. The virtual machine status must be stopped. <br>
A virtual machine can create an image with no task in progress. <br>
If a data disk is attached in the virtual machine,  the snapshot of data disk is created by default to generate a packaged image. <br>
After calling the API, the user can not use the image normally until the image status becomes <b>ready</b>.


## 请求方式
POST

## 请求地址
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:createImage

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True||VM ID|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**dataDisks**|[InstanceDiskAttachmentSpec[]](##InstanceDiskAttachmentSpec)|False||A list of data disks that add new snapshots and empty disks to, or excludes data disks from a VM after a data disk is attached with an instance.|
|**description**|String|True||Image description, <a href="https://www.jdcloud.com/help/detail/3870/isCatalog/1">refer to public parameter specification</a>.|
|**name**|String|True||Image name, <a href="https://www.jdcloud.com/help/detail/3870/isCatalog/1">Refer to the public parameter specification </a>.|

### <a name="InstanceDiskAttachmentSpec">InstanceDiskAttachmentSpec</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**autoDelete**|Boolean|False||Deleting this disk with the VM automatically when the machine is deleted. The default value is true, which cannot be changed.<br>This parameter does not take effect if the data disk in the VM is a monthly package.<br>This parameter does not take effect if the data disk in the VM is a shared data disk.<br>|
|**cloudDiskSpec**|[DiskSpec](##DiskSpec)|False||Data disk configuration|
|**deviceName**|String|False||Data disk logical attach point, value range: vda, vdb, vdc, vdd, vde, vdb, vdg, vdh, vdi|
|**diskCategory**|String|False||Disk classification, the local or cloud data disk is taken.<br>The system disk supports local disk or cloud disk. The system disk selects local Type, and the user must use the image localDisk type; If the system disk selects the cloud type, the user must use the image of the cloudDisk type.<br>The data disk supports cloud disk only.<br>|
|**noDevice**|Boolean|False||Excludes the device and parameter noDevice is used with deviceName.<br>Create a package image: deviceName: vdb, noDevice: true, the data disk vdb in the VM is not involved in creating an image.<br>Create a template: deviceName: vdb, noDevice: true, the data disk vdb in the image is not involved in creating the machine.<br>Create a machine: deviceName: vdb, noDevice: true, the data disk vdb in the image or the data disk vdb in the template (create machine by using the template) is not involved in creating the machine.|
### <a name="DiskSpec">DiskSpec</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**az**|String|True||Availability zone, to which the cloud disk service belongs|
|**charge**|[ChargeSpec](##ChargeSpec)|False||Billing configuration. If not specified, the default billing type is pay-as-you-go - pay by service time by default.|
|**description**|String|False||Description of the cloud disk service|
|**diskSizeGB**|Integer|True||Size of the cloud disk service, in GiB; ssd value range of [20,1000]GB and step size of 10G; premium-hdd value range of [20,3000]GB and step size of 10G|
|**diskType**|String|True||Type of the cloud disk service, value ssd or premium-hdd|
|**multiAttachable**|Boolean|False||Whether the cloud disk service supports the mode that one disk is attached to multiple machines. It is set as false by default (not supported).|
|**name**|String|True||Name of the cloud disk service|
|**snapshotId**|String|False||Snapshot ID used to create cloud disk service|
### <a name="ChargeSpec">ChargeSpec</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**chargeDuration**|Integer|False||Pay-In-Advance billing duration, the Pay-In-Advance is compulsory and valid only when the value of chargeMode is prepaid_by_duration. When chargeUnit is month, the value shall be 1~9; when chargeUnit is year, the value shall be 1, 2 or 3|
|**chargeMode**|String|False|postpaid_by_duration|Billing model value is prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration means Pay-In-Advance, postpaid_by_usage means Pay-As-You-Go By Consumption and postpaid_by_duration means pay by configuration; is postpaid_by_duration by default. Please refer to the Help Documentation of specific product line to confirm the billing type supported by the production line|
|**chargeUnit**|String|False||Billing unit of Pay-In-Advance, the Pay-In-Advance is compulsory, and valid only when chargeMode is prepaid_by_duration, and the value is month or year and month by default|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**imageId**|String|Image ID|

## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**500**|Internal server error|
|**503**|Service unavailable|
|**200**|OK|
|**404**|Not found|
|**429**|Quota exceeded|
