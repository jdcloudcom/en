# submitVqdTask


## Description
Submit video quality detection tasks

## Request Method
POST

## Request Address
https://vqd.jdcloud-api.com/v1/vqdTasks:submit


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**media**|[VqdMediaObject](submitvqdtask#vqdmediaobject)|True| | |
|**templateId**|String|True| |Quality detection template ID|

### <div id="vqdmediaobject">VqdMediaObject</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**mediaUrl**|String|True| |Media URL|
|**mediaName**|String|False| |Media Name|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](submitvqdtask#result)|Submit the result of video quality detection tasks|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**taskId**|String| |

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
https://vqd.jdcloud-api.com/v1/vqdTasks:submit

```
```
{
    "media": {
        "mediaName": "The Garden of Words", 
        "mediaUrl": "https://example.com/video/filename.mp4"
    }, 
    "templateId": "10000"
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "taskId": "10000"
    }
}
```
