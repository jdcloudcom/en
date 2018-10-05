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
|**id**|String|True| |deviceId, mobile, etc., separated by multiple id English commas|
|**labelCode**|String|True| |Profile Label Number, multiple profile labels are separated by English commas|
|**type**|String|True| |data type, only one type can be queried, support type: mobile, idfa, imei, md5_idfa, md5_imei|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID, requests are different at each time|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|String|Map<String, Map<String,String>>, the serialized character string needs to be reconverted before use. Key is the corresponding deviceId, value is the corresponding profile label content, the key of the map within value is the label code of the profile, and value is the value corresponding to the profile.|
|**message**|String|Description Information|
|**status**|Boolean|True is success, false is failure|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
