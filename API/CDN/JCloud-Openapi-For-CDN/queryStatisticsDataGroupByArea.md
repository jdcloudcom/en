# queryStatisticsDataGroupByArea


## Description
Search and count data by regions and operators

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/statistics:groupByArea


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|False| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|False| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**domain**|String|False| |Domain required to be searched must be domain with permission under user pin|
|**subDomain**|String|False| |Subdomain To Be Searched|
|**fields**|String|False| |Field Required To Be Searched|
|**area**|String|False| | |
|**isp**|String|False| | |
|**origin**|String|False| | |
|**period**|String|False| |Time granularity, value: [oneMin,fiveMin,followTime], followTime only can return the summarized data|
|**groupBy**|String|False| |Grouping Basis|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**startTime**|String| |
|**endTime**|String| |
|**domain**|String| |
|**statistics**|StatisticsWithAreaGroupDetail[]| |
### StatisticsWithAreaGroupDetail
|Name|Type|Description|
|---|---|---|
|**startTime**|String|UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**data**|StatisticsWithAreaGroupDetailItem[]| |
### StatisticsWithAreaGroupDetailItem
|Name|Type|Description|
|---|---|---|
|**area**|String| |
|**ispStat**|Object|Search result, the type is HashMap<String, Object>|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
