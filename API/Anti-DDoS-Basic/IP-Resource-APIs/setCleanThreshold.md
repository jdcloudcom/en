# setCleanThreshold


## Description
Set cleaning threshold of public IP protected by Anti-DDoS Basic, only supporting ipv4. (obsolete, <a href='http://docs.jdcloud.com/anti-ddos-basic/api/setipcleanthreshold'>setIpCleanThreshold</a> APIs are recommended)


## Request Method
POST

## Request Address
https://baseanti.jdcloud-api.com/v1/regions/{regionId}/ipResources/{ip}:setCleanThreshold

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code. Anti-DDoS Basic is supported in cn-north-1, cn-east-1, cn-east-2, and cn-south-1|
|**ip**|String|True| |Public IP protected by Anti-DDoS Basic, only supporting ipv4 format .<br>- Use <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describeelasticipresources'>describeElasticIpResources</a> APIs to search elastic IP of VPC protected by Anti-DDoS Basic<br>- Use <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describecpsipresources'>describeCpsIpResources</a> APIs to search public IP and elastic IP of Cloud Physical Server protected by Anti-DDoS Basic <br>- Use <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describeccsipresources'>describeCcsIpResources</a> APIs to search public IP of Cabinet Service protected by Anti-DDoS Basic|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**cleanThresholdSpec**|CleanThresholdSpec|True| |Request Parameter|

### CleanThresholdSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**cleanThresholdBps**|Long|True| |Traffic rate of trigger cleaning, unit: bps. Value range can be searched through <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describeipcleanthresholdrange'>describeIpCleanThresholdRange</a> APIs|
|**cleanThresholdPps**|Long|True| |Packet traffic rate of trigger cleaning, unit: bps. Value range can be searched through <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describeipcleanthresholdrange'>describeIpCleanThresholdRange</a> APIs|

## Return Parameter
|Name|Type|Description|
|---|---|---|
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

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
