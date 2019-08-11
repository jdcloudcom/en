# describeProtectionRule


## Description
Get protection package instance or IP protection rule

## Request Method
GET

## Request Address
https://antipro.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:describeProtectionRule

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Id, now the Anti-DDoS Protection Package is supported in: cn-north-1, cn-east-1 and cn-east-2|
|**instanceId**|String|True| |Protection package instance Id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ip**|String|False| |Protected IP, get protection package instance protection rule if it is the default|


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
|**data**|ProtectionRule| |
### ProtectionRule
|Name|Type|Description|
|---|---|---|
|**type**|Integer|Protection Rules Type. <br>- 0: Default protection package<br>- 1: Customized rule of IP|
|**cleanThresholdBps**|Long|Cleaning Trigger Value bps|
|**cleanThresholdPps**|Long|Cleaning Trigger Value pps|
|**spoofIpEnable**|Integer|Enable IP address spoofing|
|**srcNewConnLimitEnable**|Integer|Enable source creation connection speed limit|
|**srcNewConnLimitValue**|Long|Source Creation and Connection Rate|
|**dstNewConnLimitEnable**|Integer|Enable target creation connection|
|**dstNewConnLimitValue**|Long|Target Creation and Connection Rate|
|**datagramRangeMin**|Long|Minimum Packet length|
|**datagramRangeMax**|Long|Maximum Packet Length|
|**geoBlackList**|GeoBlack[]|geo Interception Region List|
|**ipBlackList**|String[]|IP Blacklist|
|**ipWhiteList**|String[]|IP Whitelist|
### GeoBlack
|Name|Type|Description|
|---|---|---|
|**label**|String|geo Interception Region|
|**value**|String|geo Interception Region Code|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
