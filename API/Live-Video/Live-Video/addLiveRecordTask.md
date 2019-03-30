# addLiveRecordTask


## Description
Add recording point print task<br>
You can call this interface to accurately extract the part you need in the recorded file

## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/records/{publishDomain}/appNames/{appName}/streamNames/{streamName}/task

|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**publishDomain**|String|True|Pushing Streaming Accelerated Domain|
|**appName**|String|True|Application Name of the Live Streaming|
|**streamName**|String|True|Live Streaming Name|

## Request Parameter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**recordTimes**|List<RecordTime>|True|Recording Time Set|
|**saveBucket**|String|True|Bucket|
|**saveEndpoint**|String|True|Storage Address|
|**recordFileType**|String|True|Recording File Type<br>  - Value: ts,flv,mp4 (separate with ; before multiple types)<br>  - Case Insensitive<br>|
|**saveObject**|String|False|Storage Path of Recording File :<br>  - Default Address: record/{Date}/{ServerId}/{AppName}/{StreamName}/{StartTime}_{EndTime}.{format}<br>|
    
    
### RecordTime
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**startTime**|String|True|Start Time|
|**endTime**|String|True|End Time|

## Examples
    {
        "recordTimes": ["2015-12-07T17:50:21Z","2015-12-07T18:54:21Z"],
        "saveBucket": "vod-storage-398392",
        "saveEndpoint": "s3.cn-north-1.jcloudcs.com",
        "recordFileType": "mp4",
        "saveObject": "record/{Date}/{ServerId}/{AppName}/{StreamName}/{StartTime}_{EndTime}.{format}"
    }

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|requestId|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
