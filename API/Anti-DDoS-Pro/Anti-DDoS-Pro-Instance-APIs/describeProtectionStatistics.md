# describeProtectionStatistics


## Description
Query the Statistic Information of Anti-DDoS Pro Instance Protection

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/describeProtectionStatistics

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
None


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
|**data**|ProtectionStatistics| |
### ProtectionStatistics
|Name|Type|Description|
|---|---|---|
|**instancesCount**|Integer|Instance Counts|
|**protectedCount**|Integer|Count of Protected Instances|
|**protectedDay**|Integer|Days of Protection|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
|**500**|INTERNAL_SERVER_ERROR|
