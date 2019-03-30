# describeAttackStatistics


## Description
Query the attack counts and traffic peak value

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/attacklog/describeAttackStatistics

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Start time, up to the latest 30 days, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**instanceId**|Long[]|False| |Anti-DDoS Pro Instance ID|
|**type**|Integer|True| |Attack Type, 0 is DDos, and 1 is CC|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |
|**error**|Error| |

### Error
|Name|Type|Description|
|---|---|---|
|**code**|Integer|Request Error Status Code|
|**status**|String|Request Error Status Code|
|**message**|String|Request Error Notification|
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
