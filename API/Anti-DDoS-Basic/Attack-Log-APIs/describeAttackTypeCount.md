# describeAttackTypeCount


## Description
Search attack counts of various types

## Request Method
GET

## Request Address
https://baseanti.jdcloud-api.com/v1/describeAttackTypeCount


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**endTime**|String|True| |End time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**ip**|String[]|False| |Public IP protected by Anti-DDoS Basic, if ip is not null, search ip corresponding attack counts of all types, if ip is null, search all public IP attack counts of all types of user<br>- Use <a href="http://docs.jdcloud.com/anti-ddos-basic/api/describeelasticipresources">describeElasticIpResources</a> APIs to search VPC elastic IP protected by Anti-DDoS Basic<br>- Use <a href="http://docs.jdcloud.com/anti-ddos-basic/api/describecpsipresources">describeCpsIpResources</a> APIs to search Cloud Physical Server public IP and elastic IP protected by Anti-DDoS Basic<br>|


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
