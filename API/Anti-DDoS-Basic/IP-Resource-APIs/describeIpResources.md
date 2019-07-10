# describeIpResources


## Description
Search public IP security information list, including VPC elastic IP (except reserved address of operator-level NAT), public IP and elastic IP of Cloud Physical Server. (obsolete, <a href="http://docs.jdcloud.com/anti-ddos-basic/api/describeelasticipresources">describeElasticIpResources</a> and <a href="http://docs.jdcloud.com/anti-ddos-basic/api/describecpsipresources">describeCpsIpResources</a> APIs are recommended)"


## Request Method
GET

## Request Address
https://baseanti.jdcloud-api.com/v1/regions/{regionId}/ipResources

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code. Anti-DDoS Basic is supported in cn-north-1, cn-east-1, cn-east-2, and cn-south-1|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ip**|String|False| |IP Fuzzy Matching|


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
|**totalCount**|Integer| |
### IpResource
|Name|Type|Description|
|---|---|---|
|**region**|String|Region code where public IP is located|
|**resourceType**|Integer|Public IP type or associated resource type:<br>  0: Unknown type,<br>  1: Elastic IP (IP is elastic IP, and associated resource type is unknown),<br>  10: Elastic IP (IP is elastic IP, and no resource is associated),<br>  11: Virtual Machines,<br>  12: Load Balancer,<br>  13: Native Container Instance,<br>  14: Native Container Pod,<br>  2: Cloud Physical Server,<br>|
|**ip**|String|EIP Address|
|**bandwidth**|Long|Bandwidth cap, unit: Mbps|
|**cleanThresholdBps**|Long|Requested Traffic per Second|
|**cleanThresholdPps**|Long|Number of Requested Packets Per Second|
|**blackHoleThreshold**|Long|Black Hole Threshold|
|**instanceId**|Long|Associated protection package ID, if it is 0, it means no protection package is associated|
|**instanceName**|String|Associated protection package name, if it is null character string, it means no protection package is associated|
|**instanceType**|Integer|Package type, 1: Exclusive IP, 2: Shared IP, if it is 0, it means no protection package is associated|
|**safeStatus**|Integer|Security Status, 0: Secure, 1: Clean, 2: Black Hole|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
