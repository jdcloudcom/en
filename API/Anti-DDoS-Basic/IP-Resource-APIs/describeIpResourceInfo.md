# describeIpResourceInfo


## Description
Search public IP security information, only supporting ipv4. (obsolete, <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describeipsafetyinfo'>describeIpSafetyInfo</a> APIs are recommended)


## Request Method
GET

## Request Address
https://baseanti.jdcloud-api.com/v1/regions/{regionId}/ipResources/{ip}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code. Anti-DDoS Basic is supported in cn-north-1, cn-east-1, cn-east-2, and cn-south-1|
|**ip**|String|True| |Public IP protected by Anti-DDoS Basic, only supporting ipv4 format .<br>- Use <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describeelasticipresources'>describeElasticIpResources</a> APIs to search elastic IP of VPC protected by Anti-DDoS Basic<br>- Use <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describecpsipresources'>describeCpsIpResources</a> APIs to search public IP and elastic IP of Cloud Physical Server protected by Anti-DDoS Basic <br>- Use <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describeccsipresources'>describeCcsIpResources</a> APIs to search public IP of Cabinet Service protected by Anti-DDoS Basic|

## Request Parameter
None


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
|**data**|IpResourceInfo| |
### IpResourceInfo
|Name|Type|Description|
|---|---|---|
|**ip**|String|EIP Address|
|**safeStatus**|Integer|Security Status, <br>- 0: Secure<br>- 1: Clean<br>- 2: Black Hole|
|**region**|String|Region code where public IP is located|
|**blackHoleThreshold**|Long|Black hole threshold, unit: bps|
|**cleanThresholdBps**|Long|Traffic rate of trigger cleaning, unit: bps|
|**cleanThresholdPps**|Long|Package rate of trigger cleaning, unit: pps|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
