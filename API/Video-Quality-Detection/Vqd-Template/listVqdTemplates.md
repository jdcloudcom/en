# listVqdTemplates


## Description
Search the list of video quality detection templates.
Support filtering search:
  - templateId,eq exactly matched template ID (not required)


## Request Method
GET

## Request Address
https://vqd.jdcloud-api.com/v1/vqdTemplates


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number; the default value is 1|
|**pageSize**|Integer|False|10|page size; the default value is 10; the value range is [10, 100]|
|**filters**|[Filter[]](listvqdtemplates#filter)|False| | |

### <div id="filter">Filter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Filter Attribute Name|
|**operator**|String|False| |The default value of filter operator is eq|
|**values**|String[]|True| |Filter Attribute Value|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](listvqdtemplates#result)|Result of searching video quality control template list information|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**pageNumber**|Integer|Current Page Number|
|**pageSize**|Integer|Number on Each Page|
|**totalElements**|Integer|Search Total Amount|
|**totalPages**|Integer|Total Number of Pages|
|**content**|[VqdTemplateObject[]](listvqdtemplates#vqdtemplateobject)|Paging Content|
### <div id="vqdtemplateobject">VqdTemplateObject</div>
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
GET
```
https://vqd.jdcloud-api.com/v1/vqdTemplates?pageNumber=1&pageSize=10

```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "content": [
            {
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
        ], 
        "pageNumber": 1, 
        "pageSize": 10, 
        "totalElements": 100, 
        "totalPages": 10
    }
}
```
