# describeUserQuota


## 描述
Query account quota information

## 请求方式
GET

## 请求地址
https://redis.jdcloud-api.com/v1/regions/{regionId}/quota

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |The Region ID of the region where the JCS for Redis instance is located. At present, the JCS for Redis has North China, South China, and East China regions, and the corresponding Region IDs are cn-north-1, cn-south-1, and cn-east-2|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**quota**|Quota| |
### Quota
|名称|类型|描述|
|---|---|---|
|**max**|Integer|Quota|
|**name**|String|Name of the Quota Item|
|**used**|Integer|Number Used|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
