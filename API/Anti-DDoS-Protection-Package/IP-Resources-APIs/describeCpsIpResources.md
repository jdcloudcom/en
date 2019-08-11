# describeCpsIpResources


## Description
Search public IP of Cloud Physical Server protected by Anti-DDoS Protection Package (including elastic IP of Cloud Physical Server and public IP of basic network instance of Cloud Physical Server)

## Request Method
GET

## Request Address
https://antipro.jdcloud-api.com/v1/regions/{regionId}/cpsIpResources

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, now the protection package is supported in: cn-north-1, cn-east-1 and cn-east-2|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page|
|**pageSize**|Integer|False|10|Paging Size|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |
|**error**|Error| |

### Error
|Name|Type|Description|
|---|---|---|
|**err**|Err| |
### Err
|Name|Type|Description|
|---|---|---|
|**code**|Long|Same as http code|
|**details**|Object| |
|**message**|String| |
|**status**|String|Specific Error|
### Result
|Name|Type|Description|
|---|---|---|
|**dataList**|IpResource[]| |
|**currentCount**|Integer|Current Page Counts|
|**totalCount**|Integer|Total Instance Counts|
|**totalPage**|Integer|Total Number of Pages|
### IpResource
|Name|Type|Description|
|---|---|---|
|**region**|String|Region where public IP is located|
|**resourceType**|Integer|Public IP type or associated resource type.<br>- 0: Unknown type,<br>- 1: Elastic IP (IP is elastic IP, and associated resource type is unknown),<br>- 10: Elastic IP (IP is elastic IP, and no resource is associated),<br>- 11: Virtual Machines,<br>- 12: Load Balancer,<br>- 13: Native Container Instance,<br>- 14: Native Container Pod,<br>- 2: Public IP of Cloud Physical Server,<br>- 4: Public IP of Cabinet Service|
|**ip**|String|EIP Address|
|**bandwidth**|Integer|Bandwidth cap, unit: Mbps|
|**cleanThresholdBps**|Long|Request traffic cleaning trigger value, unit: bps/s|
|**cleanThresholdPps**|Long|Cleaning trigger value of packet request, unit: pps/s|
|**balckHoleThreshold**|Long|Black Hole Threshold|
|**instanceId**|String|Associated protection package ID, if it is null character string, it means no protection package is associated|
|**instanceName**|String|Associated protection package name, if it is null character string, it means no protection package is associated|
|**safeStatus**|Integer|Security Status, <br>- 0: Secure<br>- 1: Clean<br>- 2: Black Hole|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
