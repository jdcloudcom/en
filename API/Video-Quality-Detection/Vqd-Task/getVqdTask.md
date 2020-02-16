# getVqdTask


## Description
Obtain details of video quality detection tasks

## Request Method
GET

## Request Address
https://vqd.jdcloud-api.com/v1/vqdTasks/{taskId}


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**taskId**|String|True| |Task ID, path parameter|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](getvqdtask#result)| |
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**vqdTaskObject**|[VqdTaskObject](getvqdtask#vqdtaskobject)| |
### <div id="vqdtaskobject">VqdTaskObject</div>
|Name|Type|Description|
|---|---|---|
|**taskId**|String|Task ID|
|**templateId**|String|Template ID|
|**mediaName**|String|Media Name|
|**threshold**|Double|Defect determination temporal threshold|
|**detections**|String[]|List of Test Items|
|**status**|String|Task Status. <br>- READY<br>- CANCELLED<br>- RUNNING<br>- FINISHED_SUCCESS<br>- FINISHED_FAILURE<br>|
|**createTime**|String|Creation Time|
|**updateTime**|String|Update Time|

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
https://vqd.jdcloud-api.com/v1/vqdTasks/10000

```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "createTime": "2019-11-16T15:51:32Z", 
        "detections": [
            "BlackScreen", 
            "PureColor", 
            "ColorCast"
        ], 
        "mediaName": "The Garden of Words", 
        "status": "READY", 
        "taskId": "10000", 
        "templateId": "10000", 
        "threshold": "3.000", 
        "updateTime": "2019-11-16T15:51:32Z"
    }
}
```
