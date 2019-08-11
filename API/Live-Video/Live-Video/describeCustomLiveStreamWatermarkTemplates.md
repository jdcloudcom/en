# describeCustomLiveStreamWatermarkTemplates


## Description
Search User Customized Watermark Template List


## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/watermarkCustoms


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNum**|Integer|False|1|Page Number<br>- Value Range [1, 100000]<br>|
|**pageSize**|Integer|False|10|Paging Size<br>- Value Range [10, 100]<br>|
|**filters**|Filter[]|False| |Watermark Template List Search Filter Conditions:<br>  - name:   template  Recording Template Customized Name<br>  - value:  If the parameter is null, search all<br>|

### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|Name|Type|Description|
|---|---|---|
|**pageNumber**|Integer|Current Page Number|
|**pageSize**|Integer|Number on Each Page|
|**totalCount**|Integer|Search Total Amount|
|**watermarkTemplates**|WatermarkTemplate[]|Watermark Template|
### WatermarkTemplate
|Name|Type|Description|
|---|---|---|
|**offSetX**|Integer|x Axis Offset<br>- Unit: Pixel<br>|
|**offSetY**|Integer|y Axis Offset<br>- Unit: Pixel<br>|
|**width**|Integer|Watermark Width<br>- Unit: Pixel<br>|
|**height**|Integer|Watermark Height<br>- Unit: Pixel<br>|
|**url**|String|Watermark Address<br>|
|**template**|String|Watermark Template Customized Name<br>|

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
https://live.jdcloud-api.com/v1/watermarkCustoms?filters.1.name=template&filters.1.values.1=yourwatermarktemplate
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "pageNumber": 1, 
        "pageSize": 100, 
        "totalCount": 2, 
        "watermarkTemplates": [
            {
                "height": 200, 
                "offSetX": 10, 
                "offSetY": 50, 
                "template": "yourwatermarktemplate", 
                "url": "http://xxx.com/xxx.jpg", 
                "width": 155
            }
        ]
    }
}
```
