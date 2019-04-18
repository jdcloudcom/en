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
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|True| |Cloud Registration Information ID|
|**vm**|CreateVm|True| |Create VM|

### CreateVm
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|False| |Resource ID, in case of null, execute creation operation, otherwise execute modification operation|
|**region**|String|False| |Availability Zone, enter according to specifications of cloud platform|
|**az**|String|False| |Availability Zone of Virtual Machines|
|**name**|String|True| |Virtual Machine Name|
|**hostName**|String|False| |Virtual Machines|
|**imageType**|ImageType|False| | |
|**instanceType**|InstanceType|False| | |
|**description**|String|False| |Description of Virtual Machines|
|**subnetId**|String|True| |Subnet ID|
|**tags**|Tag[]|False| | |
|**cloudID**|String|False| |Provider ID of the Cloud|
|**keyNames**|String[]|False| |Key Pair Name, JD only supports to import one now|
|**elasticIpAddress**|String|False| |Elastic IP Address Associated to Primary IP of Primary Network Interface|
|**privateIpAddress**|String|False| |Private ip Address|
|**status**|String|False| |Virtual Machine Status|
|**createdTime**|String|False| |Creation Time|
|**imageId**|String|True| |ID of image file, image resource selected when start instance|
|**instanceFlavorType**|String|True| |Instance Type|
|**securityGroupId**|String|False| |Designate Security Group code of created instance, instances within the same Security Group can access mutually|
|**internetMaxBandwidthIn**|Integer|False| |No  Maximum Bandwidth of Public Network Inbound, Unit: Mbit/s|
|**internetMaxBandwidthOut**|Integer|False| |No  Maximum Bandwidth of Public Network Outbound, Unit: Mbit/s|
|**password**|String|False| |No  Password of Instance|
|**passwordInherit**|Boolean|False| |No  Whether use password preset in image|
|**userData**|String|False| |No  Customized data of instance need to be coded by Base64 method, and the ceiling of raw data is 16KB|
|**keyPairName**|String|False| |No  Key Pair Name|
|**systemDisk**|SystemDisk|False| | |
### SystemDisk
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**category**|String|False| |No  Disk Type of System Disk|
|**diskSize**|Integer|False| |System Disk Size|
|**description**|String|False| |System Disk Description|
### Tag
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**tagKey**|String|False| |KEY Value of Tag|
|**tagValue**|String|False| |Value of Tag Value|
### InstanceType
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|False| |Name of Instance Configuration Type|
|**cpu**|Integer|False| |Cores of Processor, Unit: C|
|**memory**|Integer|False| |Memory Size, Unit: M|
### ImageType
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|False| |Image ID|
|**desc**|String|False| |Image Description|
|**imageSource**|String|False| |Image Source|
|**name**|String|False| |Image Name|
|**osType**|String|False| |Operating System Type of Image|
|**osVersion**|String|False| |Operating System Version of Image|
|**platform**|String|False| |Operating System Release Version of Image|
|**region**|String|False| |Region of Image|
|**cloudID**|String|False| |Provider ID of the Cloud|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**task**|ResourceTFInfo| |
### ResourceTFInfo
|Name|Type|Description|
|---|---|---|
|**uuid**|String|uuid|
|**body**|String|Request Body|
|**status**|String|Status|
|**result**|String|Execution Results|
|**createdTime**|String|Creation Time|
|**updateTime**|String|Update Time|
|**provider**|String|cloud provider|
|**cloudId**|String|cloud ID|
|**userId**|String|user ID|

## Return Code
|Return Code|Description|
|---|---|
|**201**|CREATED|
