# updateQualityDetectionTemplate


## Description
Modify Quality Control Template

## Request Method
PUT

## Request Address
https://vod.jdcloud-api.com/v1/qualityDetectionTemplates/{templateId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**templateId**|Long|True| |Template ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|False| |Template Name. Length cannot exceed 128 characters. UTF-8 code. <br>|
|**detections**|String[]|False| |List of Test Items. Value range: <br>  blackScreen - black screen<br>  pureColor - pure<br>  colorCast -   color cast<br>  frozenFrame - frozen frame<br>  brightness - brightness<br>  contrast - contrast<br>|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](updatequalitydetectiontemplate#result)|Result of Modifying Quality Control Template|
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
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

## Request Example
PUT
```
https://vod.jdcloud-api.com/v1/qualityDetectionTemplates/10001

```
```
{
    "detections": [
        "blackScreen", 
        "contrast", 
        "colorCast"
    ], 
    "name": "Quality Control Template-001"
}
```

## Return Example
```
{
    "code": 200, 
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
