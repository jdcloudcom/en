# describeAttackLogs


## Description
Search attack records, and parameter ip priority is greater than that of instanceId
  - When ip parameters are appointed, ignore instanceId parameters and search attack records related to ip
  - When no ip is appointed, search attack records related to instances appointed by instanceId
  - Search all public IP attack records of users when neither ip nor instanceId is appointed


## Request Method
GET

## Request Address
https://antipro.jdcloud-api.com/v1/attacklog


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page|
|**pageSize**|Integer|False|10|Paging Size|
|**startTime**|String|True| |Start time, only data within the latest 90 days can be queried, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**endTime**|String|True| |Query end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**instanceId**|String|False| |Protection package instance Id|
|**ip**|String[]|False| |Public IP Protected by Anti-DDoS Protection Package<br>- Use <a href="http://docs.jdcloud.com/anti-ddos-protection-package/api/describeprotectediplist">describeProtectedIpList</a> APIs to search public IP protected by Anti-DDoS Protection Package<br>|


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
|**ip**|String|Public IP|
|**resourceType**|Integer|Public IP type or associated resource type:<br>  0: Unknown type,<br>  1: Elastic IP (IP is elastic IP, and associated resource type is unknown),<br>  10: Elastic IP (IP is elastic IP, and no resource is associated),<br>  11: Virtual Machines,<br>  12: Load Balancer,<br>  13: Native Container Instance,<br>  14: Native Container Pod,<br>  2: Cloud Physical Server,<br>|
|**attackLogId**|String|Attack Record Id|
|**startTime**|String|Start Time of Attack|
|**endTime**|String|End Time of Attack|
|**cause**|Integer|Trigger reason:<br>0: Unknown,<br>1: Four-layer,<br>2: Seven-layer,<br>3: Four-layer and seven-layer<br>|
|**status**|Integer|Status, 0: Cleaning Finished, 1: Cleaning, 2: In Black Hole|
|**blackHole**|Boolean|Black hole or not|
|**peak**|Double|Attack Traffic Peak Value|
|**unit**|String|Attack Traffic Peak Value Unit|
|**attackType**|String[]|Attack Type|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
