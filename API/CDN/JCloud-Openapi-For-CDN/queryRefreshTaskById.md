# queryRefreshTaskById


## Description
Search refresh and prewarm task according to taskId

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/task/{taskId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**taskId**|String|True| |Domain Group id|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](queryrefreshtaskbyid#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**task**|[RefreshTask](queryrefreshtaskbyid#refreshtask)| |
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
|**urlTasks**|[UrlTask[]](queryrefreshtaskbyid#urltask)|Detailed Task|
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