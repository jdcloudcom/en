# describeDDosAttackLogs


## Description
Search the DDos attack log

## Request method
GET

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/attacklog:ddos

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Belonging Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**instanceId**|String[]|False| |Advanced Anti-DDoS Instance ID|
|**pageNumber**|Integer|False| |Page Number: 1 by default|
|**pageSize**|Integer|False| |Paging Size: 20 by default; value range [10, 100]|
|**startTime**|String|True| |Start time, up to the latest 30 days, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**currentCount**|Integer|Current Page Counts|
|**dataList**|DDosAttackLog[]| |
|**totalCount**|Integer|Total Number of Instances|
|**totalPage**|Integer|Total Number of Pages|
### DDosAttackLog
|Name|Type|Description|
|---|---|---|
|**attackTraffic**|Number|Attack Traffic|
|**blackHole**|Integer|Is black hole triggered, 0->no  1->yes|
|**endTime**|String|End Time of Attack|
|**instanceId**|Integer|Advanced Anti-DDoS Instance ID|
|**name**|String|Advanced Anti-DDoS Instance Name|
|**startTime**|String|Start Time of Attack|
|**unit**|String|Traffic Unit: bps, Kbps, Mbps and Gbps|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
