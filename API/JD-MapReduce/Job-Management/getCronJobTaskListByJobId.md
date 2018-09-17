# getCronJobTaskListByJobId


## 描述
Search the operation record of a job of an execution plan

## 请求方式
POST

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/cronJobTask/job/{jobId}:list

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**jobId**|String|False||Job ID|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**planId**|String|True||Regular task ID|
|**selectParams**|[SelectParams](##SelectParams)|False||Search conditions, optional parameters|

### <a name="SelectParams">SelectParams</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**orderBy**|String|False||Ranking condition, optional|
|**pageNum**|Integer|False||Search paging number, optional condition|
|**pageSize**|Integer|False||Search paging size, optional condition|
|**status**|String|False|||

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**data**|Object|"Include the searched JmrTaskViewModel list - taskList"<br>"And returned list size - totalNum"<br>|
|**message**|String||
|**status**|String||

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
