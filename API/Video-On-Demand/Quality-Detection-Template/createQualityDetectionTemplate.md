# createQualityDetectionTemplate


## Description
Create Quality Control Template

## Request Method
POST

## Request Address
https://vod.jdcloud-api.com/v1/qualityDetectionTemplates


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Template Name. Length cannot exceed 128 characters. UTF-8 code. <br>|
|**templateType**|String|True| |Template Type, distinguish the detection content of the template. Currently, only supports video.|
|**detections**|String[]|True| |List of Test Items. Value range: <br>  blackScreen - black screen<br>  pureColor - pure<br>  colorCast -   color cast<br>  frozenFrame - frozen frame<br>  brightness - brightness<br>  contrast - contrast<br>|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](createqualitydetectiontemplate#result)|Result of Creating Quality Control Template|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**id**|Long|Template ID|
|**name**|String|Template Name. Length cannot exceed 128 characters. UTF-8 code. <br>|
|**templateType**|String|Template Type, distinguish the detection content of the template. Currently, only supports video.|
|**detections**|String[]|List of Test Items. Value range: <br>  blackScreen - black screen<br>  pureColor - pure<br>  colorCast -   color cast<br>  frozenFrame - frozen frame<br>  brightness - brightness<br>  contrast - contrast<br>|
|**createTime**|String|Creation Time|
|**updateTime**|String|Modification Time|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**500**|Internal server error|
|**503**|Service unavailable|

## Request Example
POST
```
https://vod.jdcloud-api.com/v1/QualityDetectionTemplates

```
```
{
    "detections": [
        "blackScreen", 
        "contrast"
    ], 
    "name": "Quality Control Template-001", 
    "templateType": "video"
}
```

## Return Example
```
{
    "code": 200, 
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
