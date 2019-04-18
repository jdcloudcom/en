# getVmInstances


## Description
Search Information of corresponding Virtual Machine resource according to the cloud provider

## Request Method
GET

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
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**vms**|VmInfo[]| |
### VmInfo
|Name|Type|Description|
|---|---|---|
|**id**|String|Resource ID, in case of null, will execute creation operation, otherwise execute modification operation|
|**region**|String|Availability Zone, enter according to specifications of cloud platform|
|**az**|String|Availability Zone of Virtual Machines|
|**name**|String|Virtual Machine Name|
|**hostName**|String|Virtual Machines|
|**imageType**|ImageType| |
|**instanceType**|InstanceType| |
|**description**|String|Description of Virtual Machines|
|**subnetId**|String|Subnet ID|
|**tags**|Tag[]| |
|**cloudID**|String|Provider ID of the Cloud|
|**keyNames**|String[]|Key Pair Name, JD only supports to import one now|
|**elasticIpAddress**|String|Elastic IP Address Associated to Primary IP of Primary Network Interface|
|**privateIpAddress**|String|Private ip Address|
|**status**|String|Virtual Machine Status|
|**createdTime**|String|Creation Time|
|**imageId**|String|Image ID|
|**securityGroupIds**|String[]|Security Group ID|
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
