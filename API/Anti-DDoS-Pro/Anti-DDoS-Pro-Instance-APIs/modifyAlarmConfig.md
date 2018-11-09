# modifyAlarmConfig


## Description
Update Alarm Configuration

## Request method
POST

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:modifyAlarmConfig

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |Instance ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**alarmConfigSpec**|AlarmConfigSpec|True| |Update the Request Parameter of Alarm Configuration|

### AlarmConfigSpec
|Name|Type|Required or not|Default value|Description|
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
|**requestId**|String| |



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
