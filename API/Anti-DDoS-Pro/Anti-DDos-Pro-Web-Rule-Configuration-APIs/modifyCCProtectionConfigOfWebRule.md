# modifyCCProtectionConfigOfWebRule


## Description
Modify CC defense configuration of web service rules

## Request Method
PATCH

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/webRules/{webRuleId}:ccProtectionConfig

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|
|**instanceId**|String|True| |Anti-DDoS Pro instance Id|
|**webRuleId**|String|True| |Web Rule Id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ccProtectionConfigSpec**|CCProtectionConfigSpec|True| |Modify request parameters of CC defense configuration|

### CCProtectionConfigSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**level**|Integer|True| |Protection level, 0: Normal, 1: Loose, 2: Critical, 3: Customized|
|**ccThreshold**|Long|False| |HTTP requests threshold, required in case the protection level is customized|
|**hostQps**|Long|False| |Protection threshold of Host, required in case the protection level is customized|
|**hostUrlQps**|Long|False| |Protection threshold of Host + Url, required in case the protection level is customized|
|**ipHostQps**|Long|False| |Protection threshold of each source IP to Host, required in case the protection level is customized|
|**ipHostUrlQps**|Long|False| |Protection threshold of each source IP to Host + Url, required in case the protection level is customized|

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
