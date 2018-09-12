# resetCacheInstancePassword


## 描述
Reset the password of the Redis instance to support the password-free operation

## 请求方式
POST

## 请求地址
https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}:resetCacheInstancePassword

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**cacheInstanceId**|String|True||The ID of the Redis instance is the unique identifier to access to instance.|
|**regionId**|String|True||The Region ID of the region where the Redis instance is located. At present, the Redis has North China, South China, and East China regions, and the corresponding Region IDs are cn-north-1, cn-south-1, and cn-east-2|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**password**|String|False||Password contains and only supports letters and numbers with no less than 8 characters and no more than 16 characters. If the password is null, it means password-free.|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ID of This Reset Request|



## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
