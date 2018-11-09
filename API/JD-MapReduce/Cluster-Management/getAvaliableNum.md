# getAvaliableNum


## Description
Obtain the number of remaining resources that can be created of the current user

## Request method
GET

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/avaliableNum

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
|**data**|AvailableNumData|The number of remaining resources that can be created|
|**message**|String| |
|**status**|String| |
### AvailableNumData
|Name|Type|Description|
|---|---|---|
|**serverNum**|Integer|Number of Available Services|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
