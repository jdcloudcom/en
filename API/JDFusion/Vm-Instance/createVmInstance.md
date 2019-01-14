# createVmInstance


## Description
Create Virtual Machines according to the cloud provider

## Request Method
POST

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vm_instances

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**body**|CreateVmReq|True| |Create VM|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|True| |Cloud Registration Information ID|
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|

### CreateVmReq
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**vms**|CreateVm|False| | |
### CreateVm
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**az**|String|False| |Availability Zone of Virtual Machines|
|**cloudID**|String|False| |Provider ID of the Cloud|
|**createdTime**|String|False| |Creation Time|
|**description**|String|False| |Description of Virtual Machines|
|**elasticIpAddress**|String|False| |Elastic IP Address Associated to Primary IP of Primary Network Interface|
|**hostName**|String|False| |Virtual Machines|
|**id**|String|False| |Resource ID, in case of null, execute creation operation, otherwise execute modification operation|
|**imageId**|String|True| |ID of image file, image resource selected when start instance|
|**imageType**|ImageType|False| | |
|**instanceFlavorType**|String|True| |Instance Type|
|**instanceType**|InstanceType|False| | |
|**internetMaxBandwidthIn**|Integer|False| |No  Maximum Bandwidth of Public Network Inbound, Unit: Mbit/s|
|**internetMaxBandwidthOut**|Integer|False| |No  Maximum Bandwidth of Public Network Outbound, Unit: Mbit/s|
|**keyNames**|String[]|False| |Key Pair Name, JD only supports to import one now|
|**keyPairName**|String|False| |No  Key Pair Name|
|**name**|String|True| |Virtual Machine Name|
|**password**|String|False| |No  Password of Instance|
|**passwordInherit**|Boolean|False| |No  Whether use password preset in image|
|**privateIpAddress**|String|False| |Private ip Address|
|**region**|String|False| |Availability Zone, enter according to specifications of cloud platform|
|**securityGroupId**|String|False| |Designate Security Group code of created instance, instances within the same Security Group can access mutually|
|**status**|String|False| |Virtual Machine Status|
|**subnetId**|String|True| |Subnet ID|
|**systemDisk**|SystemDisk|False| | |
|**tags**|Tag[]|False| | |
|**userData**|String|False| |No  Customized data of instance need to be coded by Base64 method, and the ceiling of raw data is 16KB|
### ImageType
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**cloudID**|String|False| |Provider ID of the Cloud|
|**desc**|String|False| |Image Description|
|**id**|String|False| |Image ID|
|**imageSource**|String|False| |Image Source|
|**name**|String|False| |Image Name|
|**osType**|String|False| |Operating System Type of Image|
|**osVersion**|String|False| |Operating System Version of Image|
|**platform**|String|False| |Operating System Release Version of Image|
|**region**|String|False| |Region of Image|
### InstanceType
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**cpu**|Integer|False| |Cores of Processor, Unit: C|
|**memory**|Integer|False| |Memory Size, Unit: M|
|**name**|String|False| |Name of Instance Configuration Type|
### SystemDisk
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**category**|String|False| |No  Disk Type of System Disk|
|**description**|String|False| |System Disk Description|
|**diskSize**|Integer|False| |System Disk Size|
### Tag
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**tagKey**|String|False| |KEY Value of Tag|
|**tagValue**|String|False| |Value of Tag Value|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**task**|ResourceTFInfo| |
### ResourceTFInfo
|Name|Type|Description|
|---|---|---|
|**body**|String|Request Body|
|**cloudId**|String|cloud ID|
|**createdTime**|String|Creation Time|
|**provider**|String|cloud provider|
|**result**|String|Execution Results|
|**status**|String|Status|
|**updateTime**|String|Update Time|
|**userId**|String|user ID|
|**uuid**|String|uuid|

## Return Code
|Return Code|Description|
|---|---|
|**201**|CREATED|
