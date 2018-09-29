# describeInstancePrivateIpAddress


## 描述
Query the private IP address of the VM in batches, and query the primary private IP address in the primary network interface.

## 请求方式
GET

## 请求地址
https://vm.jdcloud-api.com/1.0.3/regions/{regionId}/instancePrivateIpAddress

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**filters**|Filter[]|False| |instanceId-VM ID, exact match, multiple supported<br>PrivateIpAddress-primary private IP address of primary network interface, fuzzy match, multiple supported<br>vpcId-Virtual Private Cloud ID, exact match, multiple supported<br>status - Virtual machine status, exact match, multiple supported <a href='https://www.jdcloud.com/help/detail/3869/isCatalog/1'>refer to virtual machine status</a><br>name-VM name, fuzzy match, single supported<br>imageId-Image ID, exact match, multiple supported<br>networkInterfaceId-ENI ID, exact match, multiple supported<br>subnetId-Subnet ID, exact match, multiple supported<br>|
|**pageNumber**|Integer|False|1|Page; 1 by default|
|**pageSize**|Integer|False|20|Paging Size; 20 by default; Value range[10, 100] |

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
|**instancePrivateIpAddress**|InstancePrivateIpAddress[]| |
|**totalCount**|Number| |
### InstancePrivateIpAddress
|名称|类型|描述|
|---|---|---|
|**instanceId**|String|VM ID|
|**privateIpAddress**|String|The primary IP address in the primary network interface|

## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not Found  |
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
