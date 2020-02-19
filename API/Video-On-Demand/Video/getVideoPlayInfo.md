# getVideoPlayInfo


## Description
Get video playing information

## Request Method
GET

## Request Address
https://vod.jdcloud-api.com/v1/videos/{videoId}:getPlayInfo

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**videoId**|String|True| |Video ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](getvideoplayinfo#result)|Get video playing information result|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**baseInfo**|[VideoBaseInfo](getvideoplayinfo#videobaseinfo)|Basic Video Information|
|**playInfoList**|[VideoPlayInfo[]](getvideoplayinfo#videoplayinfo)|Video Play Information List|
### <div id="videoplayinfo">VideoPlayInfo</div>
|Name|Type|Description|
|---|---|---|
|**taskId**|String|Produce transcode task ID of playing information|
|**definition**|String|Definition Specification Mark. Value range: <br>  SD - standard definition<br>  HD - high definition<br>  FHD - super definition<br>  2K<br>  4K<br>|
|**mediaType**|Integer|Media Type|
|**status**|String|Only normal status is available for play information status now|
|**url**|String|CDN Address, Initial Address or Authentication Address|
|**size**|Long| |
|**duration**|Long|Video Duration|
|**bitrate**|Long|Code Rate|
|**codec**|String|Encoding Formats|
|**format**|String|Encapsulation Format|
|**width**|Integer|Video Width|
|**height**|Integer|Video Height|
|**fps**|String|Video Frame Rate|
|**createTime**|String| |
|**updateTime**|String| |
### <div id="videobaseinfo">VideoBaseInfo</div>
|Name|Type|Description|
|---|---|---|
|**videoId**|String|Video ID|
|**videoName**|String|Video Name|
|**description**|String|Video Description|
|**categoryId**|Long| |
|**categoryName**|String|Category Name|
|**tags**|String|Tag|
|**duration**|Long|Video Duration|
|**coverUrl**|String|Cover Address|

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
https://vod.jdcloud-api.com/v1/videos/4fc583b4-d08a-457a-9ce4-8a59c5f474ac:getPlayInfo

```

## Return Example
```
{
    "code": 200, 
    "requestId": "bkpp00iunavp370wuuur7tk4tw8hqnga", 
    "result": {
        "baseInfo": {
            "coverImgUrl": "https://s3.cn-north-1.jcloudcs.com/vod-storage-72757/img/2019/3044119/1/img1.jpg", 
            "tag": "[]", 
            "videoId": "0b2a55f8-233a-4169-8c0d-b441d693fb86", 
            "videoName": "src_i-100_720p"
        }, 
        "playInfoList": [
            {
                "bitrate": 1489895, 
                "codec": "avc1", 
                "createTime": "2019-07-19T08:26:20Z", 
                "definition": "HD", 
                "duration": 217200, 
                "format": "mp4", 
                "fps": "25.000", 
                "height": 720, 
                "mediaType": 0, 
                "size": 40513620, 
                "status": 2, 
                "taskId": 3045989, 
                "updateTime": "2019-07-19T08:26:20Z", 
                "url": "https://72757-playvod.jdcloud.com/1563528722/ff23b0202a4c59512034cd94d95aef0c/vod/product/3045989/7/0b2a55f8-233a-4169-8c0d-b441d693fb86.mp4", 
                "width": 1280
            }
        ]
    }
}
```
