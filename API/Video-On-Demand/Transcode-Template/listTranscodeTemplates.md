# listTranscodeTemplates


## Description
Search transcode template list.
Search by filtering conditions is allowed and the supported filter fields are as follows:
  - source[eq] precise search by template source
  - templateType[eq] precise search by template type


## Request Method
GET

## Request Address
https://vod.jdcloud-api.com/v1/transcodeTemplates


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number; the default value is 1|
|**pageSize**|Integer|False|10|page size; the default value is 10; the value range is [10, 100]|
|**filters**|Filter[]|False| | |

### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Filter Attribute Name|
|**operator**|String|False| |The default value of filter operator is eq|
|**values**|String[]|True| |Filter Attribute Value|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Search result of transcode template list information|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**pageNumber**|Integer|Current Page Number|
|**pageSize**|Integer|Number on Each Page|
|**totalElements**|Integer|Search total amount|
|**totalPages**|Integer|Total Number of Pages|
|**content**|TranscodeTemplateObject[]|Paging Content|
### TranscodeTemplateObject
|Name|Type|Description|
|---|---|---|
|**id**|Long|Template ID|
|**name**|String|Template Name. Length cannot exceed 128 characters. UTF-8 code. <br>|
|**video**|Video|Video Parameter Configuration|
|**audio**|Audio|Audio Parameter Configuration|
|**encapsulation**|Encapsulation|Encapsulation Configuration|
|**definition**|String|Definition Specification Mark. Value range: <br>  SD - standard definition<br>  HD - high definition<br>  FHD - super definition<br>  2K<br>  4K<br>|
|**source**|String|Template Source. Value range:<br>  system - preset by the system<br>  custom - built by users<br>|
|**templateType**|String|Template Type. Value range: <br>  jdchd - Jingxiang Super Definition<br>  jdchs - Topspeed Transcode<br>|
|**createTime**|String|Creation Time|
|**updateTime**|String|Modification Time|
### Encapsulation
|Name|Type|Description|
|---|---|---|
|**format**|String|Encapsulation Format|
### Audio
|Name|Type|Description|
|---|---|---|
|**codec**|String|Audio Code. Value range: aac|
|**bitrate**|Integer|Target Code Rate of Audio. Value range: [8, 1000], unit: Kbps|
|**sampleRate**|Integer|Audio Sampling Rate. Value range: 8000, 11025, 12000, 16000, 22050, 24000, 32000, 44100, 48000, 64000, 88200 and 96000|
|**channels**|Integer|Audio sound channel number: 1 and 2|
|**comfortable**|Boolean|Turn on the comfortable audio or not: true and false|
### Video
|Name|Type|Description|
|---|---|---|
|**codec**|String|Video Code. Value range: h265 and h264|
|**bitrate**|Integer|Video Code Rate. Value range: [128, 10000], unit: Kbps|
|**fps**|Integer|Video Frame Rate. The value range is [1, 60] and the unit is fps|
|**width**|Integer|Video Output Width. The value is an integer from the value range [128, 4096]. <br>If this value is null and height is null too, please keep width and height consistent with those of the original video; if height is not null, width will be zoomed out as per the resolution of the original video. <br>|
|**height**|Integer|Video Output Height. The value is an integer from the value range [128, 4096]. <br>If this value is null and width is null too, please keep width and height consistent with those of the original video; if width is not null, height will be zoomed out as per the resolution of the original video. <br>|

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
https://vod.jdcloud-api.com/v1/transcodeTemplates?pageNumber=1&pageSize=10&filters.1.name=source&filters.1.values.1=custom&filters.1.operator=eq&filters.2.name=templateType&filters.2.values.1=jdchd&filters2.operator=eq

```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "content": [
            {
                "audio": {
                    "bitrate": 200, 
                    "channels": 2, 
                    "codec": "ACC", 
                    "comfortable": true, 
                    "sampleRate": 44100
                }, 
                "createTime": "2019-04-16T15:51:32Z", 
                "definition": "HD", 
                "encapsulation": {
                    "format": "FLV"
                }, 
                "id": 1, 
                "name": "My Transcode Template", 
                "source": "custom", 
                "templateType": "jdchd", 
                "updateTime": "2019-04-16T15:51:32Z", 
                "video": {
                    "bitrate": 1080, 
                    "codec": "H.264", 
                    "fps": 20, 
                    "height": 240, 
                    "width": 320
                }
            }
        ], 
        "pageNumber": 1, 
        "pageSize": 10, 
        "totalElements": 100, 
        "totalPages": 10
    }
}
```
