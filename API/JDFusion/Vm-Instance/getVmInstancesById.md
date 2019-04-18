# getVmInstancesById


## Description
Search information of corresponding VM resource according to the cloud provider

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vm_instances/{id}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|True| |ID of Resource Instance|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**vm**|VmInfoDetail| |
### VmInfoDetail
|Name|Type|Description|
|---|---|---|
|**id**|String|Resource ID, in case of null, will execute creation operation, otherwise execute modification operation|
|**region**|String|Availability Zone, enter according to specifications of cloud platform|
|**az**|String|Availability Zone of Virtual Machines|
|**name**|String|Virtual Machine Name|
|**hostName**|String|Virtual Machines|
|**imageId**|String|Image ID|
|**imageType**|ImageType| |
|**instanceType**|InstanceType| |
|**description**|String|Description of Virtual Machines|
|**subnetId**|String|Subnet ID|
|**tags**|Tag[]| |
|**cloudID**|String|Provider ID of the Cloud|
|**keyNames**|String[]|Key Pair Name, JD only supports to import one now|
|**elasticIpAddress**|String|Elastic IP Address Associated to Primary IP of Primary Network Interface|
|**privateIpAddress**|String|Private ip Address|
|**securityGroupIds**|String[]|Security Group ID|
|**status**|String|Virtual Machine Status|
|**createdTime**|String|Creation Time|
|**sysDiskInfo**|SysDiskInfo| |
|**dataDiskAttachments**|DataDiskAttachment[]|Configuration Information of Data Disk|
|**primaryNetworkInterface**|NetAttachment| |
|**secondaryNetworkInterfaces**|NetAttachment[]|Secondary Network Interface Configuration|
|**metadata**|String|Extension Information|
### NetAttachment
|Name|Type|Description|
|---|---|---|
|**autoDelete**|Boolean|Indicate whether deleting Network Interface when deleting the instance, it is true by default; (it can only be true at present)|
|**deviceIndex**|Integer|Device Index|
|**networkInterface**|NetworkInterface| |
### NetworkInterface
|Name|Type|Description|
|---|---|---|
|**macAddress**|String|Ethernet Address|
|**networkInterfaceId**|String|Elastic Network Interface ID|
|**sanityCheck**|Integer|Source and target IP Address verification, with value of 0 or 1|
|**subnetId**|String|Subnet ID|
|**vpcId**|String|Virtual Network ID|
|**primaryIp**|Ip| |
|**secondaryIps**|Ip[]|Secondary IP of Network Interface|
|**securityGroups**|SecurityGroup[]|Belonged Security Group List|
### SecurityGroup
|Name|Type|Description|
|---|---|---|
|**groupId**|String|Security Group ID|
|**groupName**|String|Security Group Name|
### Ip
|Name|Type|Description|
|---|---|---|
|**elasticIpAddress**|String|Elastic IP Instance Address|
|**privateIpAddress**|String|IPV4 Address of Private IP|
### DataDiskAttachment
|Name|Type|Description|
|---|---|---|
|**autoDelete**|Boolean|Whether to be deleted followed by deletion of Virtual Machines, true: automatically; false: non-automatically|
|**dataDisk**|DataDiskInfo| |
|**deviceName**|String|Logical Attach Point of Data Disk|
|**diskCategory**|String|Disk Category, with value of local disk (local) or Data Disk (cloud)|
### DataDiskInfo
|Name|Type|Description|
|---|---|---|
|**diskId**|String|Hard Disk ID|
|**diskSize**|Integer|Hard Disk Size|
|**diskMediumType**|String|Disk media Category, which is reserved and can be null|
|**diskName**|String|Disk Name|
|**autoDelete**|String|Whether disk is deleted followed by the deletion of host|
|**status**|String|Disk Status|
### SysDiskInfo
|Name|Type|Description|
|---|---|---|
|**diskSize**|Integer|Hard Disk Size|
|**diskMediumType**|String|Disk media Category, which is reserved and can be null|
|**diskName**|String|Disk Name|
|**autoDelete**|String|Whether disk is deleted followed by the deletion of host|
|**status**|String|Disk Status|
### Tag
|Name|Type|Description|
|---|---|---|
|**tagKey**|String|KEY Value of Tag|
|**tagValue**|String|Value of Tag Value|
### InstanceType
|Name|Type|Description|
|---|---|---|
|**name**|String|Name of Instance Configuration Type|
|**cpu**|Integer|Cores of Processor, Unit: C|
|**memory**|Integer|Memory Size, Unit: M|
### ImageType
|Name|Type|Description|
|---|---|---|
|**id**|String|Image ID|
|**desc**|String|Image Description|
|**imageSource**|String|Image Source|
|**name**|String|Image Name|
|**osType**|String|Operating System Type of Image|
|**osVersion**|String|Operating System Version of Image|
|**platform**|String|Operating System Release Version of Image|
|**region**|String|Region of Image|
|**cloudID**|String|Provider ID of the Cloud|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
|**404**|Without Search Results|
