# describeInstanceTypes


## 描述
Query instance type information list


## 请求方式
GET

## 请求地址
https://vm.jdcloud-api.com/v1/regions/{regionId}/instanceTypes

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**filters**|[Filter[]](##Filter)|False||instanceTypes - Instance type, exact match, multiple support<br>az-AZ,  exact match,  multiple supported<br>|

### <a name="Filter">Filter</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**name**|String|True||Name of filter requirements|
|**operator**|String|False||Operator of filter requirements is eq by default|
|**values**|String[]|True||Value of filter requirements|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**instanceTypes**|[InstanceType[]](##InstanceType)|Generic instance type|
|**specificInstanceTypes**|[InstanceType[]](##InstanceType)|User-specific instance type; ticket application required|
|**totalCount**|Integer|Quantity|
### <a name="InstanceType">InstanceType</a>
|名称|类型|描述|
|---|---|---|
|**cpu**|Integer|CPU number|
|**desc**|String|Description|
|**family**|String|Instance type|
|**instanceType**|String|Instance type, such as g.b1.2xlarge|
|**memoryMB**|Integer|Memory size|
|**nicLimit**|Integer|Number of ENI supported|
|**state**|[InstanceTypeState[]](##InstanceTypeState)|Instance type status|
### <a name="InstanceTypeState">InstanceTypeState</a>
|名称|类型|描述|
|---|---|---|
|**az**|String|AZ|
|**inStock**|Boolean|Tradable details, true: available, false: sold out, unavailable|

## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
