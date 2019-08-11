# describeCustomLiveStreamRecordTemplates


## Description
Search user customized live recording template list


## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/recordCustoms:template


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNum**|Integer|False|1|Page Number<br>- Value Range[1, 100000]<br>|
|**pageSize**|Integer|False|10|Paging Size<br>- Value Range[10, 100]<br>|
|**filters**|Filter[]|False| |Recording Template List Search Filter Conditions:<br>  - name:   template  Recording Template Customized Name<br>  - value:  If the parameter is null, search all<br>|

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
|**recordTemplates**|RecordTemplate[]|Record template information|
### RecordTemplate
|Name|Type|Description|
|---|---|---|
|**recordPeriod**|Integer|Automatic Recording Cycle<br>- Value:[15,360]<br>- Unit: Minute<br>|
|**saveBucket**|String|Bucket|
|**saveEndpoint**|String|Storage Address|
|**recordFileType**|String|Recording File Format<br>- Value: ts, flv, mp4 (; is used as separations between multiple types)<br>- Case Insensitive<br>|
|**template**|String|Recording Template<br>- Value Requirements: Numbers, uppercase and lowercase letters or hyphen ("-"),<br>          No special character of ("-") is allowed at both ends<br>- <b>Note: No duplication is allowed to defined names</b><br>|

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
https://live.jdcloud-api.com/v1/recordCustoms:template?pageNum=1&pageSize=10&filters.1.name=template&filters.1.values.1=myrecordtemplate
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "pageNumber": 1, 
        "pageSize": 10, 
        "recordTemplates": [
            {
                "recordFileType": "mp4;flv", 
                "reordPeriod": 30, 
                "saveBucket": "testbucket", 
                "saveEndpoint": "oss.xxx.com", 
                "template": "myrecordtemplate"
            }
        ], 
        "totalCount": 1
    }
}
```
