# ccGraph


## Description
Forwarding traffic report

## Request method
GET

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/charts:ccGraph

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Belonging region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**endTime**|String|True||Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**instanceId**|String[]|False||Advanced Anti-DDoS instance ID, 0 or more can be transferred|
|**startTime**|String|True||Start time, up to the latest 30 days, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**subDomain**|String[]|False||Rule domain name, 0 or more can be transferred|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**postProtect**|Integer[]||
|**preProtect**|Integer[]||
|**time**|Integer[]||
|**unit**|String|Unit|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
