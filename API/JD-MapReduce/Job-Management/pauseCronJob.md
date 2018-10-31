# pauseCronJob


## Description
Suspend a regular task of the job

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/cronJob/{planId}:pause

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**planId**|String|True| |Suspended Task ID|
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
|**message**|String| |
|**status**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
