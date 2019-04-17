# modifyInstanceIpBlackList


## Description
Set the instance IP blacklist

## Request Method
POST

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:setIpBlackList

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceId**|Long|True| |Instance ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ipBwListSpec**|IpBwListSpec|True| |Set IP Blacklist Request|

### IpBwListSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ipList**|String[]|True| |IP or IP Segment List|
|**tryFlag**|Boolean|True| |In case of false, it is forced to write, and in case of true, there is a duplicate and nothing is written|

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
|**code**|Integer|0: IP blacklist setting failed, 1: IP blacklist setting succeeded|
|**message**|String|Corresponding Notification Message|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
