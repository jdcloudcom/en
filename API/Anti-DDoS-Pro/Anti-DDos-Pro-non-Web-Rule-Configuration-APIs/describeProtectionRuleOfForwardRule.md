# describeProtectionRuleOfForwardRule


## Description
Query the protection rules of non-web service forwarding rules

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/forwardRules/{forwardRuleId}:describeProtectionRule

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|
|**instanceId**|String|True| |Anti-DDoS Pro instance Id|
|**forwardRuleId**|String|True| |Forwarding rule Id|

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
|**geoBlackList**|Geo[]|geo Interception Region List|
### Geo
|Name|Type|Description|
|---|---|---|
|**label**|String|geo Interception Region|
|**value**|String|geo Interception Region Code|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
