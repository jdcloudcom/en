# isValidJobName


## Description
Verify whether the job name is valid

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/jobName:Validate

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**jobId**|String|True| |It is considered as the job name verification basis|
|**jobName**|String|True| |Job Name to be Verified|


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
