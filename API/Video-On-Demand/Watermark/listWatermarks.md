# listWatermarks


## Description
Search watermark list

## Request Method
GET

## Request Address
https://vod.jdcloud-api.com/v1/watermarks


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number; the default value is 1|
|**pageSize**|Integer|False|10|page size; the default value is 10; the value range is [10, 100]|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Search watermark list result|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**pageNumber**|Integer|Current Page Number|
|**pageSize**|Integer|Number on Each Page|
|**totalElements**|Integer|Search total amount|
|**totalPages**|Integer|Total Number of Pages|
|**content**|WatermarkObject[]|Paging Content|
### WatermarkObject
|Name|Type|Description|
|---|---|---|
|**id**|Long|Watermark ID|
|**name**|String|Watermark Name. Support Chinese or English letters and numbers only. Length cannot exceed 128 characters. UTF-8 code. <br>|
|**imgUrl**|String|Image Address|
|**width**|Integer|Watermark Width. <br>When sizeUnit = pixel , the value is the integer from the value range [8, 4096]<br>When sizeUnit = percent, the value is the integer from the value range [1, 100]<br>|
|**height**|Integer|Watermark Height. <br>When sizeUnit = pixel , the value is the integer from the value range [8, 4096]<br>When sizeUnit = percent, the value is the integer from the value range [1, 100]<br>|
|**sizeUnit**|String|Size Unit. Value range: <br>  pixel - pixel<br>  percent - percent<br>the default value is pixel<br>|
|**position**|String|Watermark Location. Value range: <br>  LT - left top<br>  RT - right top<br>  LB - left bottom<br>  RB - right bottom|
|**offsetX**|Integer|Horizontal Shift. <br>When offsetUnit = pixel, the value is the integer from the value range [8, 4088]<br>When offsetUnit = percent, the value range is the integer from the value range [1, 100]<br>|
|**offsetY**|Integer|Vertical Shift. <br>When offsetUnit = pixel, the value is the integer from the value range [8, 4088]<br>When offsetUnit = percent, the value range is the integer from the value range [1, 100]<br>|
|**offsetUnit**|String|Shifting Unit. Value range: <br>  pixel - pixel<br>  percent - percent<br>the default value is pixel<br>|
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
https://vod.jdcloud-api.com/v1/watermarks

```

## Return Example
```
{
    "requestId": "edfc74ea-be4c-418b-b841-31ddd2b33203", 
    "result": {
        "content": [
            {
                "createTime": "2019-04-16T15:51:32Z", 
                "height": 50, 
                "id": 1, 
                "imgUrl": "http://s3.cn-north-1-stag.jcloudcs.com/vod-storage-72757/image/ecd9066c0f2c8e4bbd8a9fd7ae37965f.PNG", 
                "name": "Mango", 
                "offsetX": 32, 
                "offsetY": 16, 
                "position": "LT", 
                "unit": "pixel", 
                "updateTime": "2019-04-16T15:51:32Z", 
                "width": 100
            }
        ], 
        "pageNumber": 1, 
        "pageSize": 10, 
        "totalElements": 1, 
        "totalPages": 1
    }
}
```
