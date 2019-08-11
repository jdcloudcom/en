# openLiveRestart


## Description
Open Restart
1. Live review file format only supports m3u8.<br>
2. The user can configure review duration, which supports 7 days to the maximum extent, namely, when the user requests for reviewing contents, living review contents for the latest 7 days can be requested to the maximum extent.<br>
3. Domain Format: http://{restartDomain}/{appName}/{streamName}/index.m3u8?starttime=1527756680&endtime=1527760280 (unix time stamp)<br>
4. For startTime-endTime, the maximum of 24 hours is supported and cross-day is acceptable<br>


## Request Method
PUT

## Request Address
https://live.jdcloud-api.com/v1/liveRestart:open


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**restartDomain**|String|True| |Playing Domain for Restarting|


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
PUT
```
https://live.jdcloud-api.com/v1/liveRestart:open
```

```
{
    "restartDomain": "restart.yourdomain.com"
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
