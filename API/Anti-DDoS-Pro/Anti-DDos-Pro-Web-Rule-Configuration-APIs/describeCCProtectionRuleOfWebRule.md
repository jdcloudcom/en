# describeCCProtectionRuleOfWebRule


## Description
Search CC defense rules of web service rules

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/webRules/{webRuleId}/ccProtectionRules/{ccProtectionRuleId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|
|**instanceId**|String|True| |Anti-DDoS Pro instance Id|
|**webRuleId**|String|True| |Web Rule Id|
|**ccProtectionRuleId**|String|True| |CC defense rule Id of web service rules|

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
|**data**|CCProtectionRule| |
### CCProtectionRule
|Name|Type|Description|
|---|---|---|
|**id**|String|CC Defense Rule ID|
|**webRuleId**|String|Web rule ID corresponding to CC defense rules|
|**instanceId**|String|Instance ID corresponding to CC defense rules|
|**name**|String|CC defense rule name, within 30 characters|
|**enable**|Integer|CC defense rules status: 0: Disable, 1: Enable|
|**uri**|String|uri, begin with /, within 200 characters|
|**matchType**|Integer|Match uri type, 0: Exact match, 1: Prefix match|
|**detectPeriod**|Long|Detection period, unit is second, value range [5, 10800]|
|**singleIpLimit**|Long|ip access count, value range [2, 2000]|
|**blockType**|Integer|Block type, 1: Block, 2: Man-machine interaction|
|**blockTime**|Long|Block duration, unit is second, value range [10, 86400]|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
