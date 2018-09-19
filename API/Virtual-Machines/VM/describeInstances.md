# describeInstances


## Description
Batch query of Virtual Machines details<br>
This API supports paging query with 20 items per page by default.


## Request method
GET

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**filters**|Filter[]|False||instanceId-VM ID, exact match, multiple supported<br>PrivateIpAddress-primary private IP address of primary network interface, fuzzy match, multiple supported<br>az-AZ,  exact match,  multiple supported<br>vpcId-Virtual Private Cloud ID, exact match, multiple supported<br>status-virtual machine status,  match exactly,  support multiple,  <a href="https://www.jdcloud.com/help/detail/3869/isCatalog/1">refer to virtual machine status</a><br>name-VM name, fuzzy match, single supported<br>imageId-Image ID, exact match, multiple supported<br>networkInterfaceId-ENI ID, exact match, multiple supported<br>subnetId-subnet ID, exact match, multiple supported<br>agId-Use the AG id, single supported<br>faultDomain-Error domain, multiple supported<br>|
|**pageNumber**|Integer|False|1|Page; 1 by default|
|**pageSize**|Integer|False|20|Paging size;20 by default;Value range[10, 100]|

### Filter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True||Name of Filter Requirements|
|**operator**|String|False||Operator of filter requirements is eq by default|
|**values**|String[]|True||Value of Filter Requirements|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### Result
|Name|Type|Description|
|---|---|---|
|**instances**|Instance[]||
|**totalCount**|Number||
### Instance
|Name|Type|Description|
|---|---|---|
|**ag**|Ag|AG, where an AG is used to create a VM, an AG name can be displayed here|
|**az**|String|The AZ of the VM|
|**charge**|Charge|Billing information|
|**dataDisks**|InstanceDiskAttachment[]|Data disk configuration|
|**description**|String|VM description|
|**elasticIpAddress**|String|The address of the primary network interface of primary IP associating EIP|
|**elasticIpId**|String|The ID of the primary network interface of primary IP associating EIP|
|**faultDomain**|String|Error domains in AGs|
|**imageId**|String|Image ID|
|**instanceId**|String|VM ID|
|**instanceName**|String|VM name|
|**instanceType**|String|Instance type|
|**keyNames**|String[]|Key pair name|
|**launchTime**|String|Creation Time|
|**primaryNetworkInterface**|InstanceNetworkInterfaceAttachment|Primary network interface instance type|
|**privateIpAddress**|String|IP address of primary network interface|
|**secondaryNetworkInterfaces**|InstanceNetworkInterfaceAttachment[]|Secondary network interface instance type|
|**status**|String|Virtual machine status,<a href='https://www.jdcloud.com/help/detail/3869/isCatalog/1'>refer to virtual machine status</a>|
|**subnetId**|String|ID of the subnet to which the primary network interface belongs|
|**systemDisk**|InstanceDiskAttachment|System disk configuration|
|**tags**|Tag[]|Tag information|
|**vpcId**|String|ID of the VPC to which the primary network interface belongs|
### Ag
|Name|Type|Description|
|---|---|---|
|**id**|String|AG id|
|**name**|String|AG name|
### Charge
|Name|Type|Description|
|---|---|---|
|**chargeExpiredTime**|String|Expiration Time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeMode**|String|Payment Model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
|**chargeRetireTime**|String|The Expected Release Time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStatus**|String|Cost Payment Status, the value is respectively normal, overdue and arrear.|
### InstanceDiskAttachment
|Name|Type|Description|
|---|---|---|
|**autoDelete**|Boolean|Deleting this disk with the VM automatically when the machine is deleted. The default value is true, which cannot be changed by local.<br>This parameter does not take effect if the data disk in the VM is a monthly package.<br>This parameter does not take effect if the data disk in the VM is a shared data disk.<br>|
|**cloudDisk**|Disk|Cloud Disk Service instance type|
|**deviceName**|String|Data disk logical attach point, value range: vda, vdb, vdc, vdd, vde, vdb, vdg, vdh, vdi|
|**diskCategory**|String|Disk classification, the local disk or data disk is taken.<br>The system disk supports local disk or Cloud Disk Service. The system disk selects local Type, and the user must use the image localDisk type; If the system disk selects the cloud type, the user must use the image of the cloudDisk type.<br>The data disk supports Cloud Disk Service only.<br>|
|**localDisk**|LocalDisk|Local disk instance type|
### Disk
|Name|Type|Description|
|---|---|---|
|**attachments**|DiskAttachment[]|Attach Information|
|**az**|String|AZ, to which the Cloud Disk belongs|
|**charge**|Charge|Configuration Information for Cloud Disk Service Billing|
|**createTime**|String|Cloud Disk Creating Time|
|**description**|String|Description of the Cloud Disk. It allows you to enter all characters under UTF-8 encoding, but no more than 256 characters.|
|**diskId**|String|Cloud Disk ID|
|**diskSizeGB**|Integer|Disk Size, in GiB|
|**diskType**|String|Disk Type, ssd or premium-hdd|
|**multiAttachable**|Boolean|Does the Cloud Disk service support multiple attachments?|
|**name**|String|Name of the Cloud Disk. Only Chinese characters, numbers, uppercase and lowercase letters, English underscores '_' or hyphens '-' are allowed. It is not allowed to be blank and shall not exceed 32 characters.|
|**snapshotId**|String|Snapshot ID used to create the Cloud Disk|
|**status**|String|Status of the Cloud Disk, creating, available, in-use, extending, restoring, deleting, deleted, error_create, error_delete, error_restore or error_extend|
|**tags**|Tag[]|Tag Information|
### DiskAttachment
|Name|Type|Description|
|---|---|---|
|**attachTime**|String|Attaching Time|
|**attachmentId**|String|Attach ID|
|**diskId**|String|Cloud Disk ID|
|**instanceId**|String|ID of Instance Attached|
|**instanceType**|String|Type of the Instance Attached, vm or nc|
|**status**|String|Attaching Status, 'attaching', 'attached', 'detaching' or 'detached'|
### Tag
|Name|Type|Description|
|---|---|---|
|**key**|String|Tag Key|
|**value**|String|Tag Value|
### LocalDisk
|Name|Type|Description|
|---|---|---|
|**diskSizeGB**|Integer|Disk size|
|**diskType**|String|Disk type, value range {premium-hdd,  ssd}|
### InstanceNetworkInterfaceAttachment
|Name|Type|Description|
|---|---|---|
|**autoDelete**|Boolean|Indicates whether the network interface is deleted when deleting an instance, and the default is true, which cannot be changed currently|
|**deviceIndex**|Integer|Device Index|
|**networkInterface**|InstanceNetworkInterface|Network interface API instance type|
### InstanceNetworkInterface
|Name|Type|Description|
|---|---|---|
|**macAddress**|String|Ethernet address|
|**networkInterfaceId**|String|ENI ID|
|**primaryIp**|NetworkInterfacePrivateIp|Network interface primary IP|
|**sanityCheck**|Integer|Source and destination IP address verification with a value of 0 or 1|
|**secondaryIps**|NetworkInterfacePrivateIp[]|Network interface secondary IP|
|**securityGroups**|SecurityGroupSimple[]||
|**subnetId**|String|Subnet ID|
|**vpcId**|String|Virtual Network ID|
### NetworkInterfacePrivateIp
|Name|Type|Description|
|---|---|---|
|**elasticIpAddress**|String|Elastic IP Instance Address|
|**elasticIpId**|String|Elastic IP Instance ID|
|**privateIpAddress**|String|IPV4 Address of Private IP|
### SecurityGroupSimple
|Name|Type|Description|
|---|---|---|
|**groupId**|String|Security groupID|
|**groupName**|String|Security group name|
### Tag
|Name|Type|Description|
|---|---|---|
|**key**|String|Tag key|
|**value**|String|Tag value|

## Return code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found  |
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
