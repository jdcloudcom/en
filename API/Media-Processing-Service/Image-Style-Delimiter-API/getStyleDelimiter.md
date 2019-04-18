# getStyleDelimiter


## Description
Obtain the image style delimiter configuration of bucket

## Request Method
GET

## Request Address
https://mps.jdcloud-api.com/v1/regions/{regionId}/buckets/{bucketName}/styleDelimiter/

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**bucketName**|String|True| |Bucket Name|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**styleDelimiterConf**|StyleDelimiterConf| |
### StyleDelimiterConf
|Name|Type|Description|
|---|---|---|
|**delimiters**|String[]|Image style delimiter configuration (JSON array); the supported delimiter contains: ["-", "_", "/", "!" ]|

## Return Code
|Return Code|Description|
|---|---|
|**200**|success|
