# createVqdTemplate


## Description
Create video quality detection templates

## Request Method
POST

## Request Address
https://vqd.jdcloud-api.com/v1/vqdTemplates


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**templateName**|String|True| |Template Name. Length cannot exceed 128 characters. UTF-8 code. <br>|
|**threshold**|Double|False| |Defect determination temporal threshold (not required) is 3.0 by default|
|**detections**|String[]|True| |List of Test Items|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](createvqdtemplate#result)|Result of creating video quality detection templates|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**templateId**|String|Template ID|
|**templateName**|String|Template Name. Length cannot exceed 128 characters. UTF-8 code. <br>|
|**threshold**|Double|Defect determination temporal threshold|
|**detections**|String[]|List of Test Items|
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
https://vqd.jdcloud-api.com/v1/vqdTemplates

```
```
{
    "detections": [
        "BlackScreen", 
        "PureColor"
    ], 
    "templateName": "Template-10000", 
    "threshold": "3.000"
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "createTime": "2019-04-16T15:51:32Z", 
        "detections": [
            "BlackScreen", 
            "ColorCast"
        ], 
        "templateId": "10000", 
        "templateName": "Template-10000", 
        "threshold": "3.000", 
        "updateTime": "2019-04-16T15:51:32Z"
    }
}
```
