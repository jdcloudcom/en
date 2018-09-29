# countImageStyle


## Description
Total Number of Image Styles

## Request method
GET

## Request address
https://mps.jdcloud-api.com/v1/regions/{regionId}/buckets/{bucketName}/imageStyles/count

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**bucketName**|String|True| |Bucket Name|
|**regionId**|String|True| |Zone ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**styleName**|String|False| |Query by Style Name|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**imageStyleCount**|ImageStyleCount| |
### ImageStyleCount
|Name|Type|Description|
|---|---|---|
|**styleCount**|Integer|Total Number of Image Styles|

## Response code
|Return code|Description|
|---|---|
|**200**|Success|
