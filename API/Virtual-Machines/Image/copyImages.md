# copyImages


## 描述
Image inter-domain replication, copy private images to other regions, allowing  you to operate your private image only. <br>
Only images of the Cloud Disk Service of system disk are supported.


## 请求方式
POST

## 请求地址
https://vm.jdcloud-api.com/1.0.3/regions/{regionId}/images:copyImages

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**destinationRegion**|String|True| |Target Area|
|**sourceImageIds**|String[]|True| |Source Image ID|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**copyImages**|CopyImage[]|source image and target image mapping relationships|
### CopyImage
|名称|类型|描述|
|---|---|---|
|**destinationImageId**|String|Target Image ID after Replication|
|**sourceImageId**|String|Source Image ID|

## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not Found  |
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
