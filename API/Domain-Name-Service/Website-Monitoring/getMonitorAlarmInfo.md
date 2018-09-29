# getMonitorAlarmInfo


## Description
Alarm Information for Monitoring Items of the Main Domain

## Request method
GET

## Request address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/monitor/alarminfo

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainId**|String|True| |Domain Name ID|
|**regionId**|String|True| |Region ID to which the instance belongs|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**pageIndex**|Integer|False| |Current page, starting value is 1, default value is 1|
|**pageSize**|Integer|False| |Number of Rows Per Page Set During the Page Query|
|**searchValue**|String|False| |Keyword|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of This Request|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**currentCount**|Integer|Number of Alarm Information of the Current Page|
|**dataList**|MonitorAlarmInfo[]|Array of Alarm Information of the Current Page|
|**totalCount**|Integer|Number of All Alarm Information|
|**totalPage**|Integer|Pages of All Alarm Information|
### MonitorAlarmInfo
|Name|Type|Description|
|---|---|---|
|**domainId**|Integer|Domain Name ID|
|**host**|String|Fault IP/Domain Name|
|**id**|Integer| |
|**startTime**|Integer|Fault Start Time|
|**subDomainName**|String|Subdomain|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
