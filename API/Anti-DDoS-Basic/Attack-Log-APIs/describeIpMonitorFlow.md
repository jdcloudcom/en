# describeIpMonitorFlow


## Description
Search monitoring traffic of multiple public IPs, supporting ipv4 and ipv6

## Request Method
GET

## Request Address
https://baseanti.jdcloud-api.com/v1/describeIpMonitorFlow


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**endTime**|String|True| |End time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**ip**|String[]|True| |Public IP protected by Anti-DDoS Basic. <br>- Use <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describeelasticipresources'>describeElasticIpResources</a> APIs to search elastic IP of VPC protected by Anti-DDoS Basic.<br>- Use <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describecpsipresources'>describeCpsIpResources</a> APIs to search public IP and elastic IP of Cloud Physical Server protected by Anti-DDoS Basic. <br>- Use <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describeccsipresources’>describeCcsIpResources</a> APIs to search public IP of Cabinet Service protected by Anti-DDoS Basic|


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
|**bps**|IpResourceFlow| |
|**pps**|IpResourceFlow| |
### IpResourceFlow
|Name|Type|Description|
|---|---|---|
|**time**|String[]|UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**postProtect**|Double[]|Traffic After Protection|
|**preProtect**|Double[]|Traffic Before Protection|
|**unit**|String|Traffic Unit|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
