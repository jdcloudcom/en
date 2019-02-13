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
|**vms**|VmInfo[]| |
### VmInfo
|Name|Type|Description|
|---|---|---|
|**az**|String|Availability Zone of Virtual Machines|
|**cloudID**|String|Provider ID of the Cloud|
|**createdTime**|String|Creation Time|
|**description**|String|Description of Virtual Machines|
|**elasticIpAddress**|String|Elastic IP Address Associated to Primary IP of Primary Network Interface|
|**hostName**|String|Virtual Machines|
|**id**|String|Resource ID, in case of null, will execute creation operation, otherwise execute modification operation|
|**imageType**|ImageType| |
|**instanceType**|InstanceType| |
|**keyNames**|String[]|Key Pair Name, JD only supports to import one now|
|**name**|String|Virtual Machine Name|
|**privateIpAddress**|String|Private ip Address|
|**region**|String|Availability Zone, enter according to specifications of cloud platform|
|**status**|String|Virtual Machine Status|
|**subnetId**|String|Subnet ID|
|**tags**|Tag[]| |
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
### Tag
|Name|Type|Description|
|---|---|---|
|**tagKey**|String|KEY Value of Tag|
|**tagValue**|String|Value of Tag Value|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
