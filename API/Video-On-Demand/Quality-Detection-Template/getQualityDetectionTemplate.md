# getQualityDetectionTemplate


## Description
Search Quality Control Template

## Request Method
GET

## Request Address
https://vod.jdcloud-api.com/v1/qualityDetectionTemplates/{templateId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**templateId**|Long|True| |Template ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Result of Searching Quality Control Template Information|
|**requestId**|String|Request ID|

### Result
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
GET
```
https://vod.jdcloud-api.com/v1/qualityDetectionTemplates/10001

```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "createTime": "2019-08-26T15:51:32Z", 
        "detections": [
            "blackScreen", 
            "contrast"
        ], 
        "id": 10001, 
        "name": "Quality Control Template-001", 
        "templateType": "video", 
        "updateTime": "2019-08-26T15:51:32Z"
    }
}
```
