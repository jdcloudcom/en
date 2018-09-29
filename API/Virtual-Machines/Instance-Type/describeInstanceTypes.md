# describeInstanceTypes


## 描述
Query instance type information list


## 请求方式
GET

## 请求地址
https://vm.jdcloud-api.com/1.0.3/regions/{regionId}/instanceTypes

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**filters**|Filter[]|False| |instanceTypes - Instance type, exact match, multiple support<br>az-AZ, exact match, multiple supported<br>|

### Filter
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**instanceTypes**|InstanceType[]|Generic Instance Type|
|**specificInstanceTypes**|InstanceType[]|User-specific instance type; ticket application required|
|**totalCount**|Integer|Quantity|
### InstanceType
|名称|类型|描述|
|---|---|---|
|**cpu**|Integer|CPU Number|
|**desc**|String|Description|
|**family**|String|Instance Type|
|**instanceType**|String|Instance type, such as g.b1.2xlarge|
|**memoryMB**|Integer|Memory Size|
|**nicLimit**|Integer|Number of ENI Supported|
|**state**|InstanceTypeState[]|Instance Type Status|
### InstanceTypeState
|名称|类型|描述|
|---|---|---|
|**az**|String|AZ|
|**inStock**|Boolean|Tradable details, true: available, false: sold out, unavailable|

## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not Found  |
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
