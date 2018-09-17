# getMonitorAlarmInfo


## Description
Alarm information for monitoring items of the main domain

## Request method
GET

## Request address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/monitor/alarminfo

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainId**|String|True||Domain Name ID|
|**regionId**|String|True||Region ID to which the instance belongs|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**pageIndex**|Integer|False||Current page, starting value of 1, default value of 1|
|**pageSize**|Integer|False||Number of rows per page set during paged query|
|**searchValue**|String|False||Keyword|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of this request|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**currentCount**|Integer|Number of alarm information of current page|
|**dataList**|[MonitorAlarmInfo[]](##MonitorAlarmInfo)|Array of alarm information of the current page|
|**totalCount**|Integer|Number of all alarm information|
|**totalPage**|Integer|Pages of all alarm information|
### <a name="MonitorAlarmInfo">MonitorAlarmInfo</a>
|Name|Type|Description|
|---|---|---|
|**domainId**|Integer|Domain Name ID|
|**host**|String|Fault IP/Domain Name|
|**id**|Integer||
|**startTime**|Integer|Fault Start Time|
|**subDomainName**|String|Subdomain|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
