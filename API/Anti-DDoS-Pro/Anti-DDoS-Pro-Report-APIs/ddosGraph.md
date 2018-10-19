# ddosGraph


## Description
DDos Protection Report

## Request method
GET

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/charts:ddosGraph

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**instanceId**|String[]|False| |Advanced Anti-DDoS Instance ID, 0 or more can be transferred|
|**startTime**|String|True| |Start time, up to the latest 60 days, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**postProtect**|Number[]| |
|**preProtect**|Number[]| |
|**time**|Integer[]| |
|**unit**|String|Traffic Unit|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
