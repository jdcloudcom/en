# describeProtectionStatistics


## Description
Query the Statistic Information of Anti-DDoS Pro Instance Protection

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/describeProtectionStatistics

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|

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
