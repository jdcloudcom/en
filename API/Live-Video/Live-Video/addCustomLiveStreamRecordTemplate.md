# addCustomLiveStreamRecordTemplate


## Description
Add live record template

## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/recordCustoms:template


## Request Parameter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**recordPeriod**|Integer|True|Automatic Recording Cycle:<br>  - Value:[15,360]<br>  - Unit: Minute<br>|
|**saveBucket**|String|True|Bucket<br>|
|**saveEndpoint**|String|True|Storage Address<br>|
|**recordFileType**|String|True|Recording File Format:<br>  - Value: ts,flv,mp4 (separate with ; before multiple types)<br>  - Case Insensitive<br>|
|**template**|String|True|Recording Template Customized Name:<br>  - Value Requirements: For numbers, uppercase and lowercase letters, or hyphens ("-"), no special characters are allowed at the beginning and end("-")<br> - <b>Note: It cannot be repeated with the defined template name</b><br>|

## Examples
    {
        "recordPeriod": 50,
        "saveBucket": "vod-storage-398392",
        "saveEndpoint":"s3.cn-north-1.jcloudcs.com",
        "recordFileType":"mp4",
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
