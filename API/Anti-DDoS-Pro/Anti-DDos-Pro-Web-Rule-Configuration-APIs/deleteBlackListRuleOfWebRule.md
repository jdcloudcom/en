# deleteBlackListRuleOfWebRule


## Description
Delete blacklist rules of web service rule, multiple webBlackListRuleId, separated by ',', can be uploaded in batch operations, when result.code returns 1, representing operation succeeded, when 0, representing all or part of the operations may fail

## Request Method
DELETE

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/webRules/{webRuleId}/webBlackListRules/{webBlackListRuleId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|
|**instanceId**|String|True| |Anti-DDoS Pro instance Id|
|**webRuleId**|String|True| |Web Rule Id|
|**webBlackListRuleId**|String|True| |Blacklist rule Id of web service rules|

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
|**code**|Integer|Deletion result, 0: Deletion failed, 1: Deletion succeeded|
|**message**|String|Please specify reasons for deletion failure|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
