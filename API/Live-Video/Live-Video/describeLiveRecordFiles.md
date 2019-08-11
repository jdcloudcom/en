# describeLiveRecordFiles


## Description
Search Recording File List


## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/recordFiles


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNum**|Integer|True| |Current Page<br>|
|**pageSize**|Integer|True| |Number of Records per Page<br>|
|**authExpire**|Integer|False| |Download link validity period, Unit: Second, default: 3600<br>|
|**publishDomain**|String|True| |Pushing Streaming Domain<br>|
|**appName**|String|True| |Pushing streaming AppName<br>|
|**streamName**|String|True| |Streaming Name<br>|
|**startTime**|String|True| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss'Z'<br>|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss'Z'<br>|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|Name|Type|Description|
|---|---|---|
|**pageNumber**|Integer|Current Page Number|
|**pageSize**|Integer|Number on Each Page|
|**totalCount**|Integer|Search Total Amount|
|**domainDetails**|RecordFile[]|File Information Set|
### RecordFile
|Name|Type|Description|
|---|---|---|
|**fileId**|String|Recording File ID<br>|
|**format**|String|File Format<br>|
|**width**|Integer|Video Width<br>- Unit: Pixel<br>|
|**height**|Integer|Video Height<br>- Unit: Pixel<br>|
|**startTime**|String|Recording Start Time<br>|
|**endTime**|String|Recording End Time<br>|
|**duration**|Integer|Video Duration<br>|
|**size**|Integer|File Size<br>|
|**bitrate**|Integer|Code Rate<br>|
|**fps**|Integer|Frame Rate<br>|
|**imgUrl**|String|File Address<br>|
|**createTime**|String|Creation Time<br>|

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
https://live.jdcloud-api.com/v1/recordFiles
```

```
{
    "appName": "your appname", 
    "authExpire": 3600, 
    "endTime": "2019-03-27T16:00:00Z", 
    "pageNum": "0", 
    "pageSize": "100", 
    "publishDomain": "your domain", 
    "startTime": "2019-03-26T16:00:00Z", 
    "streamName": "your streamname"
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "fileList": [
            {
                "appName": "xxx", 
                "bitrate": "", 
                "createTime": "2016-05-25T05:48:11Z", 
                "duration": 18800, 
                "endTime": "2016-05-25T05:47:11Z", 
                "fileId": "", 
                "fileUrl": "", 
                "format": "jpg", 
                "fps": "", 
                "height": 234, 
                "publishDomain": "xxx", 
                "size": 200808, 
                "startTime": "2016-05-25T05:37:11Z", 
                "streamName": "xxx", 
                "width": 112
            }
        ], 
        "pageNumber": 1, 
        "pageSize": 100, 
        "totalCount": 2
    }
}
```
