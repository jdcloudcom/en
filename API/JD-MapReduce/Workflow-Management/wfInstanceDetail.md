# wfInstanceDetail


## Description
View the detailed information of the specified workflow

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/wfInstance:detail

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**wfId**|String|True| | |
|**wfInstanceId**|String|True| | |


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**message**|Message| |
### Message
|Name|Type|Description|
|---|---|---|
|**code**|String|Code|
|**data**|Object|Data|
|**instanceId**|String| |
|**jobId**|String|Job ID|
|**path**|Path[]| |
|**pipeline**|String| |
|**rect**|Rect[]| |
|**result**|String|Result|
|**source**|String| |
|**sourceParameterList**|String[]| |
|**target**|String| |
|**targetParameterList**|String[]| |
|**taskId**|String| |
|**total**|Integer| |
### Path
|Name|Type|Description|
|---|---|---|
|**child**|Integer| |
|**father**|Integer| |
### Rect
|Name|Type|Description|
|---|---|---|
|**instanceId**|Integer| |
|**instanceStatus**|Integer| |
|**intervalTimes**|Integer|Re-running Interval of the Failed Task|
|**jobId**|Integer| |
|**retryTimes**|Integer|Retry times after the task is failed|
|**taskDesc**|String| |
|**taskId**|String| |
|**taskName**|String| |
|**taskType**|String| |
|**x**|Number| |
|**y**|Number| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
