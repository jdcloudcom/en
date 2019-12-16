# describeQualityDetectionBinding


## Description
Search Quality Detection Template Association


## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/qualityDetectionTemplates/{template}:binding

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**template**|String|True| |Quality Detection Template|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**bindingList**|[TemplateBinding[]](#TemplateBinding)|Quality Detection Template Template Association Set|
### <a name="TemplateBinding">TemplateBinding</a>
|Name|Type|Description|
|---|---|---|
|**publishDomain**|String|Pushing Streaming Domain|
|**appName**|String|Application Name|
|**streamName**|String|Stream Name|
|**template**|String|Template|

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
https://live.jdcloud-api.com/v1/qualityDetectionTemplates/template:binding
```

## Return Example
```
{
    "code": 200, 
    "requestId": "xxxxx", 
    "result": {
        "bindingList": [
            {
                "publishDomain": "push.yourdmain.com", 
                "template": "QualityDetection-test1"
            }, 
            {
                "appName": "live", 
                "publishDomain": "push.yourdmain.com", 
                "template": "QualityDetection-test2"
            }, 
            {
                "appName": "live", 
                "publishDomain": "push.yourdmain.com", 
                "streamName": "streamName", 
                "template": "QualityDetection-test3"
            }
        ]
    }
}
```
