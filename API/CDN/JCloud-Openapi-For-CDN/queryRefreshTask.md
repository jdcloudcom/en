# queryRefreshTask


## Description
Search refresh and prewarm task

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/task


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**keyword**|String|False| |Fuzzy search keyword of url or directory|
|**taskId**|String|False| |Task id|
|**taskStatus**|String|False| | |
|**taskType**|String|False| | |
|**pageNumber**|Integer|False| |Page Number, default value 1|
|**pageSize**|Integer|False| |Page Size, default value 50|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](queryrefreshtask#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**total**|Integer|Total Count of Refresh and Prewarm Entries.|
|**tasks**|[RefreshTask[]](queryrefreshtask#refreshtask)| |
### <div id="refreshtask">RefreshTask</div>
|Name|Type|Description|
|---|---|---|
|**createDate**|String|Task Creation Time, UTC time|
|**failed**|Float|Task Failure Rate|
|**success**|Float|Task Success Rate|
|**taskId**|String|id of Refresh and Prewarm task|
|**id**|Long|Database Table id|
|**retryStatus**|String|Try Again Status (unretry: not try again, retry: try again)|
|**taskStatus**|String|Task Status (running: in running, success: success, failed: failure)|
|**taskType**|String|Refresh and prewarm type, (url: url refresh, dir: directory refresh, prefetch: prewarm)|
|**urlTasks**|[UrlTask[]](queryrefreshtask#urltask)|Detailed Task|
### <div id="urltask">UrlTask</div>
|Name|Type|Description|
|---|---|---|
|**taskType**|String|Refresh and prewarm type, (url: url refresh, dir: directory refresh, prefetch: prewarm)|
|**url**|String|url of Refresh and Prewarm|
|**status**|String|Task Status (running: in running, success: success, failed: failure)|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|