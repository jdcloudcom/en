# queryVqdTaskResult


## Description
Search the results of video quality detection tasks

## Request Method
GET

## Request Address
https://vqd.jdcloud-api.com/v1/vqdTasks/{taskId}:queryResult


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**taskId**|String|True| |Task ID, path parameter|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](queryvqdtaskresult#result)| |
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**vqdTaskResultObject**|[VqdTaskResultObject](queryvqdtaskresult#vqdtaskresultobject)| |
### <div id="vqdtaskresultobject">VqdTaskResultObject</div>
|Name|Type|Description|
|---|---|---|
|**taskId**|String|Task ID|
|**status**|String|Result Status. <br>- FINISHED_SUCCESS<br>- FINISHED_FAILURE<br>|
|**defects**|[VqdDefectObject[]](queryvqdtaskresult#vqddefectobject)| |
|**errorCode**|String|Error Code|
### <div id="vqddefectobject">VqdDefectObject</div>
|Name|Type|Description|
|---|---|---|
|**item**|String|Detected Item|
|**start**|String|Defect Start Time Stamp|
|**end**|String|Defect End Time Stamp|
|**value**|String|Defect Value|
|**info**|String|Defect detection information|

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
https://vqd.jdcloud-api.com/v1/vqdTasks/10000:queryResult

```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "defects": [
            {
                "detection": "BlackScreen", 
                "end": "38.541", 
                "info": "black screen detected", 
                "start": "35.041", 
                "value": "1.0000"
            }
        ], 
        "status": "FINISHED_SUCCESS", 
        "taskId": "10000"
    }
}
```
