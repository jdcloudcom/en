# addCustomLiveStreamSnapshotTemplate


## Description
Add live snapshot template

## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/snapshotCustoms:template


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**fillType**|Integer|True| |The processing rules when the snapshot does not match the set width and height|
|**format**|String|True| |Image Format|
|**height**|Integer|True| |Range|
|**saveBucket**|String|True| |Save bucket|
|**saveEndpoint**|String|True| |Save endPoint|
|**saveMode**|Integer|True| |Storage Mode|
|**snapshotInterval**|Integer|True| |Snapshot Cycle|
|**template**|String|True| |Record Template Customized Name|
|**width**|Integer|True| |Image Width|


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
