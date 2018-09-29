# getImageStyle


## Description
Image Style Details

## Request method
GET

## Request address
https://mps.jdcloud-api.com/v1/regions/{regionId}/buckets/{bucketName}/imageStyles/{id}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**bucketName**|String|True| |Bucket Name|
|**id**|Integer|True| |Image Style ID|
|**regionId**|String|True| |Zone ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**imageStyle**|ImageStyle| |
### ImageStyle
|Name|Type|Description|
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

## Response code
|Return code|Description|
|---|---|
|**200**|Successful operation|
