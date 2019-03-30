# describeCustomLiveStreamSnapshotTemplates


## Description
Search live snapshot template list

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/snapshotCustoms


## Request Parameter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**pageNum**|Integer|False|page; it is 1 by default; value range [1, 100000]|
|**pageSize**|Integer|False|Segmentation size; it is 10 by default; value range[10, 100]|
|**filters**|Filter[]|False|Snapshot Template Search Filter Conditions:<br>  - name:   template  Recording Template Customized Name<br>  - value:  If the parameter is null, search all<br>|

### Filter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**name**|String|True|Name of Filter Requirements|
|**operator**|String|False|Operator of filter requirements is eq by default|
|**values**|String[]|True|Value of Filter Requirements|

## Examples
    {
        "pageNum": 1,
        "pageSize": 10,
        "filters": [{
           "name":"template",
           "value":"test-live-video"}]
    }

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
|**format**|String|Snapshot Format:<br>  - Value: jpg, png<br>  - Case Insensitive<br>|
|**width**|Integer|Snapshot Width:<br>  - Value: [8,8192]<br>  - Equal Ratio: If only one parameter is filled in, the snapshot is zoomed in proportion to the parameter<br>  - Source-followed: If neither parameters are filled in, the original image of source stream size will be snapped<br>|
|**height**|Integer|Snapshot Height:<br>  - Value: [8,8192]<br>  - Equal Ratio: If only one parameter is filled in, the snapshot is zoomed in proportion to the parameter<br>  - Source-followed: If neither parameters are filled in, the original image of source stream size will be snapped<br>|
|**fillType**|Integer|The processing rules when the snapshot does not match the set width and height:<br>  - 1-Stretching<br>  - 2-Left Black<br>  - 3-Left Blank<br>  - 4-Gaussian Blur<br>  - Default value 1,2,3,4 are zoomed in equal scale, 1 is stretched according to set width height<br>|
|**snapshotInterval**|Integer|Snapshot Cycle:<br>  - MIN_INTEGER = 5<br>  - MAX_INTEGER = 3600;<br>  - Unit: Second<br>|
|**saveMode**|Integer|Storage Mode:<br>  - 1-Replace<br>  - 2- Serial Numbering Storage<br>|
|**saveBucket**|String|Bucket|
|**saveEndpoint**|String|Storage Address|
|**template**|String|Snapshot Template Customized Name|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
