# queryMixStatisticsData


## Description
Search statistical data

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/statistics


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**domain**|String|False| |Domain required to be searched must be domain with permission under user pin|
|**fields**|String|False| |Field Required To Be Searched|
|**area**|String|False| | |
|**isp**|String|False| | |
|**period**|String|False| |Time granularity, value: [oneMin,fiveMin,followTime], followTime only can return the summarized data|
|**scheme**|String|False| |Search protocol, optional value: [http,https,all], null transmission means to return data from all protocols summarized by default|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](querymixstatisticsdata#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**startTime**|String| |
|**endTime**|String| |
|**domain**|String| |
|**statistics**|[StatisticsDataItem[]](querymixstatisticsdata#statisticsdataitem)| |
### <div id="statisticsdataitem">StatisticsDataItem</div>
|Name|Type|Description|
|---|---|---|
|**startTime**|String|UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**data**|Object|Search result, the type is HashMap<String, Object>|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|