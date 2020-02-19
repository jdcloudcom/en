# queryStatisticsTopUrl


## Description
Search TOP Url

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/statistics:topUrl


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**domain**|String|False| |Domain required to be searched must be domain with permission under user pin|
|**subDomain**|String|False| |Subdomain To Be Searched|
|**size**|Integer|False|20| |
|**topBy**|String|False| |Sorting Basis|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](querystatisticstopurl#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**startTime**|String| |
|**endTime**|String| |
|**domain**|String| |
|**urlData**|[StatisticsTopUrlData[]](querystatisticstopurl#statisticstopurldata)| |
### <div id="statisticstopurldata">StatisticsTopUrlData</div>
|Name|Type|Description|
|---|---|---|
|**count**|Integer| |
|**urls**|[StatisticsTopUrlItem[]](querystatisticstopurl#statisticstopurlitem)| |
### <div id="statisticstopurlitem">StatisticsTopUrlItem</div>
|Name|Type|Description|
|---|---|---|
|**url**|String| |
|**rank**|Integer| |
|**value**|Integer| |
|**fullValue**|Object|Search result, the type is HashMap<String, Object>|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|