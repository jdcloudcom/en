# getPackageId


## Description
Query Crowd Package ID according to device ID

## Request method
GET

## Request address
https://datastar.cn-south-1.jdcloud-api.com/v1/regions/{regionId}/dmp/getPackageId

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**deviceIds**|String|True| |MD5 (deviceId), multiple MD5 (deviceId) separated by English commas. Note: MD5 result is in lowercase.|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID, it is different at each time|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|String|The string is serialized by Map<String, String>, it needs to be reconverted before use. Key is deviceId, and value is crowd package Id|
|**message**|String|Description Information|
|**status**|Boolean|True is success, false is failure|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
