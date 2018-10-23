# describeProtectionStatistics


## Description
Query the Statistic Information of Advanced Anti-DDoS Instance Protection

## Request method
GET

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instance/describeProtectionStatistics

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|ProtectionStatistics| |
### ProtectionStatistics
|Name|Type|Description|
|---|---|---|
|**instancesCount**|Integer|Instance Counts|
|**protectedCount**|Integer|Count of Protected Instances|
|**protectedDay**|Integer|Days of Protection|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
|**500**|INTERNAL_SERVER_ERROR|
