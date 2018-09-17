# getLogs


## 描述
Search a container log


## 请求方式
GET

## 请求地址
https://nc.jdcloud-api.com/v1/regions/{regionId}/containers/{containerId}:getLogs

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**containerId**|String|True||Container ID|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**limitBytes**|Integer|False||Restrict byte number in returned log file within [1-4]KB, with 4KB at most.<br>|
|**sinceSeconds**|Integer|False||Return logs in sinceSeconds relatively before current time.<br>|
|**tailLines**|Integer|False||Return the tailLines in log file. If no tail line is specified, the log file will be read from the container starting time or the time specified by sinceSeconds by default.<br>|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**logs**|Object||

## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
