# describeAttackSource


## Description
Search Attack Source

## Request Method
GET

## Request Address
https://antipro.jdcloud-api.com/v1/attacklog/{attackLogId}:describeAttackSource

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**attackLogId**|String|True| |Attack Record Id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ip**|String|True| |Public IP Protected by Anti-DDoS Protection Package<br>- Use <a href="http://docs.jdcloud.com/anti-ddos-protection-package/api/describeprotectediplist">describeProtectedIpList</a> APIs to search public IP protected by Anti-DDoS Protection Package<br>|


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
|**data**|String[]|Attack Source IP List|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
