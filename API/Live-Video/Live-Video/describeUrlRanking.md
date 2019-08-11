# describeUrlRanking


## Description
Search Play URL Ranking

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/describeUrlRanking


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainName**|String|True| |Playing Domain|
|**size**|Integer|False| |Search Top count, 20 by default, namely, returning data of Top20|
|**rankfield**|String|False| |Ranking Basis Field, value:["pv", "flow", "bandwidth"], pv by default<br>- pv play times<br>- flow<br>- bandwidth<br>|
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
|**dataList**|RankingUrlResult[]| |
### RankingUrlResult
|Name|Type|Description|
|---|---|---|
|**rankingList**|RankingUrlResultData[]| |
### RankingUrlResultData
|Name|Type|Description|
|---|---|---|
|**url**|String|URL<br>|
|**rank**|Integer|Ranking Number <br>|
|**md5**|String|File md5<br>|
|**value**|Long|Value corresponded to the ranking basis field|
|**data**|RankingUrlResultRankData[]| |
### RankingUrlResultRankData
|Name|Type|Description|
|---|---|---|
|**uv**|Long|Independent Access Times<br>|
|**bandwidth**|Long|Bandwidth, Unit: bps<br>|
|**pv**|Long|Access Times<br>|
|**flow**|Long|Traffic, Unit: Byte|

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
https://live.jdcloud-api.com/v1/describeUrlRanking?domains=play.yourdomain.com&startTime=2018-10-21T10:00:00Z
```

## Return Example
```
{
    "code": 200, 
    "requestId": "bkcu3ts60jt1f86ti756imamqaw18puj", 
    "result": {
        "rankingList": [
            {
                "data": {
                    "bandwidth": 1324, 
                    "flow": 59344, 
                    "pv": 118, 
                    "uv": 7
                }, 
                "rank": 1, 
                "url": "pl.jdcloud.com/ccc/copy.m3u8", 
                "value": 118
            }
        ]
    }
}
```
