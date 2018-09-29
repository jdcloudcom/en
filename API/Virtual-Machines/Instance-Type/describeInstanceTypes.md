# describeInstanceTypes


## Description
Query instance type information list


## Request method
GET

## Request address
https://vm.jdcloud-api.com/1.0.3/regions/{regionId}/instanceTypes

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**filters**|Filter[]|False| |instanceTypes - Instance type, exact match, multiple support<br>az-AZ, exact match, multiple supported<br>|

### Filter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**instanceTypes**|InstanceType[]|Generic Instance Type|
|**specificInstanceTypes**|InstanceType[]|User-specific instance type; ticket application required|
|**totalCount**|Integer|Quantity|
### InstanceType
|Name|Type|Description|
|---|---|---|
|**cpu**|Integer|CPU Number|
|**desc**|String|Description|
|**family**|String|Instance Type|
|**instanceType**|String|Instance type, such as g.b1.2xlarge|
|**memoryMB**|Integer|Memory Size|
|**nicLimit**|Integer|Number of ENI Supported|
|**state**|InstanceTypeState[]|Instance Type Status|
### InstanceTypeState
|Name|Type|Description|
|---|---|---|
|**az**|String|AZ|
|**inStock**|Boolean|Tradable details, true: available, false: sold out, unavailable|

## Response code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not Found  |
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
