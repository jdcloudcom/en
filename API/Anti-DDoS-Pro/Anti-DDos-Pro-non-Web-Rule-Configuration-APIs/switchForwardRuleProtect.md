# switchForwardRuleProtect


## Description
Switch non-web service rules into defense status

## Request Method
POST

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/forwardRules/{forwardRuleId}:protect

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceId**|Long|True| |Anti-DDoS Pro Instance Id|
|**forwardRuleId**|Long|True| |Forwarding Rule Id|

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
|**code**|Integer|Request Error Status Code|
|**status**|String|Request Error Status Code|
|**message**|String|Request Error Notification|
### Result
|Name|Type|Description|
|---|---|---|
|**code**|Integer|0: Switch failed, 1: Switch succeeded|
|**message**|String|Please specify reasons for switch failure|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
