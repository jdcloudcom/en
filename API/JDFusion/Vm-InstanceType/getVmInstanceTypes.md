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
|**instanceTypes**|InstanceTypeInfo[]| |
### InstanceTypeInfo
|Name|Type|Description|
|---|---|---|
|**cpu**|Integer|Cores of Processor, Unit: C|
|**gpuAmount**|Integer|GPU Count|
|**gpuSpec**|String|GPU Type|
|**instanceType**|String|Type|
|**localStorageAmount**|Integer|Count of Local Storages|
|**localStorageSize**|Integer|Single Capacity of Local Storage|
|**localStorageType**|String|Type of Local Storage|
|**memory**|Integer|Memory Size, Unit: M|
|**nicLimit**|Integer|Supported Count of Elastic Network Interfaces|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
