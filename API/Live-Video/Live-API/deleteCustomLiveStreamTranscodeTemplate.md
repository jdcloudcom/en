# deleteCustomLiveStreamTranscodeTemplate


## Description
Delete user customized transcoding template

## Request Method
DELETE

## Request Address
https://live.jdcloud-api.com/v1/transcodeCustoms/{template}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**template**|String|True| |Transcoding Template|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ruquestId|


## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
