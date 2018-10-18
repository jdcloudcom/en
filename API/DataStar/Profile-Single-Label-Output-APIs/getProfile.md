# getProfile


## Description
Query profile information of the corresponding user according to deviceId

## Request method
GET

## Request address
https://datastar.cn-south-1.jdcloud-api.com/v1/regions/{regionId}/profile/getProfile

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**id**|String|True| |deviceId, mobile, etc., multiple ids are separated by English commas|
|**labelCode**|String|True| |Profile Label Number, multiple profile labels are separated by English commas|
|**type**|String|True| |data type, only one type can be queried, support type: mobile, idfa, imei, md5_idfa, md5_imei|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID, it is different at each time|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|String|The string is serialized by Map<String, Map<String,String>>. It needs to be reconverted before use. Key is deviceId, and value is the content corresponding to the profile label. The key of inner map is the label code of the profile, while the value is the one corresponding to the profile|
|**message**|String|Description Information|
|**status**|Boolean|True is success, false is failure|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
