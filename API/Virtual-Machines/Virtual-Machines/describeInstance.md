# describeInstance


## Description
Query detailed information of a VM.


## Request method
GET

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceId**|String|True| |VM ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**instance**|Instance| |
### Instance
|Name|Type|Description|
|---|---|---|
|**instanceId**|String|VM ID|
|**instanceName**|String|VM Name|
|**instanceType**|String|Instance Type|
|**vpcId**|String|ID of the VPC to which the primary network interface belongs|
|**subnetId**|String|ID of the subnet to which the primary network interface belongs|
|**privateIpAddress**|String|Primary IP address of primary network interface|
|**elasticIpId**|String|The ID of the primary IP of primary network interface associating EIP|
|**elasticIpAddress**|String|The address of the primary IP of primary network interface associating EIP|
|**status**|String|Virtual machine status,<a href="http://docs.jdcloud.com/virtual-machines/api/vm_status">Refer to virtual machine status</a>|
|**description**|String|VM Description|
|**imageId**|String|Image ID|
|**systemDisk**|InstanceDiskAttachment|System Disk Configuration|
|**dataDisks**|InstanceDiskAttachment[]|Data Disk Configuration|
|**primaryNetworkInterface**|InstanceNetworkInterfaceAttachment|Primary Network Interface Instance Type|
|**secondaryNetworkInterfaces**|InstanceNetworkInterfaceAttachment[]|Secondary Network Interface Instance Type|
|**launchTime**|String|Creation Time|
|**az**|String|Availability Zone of the VM|
|**keyNames**|String[]|Key Pair Name|
|**charge**|Charge|Billing Information|
|**ag**|Ag|Availability Group, where an AG is used to create VM, the AG name can be displayed here|
|**faultDomain**|String|Error Domains in AGs|
|**tags**|Tag[]|Tag Information|
### Tag
|Name|Type|Description|
|---|---|---|
|**key**|String|Tag Key|
|**value**|String|Tag Value|
### Ag
|Name|Type|Description|
|---|---|---|
|**name**|String|AG Name|
|**id**|String|AG id|
### Charge
|Name|Type|Description|
|---|---|---|
|**chargeMode**|String|Payment Model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
|**chargeStatus**|String|Cost Payment Status, the value is respectively normal, overdue and arrear.|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeExpiredTime**|String|Expiration Time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeRetireTime**|String|The Expected Release Time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
### InstanceNetworkInterfaceAttachment
|Name|Type|Description|
|---|---|---|
|**deviceIndex**|Integer|Device Index|
|**autoDelete**|Boolean|Indicates whether the network interface is deleted when deleting an instance, and the default is true, which cannot be changed currently|
|**networkInterface**|InstanceNetworkInterface|Network Interface API Instance Type|
### InstanceNetworkInterface
|Name|Type|Description|
|---|---|---|
|**networkInterfaceId**|String|ENI ID|
|**macAddress**|String|Ethernet Address|
|**vpcId**|String|Virtual Network ID|
|**subnetId**|String|Subnet ID|
|**securityGroups**|SecurityGroupSimple[]| |
|**sanityCheck**|Integer|Source and target IP address verification, with value 0 or 1|
|**primaryIp**|NetworkInterfacePrivateIp|Network Interface Primary IP|
|**secondaryIps**|NetworkInterfacePrivateIp[]|Network Interface Secondary IP|
### NetworkInterfacePrivateIp
|Name|Type|Description|
|---|---|---|
|**privateIpAddress**|String|IPV4 Address of Private IP|
|**elasticIpId**|String|Elastic IP Instance ID|
|**elasticIpAddress**|String|Elastic IP Instance Address|
### SecurityGroupSimple
|Name|Type|Description|
|---|---|---|
|**groupId**|String|Security Group ID|
|**groupName**|String|Security Group Name|
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
