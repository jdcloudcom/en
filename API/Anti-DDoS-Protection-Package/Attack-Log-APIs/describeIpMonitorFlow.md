# describeIpMonitorFlow


## Description
Search the EIP monitoring traffic

## Request Method
GET

## Request Address
https://antipro.jdcloud-api.com/v1/describeIpMonitorFlow


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Start time, only data within the latest 90 days can be searched, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**ip**|String[]|True| |Public IP Protected by Anti-DDoS Protection Package<br>- Use <a href='http://docs.jdcloud.com/anti-ddos-protection-package/api/describeprotectediplist'>describeProtectedIpList</a> APIs to search public IP protected by Anti-DDoS Protection Package|


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
|**time**|String[]|Time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**postProtect**|Double[]|Traffic After Protection|
|**preProtect**|Double[]|Traffic Before Protection|
|**unit**|String|Traffic Unit|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
