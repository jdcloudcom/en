# queryTopNTrafficGroupSum


## Description
Search topn statistical data

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/console:topN


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**domain**|String|False| |Domain required to be searched must be domain with permission under user pin|
|**area**|String|False| |area|
|**isp**|String|False| |isp|
|**groupBy**|String|True| |Grouping Basis|
|**topCount**|Integer|False|10| |
|**topField**|String|False| |Sorting Field|
|**sortRule**|String|False| |Sorting Rule, desc by default|
|**period**|String|False| |Time granularity, value: [oneMin,fiveMin,followTime], followTime only can return the summarized data|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**totalData**|Double| |
|**totalDataUnit**|String| |
|**topList**|[TopNRespItem[]](#topnrespitem)| |
### <div id="TopNRespItem">TopNRespItem</div>
|Name|Type|Description|
|---|---|---|
|**topKey**|String| |
|**topValue**|Object| |
|**topDataValue**|Double| |
|**topDataPercent**|String| |
|**details**|[TopNRespItemDetail[]](#topnrespitemdetail)| |
### <div id="TopNRespItemDetail">TopNRespItemDetail</div>
|Name|Type|Description|
|---|---|---|
|**timeStamp**|Long| |
|**data**|Double| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
