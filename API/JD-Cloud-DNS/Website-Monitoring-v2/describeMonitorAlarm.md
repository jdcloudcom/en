# describeMonitorAlarm


## Description
Monitoring item alarm information of primary domain

## Request Method
GET

## Request Address
https://domainservice.jdcloud-api.com/v2/regions/{regionId}/domain/{domainId}/monitorAlarm

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of Instances|
|**domainId**|String|True| |Domain ID, please get it by using the describeDomains API.|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageIndex**|Integer|False| |Current page number, the starting value is 1 and default value is 1|
|**pageSize**|Integer|False| |Rows Set per Page for Search by Pages|
|**searchValue**|String|False| |Keyword|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|ID of Request at this time|

### Result
|Name|Type|Description|
|---|---|---|
|**currentCount**|Integer|Number of Warning Information on the Current Page|
|**totalCount**|Integer|Number of all Warning Information|
|**totalPage**|Integer|Page Number of all Warning Information|
|**dataList**|MonitorAlarmInfo[]|Array of Warning Information on the Current Page|
### MonitorAlarmInfo
|Name|Type|Description|
|---|---|---|
|**domainId**|Integer|Domain Name ID|
|**subDomainName**|String|Subdomain|
|**host**|String|Failure IP/domain name|
|**id**|Integer| |
|**startTime**|Long|Fault start time, format: Unix timestamp, time unit: millisecond|
|**endTime**|Long|Fault End Time, Unix timestamp format, time unit: millisecond|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
