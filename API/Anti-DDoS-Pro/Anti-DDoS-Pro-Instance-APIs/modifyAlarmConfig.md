# modifyAlarmConfig


## Description
Update Alarm Configuration

## Request Method
POST

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:modifyAlarmConfig

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|
|**instanceId**|String|True| |Instance ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**alarmConfigSpec**|AlarmConfigSpec|True| |Update the Request Parameter of Alarm Configuration|

### AlarmConfigSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**blackHoleAlarmEmailStatus**|Integer|False| |Black Hole Alarm Message Switch 0 Off 1 On|
|**blackHoleAlarmSmsStatus**|Integer|False| |Black Hole Alarm SMS Switch 0 Off 1 On|
|**blackHoleAlarmStatus**|Integer|False| |Black Hole Alarm Main Switch 0 Off 1 On|
|**ddosAlarmEmailStatus**|Integer|False| |DDos Attack Alarm Message Switch 0 Off 1 On|
|**ddosAlarmSmsStatus**|Integer|False| |DDos Attack Alarm SMS Switch 0 Off 1 On|
|**ddosAlarmStatus**|Integer|False| |DDos Attack Alarm Main Switch 0 Off 1 On|
|**errorCodeAlarmStatus**|Integer|False| |Error Code Alarm Main Switch|
|**errorCodeDomain**|String[]|False| |Error Code Alarm Domain Name List|

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
|**code**|Integer|0: Modification failed, 1: Modification succeeded|
|**message**|String|Please specify reasons for modification failure|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
