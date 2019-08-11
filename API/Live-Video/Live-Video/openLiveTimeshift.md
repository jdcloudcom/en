# openLiveTimeshift


## Description
Open Timeshift
A maximum of 4-hour HLS timeshift is supported by live, which can be implemented by increasing timeshift parameters after the domain is played in respect of the use method. The parameter type supports the timeshift with two methods, namely specifying the start time and time offset. After live timeshift is enabled, the repushing streaming takes effect. And it can be played by accessing by using the play domain with corresponding parameters
- Domain Format:
<br>1、http://{playDomain}/{appName}/{streamName}/index.m3u8?timeshift=400 (second, refers to offset when time is moved forward from current time)
<br>2、http://{playDomain}/{appName}/{streamName}/index.m3u8?starttime=1529223702 (unix time stamp)


## Request Method
PUT

## Request Address
https://live.jdcloud-api.com/v1/liveTimeshift:open


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**playDomain**|String|True| |User Live Playing Domain|


## Return Parameter
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
https://live.jdcloud-api.com/v1/liveTimeshift:open
```

```
{
    "playDomain": "play.yourdomain.com"
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
