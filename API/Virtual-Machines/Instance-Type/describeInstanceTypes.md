# describeInstanceTypes


## Description
Query instance type information list


## Request method
GET

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instanceTypes

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**filters**|Filter[]|False||instanceTypes - Instance type, exact match, multiple support<br>az-AZ,  exact match,  multiple supported<br>|

### <a name="Filter">Filter</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True||Name of filter requirements|
|**operator**|String|False||Operator of filter requirements is eq by default|
|**values**|String[]|True||Value of filter requirements|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**instanceTypes**|InstanceType[]|Generic instance type|
|**specificInstanceTypes**|InstanceType[]|User-specific instance type; ticket application required|
|**totalCount**|Integer|Quantity|
### <a name="InstanceType">InstanceType</a>
|Name|Type|Description|
|---|---|---|
|**cpu**|Integer|CPU number|
|**desc**|String|Description|
|**family**|String|Instance type|
|**instanceType**|String|Instance type, such as g.b1.2xlarge|
|**memoryMB**|Integer|Memory size|
|**nicLimit**|Integer|Number of ENI supported|
|**state**|InstanceTypeState[]|Instance type status|
### <a name="InstanceTypeState">InstanceTypeState</a>
|Name|Type|Description|
|---|---|---|
|**az**|String|AZ|
|**inStock**|Boolean|Tradable details, true: available, false: sold out, unavailable|

## Return code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
