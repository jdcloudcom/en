# modifyProtectionRuleOfForwardRule


## Description
Modify the protection rules of non-web service forwarding rules

## Request Method
POST

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/forwardRules/{forwardRuleId}:modifyProtectionRule

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceId**|Long|True| |Anti-DDoS Pro Instance Id|
|**forwardRuleId**|Long|True| |Forwarding Rule Id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**forwardProtectionRuleSpec**|ForwardProtectionRuleSpec|True| |Modify the protection rule request parameters of non-web service forwarding rules|

### ForwardProtectionRuleSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**spoofIpEnable**|Integer|True| |IP address spoofing and empty connection, 0: Disable, 1: Enable|
|**srcNewConnLimitEnable**|Integer|True| |Source creation and connection speed limit, 0: Disable, 1: Enable|
|**srcNewConnLimitValue**|Long|True| |Source Creation and Connection Rate|
|**srcConcurrentConnLimitEnable**|Integer|True| |Source concurrent connection speed limit, 0: Disable, 1: Enable|
|**srcConcurrentConnLimitValue**|Long|True| |Source Concurrent Connection Rate|
|**dstNewConnLimitEnable**|Integer|True| |Target creation and connection, 0: Disable, 1: Enable|
|**dstNewConnLimitValue**|Long|True| |Target Creation and Connection Rate|
|**dstConcurrentConnLimitEnable**|Integer|True| |Target concurrent connection, 0: Disable, 1: Enable|
|**dstConcurrentConnLimitValue**|Long|True| |Target Concurrent Connection Rate|
|**datagramRangeMin**|Long|True| |Minimum packet length, value range\[0, datagramRangeMax)|
|**datagramRangeMax**|Long|True| |Maximum packet length, value range (datagramRangeMin, 1518\]|
|**geoBlackList**|String\[\]|False| |geo interception region code list, the code list can be set to be obtained by searching from the describeGeoAreas interface|
 
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
|**code**|Integer|0: Rule modification failed, 1: Rule modification succeeded|
|**message**|String|Please specify reasons for rule modification failure|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
