# getImageStyle


## 描述
Image Style Details

## 请求方式
GET

## 请求地址
https://mps.jdcloud-api.com/v1/regions/{regionId}/buckets/{bucketName}/imageStyles/{id}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**bucketName**|String|True| |Bucket Name|
|**id**|Integer|True| |Image Style ID|
|**regionId**|String|True| |Zone ID|

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
|**imageStyle**|ImageStyle| |
### ImageStyle
|名称|类型|描述|
|---|---|---|
|**bucketName**|String|Bucket|
|**createdTime**|String|Creation Time|
|**id**|Integer|Image Style ID|
|**modifyTime**|String|Modification Time|
|**paramAlias**|String|Image Style Parameter Alias|
|**params**|String|Image Style Parameter|
|**regionId**|String|Zone|
|**status**|Integer|Image Style Status|
|**styleName**|String|Image Style Name|
|**ucUserId**|String|User ID|

## 返回码
|返回码|描述|
|---|---|
|**200**|Successful operation|
