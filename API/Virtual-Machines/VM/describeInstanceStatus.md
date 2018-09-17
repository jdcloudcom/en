# describeInstanceStatus


## Description
Batch Query VM Status

## Request method
GET

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instanceStatus

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**filters**|[Filter[]](##Filter)|False||instanceId-VM ID, exact match, multiple supported<br>PrivateIpAddress-primary private IP address of primary network interface, fuzzy match, multiple supported<br>vpcId-Virtual Private Cloud ID, exact match, multiple supported<br>status-virtual machine status,  match exactly,  support multiple,  <a href="https://www.jdcloud.com/help/detail/3869/isCatalog/1">refer to virtual machine status</a><br>name-VM name, fuzzy match, single supported<br>imageId-Image ID, exact match, multiple supported<br>networkInterfaceId-ENI ID, exact match, multiple supported<br>subnetId-subnet ID, exact match, multiple supported<br>|
|**pageNumber**|Integer|False|1|Page; 1 by default|
|**pageSize**|Integer|False|20|Paging size; 20 by default;Value range[10, 100] |

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
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**instanceStatuses**|[InstanceStatus[]](##InstanceStatus)||
|**totalCount**|Number||
### <a name="InstanceStatus">InstanceStatus</a>
|Name|Type|Description|
|---|---|---|
|**instanceId**|String|VM ID|
|**status**|String|<a href="https://www.jdcloud.com/help/detail/3869/isCatalog/1">参考云主机状态</a>|

## Return code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
