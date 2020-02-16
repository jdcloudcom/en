# batchSubmitVqdTasks


## Description
Submit video quality inspection tasks in batches, and at a time, a maximum of 50 input medias can be submitted

## Request Method
POST

## Request Address
https://vqd.jdcloud-api.com/v1/vqdTasks:batchSubmit


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**mediaList**|[VqdMediaObject[]](batchsubmitvqdtasks#vqdmediaobject)|True| |Media List|
|**templateId**|String|True| |Quality detection template ID|

### <div id="vqdmediaobject">VqdMediaObject</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**mediaUrl**|String|True| |Media URL|
|**mediaName**|String|False| |Media Name|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](batchsubmitvqdtasks#result)|Submit the results of video quality detection tasks in batches|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**taskIds**|String[]| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**500**|Internal server error|
|**503**|Service unavailable|

## Request Example
POST
```
https://vqd.jdcloud-api.com/v1/vqdTasks:batchSubmit

```
```
{
    "mediaList": [
        {
            "mediaName": "The Garden of Words", 
            "mediaUrl": "https://example.com/video/filename-001.mp4"
        }, 
        {
            "mediaName": "Natsume's Book of Friends", 
            "mediaUrl": "https://example.com/video/filename-002.mp4"
        }
    ], 
    "templateId": "10000"
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "taskIds": [
            "10001", 
            "10002"
        ]
    }
}
```
