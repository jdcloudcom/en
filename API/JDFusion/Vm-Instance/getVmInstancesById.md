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
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**vm**|VmInfoDetail| |
### VmInfoDetail
|Name|Type|Description|
|---|---|---|
|**az**|String|Availability Zone of Virtual Machines|
|**cloudID**|String|Provider ID of the Cloud|
|**createdTime**|String|Creation Time|
|**dataDiskAttachments**|DataDiskAttachment[]|Configuration Information of Data Disk|
|**description**|String|Description of Virtual Machines|
|**elasticIpAddress**|String|Elastic IP Address Associated to Primary IP of Primary Network Interface|
|**hostName**|String|Virtual Machines|
|**id**|String|Resource ID, in case of null, will execute creation operation, otherwise execute modification operation|
|**imageType**|ImageType| |
|**instanceType**|InstanceType| |
|**keyNames**|String[]|Key Pair Name, JD only supports to import one now|
|**metadata**|String|Extension Information|
|**name**|String|Virtual Machine Name|
|**primaryNetworkInterface**|NetAttachment| |
|**privateIpAddress**|String|Private ip Address|
|**region**|String|Availability Zone, enter according to specifications of cloud platform|
|**secondaryNetworkInterfaces**|NetAttachment[]|Secondary Network Interface Configuration|
|**status**|String|Virtual Machine Status|
|**subnetId**|String|Subnet ID|
|**sysDiskInfo**|SysDiskInfo| |
|**tags**|Tag[]| |
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
|**autoDelete**|String|Whether disk is deleted followed by the deletion of host|
|**diskMediumType**|String|Disk media Category, which is reserved and can be null|
|**diskName**|String|Disk Name|
|**diskSize**|Integer|Hard Disk Size|
|**status**|String|Disk Status|
### ImageType
|Name|Type|Description|
|---|---|---|
|**cloudID**|String|Provider ID of the Cloud|
|**desc**|String|Image Description|
|**id**|String|Image ID|
|**imageSource**|String|Image Source|
|**name**|String|Image Name|
|**osType**|String|Operating System Type of Image|
|**osVersion**|String|Operating System Version of Image|
|**platform**|String|Operating System Release Version of Image|
|**region**|String|Region of Image|
### InstanceType
|Name|Type|Description|
|---|---|---|
|**cpu**|Integer|Cores of Processor, Unit: C|
|**memory**|Integer|Memory Size, Unit: M|
|**name**|String|Name of Instance Configuration Type|
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
|**primaryIp**|Ip| |
|**sanityCheck**|Integer|Source and target IP Address verification, with value of 0 or 1|
|**secondaryIps**|Ip[]|Secondary IP of Network Interface|
|**securityGroups**|SecurityGroup[]|Belonged Security Group List|
|**subnetId**|String|Subnet ID|
|**vpcId**|String|Virtual Network ID|
### Ip
|Name|Type|Description|
|---|---|---|
|**elasticIpAddress**|String|Elastic IP Instance Address|
|**privateIpAddress**|String|IPV4 Address of Private IP|
### SecurityGroup
|Name|Type|Description|
|---|---|---|
|**groupId**|String|Security Group ID|
|**groupName**|String|Security Group Name|
### SysDiskInfo
|Name|Type|Description|
|---|---|---|
|**autoDelete**|String|Whether disk is deleted followed by the deletion of host|
|**diskMediumType**|String|Disk media Category, which is reserved and can be null|
|**diskName**|String|Disk Name|
|**diskSize**|Integer|Hard Disk Size|
|**status**|String|Disk Status|
### Tag
|Name|Type|Description|
|---|---|---|
|**tagKey**|String|KEY Value of Tag|
|**tagValue**|String|Value of Tag Value|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
|**404**|Without Search Results|
