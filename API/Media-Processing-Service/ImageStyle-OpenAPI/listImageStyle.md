# listImageStyle


## Description
Image Style List

## Request method
GET

## Request address
https://mps.jdcloud-api.com/v1/regions/{regionId}/buckets/{bucketName}/imageStyles

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**bucketName**|String|True| |Bucket Name|
|**regionId**|String|True| |Zone ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Data Page|
|**pageSize**|Integer|False|10|Number of Data Per Page|
|**styleName**|String|False| |Query by Style Name|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**imageStyleQueryResult**|ImageStyleQueryResult| |
### ImageStyleQueryResult
|Name|Type|Description|
|---|---|---|
|**imageStyleList**|ImageStyle[]|Image Style List|
|**pageNumber**|Integer|Data Page|
|**pageSize**|Integer|Number of Data Per Page|
|**styleName**|String|Query by Style Name|
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
|**200**|success|
