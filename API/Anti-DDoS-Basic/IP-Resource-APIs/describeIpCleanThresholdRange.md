# describeIpCleanThresholdRange


## Description
Search public IP to set cleaning threshold range, supporting ipv4 and ipv6

## Request Method
GET

## Request Address
https://baseanti.jdcloud-api.com/v1/regions/{regionId}/describeIpCleanThresholdRange

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code. Anti-DDoS Basic is supported in cn-north-1, cn-east-1, cn-east-2, and cn-south-1|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ip**|String|True| |Public IP protected by Anti-DDoS Basic. <br>- Use <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describeelasticipresources'>describeElasticIpResources</a> APIs to search elastic IP of VPC protected by Anti-DDoS Basic<br>- Use <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describecpsipresources'>describeCpsIpResources</a> APIs to search public IP and elastic IP of Cloud Physical Server protected by Anti-DDoS Basic<br>- Use <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describeccsipresources’>describeCcsIpResources</a> APIs to search public IP of Cabinet Service protected by Anti-DDoS Basic|


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
|**data**|IpCleanThresholdRange| |
### IpCleanThresholdRange
|Name|Type|Description|
|---|---|---|
|**ipCleanThresholdBpsMax**|Number|A maximum can be set for cleaning traffic|
|**ipCleanThresholdBpsMin**|Number|A minimum can be set for cleaning traffic|
|**ipCleanThresholdPpsMax**|Number|A maximum can be set for cleaning packet traffic|
|**ipCleanThresholdPpsMin**|Number|A minimum can be set for cleaning packet traffic|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
