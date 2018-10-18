# downloadDDosAttackLogs


## Description
Download the DDos attack log

## Request method
GET

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/attacklog:ddos/download

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**instanceId**|String[]|False| |Advanced Anti-DDoS Instance ID|
|**startTime**|String|True| |Start time, only data within the latest 60 days can be downloaded, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|


## Response parameter
None



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
