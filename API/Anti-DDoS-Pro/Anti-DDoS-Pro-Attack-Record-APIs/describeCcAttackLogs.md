# describeCcAttackLogs


## Description
Search the cc attack log

## Request method
GET

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/attacklog:cc

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Belonging region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**endTime**|String|True||Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**instanceId**|String[]|False||Advanced Anti-DDoS instance ID|
|**pageNumber**|Integer|False||Page number; 1 by default|
|**pageSize**|Integer|False||Page size; it is 10 by default; value range [10, 100]|
|**startTime**|String|True||Start time, up to the latest 30 days, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**dataList**|DDosAttackLog[]||
|**totalCount**|Integer||
### <a name="DDosAttackLog">DDosAttackLog</a>
|Name|Type|Description|
|---|---|---|
|**attackTraffic**|Number|Attack traffic|
|**blackHole**|Integer|Is black hole triggered, 0->no  1->yes|
|**endTime**|String|End time of attack|
|**instanceId**|Integer|Advanced Anti-DDoS instance ID|
|**name**|String|Advanced Anti-DDoS instance name|
|**startTime**|String|Start time of attack|
|**unit**|String|Traffic unit, i.e. bps, Kbps, Mbps and Gbps|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
