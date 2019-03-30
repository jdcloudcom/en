# describeCustomLiveStreamRecordTemplates


## Description
Search record template list

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/recordCustoms:template


## Request Parameter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**pageNum**|Integer|False|page; it is 1 by default; value range [1, 100000]|
|**pageSize**|Integer|False|Segmentation size; it is 10 by default; value range[10, 100]|
|**filters**|Filter[]|False|Recording Template List Search Filter Conditions:<br>  - name:   template  Recording Template Customized Name<br>  - value:  If the parameter is null, search all<br>|

### Filter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**name**|String|True|Name of Filter Requirements|
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
|**recordTemplates**|RecordTemplate[]|Record template information|
### RecordTemplate
|Name|Type|Description|
|---|---|---|
|**recordPeriod**|Integer|Automatic Recording Cycle:<br>  - Value:[15,360]<br>  - Unit: Minute<br>|
|**saveBucket**|String|Bucket|
|**saveEndpoint**|String|Storage Address|
|**recordFileType**|String|Recording File Format:<br>  - Value: ts,flv,mp4 (separate with ; before multiple types)<br>  - Case Insensitive<br>|
|**template**|String|Record template customized name|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
