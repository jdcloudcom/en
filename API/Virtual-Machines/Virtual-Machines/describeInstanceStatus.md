# describeInstanceStatus


## Description
Batch Query of VM Status

## Request method
GET

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instanceStatus

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**filters**|Filter[]|False| |instanceId-VM ID, exact match, multiple supported<br>PrivateIpAddress-primary intranet IP of primary network interface, fuzzy match, multiple supported<br>vpcId-VPC ID, exact match, multiple supported<br>status - Virtual machine status, exact match, multiple supported <a href="http://docs.jdcloud.com/virtual-machines/api/vm_status">refer to virtual machine status</a><br>name-VM name, fuzzy match, single supported<br>imageId-Image ID, exact match, multiple supported<br>networkInterfaceId-ENI ID, exact match, multiple supported<br>subnetId-Subnet ID, exact match, multiple supported<br>|
|**pageNumber**|Integer|False|1|Page; 1 by default|
|**pageSize**|Integer|False|20|Paging Size; 20 by default; Value range[10, 100] |

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
|**instanceStatuses**|InstanceStatus[]| |
|**totalCount**|Number| |
### InstanceStatus
|Name|Type|Description|
|---|---|---|
|**instanceId**|String|VM ID|
|**status**|String|<a href="http://docs.jdcloud.com/virtual-machines/api/vm_status">Refer to virtual machine status</a>|

## Response code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
