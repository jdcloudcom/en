# describeDomainsLog


## Description
Log Download

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/describeDomainsLog


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domains**|String|True| |Separate multiple play domains with comma (,)|
|**interval**|String|False| |Time Interval, value (hour, day), hour by default when not uploaded<br>- When being downloaded by hour, it is .log file<br>-When being downloaded by day, it is .zip file|
|**startTime**|String|True| |Start Time<br>- UTC time<br>  Format: yyyy-MM-dd'T'HH:mm:ss'Z'<br>  Examples: 2018-10-21T10:00:00Z<br>|
|**endTime**|String|False| |End time:<br>- UTC Time<br>  Format:yyyy-MM-dd'T'HH:mm:ss'Z'<br>  Example:2018-10-21T10:00:00Z<br>- Is null, the current time by default<br>|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|Name|Type|Description|
|---|---|---|
|**dataList**|DomainsLogResult[]| |
### DomainsLogResult
|Name|Type|Description|
|---|---|---|
|**domain**|String|Domain<br>|
|**logList**|DomainsLogResultData[]| |
### DomainsLogResultData
|Name|Type|Description|
|---|---|---|
|**fileName**|String|File Name<br>|
|**logUrl**|String|Download Link<br>|
|**md5**|String|File md5<br>|
|**size**|Long|File Size, Unit: Byte<br>|
|**startTime**|String|Start Time, UTC time format<br>|
|**endTime**|String|End Time, UTC time format<br>|

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
https://live.jdcloud-api.com/v1/describeDomainsLog?domains=push.yourdomain.com&startTime=2018-10-21T10:00:00Z
```

## Return Example
```
{
    "requestId": "bkcu3ts60jt1f86ti756imamqaw18puj", 
    "result": {
        "dataList": [
            {
                "domain": "wcdn.servyou.com.cn", 
                "logList": [
                    {
                        "endTime": "2019-04-26T01:40:00Z", 
                        "fileName": "201904260940", 
                        "logUrl": "http://s3.cn-north-1-nat.jdcloudcs.com/cdnuserlog.test/wcdn.servyou.com.cn/20190426/2019042609/201904260935.gz?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20190524T031004Z&X-Amz-SignedHeaders=host&X-Amz-Expires=899&X-Amz-Credential=ImtHrS1VXMxeikph%2F20190524%2Fcn-ite-1%2Fs3%2Faws4_request&X-Amz-Signature=009906534b2b57f23738ef25e36a71436fc7b3f8693a07a570e521f22662c35c", 
                        "md5": "caad51b1b9cc54577183aa8e505a09da", 
                        "size": 6988, 
                        "startTime": "2019-04-26T01:35:00Z"
                    }
                ]
            }, 
            {
                "domain": "www.yqb2c.com", 
                "logList": []
            }
        ]
    }
}
```
