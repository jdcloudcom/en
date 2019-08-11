# describeLiveTranscodingDurationData


## Description
Search Transcode Duration Data

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/describeLiveTranscodingDurationData


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**grade**|String|False| |For the code rate grade, the transcode duration for a specified grade can be searched, value:<br>- video_h264_4k_1<br>- video_h264_2k_1<br>- video_h264_shd_1<br>- video_h264_hd_1<br>- video_h264_sd_1<br>- video_h265_4k_1<br>- video_h265_2k_1<br>- video_h265_shd_1<br>- video_h265_hd_1<br>- video_h265_sd_1<br>|
|**period**|String|False| |Search period, value range: "day, month, year, followTime", representing 1 day, 1 month, 1 year, follow the time. It is null by default, representing day. When followTime is transmitted, representing as per the period of Endtime-StartTime, only one point is returned<br>|
|**startTime**|String|True| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss'Z'<br>|
|**endTime**|String|False| |Search End Time, UTC time, Format: yyyy-MM-dd'T'HH:mm:ss’Z’<br>, it is the current time by default when null<br>|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|ruquestId|

### Result
|Name|Type|Description|
|---|---|---|
|**dataList**|TranscodeDurationStatisticResult[]| |
### TranscodeDurationStatisticResult
|Name|Type|Description|
|---|---|---|
|**startTime**|String|Time Point<br>|
|**endTime**|String|Time Point<br>|
|**data**|TranscodeDurationStatisticData| |
### TranscodeDurationStatisticData
|Name|Type|Description|
|---|---|---|
|**duration**|String|Duration, Unit: Second<br>|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

## Request Example
GET
```
https://live.jdcloud-api.com/v1/describeLiveTranscodingDurationData?startTime=2018-10-21T16:00:00Z&endTime=2019-03-25T16:00:00Z
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "dataList": [
            {
                "data": {
                    "duration": 39964780
                }, 
                "endTime": "2019-03-28T15:59:59Z", 
                "startTime": "2019-03-27T16:00:00Z"
            }, 
            {
                "data": {
                    "duration": 26255406
                }, 
                "endTime": "2019-03-26T15:59:59Z", 
                "startTime": "2019-03-25T16:00:00Z"
            }
        ]
    }
}
```
