# wfInstanceDetail


## 描述
View the detailed information of the specified workflow

## 请求方式
POST

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/wfInstance:detail

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**wfId**|String|True| | |
|**wfInstanceId**|String|True| | |


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**message**|Message| |
### Message
|名称|类型|描述|
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
|名称|类型|描述|
|---|---|---|
|**child**|Integer| |
|**father**|Integer| |
### Rect
|名称|类型|描述|
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

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
