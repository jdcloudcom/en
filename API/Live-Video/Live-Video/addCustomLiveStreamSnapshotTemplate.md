# addCustomLiveStreamSnapshotTemplate


## Description
Add live snapshot template

## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/snapshotCustoms:template


## Request Parameter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**format**|String|True|Snapshot Format:<br>  - Value: jpg, png<br>  - Case Insensitive<br>|
|**width**|Integer|False|Snapshot Width:<br>  - Value: [8,8192]<br>  - Equal Ratio: If only one parameter is filled in, the snapshot is zoomed in proportion to the parameter<br>  - Source-followed: If neither parameters are filled in, the original image of source stream size will be snapped<br>|
|**height**|Integer|False|Snapshot Height:<br>  - Value: [8,8192]<br>  - Equal Ratio: If only one parameter is filled in, the snapshot is zoomed in proportion to the parameter<br>  - Source-followed: If neither parameters are filled in, the original image of source stream size will be snapped<br>|
|**fillType**|Integer|True|Processing rules when the snapshot does not match the set width and height:<br>  - 1-Stretching<br>  - 2-Left Black<br>  - 3-Left Blank<br>  - 4-Gaussian Blur<br>  - Default value 1,2,3,4 are zoomed in equal scale, 1 is stretched according to set width height<br>|
|**snapshotInterval**|Integer|True|Snapshot Cycle:<br>  - MIN_INTEGER = 5<br>  - MAX_INTEGER = 3600;<br>  - Unit: Second<br>|
|**saveMode**|Integer|True|Storage Mode:<br>  - 1-Replace<br>  - 2- Serial Numbering Storage<br>|
|**saveBucket**|String|True|Bucket|
|**saveEndpoint**|String|True|Storage Address|
|**template**|String|True|Snapshot Template Customized Name:<br>  - Value Requirements: For numbers, uppercase and lowercase letters, or hyphens ("-"), no special characters are allowed at the beginning and end("-")<br>  - <b>Note: It cannot be repeated with the defined template name</b>|

## Examples
    {
        "format": "jpg",
        "width": 1080,
        "height": 720,
        "fillType":1,
        "snapshotInterval":50,
        "saveMode":1,
        "saveBucket":"vod-storage-398392",
        "saveEndpoint":"s3.cn-north-1.jcloudcs.com",
        "template":"test-live-video"
    }
    

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|requestId|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
