# listVideos


## Description
Search video list information.
Search by filtering conditions is allowed and the supported filter fields are as follows:
  - status[eq] precise search by video status
  - categoryId[eq] precise search by category ID
  - videoId[eq] precise search by video ID
  - name[eq] precise search by video name


## Request Method
GET

## Request Address
https://vod.jdcloud-api.com/v1/videos


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number; the default value is 1|
|**pageSize**|Integer|False|10|page size; the default value is 10; the value range is [10, 100]|
|**filters**|[Filter[]](listvideos#filter)|False| | |
|**sorts**|[Sort[]](listvideos#sort)|False| | |

### <div id="sort">Sort</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|False| |Sorting Attribute Name|
|**direction**|String|False| |Sorting Direction|
### <div id="filter">Filter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Filter Attribute Name|
|**operator**|String|False| |The default value of filter operator is eq|
|**values**|String[]|True| |Filter Attribute Value|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](listvideos#result)|Search result of video list information|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**pageNumber**|Integer|Current Page Number|
|**pageSize**|Integer|Number on Each Page|
|**totalElements**|Integer|Search total amount|
|**totalPages**|Integer|Total Number of Pages|
|**content**|[VideoObject[]](listvideos#videoobject)|Paging Content|
### <div id="videoobject">VideoObject</div>
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
|**snapshots**|[Snapshot[]](listvideos#snapshot)|Transcode Snapshot|
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
GET
```
https://vod.jdcloud-api.com/v1/videos?pageNumber=1&pageSize=10&filters.1.name=name&filters.1.values.1=The Three-body Problem in MC &filters.2.name=status&filters.2.values.1=normal&filters.2.operator=eq

```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "content": [
            {
                "categoryId": 0, 
                "categoryName": "No Category", 
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
                "status": "transcoding", 
                "tags": [
                    "Minecraft", 
                    "Science Fiction", 
                    "Liu Cixin"
                ], 
                "updateTime": "2019-03-29T11:45:51Z"
            }
        ], 
        "pageNumber": 1, 
        "pageSize": 10, 
        "totalElements": 92, 
        "totalPages": 10
    }
}
```
