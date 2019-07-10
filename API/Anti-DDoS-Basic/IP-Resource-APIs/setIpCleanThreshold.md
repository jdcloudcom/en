# setIpCleanThreshold


## Description
Set cleaning threshold of public IP protected by Anti-DDoS Basic, supporting ipv4 and ipv6

## Request Method
POST

## Request Address
https://baseanti.jdcloud-api.com/v1/regions/{regionId}/setIpCleanThreshold

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code. Anti-DDoS Basic is supported in cn-north-1, cn-east-1, cn-east-2, and cn-south-1|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ipCleanThresholdSpec**|IpCleanThresholdSpec|True| |Request Parameter|

### IpCleanThresholdSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ip**|String|True| |Public IP protected by Anti-DDoS Basic, supporting ipv4 and ipv6.<br>- Use <a href="http://docs.jdcloud.com/anti-ddos-basic/api/describeelasticipresources">describeElasticIpResources</a> APIs to search VPC elastic IP protected by Anti-DDoS Basic<br>- Use <a href="http://docs.jdcloud.com/anti-ddos-basic/api/describecpsipresources">describeCpsIpResources</a> APIs to search Cloud Physical Server public IP and elastic IP protected by Anti-DDoS Basic<br>|
|**cleanThresholdBps**|Long|True| |Traffic rate of trigger cleaning, unit: bps. Value range can be searched through <a href="http://docs.jdcloud.com/anti-ddos-basic/api/describeipcleanthresholdrange">describeIpCleanThresholdRange</a> APIs<br>|
|**cleanThresholdPps**|Long|True| |Packet traffic rate of trigger cleaning, unit pps. Value range can be searched through <a href="http://docs.jdcloud.com/anti-ddos-basic/api/describeipcleanthresholdrange">describeIpCleanThresholdRange</a> APIs<br>|

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
|**code**|Integer|Modification results, 0: Modification failed, 1: Modification succeeded|
|**message**|String|Please specify the reasons for modification failure|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
