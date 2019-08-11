# deleteWatermark


## Description
Delete watermark

## Request Method
DELETE

## Request Address
https://vod.jdcloud-api.com/v1/watermarks/{watermarkId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**watermarkId**|Long|True| |Watermark ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

## Request Example
DELETE
```
https://vod.jdcloud-api.com/v1/watermarks/1

```

