# describeCcAttackLogDetails


## Description
Search the cc attack log details

## Request method
GET

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/attacklog:ccDetail

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Belonging Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**endTime**|String|True||Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**instanceId**|String|True||Advanced Anti-DDoS instance ID|
|**pageNumber**|Integer|False||Page number; 1 by default|
|**pageSize**|Integer|False||Paging size; it is 20 by default; value range [10, 100]|
|**startTime**|String|True||Start time, up to the latest 30 days, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**subDomain**|String[]|False||Subdomain name|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### Result
|Name|Type|Description|
|---|---|---|
|**currentCount**|Integer|Current page counts|
|**dataList**|CCAttackLogDetail[]||
|**totalCount**|Integer|Total number of instances|
|**totalPage**|Integer|Total number of pages|
### CCAttackLogDetail
|Name|Type|Description|
|---|---|---|
|**key**|String|Feature Key|
|**num**|Integer|Attack Counts|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
