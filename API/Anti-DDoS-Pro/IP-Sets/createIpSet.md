# createIpSet


## Description
Add instance IP blacklist and whitelist, pre-defined IP blacklist and whitelist take effect after associating with the blacklist or whitelist of forwarding rules

## Request Method
POST

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/ipSets

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|
|**instanceId**|String|True| |Anti-DDoS Pro instance Id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ipSetSpec**|IpSetSpec|True| |Add instance IP blacklist and whitelist request parameters|

### IpSetSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |IP Blacklist and Whitelist Name|
|**ip**|String[]|True| |Arrays of IP or IP Segment|

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
|**code**|Integer|0: Addition failed, 1: Addition succeeded|
|**message**|String|Please specify reasons for addition failure|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
