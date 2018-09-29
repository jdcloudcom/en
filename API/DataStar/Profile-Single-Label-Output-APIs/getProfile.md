# getProfile


## 描述
Query profile information of the corresponding user according to deviceId

## 请求方式
GET

## 请求地址
https://datastar.cn-south-1.jdcloud-api.com/v1/regions/{regionId}/profile/getProfile

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**id**|String|True| |deviceId, mobile, etc., separated by multiple id English commas|
|**labelCode**|String|True| |Profile Label Number, multiple profile labels are separated by English commas|
|**type**|String|True| |data type, only one type can be queried, support type: mobile, idfa, imei, md5_idfa, md5_imei|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID, requests are different at each time|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**data**|String|Map<String, Map<String,String>>, the serialized character string needs to be reconverted before use. Key is the corresponding deviceId, value is the corresponding profile label content, the key of the map within value is the label code of the profile, and value is the value corresponding to the profile.|
|**message**|String|Description Information|
|**status**|Boolean|True is success, false is failure|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
