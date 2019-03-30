# describeDDoSAttackLogs


## Description
Search the DDos attack log

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/attacklog:DDoS

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Page Number: 1 by default|
|**pageSize**|Integer|False| |Paging Size: 10 by default; value range [10, 100]|
|**startTime**|String|True| |Start time, up to the latest 30 days, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**instanceId**|Long[]|False| |Anti-DDoS Pro Instance ID|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |
|**error**|Error| |

### Error
|Name|Type|Description|
|---|---|---|
|**code**|Integer|Request Error Status Code|
|**status**|String|Request Error Status Code|
|**message**|String|Request Error Notification|
### Result
|Name|Type|Description|
|---|---|---|
|**dataList**|DDosAttackLog[]| |
|**currentCount**|Integer|Current Page Counts|
|**totalCount**|Integer|Total Number of Instances|
|**totalPage**|Integer|Total Number of Pages|
### DDosAttackLog
|Name|Type|Description|
|---|---|---|
|**attackTraffic**|Double|Attack Traffic|
|**blackHole**|Integer|Is black hole triggered, 0->no  1->yes|
|**startTime**|String|Start Time of Attack|
|**endTime**|String|End Time of Attack|
|**unit**|String|Traffic Unit: bps, Kbps, Mbps and Gbps|
|**instanceId**|Long|Anti-DDoS Pro Instance id|
|**name**|String|Anti-DDoS Pro Instance Name|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
