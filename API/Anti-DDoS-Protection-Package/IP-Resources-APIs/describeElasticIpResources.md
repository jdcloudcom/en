# describeElasticIpResources


## Description
Search VPC elastic IP of Anti-DDoS Protection Package (excluding operator-level NAT reserved address and IPv6)

## Request Method
GET

## Request Address
https://antipro.jdcloud-api.com/v1/regions/{regionId}/elasticIpResources

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
|**region**|String|Public IP Region, cn-north-1, cn-east-1, cn-east-2 and cn-south-1|
|**resourceType**|Integer|Public IP type or associated resource type:<br>  0: Unknown type,<br>  1: Elastic IP (IP is elastic IP, and associated resource type is unknown),<br>  10: Elastic IP (IP is elastic IP, and no resource is associated),<br>  11: Virtual Machines,<br>  12: Load Balancer,<br>  13: Native Container Instance,<br>  14: Native Container Pod,<br>  2: Cloud Physical Server,<br>|
|**ip**|String|EIP Address|
|**bandwidth**|Integer|Bandwidth cap, unit: Mbps|
|**cleanThresholdBps**|Long|Request traffic cleaning trigger value, unit: bps/s|
|**cleanThresholdPps**|Long|Cleaning trigger value of packet request, unit: pps/s|
|**balckHoleThreshold**|Long|Black Hole Threshold|
|**instanceId**|String|Associated protection package ID, if it is 0, it means no protection package is associated|
|**instanceName**|String|Associated protection package name, if it is null character string, it means no protection package is associated|
|**safeStatus**|Integer|Security Status, 0: Secure, 1: Clean, 2: Black Hole|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
