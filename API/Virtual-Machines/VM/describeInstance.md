# describeInstance


## 描述
Query details for a VM


## 请求方式
GET

## 请求地址
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True||VM ID|
|**regionId**|String|True||Region ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**instance**|[Instance](##Instance)||
### <a name="Instance">Instance</a>
|名称|类型|描述|
|---|---|---|
|**ag**|[Ag](##Ag)|AG, where an AG is used to create a VM, an AG name can be displayed here|
|**az**|String|The AZ of the VM|
|**charge**|[Charge](##Charge)|Billing information|
|**dataDisks**|[InstanceDiskAttachment[]](##InstanceDiskAttachment)|Data disk configuration|
|**description**|String|VM description|
|**elasticIpAddress**|String|The address of the primary network interface of primary IP associating EIP|
|**elasticIpId**|String|The ID of the primary network interface of primary IP associating EIP|
|**faultDomain**|String|Error domains in AGs|
|**imageId**|String|Image ID|
|**instanceId**|String|VM ID|
|**instanceName**|String|VM name|
|**instanceType**|String|Instance type|
|**keyNames**|String[]|Key pair name|
|**launchTime**|String|Creation time|
|**primaryNetworkInterface**|[InstanceNetworkInterfaceAttachment](##InstanceNetworkInterfaceAttachment)|Primary network interface instance type|
|**privateIpAddress**|String|IP address of primary network interface|
|**secondaryNetworkInterfaces**|[InstanceNetworkInterfaceAttachment[]](##InstanceNetworkInterfaceAttachment)|Secondary network interface instance type|
|**status**|String|云主机状态，<a href="https://www.jdcloud.com/help/detail/3869/isCatalog/1">参考云主机状态</a>|
|**subnetId**|String|ID of the subnet to which the primary network interface belongs|
|**systemDisk**|[InstanceDiskAttachment](##InstanceDiskAttachment)|System disk configuration|
|**tags**|[Tag[]](##Tag)|Tag information|
|**vpcId**|String|ID of the VPC to which the primary network interface belongs|
### <a name="Ag">Ag</a>
|名称|类型|描述|
|---|---|---|
|**id**|String|AG id|
|**name**|String|AG name|
### <a name="Charge">Charge</a>
|名称|类型|描述|
|---|---|---|
|**chargeExpiredTime**|String|Expiration time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeMode**|String|Payment model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
|**chargeRetireTime**|String|The expected release time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStatus**|String|Cost payment status, the value is respectively normal, overdue and arrear.|
### <a name="InstanceDiskAttachment">InstanceDiskAttachment</a>
|名称|类型|描述|
|---|---|---|
|**autoDelete**|Boolean|Deleting this disk with the VM automatically when the machine is deleted. The default value is true, which cannot be changed by local.<br>This parameter does not take effect if the data disk in the VM is a monthly package.<br>This parameter does not take effect if the data disk in the VM is a shared data disk.<br>|
|**cloudDisk**|[Disk](##Disk)|Cloud disk service instance type|
|**deviceName**|String|Data disk logical attach point, value range: vda, vdb, vdc, vdd, vde, vdb, vdg, vdh, vdi|
|**diskCategory**|String|Disk classification, the local disk or data disk is taken.<br>The system disk supports local disk or cloud disk. The system disk selects local Type, and the user must use the image localDisk type; If the system disk selects the cloud type, the user must use the image of the cloudDisk type.<br>The data disk supports cloud disk only.<br>|
|**localDisk**|[LocalDisk](##LocalDisk)|Local disk instance type|
### <a name="Disk">Disk</a>
|名称|类型|描述|
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
|名称|类型|描述|
|---|---|---|
|**attachTime**|String|Attaching Time|
|**attachmentId**|String|Attach ID|
|**diskId**|String|Cloud Disk Service ID|
|**instanceId**|String|ID of instance attached|
|**instanceType**|String|Type of the instance  attached, vm or nc|
|**status**|String|Attaching state, "attaching", "attached", "detaching" or "detached"|
### <a name="Tag">Tag</a>
|名称|类型|描述|
|---|---|---|
|**key**|String|Tag Key|
|**value**|String|Tag Value|
### <a name="LocalDisk">LocalDisk</a>
|名称|类型|描述|
|---|---|---|
|**diskSizeGB**|Integer|Disk size|
|**diskType**|String|Disk type, value range {premium-hdd,  ssd}|
### <a name="InstanceNetworkInterfaceAttachment">InstanceNetworkInterfaceAttachment</a>
|名称|类型|描述|
|---|---|---|
|**autoDelete**|Boolean|Indicates whether the network interface is deleted when deleting an instance, and the default is true, which cannot be changed currently|
|**deviceIndex**|Integer|Device Index|
|**networkInterface**|[InstanceNetworkInterface](##InstanceNetworkInterface)|Network interface API instance type|
### <a name="InstanceNetworkInterface">InstanceNetworkInterface</a>
|名称|类型|描述|
|---|---|---|
|**macAddress**|String|Ethernet address|
|**networkInterfaceId**|String|ENI ID|
|**primaryIp**|[NetworkInterfacePrivateIp](##NetworkInterfacePrivateIp)|Network interface primary IP|
|**sanityCheck**|Integer|Source and destination IP address verification with a value of 0 or 1|
|**secondaryIps**|[NetworkInterfacePrivateIp[]](##NetworkInterfacePrivateIp)|Network interface secondary IP|
|**securityGroups**|[SecurityGroupSimple[]](##SecurityGroupSimple)||
|**subnetId**|String|Subnet ID|
|**vpcId**|String|Virtual Network ID|
### <a name="NetworkInterfacePrivateIp">NetworkInterfacePrivateIp</a>
|名称|类型|描述|
|---|---|---|
|**elasticIpAddress**|String|Elastic IP instance address|
|**elasticIpId**|String|Elastic IP instance ID|
|**privateIpAddress**|String|IPV4 address of private IP|
### <a name="SecurityGroupSimple">SecurityGroupSimple</a>
|名称|类型|描述|
|---|---|---|
|**groupId**|String|Security groupID|
|**groupName**|String|Security group name|
### <a name="Tag">Tag</a>
|名称|类型|描述|
|---|---|---|
|**key**|String|Tag key|
|**value**|String|Tag value|

## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
