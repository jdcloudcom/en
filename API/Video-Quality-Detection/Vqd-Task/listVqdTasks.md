# listVqdTasks


## Description
Search the list of video quality detection tasks
Support filtering search:
  - createTime,ge the earliest task creation time
  - createTime,le the latest task creation time
  - status,in task status


## Request Method
GET

## Request Address
https://vqd.jdcloud-api.com/v1/vqdTasks


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number; the default value is 1|
|**pageSize**|Integer|False|10|page size; the default value is 10; the value range is [10, 100]|
|**filters**|[Filter[]](listvqdtasks#filter)|False| | |

### <div id="filter">Filter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Filter Attribute Name|
|**operator**|String|False| |The default value of filter operator is eq|
|**values**|String[]|True| |Filter Attribute Value|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](listvqdtasks#result)|Result of searching video quality control template list information|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**pageNumber**|Integer|Current Page Number|
|**pageSize**|Integer|Number on Each Page|
|**totalElements**|Integer|Search Total Amount|
|**totalPages**|Integer|Total Number of Pages|
|**content**|[VqdTaskObject[]](listvqdtasks#vqdtaskobject)|Paging Content|
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
|**500**|Internal server error|
|**503**|Service unavailable|

## Request Example
GET
```
https://vqd.jdcloud-api.com/v1/vqdTasks

```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "content": [
            {
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
        ], 
        "pageNumber": 1, 
        "pageSize": 10, 
        "totalElements": 1, 
        "totalPages": 1
    }
}
```
