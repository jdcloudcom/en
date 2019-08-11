# addCustomLiveStreamRecordTemplate


## Description
Add user customized live recording template


## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/recordCustoms:template


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**recordPeriod**|Integer|True| |Automatic Recording Cycle<br>- Value: [15,360]<br>- Unit: minute<br>|
|**saveBucket**|String|True| |Bucket<br>|
|**saveEndpoint**|String|True| |endpoint<br>|
|**recordFileType**|String|True| |Recording File Format:<br>- Value: ts, flv, mp4 (; is used as separation between multiple types)<br>- Case Insensitive<br>|
|**template**|String|True| |Customized Name of Recording Template:<br> - Value Requirements: Numbers, uppercase and lowercase letters or hyphen ("-")<br> - <b>Note: No duplication is allowed to defined names</b><br>|


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

## Request Example
POST
```
https://live.jdcloud-api.com/v1/recordCustoms:template
```

```
{
    "recordFileType": "mp4;flv", 
    "reordPeriod": 30, 
    "saveBucket": "testbucket", 
    "saveEndpoint": "oss.xxx.com", 
    "template": "myrecordtemplate"
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
