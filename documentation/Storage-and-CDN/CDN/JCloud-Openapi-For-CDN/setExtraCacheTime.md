# setExtraCacheTime


## Description
Set the abnormal code cache time. Abnormal code cache related configuration is not supported in the acceleration outside China/on a global scale

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/domain/{domain}/extraCacheTime:set

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**httpCode**|String|True| |Shall be one of the exception status codes among ["4xx","400", "401", "402", "404", "405", "406", "407", "408", "409", "410", "411", "412", "413", "414", "415", "416", "417", "5xx","500", "501", "502", "503", "504", "505"]|
|**cacheTime**|Long|True| |Cache Time (Unit: Second)|


## Return Parameter
|Name|Description|Type|
|---|---|---|
|**result**|Object| |
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
