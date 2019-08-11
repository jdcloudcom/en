# describeAttackStatistics


## Description
Attack Statistics

## Request Method
GET

## Request Address
https://baseanti.jdcloud-api.com/v1/describeAttackStatistics


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**endTime**|String|True| |End time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**ip**|String[]|False| |Public IP protected by Anti-DDoS Basic, if ip is not null, count ip corresponding attacks, if ip is null, count all public IP attacks of user.<br>- Use <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describeelasticipresources'>describeElasticIpResources</a> APIs to search elastic IP of VPC protected by Anti-DDoS Basic.<br>- Use <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describecpsipresources'>describeCpsIpResources</a> APIs to search public IP and elastic IP of Cloud Physical Server protected by Anti-DDoS Basic.<br>- Use <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describeccsipresources'>describeCcsIpResources</a>APIs to search public IP of Cabinet Service protected by Anti-DDoS Basic|


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
|**peak**|Number|Attack Traffic Peak Value|
|**unit**|String|Attack Traffic Unit|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
