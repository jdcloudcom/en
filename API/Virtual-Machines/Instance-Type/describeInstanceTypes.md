# describeInstanceTypes


## Description
Query instance type list.


## Request method
GET

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instanceTypes

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**filters**|Filter[]|False| |instanceTypes - Instance type, exact match, multiple support<br>az-Availability Zone, exact match, multiple supported<br>|

### Filter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|
|**name**|String|True| |Name of Filter Requirements|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**totalCount**|Integer|Total Number|
|**instanceTypes**|InstanceType[]|Generic Instance Type|
|**specificInstanceTypes**|InstanceType[]|User-specific instance type; ticket application required|
### InstanceType
|Name|Type|Description|
|---|---|---|
|**family**|String|Instance Type|
|**instanceType**|String|Instance type, such as g.b1.2xlarge|
|**memoryMB**|Integer|Memory Size|
|**state**|InstanceTypeState[]|Instance Type Status|
|**nicLimit**|Integer|Number of Elastic Network Interface Supported|
|**gpu**|Gpu|Gpu configuration|
|**localDisks**|LocalDisk[]|Configuration of local cache disk, only available for Gpu specification|
|**cpu**|Integer|CPU Number|
|**desc**|String|Description|
### LocalDisk
|Name|Type|Description|
|---|---|---|
|**diskSizeGB**|Integer|Disk Size|
|**diskType**|String|Disk Type, value range {premium-hdd, ssd}|
### Gpu
|Name|Type|Description|
|---|---|---|
|**model**|String|GPU Type|
|**number**|Integer|GPU Count|
### InstanceTypeState
|Name|Type|Description|
|---|---|---|
|**az**|String|Availability Zone|
|**inStock**|Boolean|Tradable details, true: available, false: sold out, unavailable|

## Response code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
