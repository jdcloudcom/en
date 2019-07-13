# createRefreshTask


## Description
Create refresh and prewarm task

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/task


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**taskType**|String|False| |Refresh and prewarm type, (url: url refresh, dir: directory refresh, prefetch: prewarm)|
|**urls**|String[]|False| | |


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**errorCount**|Integer|Count of Failed Tasks|
|**taskId**|String|Task id|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
