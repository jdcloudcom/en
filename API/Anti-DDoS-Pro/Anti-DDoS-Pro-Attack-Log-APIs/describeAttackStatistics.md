# describeAttackStatistics


## Description
Query the attack counts and traffic peak value

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/attacklog:describeAttackStatistics

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Start time, only data within the latest 90 days can be searched, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**instanceId**|String[]|False| |Anti-DDoS Pro instance ID|
|**type**|Integer|True| |Attack type, 0 is DDoS, 1 is CC|


## Response parameter
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
|**flow**|Double|Attack Traffic Peak Value|
|**count**|Integer|Attack Counts|
|**unit**|String|Traffic Unit: bps, Kbps, Mbps, Gbps|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
