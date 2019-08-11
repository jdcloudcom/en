# describeCCProtectionConfigOfWebRule


## Description
Search CC defense configuration of web service rules

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/webRules/{webRuleId}:ccProtectionConfig

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
|**data**|CCProtectionConfig| |
### CCProtectionConfig
|Name|Type|Description|
|---|---|---|
|**enable**|Integer|CC defense status of web rule, 0: Disable, 1: Enable|
|**observerMode**|Integer|Observer mode, 0: Disable, 1: Enable|
|**level**|Integer|Protection level, 0: Normal, 1: Loose, 2: Critical, 3: Customized|
|**ccThreshold**|Long|HTTP Requests Threshold|
|**hostQps**|Long|Protection Threshold of Host|
|**hostUrlQps**|Long|Protection Threshold of Host + Url|
|**ipHostQps**|Long|Protection Threshold of Each Source IP to Host|
|**ipHostUrlQps**|Long|Protection Threshold of Each Source IP to Host + Url|
|**ccProtectionRuleEnableCount**|Long|Count of Enabled CC Defense Rules|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
