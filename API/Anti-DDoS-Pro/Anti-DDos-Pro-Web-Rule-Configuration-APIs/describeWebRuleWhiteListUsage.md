# describeWebRuleWhiteListUsage


## Description
Search whitelist usage information of web service protection rules

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/webRules/{webRuleId}:describeWebRuleWhiteListUsage

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
|**allocatedNum**|Integer|Count of Configured Whitelist Rules|
|**activeNum**|Integer|Count of Enabled Whitelist Rules|
|**surplusAllocateNum**|Integer|Count of Additionally Added Whitelist Rules|
|**maxAllocateNum**|Integer|Count of Maximum Whitelist Rules|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
