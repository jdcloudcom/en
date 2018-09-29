# describeAlarmConfig


## 描述
Query Alarm Configuration

## 请求方式
GET

## 请求地址
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:describeAlarmConfig

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True| |Instance ID|
|**regionId**|String|True| |Belonging Region ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**data**|AlarmConfig| |
### AlarmConfig
|名称|类型|描述|
|---|---|---|
|**blackHoleAlarmEmailStatus**|Integer|Black Hole Alarm Message Switch 0 Off 1 On|
|**blackHoleAlarmSmsStatus**|Integer|Black Hole Alarm SMS Switch 0 Off 1 On|
|**blackHoleAlarmStatus**|Integer|Black Hole Alarm Main Switch 0 Off 1 On|
|**ddosAlarmEmailStatus**|Integer|DDos Attack Alarm Message Switch 0 Off 1 On|
|**ddosAlarmSmsStatus**|Integer|DDos Attack Alarm SMS Switch 0 Off 1 On|
|**ddosAlarmStatus**|Integer|DDos Attack Alarm Main Switch 0 Off 1 On|
|**errorCodeAlarmStatus**|Integer|Error Code Alarm Main Switch|
|**errorCodeDomain**|String[]|Error Code Alarm Domain Name List|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
