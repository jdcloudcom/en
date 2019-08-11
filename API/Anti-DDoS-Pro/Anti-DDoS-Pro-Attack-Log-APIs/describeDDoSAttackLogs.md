# describeDDoSAttackLogs


## Description
Search DDoS attack log

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/attacklog:describeDDoSAttackLogs

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Page Number: 1 by default|
|**pageSize**|Integer|False| |Paging Size: 10 by default; value range [10, 100]|
|**startTime**|String|True| |Start time, only data within the latest 90 days can be searched, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**instanceId**|String[]|False| |Anti-DDoS Pro instance ID|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |
|**error**|Error| |

### Error
|Name|Type|Description|
|---|---|---|
|**err**|Err| |
### Err
|Name|Type|Description|
|---|---|---|
|**code**|Long|Same as http code|
|**details**|Object| |
|**message**|String| |
|**status**|String|Specific Error|
### Result
|Name|Type|Description|
|---|---|---|
|**dataList**|DDoSAttackLog[]| |
|**currentCount**|Integer|Current Page Counts|
|**totalCount**|Integer|Total Number of Instances|
|**totalPage**|Integer|Total Number of Pages|
### DDoSAttackLog
|Name|Type|Description|
|---|---|---|
|**attackTraffic**|Double|Attack Traffic|
|**blackHole**|Integer|Is black hole triggered, 0 is no while 1 is yes|
|**startTime**|String|Start Time of Attack|
|**endTime**|String|End Time of Attack|
|**unit**|String|Traffic Unit, bps, Kbps, Mbps, Gbps|
|**instanceId**|String|Anti-DDoS Pro Instance id|
|**name**|String|Anti-DDoS Pro Instance Name|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
