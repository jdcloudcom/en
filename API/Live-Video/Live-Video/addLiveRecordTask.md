# addLiveRecordTask


## Description
Add record point print task

## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/records/{publishDomain}/appNames/{appName}/streamNames/{streamName}/task

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**appName**|String|True| |Application Name of the Live Streaming|
|**publishDomain**|String|True| |Pushing Streaming Accelerated Domain|
|**streamName**|String|True| |Live Streaming Name|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**recordFileType**|String|True| |Type of Record File|
|**recordTimes**|RecordTime[]|True| |Your Pushing Streaming Accelerated Domain|
|**saveBucket**|String|True| |Bucket|
|**saveEndpoint**|String|True| |Storage Address|
|**saveObject**|String|False| |Storage Path of Record File|

### RecordTime
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**endTime**|String|True| |End Time|
|**startTime**|String|True| |Start Time|

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
