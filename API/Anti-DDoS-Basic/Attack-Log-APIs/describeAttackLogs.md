# describeAttackLogs


## Description
Search attack record

## Request Method
GET

## Request Address
https://baseanti.jdcloud-api.com/v1/attacklog


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page|
|**pageSize**|Integer|False|10|Paging Size|
|**startTime**|String|True| |Start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**endTime**|String|True| |End time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**ip**|String[]|False| |Public IP protected by Anti-DDoS Basic, if ip is not null, search ip corresponding attack record, if ip is null, search all attack records of user<br>- Use <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describeelasticipresources’>describeElasticIpResources</a> APIs to search elastic IP of VPC protected by Anti-DDoS Basic<br>- Use <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describecpsipresources'>describeCpsIpResources</a> APIs to search public IP and elastic IP of Cloud Physical Server protected by Anti-DDoS Basic<br> -Use <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describeccsipresources'>describeCcsIpResources</a> APIs to search public IP of Cabinet Service protected by Anti-DDoS Basic|


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
|**dataList**|AttackLog[]| |
|**currentCount**|Integer|Current Page Counts|
|**totalCount**|Integer|Total Instance Counts|
|**totalPage**|Integer|Total Number of Pages|
### AttackLog
|Name|Type|Description|
|---|---|---|
|**ip**|String|EIP Address|
|**resourceType**|Integer|Public IP type or associated resource type.<br>- 0: Unknown type,<br>- 1: Elastic IP (IP is elastic IP, and associated resource type is unknown),<br>- 10: Elastic IP (IP is elastic IP, and no resource is associated),<br>- 11: Virtual Machines,<br>- 12: Load Balancer,<br>- 13: Native Container Instance,<br>- 14: Native Container Pod,<br>- 2: Cloud Physical Server,<br>- 4: Public IP of Cabinet Service|
|**attackLogId**|String|Attack Record ID|
|**startTime**|String|Attack start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**endTime**|String|Attack end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**cause**|Integer|Trigger reason.<br>- 0: Unknown,<br>- 1: Four-layer,<br>- 2: Seven-layer,<br>- 3: Four-layer and seven-layer|
|**status**|Integer|Status. <br>- 0: Cleaning Finished<br>- 1: Cleaning, <br>- 2: In Black Hole|
|**blackHole**|Boolean|Black hole or not|
|**peak**|Number|Attack Traffic Peak Value|
|**unit**|String|Attack Traffic Peak Value Unit|
|**attackType**|String[]|Attack Type|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
