# getMonitorAlarmInfo


## 描述
Alarm information for monitoring items of the main domain

## 请求方式
GET

## 请求地址
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/monitor/alarminfo

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domainId**|String|True||Domain Name ID|
|**regionId**|String|True||Region ID to which the instance belongs|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**pageIndex**|Integer|False||Current page, starting value of 1, default value of 1|
|**pageSize**|Integer|False||Number of rows per page set during paged query|
|**searchValue**|String|False||Keyword|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ID of this request|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**currentCount**|Integer|Number of alarm information of current page|
|**dataList**|[MonitorAlarmInfo[]](##MonitorAlarmInfo)|Array of alarm information of the current page|
|**totalCount**|Integer|Number of all alarm information|
|**totalPage**|Integer|Pages of all alarm information|
### <a name="MonitorAlarmInfo">MonitorAlarmInfo</a>
|名称|类型|描述|
|---|---|---|
|**domainId**|Integer|Domain Name ID|
|**host**|String|Fault IP/Domain Name|
|**id**|Integer||
|**startTime**|Integer|Fault Start Time|
|**subDomainName**|String|Subdomain|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
