# describeInstanceTypes


## Description
Search instance type information list


## Request Method
GET

## Request Address
https://nativecontainer.jdcloud-api.com/v1/regions/{regionId}/instanceTypes

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**filters**|[Filter[]](describeinstancetypes#filter)|False| |instanceTypes - Instance Type, exact match, supporting multiple<br>az - Availability Zone, exact match, supporting multiple<br>|

### <div id="filter">Filter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeinstancetypes#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**instanceTypes**|[InstanceType[]](describeinstancetypes#instancetype)|General Instance Type|
|**specificInstanceTypes**|[InstanceType[]](describeinstancetypes#instancetype)|User specific instance type; Need to open a ticket for application|
|**totalCount**|Integer|Total Count|
### <div id="instancetype">InstanceType</div>
|Name|Type|Description|
|---|---|---|
|**family**|String|Instance Type|
|**instanceType**|String|Instance type, e.g. g.b1.2xlarge|
|**cpu**|Integer|cpu count|
|**memoryMB**|Integer|Memory Size|
|**nicLimit**|Integer|Supported Count of Elastic Network Interfaces|
|**desc**|String|Description|
|**state**|[InstanceTypeState[]](describeinstancetypes#instancetypestate)|Specification Status|
### <div id="instancetypestate">InstanceTypeState</div>
|Name|Type|Description|
|---|---|---|
|**az**|String|Availability Zone|
|**inStock**|Boolean|Availability for sale, true: Available for sale, false: Sold out and unavailable|
|**online**|Boolean|Online situation, true: Online, false: Offline and unavailable|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
