# disableWebRuleBlackList


## Description
Disable blacklist of web service rules

## Request Method
POST

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/webRules/{webRuleId}:disableWebRuleBlackList

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|
|**instanceId**|String|True| |Anti-DDoS Pro instance Id|
|**webRuleId**|String|True| |Web Rule Id|

## Request Parameter
None


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
|**code**|Integer|Disabling result, 0: Disabling failed, 1: Disabling succeeded|
|**message**|String|Specify reasons for disabling failure|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
