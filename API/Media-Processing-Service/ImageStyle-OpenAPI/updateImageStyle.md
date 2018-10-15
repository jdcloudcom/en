# updateImageStyle


## Description
Modify Image Style

## Request method
PUT

## Request address
https://mps.jdcloud-api.com/v1/regions/{regionId}/buckets/{bucketName}/imageStyles/{id}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**bucketName**|String|True| |Bucket Name|
|**id**|Integer|True| |Image Style ID|
|**regionId**|String|True| |Zone ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
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


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |



## Response code
|Return code|Description|
|---|---|
|**200**|successful operation|
