# describeAttackTypeCount


## Description
Search attack counts of various types and parameter ip priority is greater than that of instanceId

## Request Method
GET

## Request Address
https://antipro.jdcloud-api.com/v1/describeAttackTypeCount


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Start time, only data within the latest 90 days can be queried, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**endTime**|String|True| |End time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**instanceId**|String|False| |Protection package instance Id|
|**ip**|String[]|False| |Public IP Protected by Anti-DDoS Protection Package<br>- Use <a href='http://docs.jdcloud.com/anti-ddos-protection-package/api/describeprotectediplist'>describeProtectedIpList</a> APIs to search public IP protected by Anti-DDoS Protection Package|


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
|**dataList**|AttackTypeCount[]| |
### AttackTypeCount
|Name|Type|Description|
|---|---|---|
|**type**|String|Attack Type|
|**count**|Integer|Attack Counts|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
