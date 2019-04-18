# getVmInstanceTypes


## Description
Specification List of Virtual Machines

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vm_instanceTypes

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
|**az**|String|False| |Availability Zone|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**instanceTypes**|InstanceTypeInfo[]| |
### InstanceTypeInfo
|Name|Type|Description|
|---|---|---|
|**instanceType**|String|Type|
|**cpu**|Integer|Cores of Processor, Unit: C|
|**memory**|Integer|Memory Size, Unit: M|
|**gpuAmount**|Integer|GPU Count|
|**gpuSpec**|String|GPU Type|
|**localStorageSize**|Integer|Single Capacity of Local Storage|
|**localStorageType**|String|Type of Local Storage|
|**localStorageAmount**|Integer|Count of Local Storages|
|**nicLimit**|Integer|Supported Count of Elastic Network Interfaces|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
