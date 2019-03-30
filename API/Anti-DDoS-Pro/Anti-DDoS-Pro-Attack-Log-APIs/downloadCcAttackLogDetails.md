# downloadCCAttackLogDetails


## Description
Download the CC attack log details

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/attacklog:CCDetail/download

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Start time, only data within the latest 60 days can be downloaded, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**instanceId**|Long|True| |Anti-DDoS Pro instance ID|
|**subDomain**|String[]|False| |Subdomain Name|


## Response parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
