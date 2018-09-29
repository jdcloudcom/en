# getMonitorAlarmInfo


## 描述
Alarm Information for Monitoring Items of the Main Domain

## 请求方式
GET

## 请求地址
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/monitor/alarminfo

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domainId**|String|True| |Domain Name ID|
|**regionId**|String|True| |Region ID to which the instance belongs|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**pageIndex**|Integer|False| |Current page, starting value is 1, default value is 1|
|**pageSize**|Integer|False| |Number of Rows Per Page Set During the Page Query|
|**searchValue**|String|False| |Keyword|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ID of This Request|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**currentCount**|Integer|Number of Alarm Information of the Current Page|
|**dataList**|MonitorAlarmInfo[]|Array of Alarm Information of the Current Page|
|**totalCount**|Integer|Number of All Alarm Information|
|**totalPage**|Integer|Pages of All Alarm Information|
### MonitorAlarmInfo
|名称|类型|描述|
|---|---|---|
|**domainId**|Integer|Domain Name ID|
|**host**|String|Fault IP/Domain Name|
|**id**|Integer| |
|**startTime**|Integer|Fault Start Time|
|**subDomainName**|String|Subdomain|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
