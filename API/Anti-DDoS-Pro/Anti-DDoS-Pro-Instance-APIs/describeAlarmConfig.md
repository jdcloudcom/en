# describeAlarmConfig


## Description
Query Alarm Configuration

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:describeAlarmConfig

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|
|**instanceId**|String|True| |Instance ID|

## Request Parameter
None


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
|**data**|AlarmConfig| |
### AlarmConfig
|Name|Type|Description|
|---|---|---|
|**blackHoleAlarmEmailStatus**|Integer|Black Hole Alarm Message Switch 0 Off 1 On|
|**blackHoleAlarmSmsStatus**|Integer|Black Hole Alarm SMS Switch 0 Off 1 On|
|**blackHoleAlarmStatus**|Integer|Black Hole Alarm Main Switch 0 Off 1 On|
|**ddosAlarmEmailStatus**|Integer|DDos Attack Alarm Message Switch 0 Off 1 On|
|**ddosAlarmSmsStatus**|Integer|DDos Attack Alarm SMS Switch 0 Off 1 On|
|**ddosAlarmStatus**|Integer|DDos Attack Alarm Main Switch 0 Off 1 On|
|**errorCodeAlarmStatus**|Integer|Error Code Alarm Main Switch|
|**errorCodeDomain**|String[]|Error Code Alarm Domain Name List|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
