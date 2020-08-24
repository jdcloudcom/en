# deleteExtraCacheTime


## Description
Delete the abnormal code cache time. Abnormal code cache related configuration is not supported in the acceleration outside China/on a global scale

## Request mode
POST

## Request address
https://cdn.jdcloud-api.com/v1/domain/{domain}/extraCacheTime:delete

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User domain|

## Request parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**httpCode**|String|True| |One of abnormal status codes ["4xx", "400", "401", "402", "404", "405", "406", "407", "408", "409", "410", "411", "412", "413", "414", "415", "416", "417", "5xx", "500", "501", "502", "503", "504", "505"]|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**result**|Object| |
|**requestId**|String| |


## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
