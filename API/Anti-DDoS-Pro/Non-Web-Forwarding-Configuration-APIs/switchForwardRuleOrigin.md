# switchForwardRuleOrigin


## Description
Switch non-web service rules into back-to-origin status

## Request method
POST

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/forwardRules/{forwardRuleId}:origin

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**forwardRuleId**|String|True| |Forwarding Rule ID|
|**instanceId**|String|True| |Instance ID|
|**regionId**|String|True| |Region ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
|**500**|INTERNAL_SERVER_ERROR|
