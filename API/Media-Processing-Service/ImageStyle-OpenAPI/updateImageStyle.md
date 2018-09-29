# updateImageStyle


## 描述
Modify Image Style

## 请求方式
PUT

## 请求地址
https://mps.jdcloud-api.com/v1/regions/{regionId}/buckets/{bucketName}/imageStyles/{id}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**bucketName**|String|True| |Bucket Name|
|**id**|Integer|True| |Image Style ID|
|**regionId**|String|True| |Zone ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**bucketName**|String|False| |Bucket|
|**createdTime**|String|False| |Creation Time|
|**id**|Integer|False| |Image Style ID|
|**modifyTime**|String|False| |Modification Time|
|**paramAlias**|String|False| |Image Style Parameter Alias|
|**params**|String|False| |Image Style Parameter|
|**regionId**|String|False| |Zone|
|**status**|Integer|False|1|Image Style Status|
|**styleName**|String|False| |Image Style Name|
|**ucUserId**|String|False| |User ID|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |


## 返回码
|返回码|描述|
|---|---|
|**200**|Successful operation|
