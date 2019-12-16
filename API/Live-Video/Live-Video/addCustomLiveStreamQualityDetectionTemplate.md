# addCustomLiveStreamQualityDetectionTemplate


## Description
Add Live Quality Detection Template

## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/qualityDetectionCustoms:template


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**template**|String|True| |Template Name. Length cannot exceed 128 characters. UTF-8 Code<br>|
|**modules**|String[]|True| |List of Test Items. Value range: <br>  BlackScreen - Black Screen<br>  PureColor - Pure Color<br>  ColorCast - Color Cast<br>  FrozenFrame - Frozen Frame<br>  Brightness - Brightness<br>  Contrast - Contrast<br>|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|requestId|


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
POST
```
https://live.jdcloud-api.com/v1/qualityDetectionCustoms:template
```

```
{
    "modules": [
        "blackScreen", 
        "contrast"
    ], 
    "template": "my qd template"
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
