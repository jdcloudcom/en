# getJmrVersionList


## Description
Return to the current JD MapReduce Version List

## Request method
GET

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/jmrVersions

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
|**data**|String[]|Current JD MapReduce Version List|
|**message**|String| |
|**status**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
