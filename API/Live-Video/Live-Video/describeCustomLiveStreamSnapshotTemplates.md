# describeCustomLiveStreamSnapshotTemplates


## Description
Search live snapshot template list

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/snapshotCustoms


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNum**|Integer|False|1|Page Number<br>- Value Range [1, 100000]<br>|
|**pageSize**|Integer|False|10|Paging Size<br>- Value Range [10, 100]<br>|
|**filters**|Filter[]|False| |Snapshot Template Search Filter Conditions<br>  - name:   template  Recording Template Customized Name<br>  - value:  If the parameter is null, search all<br>|

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
|**snapshotTemplates**|SnapshotTemplate[]|Snapshot Template Set|
### SnapshotTemplate
|Name|Type|Description|
|---|---|---|
|**format**|String|Snapshot Format<br>|
|**width**|Integer|Snapshot Width<br>- Unit: Pixel<br>|
|**height**|Integer|Snapshot Height<br>- Unit: Pixel<br>|
|**fillType**|Integer|Processing rules when the snapshot does not match the set width and height<br>  - 1-Stretching<br>  - 2-Left Black<br>  - 3-Left Blank<br>  - 4-Gaussian Blur<br>|
|**snapshotInterval**|Integer|Snapshot Cycle<br>- Unit: Second<br>|
|**saveMode**|Integer|Storage Mode:<br>  1: Replace<br>  2: Serial Numbering Storage<br>|
|**saveBucket**|String|Bucket|
|**saveEndpoint**|String|Storage Address|
|**template**|String|Snapshot Template Customized Name<br>|

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
https://live.jdcloud-api.com/v1/snapshotCustoms?filters.1.name=template&filters.1.values.1=yoursnapshottemplate
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "pageNumber": 1, 
        "pageSize": 10, 
        "snapshotTemplates": [
            {
                "fillType": 1, 
                "format": "jpg", 
                "height": 258, 
                "saveBucket": "yourbucket", 
                "saveEndpoint": "oss.xxx.com", 
                "saveMode": 1, 
                "snapshotInterval": 30, 
                "template": "yoursnapshottemplate", 
                "width": 126
            }
        ], 
        "totalCount": 1
    }
}
```
