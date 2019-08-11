# describeIpResourceFlow


## Description
Search monitoring traffic within 15 minutes before endTime of public IP, only supporting ipv4. (obsolete, <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describeipmonitorflow'>describeIpMonitorFlow</a> APIs are recommended)


## Request Method
GET

## Request Address
https://baseanti.jdcloud-api.com/v1/regions/{regionId}/ipResources/{ip}/monitorFlow

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code. Anti-DDoS Basic is supported in cn-north-1, cn-east-1, cn-east-2, and cn-south-1|
|**ip**|String|True| |Public IP protected by Anti-DDoS Basic, only supporting ipv4 format .<br>- Use <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describeelasticipresources'>describeElasticIpResources</a> APIs to search elastic IP of VPC protected by Anti-DDoS Basic<br>- Use <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describecpsipresources'>describeCpsIpResources</a> APIs to search public IP and elastic IP of Cloud Physical Server protected by Anti-DDoS Basic <br>- Use <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describeccsipresources'>describeCcsIpResources</a> APIs to search public IP of Cabinet Service protected by Anti-DDoS Basic|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**endTime**|String|False| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ, if it is null, search monitoring traffic within 15 minutes before current time|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

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
