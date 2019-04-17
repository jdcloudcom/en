# lastDownsample


## Description
View the last point of a resource, metric introduction: <a href="https://docs.jdcloud.com/cn/monitoring/metrics">Metrics</a>

## Request Method
GET

## Request Address
https://monitor.jdcloud-api.com/v1/regions/{regionId}/metrics/{metric}/lastDownsample

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**metric**|String|True| |English Identifier (id) of Monitoring Item|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**serviceCode**|String|True| |Type of resource, taking values such as vm, lb, ip, database|
|**resourceId**|String|True| |Resource uuid, supporting batch search of multiple resourceIds, separating two ids with the mark “|”. e.g.: id1|id2|id3|id4|
|**tags**|TagFilter[]|False| |Customized Tag|
|**startTime**|String|False| |Query start time of time range, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ (current time by default, if it is earlier than 30d, it will be reset to 30d)|
|**endTime**|String|False| |Query end time of time range, UTC time, format: 2016-12- yyyy-MM-dd'T'HH:mm:ssZ (if it is blank, which shall be obtained by computing startTime and timeInterval)|
|**timeInterval**|String|False| |Query time interval, maximum 30 days, supporting minute level, hour level and day level, such as 1m, 1h and 1d|
|**aggrType**|String|False| |Aggregation method: max avg min and so on, used for aggregation with different dimensions|
|**downAggrType**|String|False| |Aggregation method: max avg min and so on, an aggregation method used for aggregating data of a circle within the dimensions to a point|

### TagFilter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**key**|String|False| |Tag Key|
|**values**|String[]|False| |Tag Value|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Requested identifierid|

### Result
|Name|Type|Description|
|---|---|---|
|**items**|LastDownsampleRespItem[]| |
### LastDownsampleRespItem
|Name|Type|Description|
|---|---|---|
|**metric**|String| |
|**name**|String| |
|**value**|Object| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|View the Last Point at Certain Resource|
