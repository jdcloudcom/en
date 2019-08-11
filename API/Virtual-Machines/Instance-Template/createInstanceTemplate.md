# createInstanceTemplate


## Description
Create an enabling template of the specified parameter, which contains most of the configuration parameters during VM instance creation, for avoiding repeated work during each VM instance creation.<br>
When Virtual Machines are created with enabling templates, the newly specified parameter will replace the parameters in the template, if some specified parameters conflict with the parameters in the template.<br>
When Virtual Machines are created with enabling templates, the dataDisks parameter in the template will be invalid, if the specified image ID is inconsistent with the image ID in the template.<br>
If Availability Group (Ag) is used to create Virtual Machines, the parameters in the template related to Ag cannot be adjusted, and only the template shall prevail.


## Request Method
POST

## Request Address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instanceTemplates

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instanceTemplateData**|InstanceTemplateSpec|True| |Data of Enabling Templates|
|**name**|String|True| |For the enabling template name, <a href="http://docs.jdcloud.com/virtual-machines/api/general_parameters">refer to the public parameter specification</a>.|
|**description**|String|False| |Description of enabling template, <a href="http://docs.jdcloud.com/virtual-machines/api/general_parameters">refer to the public parameter specification</a>.|

### InstanceTemplateSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instanceType**|String|True| |For the instance type, can search the<a href="http://docs.jdcloud.com/virtual-machines/api/describeinstancetypes">DescribeInstanceTypes</a> API to obtain the specification information of the specified region or availability zone.|
|**imageId**|String|True| |For the image ID, can search the <a href="http://docs.jdcloud.com/virtual-machines/api/describeimages">DescribeImages</a>API to obtain the image information of the specified region.|
|**password**|String|False| |For the password, <a href="http://docs.jdcloud.com/virtual-machines/api/general_parameters">refer to the public parameter specification</a>.|
|**keyNames**|String[]|False| |Key Pair Name; only support one now|
|**elasticIp**|InstanceTemplateElasticIpSpec|False| |Elastic IP specification related to primary IP of primary network interface|
|**primaryNetworkInterface**|InstanceTemplateNetworkInterfaceAttachmentSpec|True| |Primary Network Interface Configuration Information|
|**systemDisk**|InstanceTemplateDiskAttachmentSpec|True| |System Disk Configuration Information|
|**dataDisks**|InstanceTemplateDiskAttachmentSpec[]|False| |Configuration Information of Data Disk|
### InstanceTemplateDiskAttachmentSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**diskCategory**|String|False| |Disk Category, with value of local disk (local) or Data Disk (cloud). <br> The system disk supports the local disk (local) or Cloud Disk Service (cloud). In case the local type is selected for the system disk, the localDisk type image must be used; similarly, in case the cloud type is selected for the system disk, the cloudDisk type image must be used. <br>The data disk only supports Cloud Disk Service (cloud). <br>|
|**autoDelete**|Boolean|False| |In case of deletion along with Virtual Machines, the disk is automatically deleted when Virtual Machines are deleted. It is default as true, and the local disk (local) cannot change the value. <br>This parameter is invalid, if the data disk (cloud) in Virtual Machines is in the billing method of monthly package. <br>This parameter is invalid, if the data disk (cloud) in Virtual Machines is of shared type. <br>|
|**cloudDiskSpec**|InstanceTemplateDiskSpec|False| |Data Disk Specification|
|**deviceName**|String|False| |Logical attach point of data disk, value range: vda,vdb,vdc,vdd,vde,vdf,vdg,vdh,vdi,vmj,vdk,vdl,vdm|
|**noDevice**|Boolean|False| |In case of device exclusion, this parameter noDevice is used along with deviceName. <br>Create the template: e.g., deviceName:vdb, noDevice:true, it indicates that the data disk vdb in images cannot be involved in Virtual Machines creation. <br>|
### InstanceTemplateDiskSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**diskType**|String|False| |Cloud Disk Service type, with values of ssd, premium-hdd, hdd.std1, ssd.gp1 and ssd.io1|
|**diskSizeGB**|Integer|False| |Size of Cloud Disk Service is in GiB; the value range of ssd type [20,1000]GB, and the step length is 10G, the value range of premium-hdd type [20,3000]GB, and the step length is 10G, the value range of hdd.std1, ssd.gp1 and ssd.io1 types is [20-16000]GB, and the step length is10GB|
|**snapshotId**|String|False| |The snapshot ID used for creating Cloud Disk Service|
### InstanceTemplateNetworkInterfaceAttachmentSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**deviceIndex**|Integer|False| |Device Index; The index of primary network interface must be 1; only the primary network interface is supported now|
|**autoDelete**|Boolean|False| |Indicate if the network interface is deleted when an instance is deleted, it is true by default; it can only be true now|
|**networkInterface**|InstanceTemplateNetworkInterfaceSpec|True| |Network interface API specification; this field must be filled in now|
### InstanceTemplateNetworkInterfaceSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**subnetId**|String|True| |Subnet ID|
|**securityGroups**|String[]|False| |Security Group ID List|
|**sanityCheck**|Integer|False| |PortSecurity, with value 0 or 1 and default value 1|
### InstanceTemplateElasticIpSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**bandwidthMbps**|Integer|True| |Elastic IP Speed Limit Unit: MB|
|**provider**|String|False| |IP Service Provider, Value: BGP,nonBGP|
|**chargeMode**|String|True| |Billing type, billing by bandwidth supported, billing by flow supported|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**instanceTemplateId**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**429**|Quota exceeded|
|**500**|Internal server error|
|**503**|Service unavailable|
