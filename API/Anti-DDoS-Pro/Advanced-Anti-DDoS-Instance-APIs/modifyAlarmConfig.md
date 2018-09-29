# modifyAlarmConfig


## 描述
Update Alarm Configuration

## 请求方式
POST

## 请求地址
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:modifyAlarmConfig

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True| |Instance ID|
|**regionId**|String|True| |Belonging Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**alarmConfigSpec**|AlarmConfigSpec|True| |Update the Request Parameter of Alarm Configuration|

### AlarmConfigSpec
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**blackHoleAlarmEmailStatus**|Integer|False| |Black Hole Alarm Message Switch 0 Off 1 On|
|**blackHoleAlarmSmsStatus**|Integer|False| |Black Hole Alarm SMS Switch 0 Off 1 On|
|**blackHoleAlarmStatus**|Integer|False| |Black Hole Alarm Main Switch 0 Off 1 On|
|**ddosAlarmEmailStatus**|Integer|False| |DDos Attack Alarm Message Switch 0 Off 1 On|
|**ddosAlarmSmsStatus**|Integer|False| |DDos Attack Alarm SMS Switch 0 Off 1 On|
|**ddosAlarmStatus**|Integer|False| |DDos Attack Alarm Main Switch 0 Off 1 On|
|**errorCodeAlarmStatus**|Integer|False| |Error Code Alarm Main Switch|
|**errorCodeDomain**|String[]|False| |Error Code Alarm Domain Name List|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |


## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
