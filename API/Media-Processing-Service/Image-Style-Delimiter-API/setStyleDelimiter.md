# setStyleDelimiter


## Description
Set image style delimiters

## Request Method
PUT

## Request Address
https://mps.jdcloud-api.com/v1/regions/{regionId}/buckets/{bucketName}/styleDelimiter/

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**bucketName**|String|True| |Bucket Name|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**delimiters**|String[]|True| |Image style delimiter configuration (JSON array); the supported delimiter contains: ["-", "_", "/", "!" ]|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|success|
