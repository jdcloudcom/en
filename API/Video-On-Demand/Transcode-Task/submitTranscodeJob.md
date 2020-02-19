# submitTranscodeJob


## Description
Submit transcode job

## Request Method
POST

## Request Address
https://vod.jdcloud-api.com/v1/transcodeTasks:submitJob


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**videoId**|String|False| |Video ID|
|**templateIds**|Long[]|False| |List of Transcode Template ID|
|**watermarkIds**|Long[]|False| |Watermark ID List|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](submittranscodejob#result)|Submit transcode job result|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**tasks**|[SubmittedTranscodeTask[]](submittranscodejob#submittedtranscodetask)|Transcode Task Submitted|
### <div id="submittedtranscodetask">SubmittedTranscodeTask</div>
|Name|Type|Description|
|---|---|---|
|**taskId**|Long|Task ID|
|**videoId**|String|Video ID|
|**templateId**|Long|Transcode Template ID|
|**watermarkIds**|Long[]|Watermark ID List|

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
https://vod.jdcloud-api.com/v1/transcodeTasks:submitJob

```
```
{
    "templateIds": [
        1, 
        2
    ], 
    "vidoeId": "343a6194-85ea-49bd-8b43-df1c654f5d79", 
    "watermarkIds": [
        1, 
        2
    ]
}
```

## Return Example
```
{
    "requestId": "d2e394ff-f7ff-42b5-8544-8866f999507e", 
    "result": {
        "tasks": [
            {
                "taskId": 1, 
                "templateId": 1, 
                "vidoeId": "343a6194-85ea-49bd-8b43-df1c654f5d79", 
                "watermarkIds": [
                    1, 
                    2
                ]
            }, 
            {
                "taskId": 2, 
                "templateId": 2, 
                "vidoeId": "343a6194-85ea-49bd-8b43-df1c654f5d79", 
                "watermarkIds": [
                    1, 
                    2
                ]
            }
        ]
    }
}
```
