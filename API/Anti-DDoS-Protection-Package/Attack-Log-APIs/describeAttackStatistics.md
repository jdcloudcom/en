# describeAttackStatistics


## Description
Attack record statistics, with parameter ip priority higher than that of instanceId

## Request Method
GET

## Request Address
https://antipro.jdcloud-api.com/v1/describeAttackStatistics


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
|**attackCount**|Integer|Attack Counts|
|**blackHoleCount**|Integer|Times of Black Holes|
|**peak**|Double|Attack Traffic Peak Value|
|**unit**|String|Attack Traffic Unit|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
