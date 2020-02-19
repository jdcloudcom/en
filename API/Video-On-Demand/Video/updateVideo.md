# updateVideo


## Description
Modify video information

## Request Method
PUT

## Request Address
https://vod.jdcloud-api.com/v1/videos/{videoId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**videoId**|String|True| |Video ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|False| |Video Name|
|**categoryId**|Long|False| |Category ID|
|**tags**|String[]|False| |Tag|
|**coverUrl**|String|False| |Cover Address|
|**description**|String|False| |Video Description Information|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](updatevideo#result)|Modification result of video information|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**id**|String|Video ID|
|**name**|String|Video Name|
|**description**|String|Video Description|
|**coverUrl**|String|Cover Plot Address|
|**status**|String|Video Status. Value range: <br>  transcoding - transcoding<br>  transcode_failed - transcode failed<br>  normal - normal<br>  uploaded - uploaded (un-transcoded)<br>|
|**fileSize**|Long|The file size unit is Byte|
|**checksum**|String|File MD5 Checksum|
|**duration**|Long|Video Duration|
|**tags**|String[]|Tag Set|
|**categoryId**|Long|Category ID|
|**categoryName**|String|Category Name|
|**snapshots**|[Snapshot[]](updatevideo#snapshot)|Transcode Snapshot|
|**createTime**|String|Creation Time|
|**updateTime**|String|Modification Time|
### <div id="snapshot">Snapshot</div>
|Name|Type|Description|
|---|---|---|
|**imgId**|Long|Snapshot ID|
|**imgUrl**|String|Snapshot URL|
|**width**|Integer|Snapshot Width|
|**height**|Integer|Snapshot Height|

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
PUT
```
https://vod.jdcloud-api.com/v1/videos/4fc583b4-d08a-457a-9ce4-8a59c5f474ac

```
```
{
    "categoryId": 10, 
    "coverUrl": "http://s3.cn-ite-1.jcloudcs.com/vod-storage-vvjdcloud/img/2019/7349/1/img6.jpg", 
    "description": "The Three-body Problem in MC", 
    "name": "The Three-body Problem in MC", 
    "tags": [
        "Minecraft", 
        "Science Fiction", 
        "Liu Cixin"
    ]
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "categoryId": 10, 
        "categoryName": "Animation", 
        "checksum": "5149538c84c8e3a2c46acf29ad463328", 
        "coverUrl": "http://s3.cn-ite-1.jcloudcs.com/vod-storage-vvjdcloud/img/2019/7349/1/img6.jpg", 
        "createTime": "2019-03-29T11:44:18Z", 
        "description": "The Three-body Problem in MC", 
        "duration": 10, 
        "fileSize": 5510872, 
        "id": "4fc583b4-d08a-457a-9ce4-8a59c5f474ac", 
        "name": "The Three-body Problem in MC", 
        "snapshots": [
            {
                "height": "100", 
                "imgId": "1", 
                "imgUrl": "http://s3.cn-ite-1.jcloudcs.com/vod-storage-vvjdcloud/img/2019/7349/1/img6.jpg", 
                "width": "300"
            }
        ], 
        "status": "uploaded", 
        "tags": [
            "Minecraft", 
            "Science Fiction", 
            "Liu Cixin"
        ], 
        "updateTime": "2019-03-29T11:45:51Z"
    }
}
```
