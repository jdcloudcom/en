# describeCustomLiveStreamQualityDetectionTemplates


## Description
Search live quality detection template list

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/qualityDetectionCustoms


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNum**|Integer|False|1|Page Number<br>- Value Range [1, 100000]<br>|
|**pageSize**|Integer|False|10|Paging Size<br>- Value Range [10, 100]<br>|
|**filters**|[Filter[]](#Filter)|False| |Quality Detection Template Search Filter Conditions<br>- name:   template Quality Detection Customized Name<br>- value: If the parameter is null, search all<br>|

### <a name="Filter">Filter</a>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**pageNumber**|Integer|Current Page Number|
|**pageSize**|Integer|Number on Each Page|
|**totalCount**|Integer|Search Total Amount|
|**qualityDetectionTemplates**|[QualityDetectionTemplate[]](#QualityDetectionTemplate)|Quality Detection Template Set|
### <a name="QualityDetectionTemplate">QualityDetectionTemplate</a>
|Name|Type|Description|
|---|---|---|
|**template**|String|Template Name<br>|
|**modules**|String|List of Test Items<br>|

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
https://live.jdcloud-api.com/v1/qualityDetectionCustoms?filters.1.name=template&filters.1.values.1=yourQualityDetectionTemplate
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "pageNumber": 1, 
        "pageSize": 10, 
        "qualityDetectionTemplates": [
            {
                "modules": [
                    "blackScreen", 
                    "contrast"
                ], 
                "templateName": "my qd template"
            }
        ], 
        "totalCount": 1
    }
}
```
