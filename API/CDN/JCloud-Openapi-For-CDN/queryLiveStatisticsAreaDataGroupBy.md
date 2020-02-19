# queryLiveStatisticsAreaDataGroupBy


## Description
Search and count data by regions and operators

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/liveStatistics:groupByArea


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**domain**|String|False| |Domain required to be searched must be domain with permission under user pin|
|**appName**|String|False| |app Name|
|**fields**|String|False| |Field Required To Be Searched|
|**area**|String|False| | |
|**isp**|String|False| | |
|**streamName**|String|False| | |
|**period**|String|False| |Time granularity, value: [oneMin,fiveMin,followTime], followTime only can return the summarized data|
|**groupBy**|String|False| |Grouping Basis|
|**subDomain**|String|False| | |
|**scheme**|String|False| |Searched Stream Protocol|
|**reqMethod**|String|False| | |


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](querylivestatisticsareadatagroupby#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**startTime**|String| |
|**endTime**|String| |
|**domain**|String| |
|**statistics**|[StatisticsWithAreaGroupDetail[]](querylivestatisticsareadatagroupby#statisticswithareagroupdetail)| |
### <div id="statisticswithareagroupdetail">StatisticsWithAreaGroupDetail</div>
|Name|Type|Description|
|---|---|---|
|**startTime**|String|UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**data**|[StatisticsWithAreaGroupDetailItem[]](querylivestatisticsareadatagroupby#statisticswithareagroupdetailitem)| |
### <div id="statisticswithareagroupdetailitem">StatisticsWithAreaGroupDetailItem</div>
|Name|Type|Description|
|---|---|---|
|**area**|String| |
|**ispStat**|Object[]| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|