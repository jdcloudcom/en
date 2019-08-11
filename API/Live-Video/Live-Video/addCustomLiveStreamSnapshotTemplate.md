# addCustomLiveStreamSnapshotTemplate


## Description
Add live snapshot template

## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/snapshotCustoms:template


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**format**|String|True| |Snapshot Format<br>- Value: jpg, png<br>- Case Insensitive<br>|
|**width**|Integer|False| |Snapshot Width<br>- Value: [8,8192]<br>- If only one of (width, height) is set, then output the snapshot with another item scaled according to the set parameter item<br>- if none of (width, height) is set, then output the snapshot according to the source stream size<br>|
|**height**|Integer|False| |Snapshot Height<br>- Value: [8,8192]<br>- If only one of (width, height) is set, then output the snapshot with another item scaled according to the set parameter item<br>- if none of (width, height) is set, then output the snapshot according to the source stream size<br>|
|**fillType**|Integer|True| |The processing rules when the snapshot does not match the set width and height<br>  1: Stretch<br>  2: Left Black<br>  3: Left blank<br>  4: Gaussian Blur<br>- 1 is to stretch according to the set width and height<br>- 2, 3, 4 are to zoom in equal scale, with surplus or insufficient part disposed by adjustment<br>|
|**snapshotInterval**|Integer|True| |Snapshot Cycle<br>- Value Range[5,3600]<br>- Unit: Second<br>|
|**saveMode**|Integer|True| |Storage Mode<br>  1: Replace Storage<br>  2: Sequential Storage<br>|
|**saveBucket**|String|True| |Bucket|
|**saveEndpoint**|String|True| |Storage Address|
|**template**|String|True| |Snapshot Template Customized Name:<br>- Value Requirements: Numbers, uppercase and lowercase letters or hyphen ("-"),<br>  No special character of ("-") is allowed at both ends<br>- <b>Note: No duplication is allowed to defined names</b><br>|


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
https://live.jdcloud-api.com/v1/snapshotCustoms:template
```

```
{
    "fillType":1,
    "format":"jpg",
    "saveBucket":"testbucket",
    "saveEndpoint":"oss.xxx.com",
    "saveMode":1,
    "snapshotInterval":30,
    "template":"mysnapshottemplate"
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
