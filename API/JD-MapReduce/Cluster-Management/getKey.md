# getKey


## Description
Obtain user appkey and SecretKey

## Request method
GET

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/key

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
|**data**|AppModel|AK/SK Queried|
|**message**|String| |
|**status**|String| |
### AppModel
|Name|Type|Description|
|---|---|---|
|**appKey**|String|AK|
|**appSecret**|String|SK|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
