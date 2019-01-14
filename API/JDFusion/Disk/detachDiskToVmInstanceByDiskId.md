# detachDiskToVmInstanceByDiskId


## Description
Detach Cloud Disk from Virtual Machines

## Request Method
PUT

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/disk_disks/{id}:detach

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|True| |Cloud Disk ID|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**body**|DetachDataDiskReq|True| |Detach Cloud Disk from Virtual Machines|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|True| |Cloud Registration Information ID|
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|

### DetachDataDiskReq
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**detach**|DetachDataDisk|False| | |
### DetachDataDisk
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |Virtual Machine id|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


## Return Code
|Return Code|Description|
|---|---|
|**204**|OK|
|**404**|disk not found|
