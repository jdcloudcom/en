# modifyCCProtectionRuleOfWebRule


## Description
Modify CC defense rules of web service rules

## Request Method
PATCH

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/webRules/{webRuleId}/ccProtectionRules/{ccProtectionRuleId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|
|**instanceId**|String|True| |Anti-DDoS Pro instance Id|
|**webRuleId**|String|True| |Web Rule Id|
|**ccProtectionRuleId**|String|True| |CC defense rule Id of web service rules|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ccProtectionRuleSpec**|CCProtectionRuleSpec|True| |Modify request parameters of CC defense rules|

### CCProtectionRuleSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |CC defense rule name, cannot be null, the length does not exceed 32 characters, support Chinese characters, uppercase and lowercase letters, numbers and such characters as '-', '/', '.' and '_'|
|**uri**|String|True| |uri, cannot be null, begin with /, the length does not exceed 2048 characters|
|**matchType**|Integer|True| |Match uri type, 0: Exact match, 1: Prefix match|
|**detectPeriod**|Long|True| |Detection period, unit is second, value range [5, 10800]|
|**singleIpLimit**|Long|True| |ip access count, value range [2, 2000]|
|**blockType**|Integer|True| |Block type, 1: Block, 2: Man-machine interaction|
|**blockTime**|Long|True| |Block duration, unit is second, value range [10, 86400]|

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
|**code**|Integer|0: Modification failed, 1: Modification succeeded|
|**message**|String|Please specify reasons for modification failure|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
