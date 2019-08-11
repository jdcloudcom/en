# describeBlackListRuleOfForwardRule


## Description
Search blacklist rules of forwarding rules

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/forwardRules/{forwardRuleId}/forwardBlackListRule

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|
|**instanceId**|String|True| |Anti-DDoS Pro instance Id|
|**forwardRuleId**|String|True| |Forwarding rule Id|

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
|**data**|ForwardBlackListRule| |
### ForwardBlackListRule
|Name|Type|Description|
|---|---|---|
|**status**|Integer|Enable or not, 0: Disable, 1: Enable|
|**ipSetId**|String|Referenced IP Blacklist and Whitelist Id|
|**ipSetName**|String|Referenced IP Blacklist and Whitelist Name|
|**ip**|String[]|Are arrays of IP or IP segment|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
