# modifyInstanceIpBlackList


## Description
Set the instance IP blacklist

## Request method
POST

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:setIpBlackList

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |Instance ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ipBwListSpec**|IpBwListSpec|True| |Set IP Blacklist Request|

### IpBwListSpec
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**ipList**|String[]|False| |IP or IP Segment List|
|**tryFlag**|Boolean|False| |In case of false, it is forced to write, and in case of true, there is a duplicate and nothing is written|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**msgList**|BwRepeatMsg[]| |
|**status**|Status| |
### BwRepeatMsg
|Name|Type|Description|
|---|---|---|
|**black**|String|Blacklist Repeated IP/IP Segment|
|**white**|String|White List Repeated IP/IP Segment|
### Status
|Name|Type|Description|
|---|---|---|
|**code**|Integer|Request Error Code|
|**msg**|String|Request Error Message|
|**retcode**|Integer|Request result, 0 means success, non-0 means failure|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
