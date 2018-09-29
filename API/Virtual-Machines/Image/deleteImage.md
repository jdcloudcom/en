# deleteImage


## 描述
Delete a private image that only allows you to operate your personal private image.
If the image is shared to other users, the image can be deleted only when the sharing is released.


## 请求方式
DELETE

## 请求地址
https://vm.jdcloud-api.com/1.0.3/regions/{regionId}/images/{imageId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**imageId**|String|True| |Image ID|
|**regionId**|String|True| |Region ID|

## 请求参数
无


## 返回参数
无


## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not Found  |
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
