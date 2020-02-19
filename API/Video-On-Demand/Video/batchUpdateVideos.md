# batchUpdateVideos


## Description
Modify video information in batches

## Request Method
POST

## Request Address
https://vod.jdcloud-api.com/v1/videos:batchUpdate


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**bulkItems**|[BatchUpdateVideosBulkItem[]](batchupdatevideos#batchupdatevideosbulkitem)|True| |Update video entry set in batches|

### <div id="batchupdatevideosbulkitem">BatchUpdateVideosBulkItem</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**videoId**|String|False| |Video ID|
|**name**|String|False| |Video Name|
|**categoryId**|Long|False| |Category ID|
|**tags**|String[]|False| |Video Tagging|
|**coverUrl**|String|False| |Cover Plot Address|
|**description**|String|False| |Video Description Information|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](batchupdatevideos#result)|Modification result of video information in batches|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**okVideoIds**|String[]|List of Video ID Updated|
|**notFoundVideoIds**|String[]|List of Video ID Not Found|
|**failedVideoIds**|String[]|List of Video ID Failed to Be Updated|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "failedVidelIds": [], 
        "notFoundVideoIds": [], 
        "okVideoIds": [
            "4fc583b4-d08a-457a-9ce4-8a59c5f474ac"
        ]
    }
}
```
