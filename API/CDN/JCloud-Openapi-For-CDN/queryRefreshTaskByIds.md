# queryRefreshTaskByIds


## Description
Search refresh and prewarm task according to taskIds

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/task:queryByIds


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**taskIds**|String[]|True| |Searched Task taskIds List, 10 pieces at most|
|**keyword**|String|False| |Fuzzy search keyword of url|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](queryRefreshTaskByIds#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**tasks**|[RefreshTask[]](queryRefreshTaskByIds#refreshtask)| |
### <div id="RefreshTask">RefreshTask</div>
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
|**urlTasks**|[UrlTask[]](#urltask)|Detailed Task|
### <div id="UrlTask">UrlTask</div>
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
