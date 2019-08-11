# describeInstanceTemplate


## Description
Search the details of enabling templates


## Request Method
GET

## Request Address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instanceTemplates/{instanceTemplateId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceTemplateId**|String|True| |Enable the template ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**instanceTemplate**|InstanceTemplate| |
### InstanceTemplate
|Name|Type|Description|
|---|---|---|
|**id**|String|Enable the template ID|
|**name**|String|Enabling Template Name|
|**description**|String|Description of Enabling Template|
|**instanceTemplateData**|InstanceTemplateData|Data of Enabling Templates|
|**ags**|Ag[]|Related Availability Group (ag) Information|
|**createdTime**|String|Creation Time|
### Ag
|Name|Type|Description|
|---|---|---|
|**name**|String|Availability Group Name|
|**id**|String|Availability Group id|
### InstanceTemplateData
|Name|Type|Description|
|---|---|---|
|**instanceType**|String|Instance Type|
|**vpcId**|String|ID of primary network interface’s VPC|
|**imageId**|String|Image ID|
|**includePassword**|Boolean|Whether the enabling template contains the customized password, true: Yes, false: No|
|**systemDisk**|InstanceTemplateDiskAttachment|System Disk Information|
|**dataDisks**|InstanceTemplateDiskAttachment[]|Data disk information, when being used as the Virtual Machines of the system disk, the local disk (local type) can be attached with 8 data disks, while the Virtual Machines of which Cloud Disk Service (cloud type) serve as the system disk can be attached with 7 data disks.|
|**primaryNetworkInterface**|InstanceTemplateNetworkInterfaceAttachment|Primary Network Interface Information|
|**elasticIp**|InstanceTemplateElasticIp|Elastic IP specification related to primary IP of primary network interface|
|**keyNames**|String[]|Key Pair Name; only support one now|
### InstanceTemplateElasticIp
|Name|Type|Description|
|---|---|---|
|**bandwidthMbps**|Integer|Elastic IP Speed Limit Unit: MB|
|**provider**|String|IP Service Provider, Value: BGP,nonBGP|
|**chargeMode**|String|Billing type, billing by bandwidth supported, billing by flow supported|
### InstanceTemplateNetworkInterfaceAttachment
|Name|Type|Description|
|---|---|---|
|**deviceIndex**|Integer|Device Index; The index of primary network interface must be 1; only the primary network interface is supported now|
|**autoDelete**|Boolean|Indicate if the network interface is deleted when an instance is deleted, it is true by default; it can only be true now|
|**networkInterface**|InstanceTemplateNetworkInterface|Network Interface API Specification; this field must be filled in now|
### InstanceTemplateNetworkInterface
|Name|Type|Description|
|---|---|---|
|**subnetId**|String|Subnet ID|
|**securityGroups**|String[]|Security Group ID List|
|**sanityCheck**|Integer|PortSecurity, with value 0 or 1 and default value 1|
### InstanceTemplateDiskAttachment
|Name|Type|Description|
|---|---|---|
|**diskCategory**|String|Disk Category, with value of local disk (local) or Data Disk (cloud). <br> The system disk supports the local disk (local) or Cloud Disk Service (cloud). In case the local type is selected for the system disk, the localDisk type image must be used; similarly, in case the cloud type is selected for the system disk, the cloudDisk type image must be used. <br>The data disk only supports Cloud Disk Service (cloud). <br>|
|**autoDelete**|Boolean|In case of deletion along with Virtual Machines, the disk is automatically deleted when Virtual Machines are deleted. It is default as true, and the local disk (local) cannot change the value. <br>This parameter is invalid, if the data disk (cloud) in Virtual Machines is in the billing method of monthly package. <br>This parameter is invalid, if the data disk (cloud) in Virtual Machines is of shared type. <br>|
|**instanceTemplateDisk**|InstanceTemplateDisk|Data Disk Configuration|
|**deviceName**|String|Logical attach point of data disk, value range: vda,vdb,vdc,vdd,vde,vdf,vdg,vdh,vdi,vmj,vdk,vdl,vdm. It isn’t required for system disk, and is available only in the case of data disk.|
|**noDevice**|Boolean|In case of device exclusion, this parameter noDevice is used along with deviceName. <br>Create the entire machine image: e.g., deviceName:vdb, noDevice:true, so it indicates that the data disk vdb in Virtual Machines isn’t involved in image creation. <br>Create the template: e.g., deviceName:vdb, noDevice:true, it indicates that the data disk vdb in images cannot be involved in Virtual Machines creation. <br>Virtual machines creation: e.g., deviceName:vdb, noDevice:true, so it indicates that the data disk vdb or template (machines are created with templates) in images isn’t involved in machine creation. <br>|
### InstanceTemplateDisk
|Name|Type|Description|
|---|---|---|
|**diskType**|String|Cloud Disk Service type, with values of ssd, premium-hdd, hdd.std1, ssd.gp1 and ssd.io1|
|**diskSizeGB**|Integer|Size of Cloud Disk Service is in GiB; the value range of ssd type [20,1000]GB, and the step length is 10G, the value range of premium-hdd type [20,3000]GB, and the step length is 10G, the value range of hdd.std1, ssd.gp1 and ssd.io1 types is [20-16000]GB, and the step length is10GB|
|**snapshotId**|String|The snapshot ID used for creating Cloud Disk Service|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
