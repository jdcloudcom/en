# listQualityDetectionTemplates


## Description
Search Quality Control Template List.


## Request Method
GET

## Request Address
https://vod.jdcloud-api.com/v1/qualityDetectionTemplates


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number; the default value is 1|
|**pageSize**|Integer|False|10|page size; the default value is 10; the value range is [10, 100]|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Result of Searching Quality Control Template List Information|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**pageNumber**|Integer|Current Page Number|
|**pageSize**|Integer|Number on Each Page|
|**totalElements**|Integer|Search Total Amount|
|**totalPages**|Integer|Total Number of Pages|
|**content**|QualityDetectionTemplateObject[]|Paging Content|
### QualityDetectionTemplateObject
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
GET
```
https://vod.jdcloud-api.com/v1/qualityDetectionTemplates?pageNumber=1&pageSize=10

```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "content": [
            {
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
        ], 
        "pageNumber": 1, 
        "pageSize": 10, 
        "totalElements": 100, 
        "totalPages": 10
    }
}
```
