# batchDeleteVideos


## Description
If the API of deleting video in batches is called, all information related to the appointed video will be deleted at the same time, including transcode task information, transcode streaming data, etc. Meanwhile, relevant file resources in the Cloud Storage will be cleared.

## Request Method
POST

## Request Address
https://vod.jdcloud-api.com/v1/videos:batchDelete


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**videoIds**|String[]|True| |Video ID set|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](batchdeletevideos#result)|Delete video results in batches|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**okVideoIds**|String[]|Video ID Set Deleted|
|**notFoundVideoIds**|String[]|Set of Video ID Not Found|
|**failedVideoIds**|String[]|Set of Video ID Failed to Be Deleted|

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
        "failedVideoIds": [], 
        "notFoundVideoIds": [
            "edfc74ea-be4c-418b-b841-31ddd2b33203"
        ], 
        "okVideoIds": [
            "4fc583b4-d08a-457a-9ce4-8a59c5f474ac"
        ]
    }
}
```
