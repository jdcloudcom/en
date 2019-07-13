# describeDomainOnlineStream


## Description
Search Online Stream List

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/describeDomainOnlineStream


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainName**|String|True| |Pushing Streaming Domain|
|**appName**|String|False| |Application Name|
|**streamName**|String|False| |Stream Name|
|**pageNum**|Integer|False| |Page, beginning page 1<br>|
|**pageSize**|Integer|False| |Maximum number of records per page, value: [10,100], 10 by default<br>|
|**startTime**|String|True| |Start Time<br>- UTC time<br>  Format: yyyy-MM-dd'T'HH:mm:ss'Z'<br>  Examples: 2018-10-21T10:00:00Z<br>|
|**endTime**|String|False| |End Time:<br>- UTC Time<br>  Format:yyyy-MM-dd'T'HH:mm:ss'Z'<br>  Example:2018-10-21T10:00:00Z<br>- When null, it is the current time by default, the search time span is less than 30 days<br>|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|Name|Type|Description|
|---|---|---|
|**dataList**|PublishOnlineStreamResult[]| |
### PublishOnlineStreamResult
|Name|Type|Description|
|---|---|---|
|**total**|Integer|Number of Returned Records<br>|
|**streamList**|PublishOnlineStreamResultData[]| |
### PublishOnlineStreamResultData
|Name|Type|Description|
|---|---|---|
|**appName**|String|APP Name<br>|
|**streamName**|String|Streaming Name<br>|
|**clientIp**|String|Client ip<br>|
|**serverIp**|String|Edge Node ip<br>|
|**frameRate**|Number|Frame Rate<br>|
|**frameLossRate**|Number|Frame Loss Rate<br>|
|**lastActive**|Long|Last Active Time<br>|
|**realFps**|Number|Real-time Frame Rate<br>|
|**uploadSpeed**|Long|Upload Speed  Unit: KB/s<br>|
|**videoCodec**|Long|Video codec, value: <br>- VideoAVC = 7<br>- VideoHEVC = 12<br>|
|**videoDataRate**|Long|Video Code Rate, Unit: KB/s<br>|
|**audioCodec**|Long|Audio codec, value:<br>- AudioReserved1 = 16<br>- AudioDisabled = 17<br>- AudioLinearPCMPlatformEndian = 0<br>- AudioADPCM = 1<br>- AudioMP3 = 2<br>- AudioLinearPCMLittleEndian = 3<br>- AudioNellymoser16kHzMono = 4<br>- AudioNellymoser8kHzMono = 5<br>- AudioNellymoser = 6<br>- AudioReservedG711AlawLogarithmicPCM = 7<br>- AudioReservedG711MuLawLogarithmicPCM = 8<br>- AudioReserved = 9<br>- AudioAAC = 10<br>- AudioSpeex = 11<br>- AudioReservedMP3_8kHz = 14<br>- AudioReservedDeviceSpecificSound = 15<br>|

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
https://live.jdcloud-api.com/v1/describeDomainOnlineStream?domainName=yourdomain&appName=yourapp&streamName=yourstream&startTime=2018-10-21T10:00:00Z&&endTime=2018-10-22T10:00:00Z

```

## Return Example
```
{
    "code": 200, 
    "requestId": "bkcu3ts60jt1f86ti756imamqaw18puj", 
    "result": {
        "streamList": [
            {
                "appName": "live", 
                "audioCodec": 10, 
                "clientIp": "111.202.36.10", 
                "frameLossRate": 0.04, 
                "frameRate": 25, 
                "lastActive": 1561973235, 
                "realFps": 24, 
                "serverIp": "220.194.105.169", 
                "streamName": "dance_0", 
                "uploadSpeed": 1648, 
                "videoCodec": 7, 
                "videoDataRate": 1581
            }, 
            {
                "appName": "live", 
                "audioCodec": 10, 
                "clientIp": "", 
                "frameLossRate": 0, 
                "frameRate": 25, 
                "lastActive": 1561973234, 
                "realFps": 25, 
                "serverIp": "", 
                "streamName": "dance_0_1500", 
                "uploadSpeed": 2015, 
                "videoCodec": 7, 
                "videoDataRate": 1950
            }
        ], 
        "total": 2
    }
}
```
