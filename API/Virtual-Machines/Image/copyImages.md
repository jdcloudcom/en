# copyImages


## 描述
Image inter-domain replication,  copy private images to other regions,  allowing you to operate your private image only. <br>
Only images of the cloudDisk cloud of system disk are supported.


## 请求方式
POST

## 请求地址
https://vm.jdcloud-api.com/v1/regions/{regionId}/images:copyImages

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**destinationRegion**|String|True||target area|
|**sourceImageIds**|String[]|True||Source image ID|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**copyImages**|[CopyImage[]](##CopyImage)|source image and target image mapping relationships|
### <a name="CopyImage">CopyImage</a>
|名称|类型|描述|
|---|---|---|
|**destinationImageId**|String|Target image ID after replication|
|**sourceImageId**|String|Source image ID|

## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
