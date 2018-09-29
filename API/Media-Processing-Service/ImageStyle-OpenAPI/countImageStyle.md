# countImageStyle


## 描述
Total Number of Image Styles

## 请求方式
GET

## 请求地址
https://mps.jdcloud-api.com/v1/regions/{regionId}/buckets/{bucketName}/imageStyles/count

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**bucketName**|String|True| |Bucket Name|
|**regionId**|String|True| |Zone ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**styleName**|String|False| |Query by Style Name|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**imageStyleCount**|ImageStyleCount| |
### ImageStyleCount
|名称|类型|描述|
|---|---|---|
|**styleCount**|Integer|Total Number of Image Styles|

## 返回码
|返回码|描述|
|---|---|
|**200**|Success|
