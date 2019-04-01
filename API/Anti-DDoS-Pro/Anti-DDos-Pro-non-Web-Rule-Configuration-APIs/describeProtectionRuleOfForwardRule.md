# describeProtectionRuleOfForwardRule


## Description
Query the protection rules of non-web service forwarding rules

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/forwardRules/{forwardRuleId}:describeProtectionRule

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
|**protectionRule**|ForwardProtectionRule| |
### ForwardProtectionRule
|Name|Type|Description|
|---|---|---|
|**spoofIpEnable**|Integer|IP address spoofing and empty connection, 0: Disable, 1: Enable|
|**srcNewConnLimitEnable**|Integer|Source creation and connection speed limit, 0: Disable, 1: Enable|
|**srcNewConnLimitValue**|Long|Source Creation and Connection Rate|
|**srcConcurrentConnLimitEnable**|Integer|Source concurrent connection speed limit, 0: Disable, 1: Enable|
|**srcConcurrentConnLimitValue**|Long|Source Concurrent Connection Rate|
|**dstNewConnLimitEnable**|Integer|Target creation and connection speed limit, 0: Disable, 1: Enable|
|**dstNewConnLimitValue**|Long|Target Creation and Connection Rate|
|**dstConcurrentConnLimitEnable**|Integer|Target concurrent connection speed limit, 0: Disable, 1: Enable|
|**dstConcurrentConnLimitValue**|Long|Target Concurrent Connection Rate|
|**datagramRangeMin**|Long|Minimum Packet Length|
|**datagramRangeMax**|Long|Maximum Packet Length|
|**geoBlackList**|GeoBlack[]|geo Interception Region List|
### GeoBlack
|Name|Type|Description|
|---|---|---|
|**label**|String|geo Interception Region|
|**value**|String|geo Interception Region Code|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
